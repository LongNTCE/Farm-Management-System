/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Facility;

import dao.DAO;
import entity.Crop;
import entity.Employee;
import entity.Facility;
import entity.Pond;
import entity.FacilityOwner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "Manage_ViewAll", urlPatterns = {"/manage_viewall"})
public class Manage_ViewAll extends HttpServlet {

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
        HttpSession user_session = request.getSession();
        FacilityOwner uWithSession = (FacilityOwner) user_session.getAttribute("acc");
        Employee eWithSession = (Employee) user_session.getAttribute("accEmp");

        try {

            Integer.toString(uWithSession.getFoID());
            if (uWithSession != null) {
                int userID = uWithSession.getFoID();
                DAO dao = new DAO();

                List<Facility> facilityList = dao.getFacilityByFOID(userID);

                request.setAttribute("listF", facilityList);

                request.getRequestDispatcher("manage.jsp").forward(request, response);
            } else if (eWithSession != null) {
                int employeeID = eWithSession.getEmployeeID();
                DAO dao = new DAO();
                List<Facility> facilityList = dao.getFacilityByEmployeeID(employeeID);

                request.setAttribute("listF", facilityList);
                request.getRequestDispatcher("manage.jsp").forward(request, response);

            }
        } catch (Exception e) {
            response.sendRedirect("error500.jsp");
        }

//        int userID = uWithSession.getFoID();
//        DAO dao = new DAO();
//
//        List<Facility> facilityList = dao.getFacilityByFOID(userID);
//
//
//        request.setAttribute("listF", facilityList);
//
//
//        request.getRequestDispatcher("manage.jsp").forward(request, response);
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
        processRequest(request, response);
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
