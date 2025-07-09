/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondSurvivalRate;

import dao.FacilityBreedDAO;
import dao.PondSurvivalRateDAO;
import dao.pondDAO;
import entity.FacilityBreed_Table;
import entity.PondSurvivalRate_Record;
import entity.PondSurvivalRate_Table;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(name = "ViewSurvivalRateDetailControl", urlPatterns = {"/pondSurvivalRateDetail"})
public class ViewSurvivalRateDetailControl extends HttpServlet {

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
        PondSurvivalRateDAO pSurvivalRateDao = new PondSurvivalRateDAO();
        String pSurvivalRateTID_String = request.getParameter("pondSurvivalRateTID");

//         int fBreedTID = Integer.parseInt(fBreedTID_String);
        if (pSurvivalRateTID_String != null) {
            HttpSession session = request.getSession();
            session.removeAttribute("pSurvivalRateS");
            int pondSurvivalRateTID = Integer.parseInt(pSurvivalRateTID_String);

            PondSurvivalRate_Table survivalRateTable = pSurvivalRateDao.getSurvivalRateTableByTID(pondSurvivalRateTID);
            session.setAttribute("pSurvivalRateS", survivalRateTable);

            List<PondSurvivalRate_Record> pSurvivalRateRecordList = pSurvivalRateDao.getPSurvivalRateDetailByTable(pondSurvivalRateTID);

            request.setAttribute("listPSurvivalRateDetail", pSurvivalRateRecordList);

            request.getRequestDispatcher("pond_survivalrate_detail.jsp").forward(request, response);
        } else if (pSurvivalRateTID_String == null) {
            HttpSession session = request.getSession();
            PondSurvivalRate_Table s = (PondSurvivalRate_Table) session.getAttribute("pSurvivalRateS");
            session.setAttribute("pSurvivalRateS", s);

            int pondSurvivalRateTID = s.getPondSurvivalRateTID();

            List<PondSurvivalRate_Record> pSurvivalRateRecordList = pSurvivalRateDao.getPSurvivalRateDetailByTable(pondSurvivalRateTID);

            System.out.println("co ncudfsf");

            request.setAttribute("listPSurvivalRateDetail", pSurvivalRateRecordList);

            request.getRequestDispatcher("pond_survivalrate_detail.jsp").forward(request, response);
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
        int pDeleteSurvivalRateTID = Integer.parseInt(request.getParameter("ccnek"));
        PondSurvivalRateDAO pSurvivalRateDao = new PondSurvivalRateDAO();
        pSurvivalRateDao.deleteSurvivalRateRecord(pDeleteSurvivalRateTID);
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
