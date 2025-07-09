/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondWaterEnv;

import dao.PondWaterEnvDAO;
import entity.PondSurvivalRate_Table;
import entity.PondWaterEnv_Record;
import entity.PondWaterEnvironment_Table;
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
@WebServlet(name = "EditWaterEnvRecordControl", urlPatterns = {"/EditWaterEnvRecord"})
public class EditWaterEnvRecordControl extends HttpServlet {

    int pondEnvID;
    PondWaterEnvDAO dao = new PondWaterEnvDAO();

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

        HttpSession session = request.getSession();

        pondEnvID = Integer.parseInt(request.getParameter("pondEnvID"));

        PondWaterEnvironment_Table s = (PondWaterEnvironment_Table) session.getAttribute("pWaterEnvS");

        PondWaterEnv_Record waterEnvRecordDetail = dao.getWaterEnvRecordDetail(pondEnvID);

        request.setAttribute("waterEnvRecordDetail", waterEnvRecordDetail);
        request.getRequestDispatcher("pond_waterEnv_detail_edit.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        PondWaterEnvironment_Table s = (PondWaterEnvironment_Table) session.getAttribute("pWaterEnvS");

        String envDate = request.getParameter("edit_envDate").trim();
        double dissolveOxygen_morning = Double.parseDouble(request.getParameter("edit_dissolveOxygen_morning"));
        double dissolveOxygen_afternoon = Double.parseDouble(request.getParameter("edit_dissolveOxygen_afternoon"));
        double pH_morning = Double.parseDouble(request.getParameter("edit_pH_morning"));
        double pH_afternoon = Double.parseDouble(request.getParameter("edit_pH_afternoon"));
        double temperature_morning = Double.parseDouble(request.getParameter("edit_temperature_morning"));
        double temperature_afternoon = Double.parseDouble(request.getParameter("edit_temperature_afternoon"));
        double salinity = Double.parseDouble(request.getParameter("edit_salinity"));
        double purity = Double.parseDouble(request.getParameter("edit_purity"));
        double NH3 = Double.parseDouble(request.getParameter("edit_NH3"));
        double alkali = Double.parseDouble(request.getParameter("edit_alkali"));
        double H2S = Double.parseDouble(request.getParameter("edit_H2S"));

        PondWaterEnvDAO dao = new PondWaterEnvDAO();
        dao.editWaterEnvRecord(pondEnvID, envDate, dissolveOxygen_morning, dissolveOxygen_afternoon, pH_morning, pH_afternoon, temperature_morning, temperature_afternoon, salinity, purity, NH3, alkali, H2S);
        response.sendRedirect("pondWaterEnvDetail");
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
