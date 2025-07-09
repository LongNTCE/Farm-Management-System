/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityHarvest;

import dao.FacilityHarvestDAO;
import entity.FacilityHarvest_Record;
import entity.FacilityHarvest_Table;
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
@WebServlet(name = "ViewFHarvestDetailControl", urlPatterns = {"/facilityHarvestDetail"})
public class ViewFHarvestDetailControl extends HttpServlet {

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
        FacilityHarvestDAO fHarvestDao = new FacilityHarvestDAO();
        String fHarvestTID_String = request.getParameter("fHarvestTID");

        if (fHarvestTID_String != null) {
            HttpSession session = request.getSession();
            session.removeAttribute("harvestS");
            int fHarvestTID = Integer.parseInt(fHarvestTID_String);
            FacilityHarvest_Table harvestTable = fHarvestDao.getHarvestTableByFTID(fHarvestTID);
            session.setAttribute("harvestS", harvestTable);
            List<FacilityHarvest_Record> fHarvestRecordList = fHarvestDao.getFHarvestDetailByTable(fHarvestTID);
            request.setAttribute("listFHarvestDetail", fHarvestRecordList);
            request.getRequestDispatcher("facility_harvest_detail.jsp").forward(request, response);
        } else if (fHarvestTID_String == null) {
            HttpSession session = request.getSession();
            FacilityHarvest_Table hs = (FacilityHarvest_Table) session.getAttribute("harvestS");
            session.setAttribute("harvestS", hs);
            int fHarvestTID = hs.getfHarvestTID();
            List<FacilityHarvest_Record> fHarvestRecordList = fHarvestDao.getFHarvestDetailByTable(fHarvestTID);
            request.setAttribute("listFHarvestDetail", fHarvestRecordList);
            request.getRequestDispatcher("facility_harvest_detail.jsp").forward(request, response);
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
        int fDeleteHarvestTID = Integer.parseInt(request.getParameter("ccc"));
        FacilityHarvestDAO fHarvestDao = new FacilityHarvestDAO();
        fHarvestDao.deleteHarvestRecord(fDeleteHarvestTID);
        response.sendRedirect("facilityHarvestDetail");
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
