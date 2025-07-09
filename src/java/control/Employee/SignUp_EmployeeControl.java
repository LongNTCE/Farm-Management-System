/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Employee;

import dao.FacilityEmployeeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class SignUp_EmployeeControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Pattern emailPatterns = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
//    Pattern namePatterns = Pattern.compile("^[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+ [AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+(?: [AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]*)*");
    Pattern phonePatterns = Pattern.compile("^(0|\\+84)(\\s|\\.)?((1[0-9])|(3[0-9])|(5[0-9])|(7[0-9])|(8[0-9])|(9[0-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$");
    Pattern passPatterns = Pattern.compile("^[A-Za-z\\d@$!%*#?&]{8,32}$");

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        FacilityEmployeeDAO feDAO = new FacilityEmployeeDAO();
        String user = request.getParameter("signup_employee_username").trim();
        String email = request.getParameter("signup_employee_email").trim();
        String phoneNum = request.getParameter("signup_employee_phoneNum").trim();
        String password = request.getParameter("signup_employee_pass").trim();
        String repass = request.getParameter("signup_employee_repass").trim();

        if (emailPatterns.matcher(email).matches() == true && phonePatterns.matcher(phoneNum).matches() == true) {
            String check[] = feDAO.checkEmployeeExist(email, phoneNum);
            System.out.println(check);
            if (check[0].equals("cac")) {
                request.setAttribute("errorMail", check[1]);
                request.setAttribute("signup_employee_username", user);
                request.setAttribute("signup_employee_phoneNum", phoneNum);
                request.setAttribute("signup_employee_email", email);
                request.setAttribute("signup_employee_pass", password);
                request.setAttribute("signup_employee_repass", repass);
                request.getRequestDispatcher("employee_signup.jsp").forward(request, response);
            } else if(check[0].equals("cac2")){
                request.setAttribute("errorMail", check[1]);
                request.setAttribute("errorPhone", check[2]);
                request.setAttribute("signup_employee_username", user);
                request.setAttribute("signup_employee_phoneNum", phoneNum);
                request.setAttribute("signup_employee_email", email);
                request.setAttribute("signup_employee_pass", password);
                request.setAttribute("signup_employee_repass", repass);
                request.getRequestDispatcher("employee_signup.jsp").forward(request, response);
            }else {
                feDAO.signupEmployee(user, email, phoneNum, password);
                response.sendRedirect("login");
            }

//                feDAO.signupEmployee(user, email, phoneNum, password);
//                response.sendRedirect("login");
        }

//        } else if (namePatterns.matcher(user).matches() == false) {
//            request.setAttribute("error1", "Sai format tên");
//
//            request.setAttribute("signup_employee_username", user);
//            request.setAttribute("signup_employee_phoneNum", phoneNum);
//            request.setAttribute("signup_employee_email", email);
//            request.setAttribute("signup_employee_pass", password);
//            request.setAttribute("signup_employee_repass", repass);
//            request.getRequestDispatcher("employee_signup.jsp").forward(request, response);
//
//        } 
//        if (emailPatterns.matcher(email).matches() == false) {
//            request.setAttribute("error2", "Sai format email");
//
//            request.setAttribute("signup_employee_username", user);
//            request.setAttribute("signup_employee_phoneNum", phoneNum);
//            request.setAttribute("signup_employee_email", email);
//            request.setAttribute("signup_employee_pass", password);
//            request.setAttribute("signup_employee_repass", repass);
//            request.getRequestDispatcher("employee_signup.jsp").forward(request, response);
//
//        } else if (phonePatterns.matcher(phoneNum).matches() == false) {
//            request.setAttribute("error3", "Sai format sđt");
//
//            request.setAttribute("signup_employee_username", user);
//            request.setAttribute("signup_employee_phoneNum", phoneNum);
//            request.setAttribute("signup_employee_email", email);
//            request.setAttribute("signup_employee_pass", password);
//            request.setAttribute("signup_employee_repass", repass);
//            request.getRequestDispatcher("employee_signup.jsp").forward(request, response);
//
//        } else if (passPatterns.matcher(password).matches() == false) {
//            request.setAttribute("error4", "Password có ít nhất 8 và nhiều nhất 32 bao gồm chữ và số");
//
//            request.setAttribute("signup_employee_username", user);
//            request.setAttribute("signup_employee_phoneNum", phoneNum);
//            request.setAttribute("signup_employee_email", email);
//            request.setAttribute("signup_employee_pass", password);
//            request.setAttribute("signup_employee_repass", repass);
//            request.getRequestDispatcher("employee_signup.jsp").forward(request, response);
//
//        } else if (user == null || phoneNum == null || email == null || password == null || repass == null) {
//            request.setAttribute("error5", "Không được để trống");
//
//            request.setAttribute("signup_employee_username", user);
//            request.setAttribute("signup_employee_phoneNum", phoneNum);
//            request.setAttribute("signup_employee_email", email);
//            request.setAttribute("signup_employee_pass", password);
//            request.setAttribute("signup_employee_repass", repass);
//            request.getRequestDispatcher("employee_signup.jsp").forward(request, response);
//        } else if (password != repass) {
//            request.setAttribute("error6", "Mật khẩu nhập lại không đúng");
//
//            request.setAttribute("signup_employee_username", user);
//            request.setAttribute("signup_employee_phoneNum", phoneNum);
//            request.setAttribute("signup_employee_email", email);
//            request.setAttribute("signup_employee_pass", password);
//            request.setAttribute("signup_employee_repass", repass);
//            request.getRequestDispatcher("employee_signup.jsp").forward(request, response);
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
        RequestDispatcher rd = request.getRequestDispatcher("employee_signup.jsp");
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
