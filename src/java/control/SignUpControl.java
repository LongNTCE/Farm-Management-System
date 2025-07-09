/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import dao.FacilityEmployeeDAO;
import entity.FacilityOwner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "SignUpControl", urlPatterns = {"/signup"})
public class SignUpControl extends HttpServlet {

    Pattern emailPatterns = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
//    Pattern namePatterns = Pattern.compile("^[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+ [AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+(?: [AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]*)*");
    Pattern phonePatterns = Pattern.compile("^(0|\\+84)(\\s|\\.)?((1[0-9])|(3[0-9])|(5[0-9])|(7[0-9])|(8[0-9])|(9[0-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$");
    Pattern passPatterns = Pattern.compile("^[A-Za-z\\d@$!%*#?&]{8,32}$");

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
        RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
        rd.forward(request, response);
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

        DAO dao = new DAO();
        FacilityEmployeeDAO feDAO = new FacilityEmployeeDAO();

        String user = request.getParameter("signup_username").trim();
        String email = request.getParameter("signup_email").trim();
        String phoneNum = request.getParameter("signup_phoneNum").trim();
        String password = request.getParameter("signup_pass").trim();
        String repass = request.getParameter("signup_repass").trim();

        String check[] = feDAO.checkEmployeeExist(email, phoneNum);

        int[] checkConcu = new int[6];
        checkConcu[0] = -1;
        checkConcu[1] = -1;
        checkConcu[2] = -1;
        checkConcu[3] = -1;
        checkConcu[4] = -1;
        checkConcu[5] = -1;

        if (emailPatterns.matcher(email).matches() == false) {
            checkConcu[0] = 1;
        }
        if (phonePatterns.matcher(phoneNum).matches() == false) {
            checkConcu[1] = 1;
        }
        if (passPatterns.matcher(password).matches() == false) {
            checkConcu[2] = 1;
        }
        if (!password.equals(repass)) {
            checkConcu[3] = 1;
        }
        if (check[0].equals("cac")) {
            checkConcu[4] = 1;
        }
        if (check[0].equals("cac2")) {
            checkConcu[5] = 1;
        }

        String signUpRole = request.getParameter("signup_role");

        if (checkConcu[0] == 1) {
            request.setAttribute("error5", "Email sai ne");
            request.setAttribute("signup_user", user);
            request.setAttribute("signup_phoneNum", phoneNum);
            request.setAttribute("signup_email", email);
            request.setAttribute("signup_pass", password);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }
        if (checkConcu[1] == 1) {
            request.setAttribute("error5", "Phone sai ne");
            request.setAttribute("signup_user", user);
            request.setAttribute("signup_phoneNum", phoneNum);
            request.setAttribute("signup_email", email);
            request.setAttribute("signup_pass", password);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (checkConcu[2] == 1) {
            request.setAttribute("error5", "Pass sai ne");
            request.setAttribute("signup_user", user);
            request.setAttribute("signup_phoneNum", phoneNum);
            request.setAttribute("signup_email", email);
            request.setAttribute("signup_pass", password);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (checkConcu[3] == 1) {
            request.setAttribute("error5", "Xác nhận mật khẩu không đúng");
            request.setAttribute("signup_user", user);
            request.setAttribute("signup_phoneNum", phoneNum);
            request.setAttribute("signup_email", email);
            request.setAttribute("signup_pass", password);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (checkConcu[4] == 1) {
            request.setAttribute("errorMail", check[1]);
            request.setAttribute("signup_user", user);
            request.setAttribute("signup_phoneNum", phoneNum);
            request.setAttribute("signup_email", email);
            request.setAttribute("signup_pass", password);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (checkConcu[5] == 1) {
            request.setAttribute("errorMail", check[1]);
            request.setAttribute("errorPhone", check[2]);
            request.setAttribute("signup_user", user);
            request.setAttribute("signup_phoneNum", phoneNum);
            request.setAttribute("signup_email", email);
            request.setAttribute("signup_pass", password);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (signUpRole.equals("signup_type_fowner")) {
            dao.signupFO(user, email, phoneNum, password);
            request.setAttribute("error5", "yes babe");
            request.getRequestDispatcher("signup.jsp").forward(request, response);

        } else if (signUpRole.equals("signup_type_employee")) {
            feDAO.signupEmployee(user, email, phoneNum, password);
            request.setAttribute("error5", "yes BABE");
            request.getRequestDispatcher("signup.jsp").forward(request, response);

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
