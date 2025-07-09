<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>
        <!--Bootstrap 5-->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <!--Font awesome-->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
            integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <link rel="stylesheet" href="./css/employee_signup.css" />
    </head>
    <body class="signup-body">
        <div class="container py-3 h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-10">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">
                            <div class="col-12 col-lg-6 d-flex align-items-center gradient-custom-2 login-panel-employee" >
                                <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                                    <h4 class="mb-4">Hơn cả một phần mềm</h4>
                                    <p class="small mb-0">Chúng tôi mong muốn được hỗ trợ người dân trong việc nhập xuất báo cáo theo chuẩn VIETGAP</p>
                                </div>
                            </div>
                            <div class="col-12 col-lg-6">
                                <div class="card-body p-md-5 mx-md-4">
                                    <div class="text-center">
                                        <img src="./images/shrimp.jpg" alt="logo">
                                        <h4 class="">Phần mềm quản lý báo cáo nuôi tôm theo chuẩn VIETGAP</h4>
                                        <h6 class="text-primary mt-3">Đăng kí cho nhân công</h6>
                                    </div>
                                    <h4 class="text-danger"> ${error5}</h4>
                                    <form action="SignUp_EmployeeControl" method="post">

                                        <div class="form-outline mb-2">
                                            <input type="text" name="signup_employee_username" value="${signup_employee_username}" id="" class="form-control"  required="required" title="Nhập 6 đến 20 kí tự bao gồm chữ cái và số." placeholder="Tên đầy đủ"/>
                                            <p class="text-danger"> ${error1}</p>
                                        </div>
                                        <div class="form-outline mb-2">
                                            <input type="text" name="signup_employee_email" value="${signup_employee_email}" class="form-control"  placeholder="Email" required="required" pattern="[^@\s]+@[^@\s]+\.[^@\s]+" title="Email không hợp lệ." />
                                            <p class="text-danger"> ${error2}</p>
                                            <p class="text-danger"> ${errorMail}</p>
                                        </div>
                                        <div class="form-outline mb-2">
                                            <input type="text" name="signup_employee_phoneNum" value="${signup_employee_phoneNum}" id="" required="required" class="form-control" title="Số điện thoại không hợp lệ." placeholder="Số điện thoại"/>
                                            <p class="text-danger"> ${error3}</p>
                                            <p class="text-danger"> ${errorPhone}</p>
                                        </div>
                                        <div class="form-outline mb-2">
                                            <input type="password" name="signup_employee_pass" value="${signup_employee_pass}" onmouseover="mouseoverPass();" onmouseout="mouseoutPass();" id="pass1" class="form-control" placeholder="Mật khẩu" required="required" /><p class="text-danger"> ${error6}</p>
                                        </div>
                                        <div class="form-outline mb-2">
                                            <input type="password" name="signup_employee_repass" value="${signup_employee_repass}" onmouseover="mouseoverPass2();" onmouseout="mouseoutPass2();" id="pass2" class="form-control" placeholder="Nhập lại mật khẩu" required="required" /><p class="text-danger"> ${error6}</p>
                                        </div>
                                        <div class="text-center pt-1 mb-5">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">Đăng kí</button>
                                        </div>
                                        <div class="d-flex align-items-center justify-content-center">
                                            <p class="mb-0 me-2">Bạn đã có sẵn tài khoản? </p>
                                            <button type="button" class="btn btn-outline-danger"> <a href="./login.jsp" class="text-decoration-none">Đăng nhập</a></button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script>
            function mouseoverPass(obj) {
                var obj = document.getElementById('pass1');
                obj.type = "text";
            }
            function mouseoutPass(obj) {
                var obj = document.getElementById('pass1');
                obj.type = "password";
            }
            function mouseoverPass2(obj) {
                var obj = document.getElementById('pass2');
                obj.type = "text";
            }
            function mouseoutPass2(obj) {
                var obj = document.getElementById('pass2');
                obj.type = "password";
            }
        </script>
    </body>
</html>