/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityInventory;

import dao.FacilityHarvestDAO;
import dao.FacilityInventoryDAO;
import entity.FacilityInventory_Record;
import entity.FacilityInventory_Table;
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
@WebServlet(name = "ViewFInventoryDetailControl", urlPatterns = {"/facilityInventoryDetail"})
public class ViewFInventoryDetailControl extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        FacilityInventoryDAO fInventoryDao = new FacilityInventoryDAO();
        String fInventoryTID_String = request.getParameter("fInventoryTID");
        if (fInventoryTID_String != null) {
            HttpSession session = request.getSession();
            session.removeAttribute("inventoryS");
            int fInventoryTID = Integer.parseInt(fInventoryTID_String);
            FacilityInventory_Table harvestTable = fInventoryDao.getInventoryTableByFTID(fInventoryTID);
            session.setAttribute("inventoryS", harvestTable);
            List<FacilityInventory_Record> fInventoryRecordList = fInventoryDao.getFInventoryDetailByTable(fInventoryTID);
            request.setAttribute("listFInventoryDetail", fInventoryRecordList);
            request.getRequestDispatcher("facility_inventory_detail.jsp").forward(request, response);

        } else if (fInventoryTID_String == null) {
            HttpSession session = request.getSession();
            FacilityInventory_Table hs = (FacilityInventory_Table) session.getAttribute("inventoryS");
            session.setAttribute("inventoryS", hs);
            int fInventoryTID = hs.getfInventoryTID();
            List<FacilityInventory_Record> fInventoryRecordList = fInventoryDao.getFInventoryDetailByTable(fInventoryTID);
            request.setAttribute("listFInventoryDetail", fInventoryRecordList);
            request.getRequestDispatcher("facility_inventory_detail.jsp").forward(request, response);
        }

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
        processRequest(request, response);
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
        int fDeleteInventoryTID = Integer.parseInt(request.getParameter("ccc"));
        FacilityInventoryDAO fInventoryDao = new FacilityInventoryDAO();
        fInventoryDao.deleteInventoryRecord(fDeleteInventoryTID);
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
