/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.FacilityBreed;

import dao.FacilityBreedDAO;
import dao.pondDAO;
import entity.Crop;
import entity.FacilityBreed_Table;
import entity.FacilityInventory_Table;
import entity.FacilityBreed_Record;
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
 * @author msi-pc
 */
@WebServlet(name = "EditFBreedRecordControl", urlPatterns = {"/EditBreedRecord"})
public class EditFBreedRecordButtonControl extends HttpServlet {

    int fBreedID = 123;

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
        HttpSession session = request.getSession();
        fBreedID = Integer.parseInt(request.getParameter("fBreedID"));
        Crop cropSes = (Crop) session.getAttribute("cropS");
        FacilityBreed_Table s = (FacilityBreed_Table) session.getAttribute("breedS");
        int cropID = cropSes.getCropID();
        System.out.println(cropID);

        pondDAO pondDao = new pondDAO();
        FacilityBreedDAO dao = new FacilityBreedDAO();
        FacilityBreed_Record b = dao.getBreedRecordDetail(fBreedID);
        request.setAttribute("b", b);
        b.setPondName(dao.getPondNameByPID(b.getPondID()));

        List<Pond> pondListbyCropID = pondDao.getPondByCropID(cropID);
        for (int i = 0; i < pondListbyCropID.size(); i++) {
            Pond p = pondListbyCropID.get(i);
            if (p.getPondID() == b.getPondID()) {
                pondListbyCropID.remove(p);

            }
        }

        request.setAttribute("listPondByCropID", pondListbyCropID);
        System.out.println("lon" + fBreedID);
        request.getRequestDispatcher("facility_breed_detail_edit.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        FacilityBreed_Table s = (FacilityBreed_Table) session.getAttribute("breedS");
        request.setAttribute("ds", Integer.toString(fBreedID));
        System.out.println("....." + fBreedID);

        String breedRdate = request.getParameter("breedRdate").trim();
        int breedRpond = Integer.parseInt(request.getParameter("breedRpond"));
        double breedRsize = Double.parseDouble(request.getParameter("breedRsize"));
        int breedRdensity = Integer.parseInt(request.getParameter("breedRdensity"));
        String breedRsource = request.getParameter("breedRsource").trim();
        String breedRcert = request.getParameter("breedRcert").trim();
        FacilityBreedDAO dao = new FacilityBreedDAO();
        dao.editFacilityBreedRecord(fBreedID, breedRpond, breedRdate, breedRsize, breedRdensity, breedRsource, breedRcert);
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
