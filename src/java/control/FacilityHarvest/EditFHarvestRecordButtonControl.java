/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityHarvest;

import dao.FacilityHarvestDAO;
import dao.pondDAO;
import entity.Crop;
import entity.FacilityHarvest_Record;
import entity.FacilityHarvest_Table;
import entity.Pond;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "EditFHarvestRecordControl", urlPatterns = {"/EditHarvestRecord"})
public class EditFHarvestRecordButtonControl extends HttpServlet {

    int fHarvestID = 123;

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
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        fHarvestID = Integer.parseInt(request.getParameter("fHarvestID"));
        Crop cropSes = (Crop) session.getAttribute("cropS");

        FacilityHarvest_Table s = (FacilityHarvest_Table) session.getAttribute("harvestS");
        FacilityHarvestDAO dao = new FacilityHarvestDAO();
        FacilityHarvest_Record r = dao.getHarvestRecordDetail(fHarvestID);
        r.setPondName(dao.getPondNameByPID(r.getPondID()));
        request.setAttribute("r", r);
        System.out.println("ccmm" + r);
        int cropID = cropSes.getCropID();
        System.out.println(cropID);

        pondDAO pondDao = new pondDAO();


        
List<Pond> pondListbyCropID = pondDao.getPondByCropID(cropID);
        for (int i = 0; i < pondListbyCropID.size(); i++ ){
             Pond p = pondListbyCropID.get(i);
            if(p.getPondID() == r.getPondID()){
                pondListbyCropID.remove(p);
                
            }
        }
        
     request.setAttribute("listPondByCropID", pondListbyCropID);

        System.out.println("lon" + fHarvestID);
        request.getRequestDispatcher("facility_harvest_detail_edit.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        FacilityHarvest_Table s = (FacilityHarvest_Table) session.getAttribute("harvestS");
        request.setAttribute("ds", Integer.toString(fHarvestID));
        System.out.println("....." + fHarvestID);
        String harvestRdate = request.getParameter("harvestRdate").trim();
        int harvestRpond = Integer.parseInt(request.getParameter("harvestRpond"));
        double harvestNetWeight = Double.parseDouble(request.getParameter("harvestNetWeight"));
        double harvestWeight = Double.parseDouble(request.getParameter("harvestWeight"));
        String merchantName = request.getParameter("merchantName").trim();
        FacilityHarvestDAO dao = new FacilityHarvestDAO();
        dao.editFacilityHarvestRecord(fHarvestID, harvestRpond, harvestRdate, harvestNetWeight, harvestWeight, merchantName);
        response.sendRedirect("facilityHarvestDetail");
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
