/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Employee;
import entity.FacilityOwner;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "HomeControl", urlPatterns = {"/home"})
public class HomeControl extends HttpServlet {

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

        Cookie[] c = request.getCookies();
        String userName = "";
        String password = "";
        String loginType = "";

        if (c != null) {
            for (Cookie cookie : c) {

                System.out.println("n " + cookie.getName());
                System.out.println("v " + cookie.getValue());
                if (cookie.getName().equals("userName")) {
                    userName = cookie.getValue();
                }
                if (cookie.getName().equals("pass")) {
                    password = cookie.getValue();
                }
                if (cookie.getName().equals("role")) {
                    loginType = cookie.getValue();
                }

            }
        }
//
        System.out.println("my baby home" + userName);
        System.out.println("my baby home" + password);
        System.out.println("my baby home" + loginType);

        if (userName.equals("")) {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        } else {
            login(request, response, userName, password, loginType, "checked");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }

//        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//        rd.forward(request, response);
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

    private void login(HttpServletRequest request, HttpServletResponse response, String email, String pass, String role, String checkBox) throws ServletException, IOException {

        DAO dao = new DAO();

        Employee emp1 = null;
        FacilityOwner e = null;
        FacilityOwner a = null;

        HttpSession user_session = request.getSession();
        FacilityOwner uWithSession = (FacilityOwner) user_session.getAttribute("acc");
        Employee WithSession = (Employee) user_session.getAttribute("accEmp");

        if (role.equals("login_type_fowner")) {
            e = dao.checkUsername(email);
            a = dao.loginFO(email, pass);
            //add cookie

            HttpSession session = request.getSession();
            session.setAttribute("acc", a);
            session.setAttribute("accEmp", emp1);
            

        } else if (role.equals("login_type_employee")) {
            emp1 = dao.loginE(email, pass);
            
            HttpSession session = request.getSession();
            session.setAttribute("acc", a);
            session.setAttribute("accEmp", emp1);
        }

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
