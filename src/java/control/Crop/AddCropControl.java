/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Crop;

import dao.DAO;
import dao.FacilityEmployeeDAO;
import entity.Employee;
import entity.Facility;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AddCropControl", urlPatterns = {"/addcrop"})
public class AddCropControl extends HttpServlet {

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
        HttpSession userSession = request.getSession();
        Facility fSession = (Facility) userSession.getAttribute("facilityS");
        int add_fID = fSession.getFacilityID();
        DAO dao = new DAO();
        FacilityEmployeeDAO feDAO = new FacilityEmployeeDAO();
        String add_cropName = request.getParameter("add_cropName").trim();
        String add_cropStartDate = request.getParameter("add_cropStartDate").trim();
        String add_cropEndDate = request.getParameter("add_cropEndDate").trim();

        dao.addCrop(add_fID, add_cropName, add_cropStartDate, add_cropEndDate);

        List<Employee> listE = feDAO.getEmployeefID(add_fID);

        for (Employee e : listE) {
            feDAO.initEmployeeAuthorizationForCrop(e.getEmployeeID(), add_fID);
        }

        response.sendRedirect("facilityDetail");
        //  response.sendRedirect("manage_viewall");
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
