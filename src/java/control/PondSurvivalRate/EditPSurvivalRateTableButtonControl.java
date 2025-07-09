/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondSurvivalRate;

import dao.PondSurvivalRateDAO;
import entity.PondSurvivalRate_Table;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "EditPSurvivalRateTable", urlPatterns = {"/editPondSurvivalRateTableButton"})
public class EditPSurvivalRateTableButtonControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
       int pondSurvivalRateTID = 123;
       PondSurvivalRateDAO dao = new PondSurvivalRateDAO();
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet EditPSurvivalRateTable</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet EditPSurvivalRateTable at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
        response.setContentType("text/html;charset=UTF-8");
          pondSurvivalRateTID = Integer.parseInt(request.getParameter("pondSurvivalRateTID"));
          PondSurvivalRate_Table survivalRateTableDetail = dao.getSurvivalRateTableDetail(pondSurvivalRateTID);
        
          request.setAttribute("survivalRateTableDetail", survivalRateTableDetail);
        System.out.println("ID" +pondSurvivalRateTID);
        request.getRequestDispatcher("pond_survivalrate_edit.jsp").forward(request, response);
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
                String username = request.getParameter("edit_pondSurvivalRateTName").trim();
        System.out.println("lon123 "+username);
        request.setAttribute("dss", Integer.toString(pondSurvivalRateTID));
        PondSurvivalRateDAO dao = new PondSurvivalRateDAO();
        dao.editPondSurvivalRateTable(pondSurvivalRateTID, username);
        
       response.sendRedirect("pondSurvivalRate_Management");

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
