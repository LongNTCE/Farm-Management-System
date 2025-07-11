/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.PondWaterEnv;

import dao.PondWaterEnvDAO;
import entity.PondWaterEnvironment_Table;
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
@WebServlet(name = "EditPondWaterEnvTButton", urlPatterns = {"/editPondWaterEnvTableButton"})
public class EditPondWaterEnvTableButton extends HttpServlet {

    int pondWaterEnvTID = 123;
    PondWaterEnvDAO dao = new PondWaterEnvDAO();

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
//        request.getRequestDispatcher("facility_breed_edit.jsp").forward(request, response);
        pondWaterEnvTID = Integer.parseInt(request.getParameter("pondWaterEnvTID"));
        PondWaterEnvironment_Table waterEnvTableDetail = dao.getWaterEnvTableDetail(pondWaterEnvTID);

        request.setAttribute("waterEnvTableDetail", waterEnvTableDetail);
        request.getRequestDispatcher("pond_waterEnv_edit.jsp").forward(request, response);

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
        String pondWaterEnvTName = request.getParameter("edit_pondWaterEnvTName").trim();

        request.setAttribute("dsss", Integer.toString(pondWaterEnvTID));
        PondWaterEnvDAO dao = new PondWaterEnvDAO();
        dao.editPondWaterEnvTable(pondWaterEnvTID, pondWaterEnvTName);

        response.sendRedirect("pondWaterEnv_Management");
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
