/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Facility;

import dao.DAO;
import entity.Facility;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author msi-pc
 */
@WebServlet(name = "EditFacilityControl", urlPatterns = {"/editFacility"})
public class EditFacilityControl extends HttpServlet {

    Pattern phonePatterns = Pattern.compile("^(0|\\+84)(\\s|\\.)?((1[0-9])|(3[0-9])|(5[0-9])|(7[0-9])|(8[0-9])|(9[0-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$");

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("facility_edit.jsp").forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            Facility faSession = (Facility) session.getAttribute("facilityS");

            int edit_facilityID = faSession.getFacilityID();

            /* TODO output your page here. You may use following sample code. */
            String edit_fName = request.getParameter("edit_fName").trim();
            out.print(edit_fName);

            String edit_fAddress = request.getParameter("edit_fAddress").trim();
            out.print(edit_fAddress);

            String edit_fPhone = request.getParameter("edit_fPhone").trim();
            out.print(edit_fPhone);

            String edit_fCultivatingPondSquare_String = request.getParameter("edit_fCultivatingPondSquare").trim();
            Double edit_fCultivatingPondSquare = Double.parseDouble(edit_fCultivatingPondSquare_String);
            out.print(edit_fCultivatingPondSquare);
            //    int edit_fCultivatingPondSquare = Integer.parseInt(edit_fCultivatingPondSquare_String);

            String edit_fStoragePondSquare_String = request.getParameter("edit_fStoragePondSquare").trim();
            Double edit_fStoragePondSquare = Double.parseDouble(edit_fStoragePondSquare_String);
            out.print(edit_fStoragePondSquare);

            String edit_fWastePondSquare_String = request.getParameter("edit_fWastePondSquare").trim();
            Double edit_fWastePondSquare = Double.parseDouble(edit_fWastePondSquare_String);
            out.print(edit_fWastePondSquare);

            String edit_fCultivatingObject = request.getParameter("edit_fCultivatingObject").trim();
            out.print(edit_fCultivatingObject);

            String edit_fCultivatingTime_String = request.getParameter("edit_fCultivatingTime").trim();
            int edit_fCultivatingTime = Integer.parseInt(edit_fCultivatingTime_String);
            out.print(edit_fCultivatingTime);

            Double edit_fTotalSquare = edit_fCultivatingPondSquare + edit_fStoragePondSquare + edit_fWastePondSquare;
            out.print(edit_fTotalSquare);

            DAO dao = new DAO();
            int[] checkConcu = new int[1];
            checkConcu[0] = -1;
            if (phonePatterns.matcher(edit_fPhone).matches() == false) {
                checkConcu[1] = 1;
            }
            if (checkConcu[0] == 1) {
                request.setAttribute("error", "Sai format dt");
                request.getRequestDispatcher("facility_edit.jsp").forward(request, response);
            } else {
                // dao.editFarm(farmName, farmAddress, farmSquare, farmID);
                dao.editFacility(edit_facilityID, edit_fName, edit_fAddress, edit_fPhone, edit_fCultivatingPondSquare, edit_fStoragePondSquare, edit_fWastePondSquare, edit_fCultivatingObject, edit_fCultivatingTime, edit_fTotalSquare);
                request.getRequestDispatcher("manage_viewall").forward(request, response);
            }
        }
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
