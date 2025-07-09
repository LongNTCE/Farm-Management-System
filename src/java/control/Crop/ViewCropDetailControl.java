/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Crop;

import dao.DAO;
import dao.FacilityEmployeeDAO;
import dao.cropDAO;
import dao.pondDAO;
import entity.Crop;
import entity.CropEmployeeAuthorization;
import entity.Employee;
import entity.Facility;
import entity.FacilityOwner;
import entity.Pond;
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
@WebServlet(name = "ViewCropDetailControl", urlPatterns = {"/cropDetail"})
public class ViewCropDetailControl extends HttpServlet {

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
        cropDAO cropDao = new cropDAO();
        pondDAO pondDao = new pondDAO();
        FacilityEmployeeDAO dao = new FacilityEmployeeDAO();

        String cropID_String = request.getParameter("cropID");
        HttpSession session = request.getSession();
        Employee eWithSession = (Employee) session.getAttribute("accEmp");
        FacilityOwner uWithSession = (FacilityOwner) session.getAttribute("acc");
        if (eWithSession != null) {
            if (cropID_String != null) {
                // HttpSession session = request.getSession();
                session.removeAttribute("cropS");
                session.removeAttribute("cropEmployeeAuthorization");
                int cropID = Integer.parseInt(cropID_String);
                Crop crop = cropDao.getCropByCID(cropID);
                session.setAttribute("cropS", crop);
                List<Pond> pondListbyCropID = pondDao.getPondByCropID(cropID);
                request.setAttribute("listPondByCropID", pondListbyCropID);
                request.setAttribute("cropDetail", crop);
               
                
                //Create session for employee validation
                // Employee eWithSession = (Employee) session.getAttribute("accEmp");
                int employeeID = eWithSession.getEmployeeID();
                CropEmployeeAuthorization cropEmployeeAuthorization = dao.getCropEmployeeAuthorizationByEIDCID(employeeID, cropID);
               // session.setAttribute("cropEmployeeAuthorization", cropEmployeeAuthorization);
                request.setAttribute("cropEmployeeAuthorization", cropEmployeeAuthorization);
                //
                
                
                request.getRequestDispatcher("crop_detail.jsp").forward(request, response);
            } else if (cropID_String == null) {
                //  HttpSession session = request.getSession();
                Crop cropSes = (Crop) session.getAttribute("cropS");
                session.setAttribute("cropS", cropSes);
                int cropID = cropSes.getCropID();
                List<Pond> pondListbyCropID = pondDao.getPondByCropID(cropID);
                request.setAttribute("listPondByCropID", pondListbyCropID);
                request.setAttribute("cropDetail", cropSes);
                
                
                
                //Create session for employee validation
                // Employee eWithSession = (Employee) session.getAttribute("accEmp");
                int employeeID = eWithSession.getEmployeeID();
                CropEmployeeAuthorization cropEmployeeAuthorization = dao.getCropEmployeeAuthorizationByEIDCID(employeeID, cropID);
                //session.setAttribute("cropEmployeeAuthorizationS", cropEmployeeAuthorization);
                request.setAttribute("cropEmployeeAuthorization", cropEmployeeAuthorization);
                //
                
                
                
                request.getRequestDispatcher("crop_detail.jsp").forward(request, response);
            }
        } else if (uWithSession != null) {
            if (cropID_String != null) {
                // HttpSession session = request.getSession();
                session.removeAttribute("cropS");
                int cropID = Integer.parseInt(cropID_String);
                Crop crop = cropDao.getCropByCID(cropID);
                session.setAttribute("cropS", crop);
                List<Pond> pondListbyCropID = pondDao.getPondByCropID(cropID);
                request.setAttribute("listPondByCropID", pondListbyCropID);
                request.setAttribute("cropDetail", crop);
                request.getRequestDispatcher("crop_detail.jsp").forward(request, response);
            } else if (cropID_String == null) {
                //  HttpSession session = request.getSession();
                Crop cropSes = (Crop) session.getAttribute("cropS");
                session.setAttribute("cropS", cropSes);
                int cropID = cropSes.getCropID();
                List<Pond> pondListbyCropID = pondDao.getPondByCropID(cropID);
                request.setAttribute("listPondByCropID", pondListbyCropID);
                request.setAttribute("cropDetail", cropSes);
                request.getRequestDispatcher("crop_detail.jsp").forward(request, response);
            }

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
