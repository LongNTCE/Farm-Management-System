/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondSurvivalRate;

import dao.PondSurvivalRateDAO;
import entity.Pond;
import entity.PondSurvivalRate_Table;
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
@WebServlet(name = "ViewSurvivalRateTableListControl", urlPatterns = {"/pondSurvivalRate_Management"})
public class ViewSurvivalRateTableListControl extends HttpServlet {

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
        // 
        HttpSession session = request.getSession();
        Pond pondSes = (Pond) session.getAttribute("pondS");
        session.setAttribute("pondS", pondSes);
        int pondID = pondSes.getPondID();

        PondSurvivalRateDAO pSurvivalRateDao = new PondSurvivalRateDAO();

        List<PondSurvivalRate_Table> pSurvivalRateList = pSurvivalRateDao.getPSurvivalRateByPID(pondID);

        request.setAttribute("listPSurvivalRateRecordByPID", pSurvivalRateList);

        request.getRequestDispatcher("pond_survivalrate_list.jsp").forward(request, response);
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
        int survivalRateTID = Integer.parseInt(request.getParameter("ccc"));
        PondSurvivalRateDAO dao = new PondSurvivalRateDAO();
        dao.deleteSurvivalRateTable(survivalRateTID);
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
