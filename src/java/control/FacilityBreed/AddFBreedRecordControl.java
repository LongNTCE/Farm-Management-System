/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityBreed;

import dao.FacilityBreedDAO;
import dao.FacilityInventoryDAO;
import dao.pondDAO;
import entity.Crop;
import entity.Facility;
import entity.FacilityBreed_Table;
import entity.Pond;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author msi-pc
 */
@WebServlet(name = "AddFBreedRecordControl", urlPatterns = {"/AddFacilityBreedRecord"})
public class AddFBreedRecordControl extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        Crop cropSes = (Crop) session.getAttribute("cropS");
        FacilityBreed_Table s = (FacilityBreed_Table) session.getAttribute("breedS");
        int cropID = cropSes.getCropID();
        //    int breedID = s.getfBreedTID();
        //   System.out.println("con cac "+ cropID + breedID);

        pondDAO pondDao = new pondDAO();
//        List<Pond> pondListbyCropID = pondDao.getPondByCropID(cropID);
//        for(Pond o: pondListbyCropID){
//            System.out.println(o.getPondName());
//           
//        }
//        request.setAttribute("listPondByCropID", pondListbyCropID);
//        request.setAttribute("123", pondListbyCropID.get(0).getPondName());

        List<Pond> pondListbyCropID = pondDao.getPondByCropID(cropID);

        request.setAttribute("listPondByCropID", pondListbyCropID);

        request.getRequestDispatcher("facility_breed_detail_add.jsp").forward(request, response);
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
        //processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        
        HttpSession session = request.getSession();
        FacilityBreed_Table s = (FacilityBreed_Table) session.getAttribute("breedS");
        int breedID = s.getfBreedTID();
        System.out.println("....." + breedID);

        String breedRdate = request.getParameter("breedRdate").trim();
        int breedRpond = Integer.parseInt(request.getParameter("breedRpond"));
        double breedRsize = Double.parseDouble(request.getParameter("breedRsize"));
        int breedRdensity = Integer.parseInt(request.getParameter("breedRdensity"));
        String breedRsource = request.getParameter("breedRsource").trim();
        String breedRcert = request.getParameter("breedRcert").trim();

        FacilityBreedDAO dao = new FacilityBreedDAO();
        dao.addBreedRecord(breedID, breedRpond, breedRdate, breedRsize, breedRdensity, breedRsource, breedRcert);
        response.sendRedirect("facilityBreedDetail");

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
