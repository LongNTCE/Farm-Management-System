/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Facility;

import dao.DAO;
import dao.cropDAO;
import dao.pondDAO;
import entity.Crop;
import entity.Facility;
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
@WebServlet(name = "ViewFacilityDetailControl", urlPatterns = {"/facilityDetail"})
public class ViewFacilityDetailControl extends HttpServlet {

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
request.setCharacterEncoding("UTF-8");
        String facilityID_String = request.getParameter("facilityID");
        DAO dao = new DAO();
        cropDAO cropDao = new cropDAO();
        pondDAO pondDao = new pondDAO();
        if (facilityID_String != null) {
            HttpSession session = request.getSession();
            session.removeAttribute("facilityS");
            int facilityID = Integer.parseInt(facilityID_String);
            Facility facility = dao.getFacilityByFID(facilityID);
            session.setAttribute("facilityS", facility);
            List<Crop> cropListbyFacilityID = cropDao.getCropByFacilityID(facilityID);
            List<Pond> pondListByFID = pondDao.getPondByFID(facilityID);
            request.setAttribute("listCropByFacilityID", cropListbyFacilityID);
            request.setAttribute("facilityDetail", facility);
            request.setAttribute("listPondByFID", pondListByFID);
            request.getRequestDispatcher("facility_detail.jsp").forward(request, response);
        } else if (facilityID_String == null) {
            HttpSession session = request.getSession();
            Facility facilitySes = (Facility) session.getAttribute("facilityS");
            session.setAttribute("facilityS", facilitySes);
            int facilityID = facilitySes.getFacilityID();
            List<Crop> cropListbyFacilityID = cropDao.getCropByFacilityID(facilityID);
            List<Pond> pondListByFID = pondDao.getPondByFID(facilityID);

            request.setAttribute("listPondByFID", pondListByFID);
            request.setAttribute("listCropByFacilityID", cropListbyFacilityID);
            request.setAttribute("facilityDetail", facilitySes);

            request.getRequestDispatcher("facility_detail.jsp").forward(request, response);
        }
        //    Facility facilitySes =(Facility) session.getAttribute("facilityS");

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
