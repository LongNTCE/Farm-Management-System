/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityInventory;

import dao.FacilityInventoryDAO;
import entity.FacilityInventory_Table;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author msi-pc
 */
@WebServlet(name = "EditFacilityInventoryTableButtonControl", urlPatterns = {"/EditFacilityInventoryTableButton"})
public class EditFacilityInventoryTableButtonControl extends HttpServlet {

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
    int fInventoryTID = 123;
    FacilityInventoryDAO dao = new FacilityInventoryDAO();

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        fInventoryTID = Integer.parseInt(request.getParameter("fInventoryTID"));

        FacilityInventory_Table fInventoryTableDetail = dao.getFInventoryTableDetail(fInventoryTID);

        request.setAttribute("fInventoryTableDetail", fInventoryTableDetail);

        System.out.println("lon" + fInventoryTID);
        request.getRequestDispatcher("facility_inventory_edit.jsp").forward(request, response);
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
        String name = request.getParameter("tableName").trim();
        System.out.println("lon123 " + name);
        request.setAttribute("ds", Integer.toString(fInventoryTID));
        FacilityInventoryDAO dao = new FacilityInventoryDAO();
        dao.editFacilityInventoryTable(fInventoryTID, name);

        response.sendRedirect("facilityInventory_Management");
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
