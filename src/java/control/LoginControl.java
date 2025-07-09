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
import static java.lang.System.out;
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
@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {

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
//        request.setCharacterEncoding("UTF-8");
//        String username = request.getParameter("login_username").trim();
//        String password = request.getParameter("login_pass").trim();
//        String login_role = request.getParameter("login_role");
//        login(request, response, username, password, login_role);
        
//        if (a == null) {
//            request.setAttribute("mess", "Tên đăng nhập không đúng");
//            request.setAttribute("login_username", username);
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        } else {
//            //     request.getRequestDispatcher("home").forward(request, response);
//            if (a == null) {
//                request.setAttribute("mess2", "Mật khẩu không đúng");
//                request.setAttribute("login_username", username);
//                request.setAttribute("login_pass", password);
//
//                request.getRequestDispatcher("login.jsp").forward(request, response);
//            } else {

// 
//
//                HttpSession session = request.getSession();
//                session.setAttribute("acc", a);
//                session.setAttribute("accEmp", emp1);
////            response.sendRedirect("index.jsp");
//
//                if (login_role.equals("login_type_fowner")) {
//                    session.setAttribute("acc", a);
//                    session.setAttribute("accEmp", emp1);
//                } else if (login_role.equals("login_type_employee")) {
//                    session.setAttribute("acc", a);
//                    session.setAttribute("accEmp", emp1);
//                } else {
//
//                }
//                response.sendRedirect("index.jsp");
//            }
//        }
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
        HttpSession user_session = request.getSession();
        FacilityOwner uWithSession = (FacilityOwner) user_session.getAttribute("acc");
        Employee eWithSession = (Employee) user_session.getAttribute("accEmp");
        String checkBox = request.getParameter("checkBox");
        checkBox = "checked";
        //get cookie

        Cookie[] c = request.getCookies();
        String userName = "";
        String password = "";
        String loginType = "";
        
        
        
        
        for (Cookie cookie : c) {

            System.out.println("n "+cookie.getName());
            System.out.println("v "+cookie.getValue());
            if(cookie.getName().equals("userName")){
                userName = cookie.getValue();
            }
            if(cookie.getName().equals("pass")){
                password = cookie.getValue();
            }
            if(cookie.getName().equals("role")){
                loginType = cookie.getValue();
            }

        }

        System.out.println("my baby" + userName);
        System.out.println("my baby" + password);
        System.out.println("my baby" + loginType);
        // c[1].getValue();
//        System.out.println("giá trị: " + c.getValue());
        //  c[2].getValue();
        // c[3].getValue();
//        System.out.println("cookies " + c[1].getValue());
        //
        

        if(userName.equals("")){
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);
        } else{
            login(request, response, userName, password, loginType, checkBox);
        }
       
//        if (uWithSession != null || eWithSession != null) {
//            RequestDispatcher rdx = request.getRequestDispatcher("home");
//            rdx.forward(request, response);
//        } else {
//            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//            rd.forward(request, response);
//        }
        

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
        String username = request.getParameter("login_username").trim();
        String password = request.getParameter("login_pass").trim();
        String login_role = request.getParameter("login_role");
        String checkBox = request.getParameter("checkBox");
        System.out.println("checkkkkconcu " + checkBox);

        login(request, response, username, password, login_role,checkBox);
       
    }

    
    private void login(HttpServletRequest request, HttpServletResponse response, String email, String pass, String role, String checkBox)throws ServletException, IOException{
        

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
            Cookie c1 = new Cookie("userName", email);
            Cookie c2 = new Cookie("pass", pass);
            Cookie c3 = new Cookie("role", role);

            if (a == null) {
                request.setAttribute("mess", "Tên đăng nhập không đúng");
                request.setAttribute("login_username", email);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("acc", a);
                session.setAttribute("accEmp", emp1);
                System.out.println("check nè 1 " + checkBox);
                if (checkBox == null) {
                    //add cookie
                    c1.setMaxAge(0);
                    c2.setMaxAge(0);
                    c3.setMaxAge(0);
                    response.addCookie(c1);
                    response.addCookie(c2);
                    response.addCookie(c3);
                    response.sendRedirect("home");

                } else if (checkBox.equals("checked")) {

                    System.out.println("check nè " + checkBox);
                    c1.setMaxAge(60 * 60 * 24 * 30);
                    c2.setMaxAge(60 * 60 * 24 * 30);
                    c3.setMaxAge(60 * 60 * 24 * 30);
                    response.addCookie(c1);
                    response.addCookie(c2);
                    response.addCookie(c3);

                    response.sendRedirect("home");
                }
            }
        } else if (role.equals("login_type_employee")) {
            
            
            emp1 = dao.loginE(email, pass);
            
            Cookie c1 = new Cookie("userName", email);
            Cookie c2 = new Cookie("pass", pass);
            Cookie c3 = new Cookie("role", role);
            if (emp1 == null) {
                request.setAttribute("mess", "Tên đăng nhập không đúng");
                request.setAttribute("login_username", email);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("acc", a);
                session.setAttribute("accEmp", emp1);
//            response.sendRedirect("index.jsp");

                if (checkBox == null) {
                    //add cookie
                    c1.setMaxAge(0);
                    c2.setMaxAge(0);
                    c3.setMaxAge(0);
                    response.addCookie(c1);
                    response.addCookie(c2);
                    response.addCookie(c3);
                    response.sendRedirect("home");

                } else if (checkBox.equals("checked")) {

                    System.out.println("check nè " + checkBox);
                    c1.setMaxAge(60 * 60 * 24 * 30);
                    c2.setMaxAge(60 * 60 * 24 * 30);
                    c3.setMaxAge(60 * 60 * 24 * 30);
                    response.addCookie(c1);
                    response.addCookie(c2);
                    response.addCookie(c3);

                    response.sendRedirect("home");
                }

            }

        }

    }
    private void loginConcu(HttpServletRequest request, HttpServletResponse response,String email, String pass, String role) throws ServletException, IOException{
        System.out.println("HEllo BITCHES");
        DAO dao = new DAO();
        FacilityOwner chim = dao.loginFO(email, pass);
        System.out.println("Chim " + chim);
        response.sendRedirect("home");
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
