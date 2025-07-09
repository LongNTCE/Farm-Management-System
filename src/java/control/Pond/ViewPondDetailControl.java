/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Pond;

import dao.DAO;
import dao.FacilityEmployeeDAO;
import dao.cropDAO;
import dao.pondDAO;
import entity.Crop;
import entity.Employee;
import entity.Facility;
import entity.FacilityOwner;
import entity.Pond;
import entity.PondEmployeeAuthorization;
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
@WebServlet(name = "ViewPondDetailControl", urlPatterns = {"/pondDetail"})
public class ViewPondDetailControl extends HttpServlet {

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
        pondDAO pondDao = new pondDAO();
        cropDAO cropDao = new cropDAO();
        FacilityEmployeeDAO dao = new FacilityEmployeeDAO();
        String pondID_String = request.getParameter("pondID");
        HttpSession session = request.getSession();
        Employee eWithSession = (Employee) session.getAttribute("accEmp");
        FacilityOwner uWithSession = (FacilityOwner) session.getAttribute("acc");
        if (uWithSession != null) {
            if (pondID_String != null) {
                //HttpSession session = request.getSession();
                session.removeAttribute("pondS");
                int pondID = Integer.parseInt(pondID_String);
                Pond pond = pondDao.getPondByPID(pondID);
                session.setAttribute("pondS", pond);
                request.setAttribute("pondDetail", pond);

                Facility facilitySes = (Facility) session.getAttribute("facilityS");
                session.setAttribute("facilityS", facilitySes);
                int facilityID = facilitySes.getFacilityID();
                List<Crop> cropListbyFacilityID = cropDao.getCropByFacilityID(facilityID);
                request.setAttribute("listCropByFacilityID", cropListbyFacilityID);
                request.getRequestDispatcher("pond_detail.jsp").forward(request, response);
            } else if (pondID_String == null) {
                //  HttpSession session = request.getSession();
                Pond pondSes = (Pond) session.getAttribute("pondS");
                session.setAttribute("pondS", pondSes);
                int pondID = pondSes.getPondID();
                Pond pond = pondDao.getPondByPID(pondID);
                HttpSession user_session = request.getSession();
                Facility facilitySes = (Facility) session.getAttribute("facilityS");
                session.setAttribute("facilityS", facilitySes);
                int facilityID = facilitySes.getFacilityID();
                List<Crop> cropListbyFacilityID = cropDao.getCropByFacilityID(facilityID);
                request.setAttribute("listCropByFacilityID", cropListbyFacilityID);
                request.setAttribute("pondDetail", pond);
                request.getRequestDispatcher("pond_detail.jsp").forward(request, response);
            }
        } else if (eWithSession != null) {
            if (pondID_String != null) {
                //HttpSession session = request.getSession();
                session.removeAttribute("pondS");
                int pondID = Integer.parseInt(pondID_String);
                Pond pond = pondDao.getPondByPID(pondID);
                session.setAttribute("pondS", pond);
                request.setAttribute("pondDetail", pond);

                Facility facilitySes = (Facility) session.getAttribute("facilityS");
                session.setAttribute("facilityS", facilitySes);
                int facilityID = facilitySes.getFacilityID();
                List<Crop> cropListbyFacilityID = cropDao.getCropByFacilityID(facilityID);
                request.setAttribute("listCropByFacilityID", cropListbyFacilityID);
                
                // Create session for pond employee auth
                int employeeID = eWithSession.getEmployeeID();
                PondEmployeeAuthorization pondEmployeeAuthorization = dao.getPondEmployeeAuthorizationByEIDCID(employeeID, pondID);
                request.setAttribute("pondEmployeeAuthorization", pondEmployeeAuthorization);
                //
                
                request.getRequestDispatcher("pond_detail.jsp").forward(request, response);
            } else if (pondID_String == null) {
                //  HttpSession session = request.getSession();
                Pond pondSes = (Pond) session.getAttribute("pondS");
                session.setAttribute("pondS", pondSes);
                int pondID = pondSes.getPondID();
                Pond pond = pondDao.getPondByPID(pondID);
                HttpSession user_session = request.getSession();
                Facility facilitySes = (Facility) session.getAttribute("facilityS");
                session.setAttribute("facilityS", facilitySes);
                int facilityID = facilitySes.getFacilityID();
                List<Crop> cropListbyFacilityID = cropDao.getCropByFacilityID(facilityID);
                request.setAttribute("listCropByFacilityID", cropListbyFacilityID);
                request.setAttribute("pondDetail", pond);
                
                
                // Create session for pond employee auth
                int employeeID = eWithSession.getEmployeeID();
                PondEmployeeAuthorization pondEmployeeAuthorization = dao.getPondEmployeeAuthorizationByEIDCID(employeeID, pondID);
                request.setAttribute("pondEmployeeAuthorization", pondEmployeeAuthorization);
                //
                
                
                request.getRequestDispatcher("pond_detail.jsp").forward(request, response);
            }
        }

//        int pondID = Integer.parseInt(pondID_String);
//
//       
//      
//        Pond pond = pondDao.getPondByPID(pondID);
//      
//        request.setAttribute("pondDetail", pond);
//
//        request.getRequestDispatcher("pond_detail.jsp").forward(request, response);
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
