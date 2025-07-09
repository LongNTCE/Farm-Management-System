/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityBreed;

import dao.FacilityBreedDAO;
import entity.FacilityBreed_Table;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author msi-pc
 */
@WebServlet(name = "EditFacilityBreedTableButtonControl", urlPatterns = {"/EditFacilityBreedTableButton"})
public class EditFacilityBreedTableButtonControl extends HttpServlet {

    int fBreedTID = 123;
    FacilityBreedDAO dao = new FacilityBreedDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        request.getRequestDispatcher("facility_breed_edit.jsp").forward(request, response);
//       int fBreedTID = Integer.parseInt(request.getParameter("fBreedTID"));
//        System.out.println("lon"+fBreedTID);
//      
//        String edit_fBreedName = request.getParameter("edit_fBreedName");
//        System.out.println(edit_fBreedName);
//        FacilityBreedDAO dao = new FacilityBreedDAO();
//        response.sendRedirect("facilityBreed_Management");
//        dao.editFacilityBreedTable(fBreedTID, edit_fBreedName);
//        request.getRequestDispatcher("facilityBreedDetail").forward(request, response);
//       
//    }

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
        fBreedTID = Integer.parseInt(request.getParameter("fBreedTID"));

        FacilityBreed_Table fBreedTableDetail = dao.getFBreedTableDetail(fBreedTID);

        request.setAttribute("fBreedTableDetail", fBreedTableDetail);

        System.out.println("lon" + fBreedTID);
        request.getRequestDispatcher("./facility_breed_edit.jsp").forward(request, response);

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
        String username = request.getParameter("xamlon").trim();
        System.out.println("lon123 " + username);
        request.setAttribute("ds", Integer.toString(fBreedTID));
        FacilityBreedDAO dao = new FacilityBreedDAO();
        dao.editFacilityBreedTable(fBreedTID, username);

        response.sendRedirect("facilityBreed_Management");

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
