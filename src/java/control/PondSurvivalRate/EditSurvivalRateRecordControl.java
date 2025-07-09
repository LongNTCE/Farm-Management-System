/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondSurvivalRate;

import dao.PondSurvivalRateDAO;
import entity.FacilityInventory_Table;
import entity.PondSurvivalRate_Record;
import entity.PondSurvivalRate_Table;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "EditSurvivalRateRecordControl", urlPatterns = {"/editSurvivalRateRecord"})
public class EditSurvivalRateRecordControl extends HttpServlet {

    int pondSurvivalRateID;
    PondSurvivalRateDAO dao = new PondSurvivalRateDAO();

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

        pondSurvivalRateID = Integer.parseInt(request.getParameter("pondSurvivalRateID"));
        PondSurvivalRate_Table s = (PondSurvivalRate_Table) session.getAttribute("pSurvivalRateS");

        PondSurvivalRate_Record survialRateRecordDetail = dao.getSurvivalRateRecordDetail(pondSurvivalRateID);

        request.setAttribute("survialRateRecordDetail", survialRateRecordDetail);
        request.getRequestDispatcher("pond_survivalrate_detail_edit.jsp").forward(request, response);
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
        PondSurvivalRate_Table s = (PondSurvivalRate_Table) session.getAttribute("pSurvivalRateS");

        String survivalDate = request.getParameter("edit_survivalDate").trim();
        double survivalMediumWeigh = Double.parseDouble(request.getParameter("edit_survivalMediumWeight"));
        int deathNumber = Integer.parseInt(request.getParameter("edit_deathNumber"));
        int lossNumber = Integer.parseInt(request.getParameter("edit_lossNumber"));
        double diseaseNumber = Double.parseDouble(request.getParameter("edit_diseaseNumber"));
        String diseaseSign = request.getParameter("edit_diseaseSign").trim();
        double estimateSurvivalRate = Double.parseDouble(request.getParameter("edit_estimateSurvivalRate"));

        PondSurvivalRateDAO dao = new PondSurvivalRateDAO();
        dao.editSurvivalRateRecord(pondSurvivalRateID, survivalDate, survivalMediumWeigh, deathNumber, lossNumber, diseaseNumber, diseaseSign, estimateSurvivalRate);
        response.sendRedirect("pondSurvivalRateDetail");
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
