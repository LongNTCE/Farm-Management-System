/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityBreed;

import dao.FacilityBreedDAO;
import dao.pondDAO;
import entity.FacilityBreed_Record;
import entity.FacilityBreed_Table;
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
@WebServlet(name = "ViewFBreedDetailControl", urlPatterns = {"/facilityBreedDetail"})
public class ViewFBreedDetailControl extends HttpServlet {

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
        FacilityBreedDAO fBreedDao = new FacilityBreedDAO();
        String fBreedTID_String = request.getParameter("fBreedTID");
//         int fBreedTID = Integer.parseInt(fBreedTID_String);
        if (fBreedTID_String != null) {
            HttpSession session = request.getSession();
            session.removeAttribute("breedS");
            int fBreedTID = Integer.parseInt(fBreedTID_String);
            FacilityBreed_Table breedTable = fBreedDao.getbreedTableByFTID(fBreedTID);
            session.setAttribute("breedS", breedTable);
            List<FacilityBreed_Record> fBreedRecordList = fBreedDao.getFBreedDetailByTable(fBreedTID);
            pondDAO pondDAO = new pondDAO();
            List<FacilityBreed_Record> fBreedRecordList2 = new ArrayList();
            System.out.println("co ncudfsf");
            for (FacilityBreed_Record cc : fBreedRecordList) {
                cc.setPondSquare(pondDAO.getPondSquareByPID(cc.getPondID()));
                fBreedRecordList2.add(cc);
            }
            request.setAttribute("listFBreedDetail", fBreedRecordList2);

            request.getRequestDispatcher("facility_breed_detail.jsp").forward(request, response);

        } else if (fBreedTID_String == null) {
            HttpSession session = request.getSession();
            FacilityBreed_Table s = (FacilityBreed_Table) session.getAttribute("breedS");
            session.setAttribute("breedS", s);

            int fBreedTID = s.getfBreedTID();
            pondDAO pondDAO = new pondDAO();
            List<FacilityBreed_Record> fBreedRecordList = fBreedDao.getFBreedDetailByTable(fBreedTID);
            List<FacilityBreed_Record> fBreedRecordList2 = new ArrayList();
            System.out.println("co ncudfsf");
            for (FacilityBreed_Record cc : fBreedRecordList) {
                cc.setPondSquare(pondDAO.getPondSquareByPID(cc.getPondID()));
                fBreedRecordList2.add(cc);
            }
            request.setAttribute("listFBreedDetail", fBreedRecordList2);
            request.setAttribute("mess3", s.getfBreedTID());
            request.getRequestDispatcher("facility_breed_detail.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
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
        request.setCharacterEncoding("UTF-8");

        int allFBreedRID = Integer.parseInt(request.getParameter("ccc"));
        int fDeleteBreedTID = Integer.parseInt(request.getParameter("ccc"));
        FacilityBreedDAO fBreedDao = new FacilityBreedDAO();
        fBreedDao.deleteBreedRecord(fDeleteBreedTID);
        response.sendRedirect("facilityBreedDetail");

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
