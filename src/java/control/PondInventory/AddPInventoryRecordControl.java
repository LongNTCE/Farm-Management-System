/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondInventory;

import dao.PondInventoryDAO;
import dao.pondDAO;
import entity.Crop;
import entity.FacilityBreed_Table;
import entity.FacilityInventory_Record;
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
 * @author Admin
 */
@WebServlet(name = "AddPInventoryRecordControl", urlPatterns = {"/PondInventory_Detail_Add"})
public class AddPInventoryRecordControl extends HttpServlet {

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
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AddPInventoryRecordControl</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AddPInventoryRecordControl at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
        int cropID = cropSes.getCropID();
        System.out.println("con cu" + cropID);

        int pondInventoryTID = Integer.parseInt(request.getParameter("pondInventoryTID"));

        System.out.println("lon" + pondInventoryTID);

        PondInventoryDAO dao = new PondInventoryDAO();

        List<FacilityInventory_Record> faIRListbyCropID = dao.getAllFIR(cropID);
        for (FacilityInventory_Record i : faIRListbyCropID) {
            System.out.println(i);
        }

        request.setAttribute("listFacilityInventory", faIRListbyCropID);
        request.getRequestDispatcher("pond_inventory_detail_add.jsp").forward(request, response);
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
        int pondInventoryTID = Integer.parseInt(request.getParameter("pondInventoryTID"));

        String usageDate = request.getParameter("usageDate").trim();
        int faInventoryID = Integer.parseInt(request.getParameter("faInventoryID"));
        double dosage = Double.parseDouble(request.getParameter("dosage"));
        double usageWeight = Double.parseDouble(request.getParameter("usageWeight"));
        String usagePurpose = request.getParameter("usagePurpose").trim();

        PondInventoryDAO dao = new PondInventoryDAO();
        dao.addPInventoryR(pondInventoryTID, faInventoryID, usageDate, dosage, usageWeight, usagePurpose);
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
