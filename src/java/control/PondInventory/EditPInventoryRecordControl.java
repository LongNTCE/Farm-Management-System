/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondInventory;

import dao.PondInventoryDAO;
import dao.PondWaterEnvDAO;
import entity.Crop;
import entity.FacilityInventory_Record;
import entity.PondInventory_Record;
import entity.PondInventory_Table;
import entity.PondWaterEnvironment_Table;
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
 * @author Admin
 */
@WebServlet(name = "EditPInventoryRecordControl", urlPatterns = {"/EditPInventoryRecord"})
public class EditPInventoryRecordControl extends HttpServlet {

    int pondInventoryID;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    
    //Initiate PondInventory DAO
    PondInventoryDAO dao = new PondInventoryDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

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

        pondInventoryID = Integer.parseInt(request.getParameter("pondInventoryID"));
        int s = (Integer) session.getAttribute("pondInventoryTID");

        PondInventory_Record pondInventoryDetail = dao.getPondInventoryRecordDetail(pondInventoryID);

        request.setAttribute("pondInventoryDetail", pondInventoryDetail);
        request.getRequestDispatcher("pond_inventory_detail_edit.jsp").forward(request, response);
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
        int s = (Integer) session.getAttribute("pondInventoryTID");

        String usageDate = request.getParameter("edit_usageDate").trim();
        double dosage = Double.parseDouble(request.getParameter("edit_dosage"));
        double usageWeight = Double.parseDouble(request.getParameter("edit_usageWeight"));
        String usagePurpose = request.getParameter("edit_usagePurpose").trim();

        PondInventoryDAO dao = new PondInventoryDAO();

        dao.edPondInventoryRecord(pondInventoryID, usageDate, dosage, usageWeight, usagePurpose);

        response.sendRedirect("PondInventory_Detail");
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
