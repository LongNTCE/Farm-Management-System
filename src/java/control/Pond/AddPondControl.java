/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Pond;
import dao.DAO;
import dao.FacilityEmployeeDAO;
import entity.Crop;
import entity.Employee;
import entity.Facility;
import entity.Pond;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
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
public class AddPondControl extends HttpServlet {
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
         HttpSession cropSession = request.getSession();
        Crop crSession = (Crop) cropSession.getAttribute("cropS");
        Facility fSession = (Facility) cropSession.getAttribute("facilityS");
         
        int add_cropID = crSession.getCropID();
        
        
        String add_pondName = request.getParameter("add_pondName").trim();
        String add_pondCode = request.getParameter("add_pondCode").trim();
        
        
        String add_pondSquare_String = request.getParameter("add_pondSquare_String").trim();
        Double add_pondSquare = Double.parseDouble(add_pondSquare_String);
        DAO dao = new DAO();
        FacilityEmployeeDAO feDAO = new FacilityEmployeeDAO();
        
        dao.addPond(add_pondName, add_pondCode, add_pondSquare);
        Pond p = dao.getLastInsertID();
        
        List<Employee> listE = feDAO.getEmployeefID(fSession.getFacilityID());
        
        for(Employee e:listE){
           feDAO.initinitEmployeeAuthorizationForPond(e.getEmployeeID(), p.getPondID());
        }
        
        
        dao.addPondtoCrop(add_cropID, p.getPondID());
        response.sendRedirect("cropDetail");
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