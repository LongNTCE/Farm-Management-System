/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityInventory;

import dao.FacilityInventoryDAO;
import entity.FacilityInventory_Record;
import entity.FacilityInventory_Table;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class EditFInventoryRecordControl extends HttpServlet {

     int fInventoryID = 123;

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
        request.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        FacilityInventoryDAO dao = new FacilityInventoryDAO();

        FacilityInventory_Record e = dao.getInventoryRecordDetail(fInventoryID);
        request.setAttribute("e", e);
        fInventoryID = Integer.parseInt(request.getParameter("fInventoryID"));
        FacilityInventory_Table s = (FacilityInventory_Table) session.getAttribute("inventoryS");
        request.getRequestDispatcher("facility_inventory_detail_edit.jsp").forward(request, response);
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
        FacilityInventory_Table s = (FacilityInventory_Table) session.getAttribute("inventoryS");
        request.setAttribute("ds", Integer.toString(fInventoryID));
        System.out.println("....." + fInventoryID);

        String inventoryRName = request.getParameter("inventoryRecordName").trim();
        String inventoryRdate = request.getParameter("inventoryRdate").trim();
        int inventoryRQuantity = Integer.parseInt(request.getParameter("inventoryRQuantity"));
        String inventoryRsource = request.getParameter("inventoryRsource").trim();
        String inventoryRManuDate = request.getParameter("inventoryRManuDate").trim();
        String inventoryRExpireDate = request.getParameter("inventoryRExpireDate").trim();

        FacilityInventoryDAO dao = new FacilityInventoryDAO();
        dao.editFacilityInvetoryRecord(fInventoryID, inventoryRName, inventoryRdate, inventoryRQuantity, inventoryRsource, inventoryRManuDate, inventoryRExpireDate);
        response.sendRedirect("facilityInventoryDetail");

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
