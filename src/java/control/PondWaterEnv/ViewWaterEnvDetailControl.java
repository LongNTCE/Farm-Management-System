/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondWaterEnv;

import dao.PondWaterEnvDAO;
import entity.PondWaterEnv_Record;
import entity.PondWaterEnvironment_Table;
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
@WebServlet(name = "ViewWaterEnvDetailControl", urlPatterns = {"/pondWaterEnvDetail"})
public class ViewWaterEnvDetailControl extends HttpServlet {

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
        PondWaterEnvDAO pWaterEnvDao = new PondWaterEnvDAO();
        String pondWaterEnvTID_String = request.getParameter("pondWaterEnvTID");

        if (pondWaterEnvTID_String != null) {
            HttpSession session = request.getSession();
            session.removeAttribute("pSurvivalRateS");
            int pondWaterEnvTID = Integer.parseInt(pondWaterEnvTID_String);

            PondWaterEnvironment_Table waterEnvTable = pWaterEnvDao.getWaterEnvTableByTID(pondWaterEnvTID);
            session.setAttribute("pWaterEnvS", waterEnvTable);

            List<PondWaterEnv_Record> pWaterEnvDetailList = pWaterEnvDao.getPWaterEnvDetail(pondWaterEnvTID);

            request.setAttribute("listPondWaterEnvDetail", pWaterEnvDetailList);

            request.getRequestDispatcher("pond_waterEnv_detail.jsp").forward(request, response);
        } else if (pondWaterEnvTID_String == null) {
            HttpSession session = request.getSession();
            
            PondWaterEnvironment_Table s = (PondWaterEnvironment_Table) session.getAttribute("pWaterEnvS");
            session.setAttribute("pWaterEnvS", s);

            int pondWaterEnvTID = s.getPondWaterEnvTID();

            List<PondWaterEnv_Record> pWaterEnvDetailList = pWaterEnvDao.getPWaterEnvDetail(pondWaterEnvTID);

            System.out.println("co ncudfsf");

            request.setAttribute("listPondWaterEnvDetail", pWaterEnvDetailList);

            request.getRequestDispatcher("pond_waterEnv_detail.jsp").forward(request, response);
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
                    int pDeleteWaterEnvID = Integer.parseInt(request.getParameter("cccc"));
                      PondWaterEnvDAO pWaterEnvDao = new PondWaterEnvDAO();
                        pWaterEnvDao.deleteSurvivalRateRecord(pDeleteWaterEnvID);
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
