
package control.Employee;

import dao.FacilityEmployeeDAO;
import dao.cropDAO;
import dao.pondDAO;
import entity.Crop;
import entity.CropEmployeeAuthorization;
import entity.Facility;
import entity.Pond;
import entity.PondEmployeeAuthorization;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class AuthorizeEmployeeControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String beo = request.getParameter("beo");
        System.out.println("beo " + request.getParameter("beo"));

        String bee_String = request.getParameter("bee");
        System.out.println("bee " + bee_String);
        boolean bee = false;
        if (bee_String == null) {
            bee = false;
            System.out.println("mr bee " + bee);
        } else if (bee_String.equals("on")) {
            bee = true;
            System.out.println("mr bee " + bee);
        }

        String hee_String = request.getParameter("hee");
        System.out.println("bee " + bee_String);
        boolean hee = false;
        if (hee_String == null) {
            hee = false;
            System.out.println("mr hee " + hee);
        } else if (hee_String.equals("on")) {
            hee = true;
            System.out.println("mr hee " + hee);
        }

        String iee_String = request.getParameter("iee");
        System.out.println("bee " + bee_String);
        boolean iee = false;
        if (iee_String == null) {
            iee = false;
            System.out.println("mr iee " + iee);
        } else if (iee_String.equals("on")) {
            iee = true;
            System.out.println("mr iee " + iee);
        }

        cropDAO cropDAO = new cropDAO();
        FacilityEmployeeDAO feDAO = new FacilityEmployeeDAO();

        String employeeID_String = request.getParameter("employeeID");
        int employeeID = -1;
        if (employeeID_String != null) {
            employeeID = Integer.parseInt(employeeID_String);
            HttpSession session = request.getSession();
            session.setAttribute("employeeID", employeeID);
        } else if (employeeID_String == null) {
            HttpSession session = request.getSession();
            employeeID = (Integer) session.getAttribute("employeeID");
            System.out.println("lon" + employeeID);
            request.setAttribute("employeeID", employeeID);
        }
        HttpSession session = request.getSession();
        Facility facility = (Facility) session.getAttribute("facilityS");
        System.out.println("fID " + facility.getFacilityID());

        List<Crop> listC = cropDAO.getCropByFacilityID(facility.getFacilityID());

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Crop> listC2 = new ArrayList<>();
        List<CropEmployeeAuthorization> listCEA = new ArrayList<>();

        for (Crop c : listC) {
            listCEA.add(feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, c.getCropID()));
        }
        for (CropEmployeeAuthorization c : listCEA) {
            listC2.add(cropDAO.getCropByCID(c.getCropID()));
        }

        String cID = request.getParameter("cID");

        System.out.println("Teo" + cID);
        Crop crop = new Crop(-1);
        if (cID != null) {
            crop = cropDAO.getCropByCID(Integer.parseInt(cID));
            request.setAttribute("teo", crop);
            request.setAttribute("be", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowBreedRecord());
            request.setAttribute("he", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowHarvestRecord());
            request.setAttribute("ie", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowInventoryRecord());

            Iterator<Crop> i = listC2.iterator();

            while (i.hasNext()) {
                Crop s = i.next(); // must be called before you can call i.remove()
                if (s.getCropID() == crop.getCropID()) {
                    i.remove();
                }
            }

            if (beo == null) {
                request.setAttribute("be", "Chon vu mua di thg lon");
            } else if (beo.equals("Luu")) {
                feDAO.updateCA(bee, hee, iee, employeeID, Integer.parseInt(cID));
                request.setAttribute("be", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowBreedRecord());
                request.setAttribute("he", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowHarvestRecord());
                request.setAttribute("ie", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowInventoryRecord());
            }

        }

        System.out.println(employeeID);

        request.setAttribute("listCName", listC2);

        /////////////////////////Pond Validation///////////////////////////////////
//        String beo = request.getParameter("beo");
//        System.out.println("beo "+ request.getParameter("beo"));
//       
//        
//        String pbee_String = request.getParameter("pbee");
//        System.out.println("pbee "+ pbee_String);
//        boolean pbee = false;
//        if (bee_String == null){
//            bee = false;
//            System.out.println("mr pbee "+pbee);
//        }else if (bee_String.equals("on")){
//            bee = true;
//            System.out.println("mr pbee "+pbee);
//        }
//        
//        String phee_String = request.getParameter("phee");
//        System.out.println("pbee "+ pbee_String);
//        boolean phee = false;
//        if (phee_String == null){
//            hee = false;
//            System.out.println("mr phee "+phee);
//        }else if (phee_String.equals("on")){
//            hee = true;
//            System.out.println("mr phee "+phee);
//        }
//        
//        String piee_String = request.getParameter("piee");
//        System.out.println("pbee "+ pbee_String);
//        boolean piee = false;
//        if (piee_String == null){
//            piee = false;
//            System.out.println("mr piee "+piee);
//        }else if (piee_String.equals("on")){
//            piee = true;
//            System.out.println("mr piee "+piee);
//        }
//        
//        
//        
//        //cropDAO cropDAO = new cropDAO();
//        pondDAO pondDAO = new pondDAO();
//       // FacilityEmployeeDAO feDAO = new FacilityEmployeeDAO();
//
//       // String employeeID_String = request.getParameter("employeeID");
//       // int employeeID = -1;
//        if (employeeID_String != null) {
//            employeeID = Integer.parseInt(employeeID_String);
//           // HttpSession session = request.getSession();
//            session.setAttribute("employeeID", employeeID);
//        } else if (employeeID_String == null) {
//           // HttpSession session = request.getSession();
//            employeeID = (Integer) session.getAttribute("employeeID");
//            System.out.println("lon" + employeeID);
//            request.setAttribute("employeeID", employeeID);
//        }
////        HttpSession session = request.getSession();
////        Facility facility = (Facility) session.getAttribute("facilityS");
//        System.out.println("fID "+facility.getFacilityID());
//                
//
//        List<Pond> listP = pondDAO.getPondByCropID(8);
//        
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        List<Pond> listP2 = new ArrayList<>();
//        List<PondEmployeeAuthorization> listPEA = new ArrayList<>();
//        
//        for (Pond p: listP){
//            listPEA.add(feDAO.getPondEmployeeAuthorizationByEIDCID(employeeID, p.getPondID()));
//        }
//        for(PondEmployeeAuthorization p : listPEA){
//            listP2.add(pondDAO.getPondByPID(p.getPondID()));
//        }
//
//        String pID = request.getParameter("pID");
//
//        System.out.println("pTeo" + pID);
//        Pond pond = new Pond(-1);
//        if (pID != null) {
//            pond = pondDAO.getPondByPID(Integer.parseInt(pID));
//            request.setAttribute("pteo", pond);
//            request.setAttribute("pbe", feDAO.getPondEmployeeAuthorizationByEIDCID(employeeID, pond.getPondID()).isAllowInventoryRecord());
//            request.setAttribute("phe", feDAO.getPondEmployeeAuthorizationByEIDCID(employeeID, pond.getPondID()).isAllowSurvivalRecord());
//            request.setAttribute("pie", feDAO.getPondEmployeeAuthorizationByEIDCID(employeeID, pond.getPondID()).isAllowWaterRecord());
//            
//            
//            Iterator<Pond> i = listP2.iterator();
//
//            while (i.hasNext()) {
//                Pond s = i.next(); // must be called before you can call i.remove()
//                if (s.getPondID() == pond.getPondID()) {
//                    i.remove();
//                }
//            }
//            
//            if (beo == null){
//                request.setAttribute("pbe", "Chon vu mua di thg lon");
//            } else if(beo.equals("Luu")){
//                feDAO.updatePA(bee, hee, iee, employeeID,Integer.parseInt(cID) );
//                request.setAttribute("pbe", feDAO.getPondEmployeeAuthorizationByEIDCID(employeeID, pond.getPondID()).isAllowInventoryRecord());
//            request.setAttribute("phe", feDAO.getPondEmployeeAuthorizationByEIDCID(employeeID, pond.getPondID()).isAllowSurvivalRecord());
//            request.setAttribute("pie", feDAO.getPondEmployeeAuthorizationByEIDCID(employeeID, pond.getPondID()).isAllowWaterRecord());
//            }
//
//        }
//
//        System.out.println(employeeID);
//
//        request.setAttribute("listCName", listC2);
//        request.setAttribute("listPName", listP2);
        ///////////////////////////////////////////////////////////
        request.getRequestDispatcher("employee_authorization.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String beo = request.getParameter("beo");
        System.out.println("beo " + request.getParameter("beo"));

        String bee_String = request.getParameter("bee");
        System.out.println("bee " + bee_String);
        boolean bee = false;
        if (bee_String == null) {
            bee = false;
            System.out.println("mr bee " + bee);
        } else if (bee_String.equals("on")) {
            bee = true;
            System.out.println("mr bee " + bee);
        }

        String hee_String = request.getParameter("hee");
        System.out.println("bee " + bee_String);
        boolean hee = false;
        if (hee_String == null) {
            hee = false;
            System.out.println("mr hee " + hee);
        } else if (hee_String.equals("on")) {
            hee = true;
            System.out.println("mr hee " + hee);
        }

        String iee_String = request.getParameter("iee");
        System.out.println("bee " + bee_String);
        boolean iee = false;
        if (iee_String == null) {
            iee = false;
            System.out.println("mr iee " + iee);
        } else if (iee_String.equals("on")) {
            iee = true;
            System.out.println("mr iee " + iee);
        }

        cropDAO cropDAO = new cropDAO();
        pondDAO pondDAO = new pondDAO();
        FacilityEmployeeDAO feDAO = new FacilityEmployeeDAO();

        String employeeID_String = request.getParameter("employeeID");
        int employeeID = -1;
        if (employeeID_String != null) {
            employeeID = Integer.parseInt(employeeID_String);
            HttpSession session = request.getSession();
            session.setAttribute("employeeID", employeeID);
        } else if (employeeID_String == null) {
            HttpSession session = request.getSession();
            employeeID = (Integer) session.getAttribute("employeeID");
            System.out.println("lon" + employeeID);
            request.setAttribute("employeeID", employeeID);
        }
        HttpSession session = request.getSession();
        Facility facility = (Facility) session.getAttribute("facilityS");
        System.out.println("fID " + facility.getFacilityID());

        List<Crop> listC = cropDAO.getCropByFacilityID(facility.getFacilityID());

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Crop> listC2 = new ArrayList<>();
        List<CropEmployeeAuthorization> listCEA = new ArrayList<>();

        for (Crop c : listC) {
            listCEA.add(feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, c.getCropID()));
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (CropEmployeeAuthorization c : listCEA) {
            listC2.add(cropDAO.getCropByCID(c.getCropID()));
        }

        String cID = request.getParameter("cID");

        System.out.println("Teo" + cID);
        Crop crop = new Crop(-1);
        if (cID != null) {

            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
            }

            crop = cropDAO.getCropByCID(Integer.parseInt(cID));
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("teo", crop);
            request.setAttribute("be", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowBreedRecord());
            request.setAttribute("he", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowHarvestRecord());
            request.setAttribute("ie", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowInventoryRecord());

            Iterator<Crop> i = listC2.iterator();

            while (i.hasNext()) {
                Crop s = i.next(); // must be called before you can call i.remove()
                if (s.getCropID() == crop.getCropID()) {
                    i.remove();
                }
            }

            if (beo == null) {
//                request.setAttribute("be", "Chon vu mua di thg lon");
            } else if (beo.equals("Luu")) {
                feDAO.updateCA(bee, hee, iee, employeeID, Integer.parseInt(cID));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.setAttribute("be", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowBreedRecord());
                request.setAttribute("he", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowHarvestRecord());
                request.setAttribute("ie", feDAO.getCropEmployeeAuthorizationByEIDCID(employeeID, crop.getCropID()).isAllowInventoryRecord());
            }

            List<Pond> listP = pondDAO.getPondByCropID(Integer.parseInt(cID));
//            request.setAttribute("listPName", listP);

            String pID = request.getParameter("pID");
            System.out.println("pondID cmn123123 " + pID);

            if (pID.equals("")) {

                System.out.println("pondID cmn con cuuuuuuuu" + pID);
            } else if (pID != null) {

                boolean conChim = false;
                for (Pond p : listP) {
                    if (p.getPondID() == Integer.parseInt(pID)) {
                        conChim = true;
                    }
                }
                if (conChim == true) {

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Pond pond = pondDAO.getPondByPID(Integer.parseInt(pID));
                    request.setAttribute("pondIni", pond);
                    System.out.println("pondID cmn con cuuuuuuuu" + pID);

                    Iterator<Pond> i2 = listP.iterator();

                    while (i2.hasNext()) {
                        Pond s2 = i2.next(); // must be called before you can call i.remove()
                        if (s2.getPondID() == pond.getPondID()) {
                            i2.remove();
                        }
                    }

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    request.setAttribute("pie", feDAO.getPondEmployeeAuthorizationByEIDPID(employeeID, pond.getPondID()).isAllowInventoryRecord());
                    request.setAttribute("pse", feDAO.getPondEmployeeAuthorizationByEIDPID(employeeID, pond.getPondID()).isAllowSurvivalRecord());
                    request.setAttribute("pwe", feDAO.getPondEmployeeAuthorizationByEIDPID(employeeID, pond.getPondID()).isAllowWaterRecord());

                    if (beo == null) {
//                request.setAttribute("be", "Chon vu mua di thg lon");
                    } else if (beo.equals("Luu")) {

                        String pie_String = request.getParameter("piee");
                        System.out.println("piee " + pie_String);
                        boolean pie = false;
                        if (pie_String == null) {
                            pie = false;
                            System.out.println("mr pie " + pie);
                        } else if (pie_String.equals("on")) {
                            pie = true;
                            System.out.println("mr pie " + pie);
                        }

                        String pse_String = request.getParameter("psee");
                        System.out.println("bee " + pse_String);
                        boolean pse = false;
                        if (pse_String == null) {
                            pse = false;
                            System.out.println("mr pse " + pse);
                        } else if (pse_String.equals("on")) {
                            pse = true;
                            System.out.println("mr pse " + pse);
                        }

                        String pwe_String = request.getParameter("pwee");
                        System.out.println("bee " + pwe_String);
                        boolean pwe = false;
                        if (pwe_String == null) {
                            pwe = false;
                            System.out.println("mr pwe " + pwe);
                        } else if (pwe_String.equals("on")) {
                            pwe = true;
                            System.out.println("mr pwe " + pwe);
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        feDAO.updatePA(pie, pse, pwe, employeeID, pond.getPondID());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(AuthorizeEmployeeControl.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        request.setAttribute("pie", feDAO.getPondEmployeeAuthorizationByEIDPID(employeeID, pond.getPondID()).isAllowInventoryRecord());
                        request.setAttribute("pse", feDAO.getPondEmployeeAuthorizationByEIDPID(employeeID, pond.getPondID()).isAllowSurvivalRecord());
                        request.setAttribute("pwe", feDAO.getPondEmployeeAuthorizationByEIDPID(employeeID, pond.getPondID()).isAllowWaterRecord());
                    }

                }

            }
            request.setAttribute("listPName", listP);

        }

        System.out.println(employeeID);

        request.setAttribute("listCName", listC2);

        request.getRequestDispatcher("employee_authorization.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}