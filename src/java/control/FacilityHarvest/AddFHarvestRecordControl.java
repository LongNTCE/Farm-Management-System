/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityHarvest;

import dao.FacilityHarvestDAO;
import dao.pondDAO;
import entity.Crop;
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
@WebServlet(name = "AddFHarvestRecordControl", urlPatterns = {"/AddFacilityHarvestRecord"})
public class AddFHarvestRecordControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//
//    }
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
        HttpSession session = request.getSession();

        request.setCharacterEncoding("UTF-8");
        Crop cropSes = (Crop) session.getAttribute("cropS");
        FacilityHarvest_Table s = (FacilityHarvest_Table) session.getAttribute("harvestS");
        int cropID = cropSes.getCropID();

        pondDAO pondDao = new pondDAO();

        List<Pond> pondListbyCropID = pondDao.getPondByCropID(cropID);

        request.setAttribute("listPondByCropID", pondListbyCropID);

        request.getRequestDispatcher("facility_harvest_detail_add.jsp").forward(request, response);
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
        int harvestID = s.getfHarvestTID();
        String harvestRdate = request.getParameter("harvestRdate").trim();
        int harvestRpond = Integer.parseInt(request.getParameter("harvestRpond"));
        double harvestNetWeight = Double.parseDouble(request.getParameter("harvestNetWeight"));
        double harvestWeight = Double.parseDouble(request.getParameter("harvestWeight"));
        String merchantName = request.getParameter("merchantName").trim();
        FacilityHarvestDAO dao = new FacilityHarvestDAO();
        dao.addHarvestRecord(harvestRpond, harvestID, harvestRdate, harvestNetWeight, harvestWeight, merchantName);
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
