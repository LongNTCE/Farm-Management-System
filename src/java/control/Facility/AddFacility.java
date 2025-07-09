/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Facility;

import dao.DAO;
import entity.FacilityOwner;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.regex.Pattern;
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
@WebServlet(name = "AddFacility", urlPatterns = {"/addfacility"})
public class AddFacility extends HttpServlet {

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
        //  request.getRequestDispatcher("manage_viewall").forward(request, response);
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
        request.getRequestDispatcher("facility_add.jsp").forward(request, response);
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
        DAO dao = new DAO();
        HttpSession userSession = request.getSession();
        FacilityOwner foSession = (FacilityOwner) userSession.getAttribute("acc");
        int add_foID = foSession.getFoID();

        String add_fName = request.getParameter("add_fName").trim();

        String add_fAddress = request.getParameter("add_fAddress").trim();

        String add_fPhone = request.getParameter("add_fPhone").trim();

        String add_fCultivatingPondSquare_String = request.getParameter("add_fCultivatingPondSquare").trim();
        Double add_fCultivatingPondSquare = Double.parseDouble(add_fCultivatingPondSquare_String);

        String add_fStoragePondSquare_String = request.getParameter("add_fStoragePondSquare").trim();
        Double add_fStoragePondSquare = Double.parseDouble(add_fStoragePondSquare_String);

        String add_fWastePonsSquare_String = request.getParameter("add_fWastePonsSquare").trim();
        Double add_fWastePonsSquare = Double.parseDouble(add_fWastePonsSquare_String);

        String add_fCultivatingObject = request.getParameter("add_fCultivatingObject").trim();

        String add_fCultivatingTime_String = request.getParameter("add_fCultivatingTime").trim();
        int add_fCultivatingTime = Integer.parseInt(add_fCultivatingTime_String);

        Double add_fTotalSquare = Double.parseDouble(request.getParameter("add_fTotalSquare"));

        int[] checkConcu = new int[1];
        checkConcu[0] = -1;
        if (phonePatterns.matcher(add_fPhone).matches() == false) {
            checkConcu[1] = 1;
        }
        if (checkConcu[0] == 1) {
            request.setAttribute("error", "Sai format dt");
            request.setAttribute("add_fName", add_fName);
            request.setAttribute("add_fAddress", add_fAddress);
            request.setAttribute("add_fPhone", add_fPhone);
            request.setAttribute("add_fCultivatingPondSquare", add_fCultivatingPondSquare_String);
            request.setAttribute("add_fStoragePondSquare", add_fStoragePondSquare_String);
            request.setAttribute("add_fWastePonsSquare", add_fWastePonsSquare_String);
            request.setAttribute("add_fCultivatingObject", add_fCultivatingObject);
            request.setAttribute("add_fCultivatingTime", add_fCultivatingTime_String);
            request.setAttribute("add_fTotalSquare", add_fTotalSquare);
            request.getRequestDispatcher("facility_add.jsp").forward(request, response);
        } else {

            dao.addFacility(add_foID, add_fName, add_fAddress, add_fPhone, add_fCultivatingPondSquare, add_fStoragePondSquare, add_fWastePonsSquare, add_fCultivatingObject, add_fCultivatingTime, add_fTotalSquare);

            response.sendRedirect("manage_viewall");
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
