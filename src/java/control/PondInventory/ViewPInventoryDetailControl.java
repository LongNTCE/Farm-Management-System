/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondInventory;

import dao.FacilityBreedDAO;
import dao.PondInventoryDAO;
import dao.PondSurvivalRateDAO;
import dao.pondDAO;
import entity.FacilityBreed_Record;
import entity.FacilityBreed_Table;
import entity.PondInventory_Record;
import entity.PondInventory_Table;
import entity.PondSurvivalRate_Record;
import entity.PondSurvivalRate_Table;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "ViewPInventoryDetailControl", urlPatterns = {"/PondInventory_Detail"})
public class ViewPInventoryDetailControl extends HttpServlet {

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

//        PondInventoryDAO pInventoryDao = new PondInventoryDAO();
//
//        String pondInventoryTID_String = request.getParameter("pondInventoryTID");
//        int pondInventoryTID = Integer.parseInt(pondInventoryTID_String);
//        
//        request.getRequestDispatcher("pond_inventory_detail.jsp").forward(request, response);
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
        int pondInventoryTID;
        String pondInventoryTID_String = request.getParameter("pondInventoryTID");

        PondInventoryDAO dao = new PondInventoryDAO();

        if (pondInventoryTID_String != null) {
            pondInventoryTID = Integer.parseInt(pondInventoryTID_String);
            HttpSession session = request.getSession();

            session.setAttribute("pondInventoryTID", pondInventoryTID);

            System.out.println("lon" + pondInventoryTID);
            request.setAttribute("pondInventoryTIDss", pondInventoryTID);

            List<PondInventory_Record> pIR = new ArrayList<>();
            pIR = dao.getPInventoryDetailByTable(pondInventoryTID);
            List<PondInventory_Record> pIR2 = new ArrayList<>();

            //PInventory Detail
            PondInventory_Record pondInventoryDetail = dao.getPondInventoryRecordDetail(pondInventoryTID);

            for (PondInventory_Record cc : pIR) {
                cc.setProductName(dao.getPNameByfaIID(cc.getFaInventoryID()));
                pIR2.add(cc);
            }

            request.setAttribute("pondInventoryDetail", pondInventoryDetail);
            request.setAttribute("listPInventoryDetail", pIR2);
            request.getRequestDispatcher("pond_inventory_detail.jsp").forward(request, response);

        } else if (pondInventoryTID_String == null) {
            HttpSession session = request.getSession();
            pondInventoryTID = (Integer) session.getAttribute("pondInventoryTID");
            System.out.println("lon" + pondInventoryTID);
            request.setAttribute("pondInventoryTIDss", pondInventoryTID);

            List<PondInventory_Record> pIR = new ArrayList<>();
            pIR = dao.getPInventoryDetailByTable(pondInventoryTID);
            List<PondInventory_Record> pIR2 = new ArrayList<>();

            for (PondInventory_Record cc : pIR) {
                cc.setProductName(dao.getPNameByfaIID(cc.getFaInventoryID()));
                pIR2.add(cc);
            }

            request.setAttribute("listPInventoryDetail", pIR2);
            request.getRequestDispatcher("pond_inventory_detail.jsp").forward(request, response);
        }

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
        int pDeletePInventoryRecord = Integer.parseInt(request.getParameter("ccnek"));
        PondInventoryDAO dao = new PondInventoryDAO();
        dao.deletePInventoryRecord(pDeletePInventoryRecord);
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
