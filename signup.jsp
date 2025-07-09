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

        <!--JQuery 3.6.1-->
        <script
            src="//ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"
            language="javascript"
            type="text/javascript"
        ></script>

        <link rel="stylesheet" href="./css/login.css" />
    </head>
    <body class="signup-body">
        <div class="container py-3 h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-10">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">
                            <div class="col-12 col-lg-6 d-flex align-items-center login-panel gradient-custom-2">
                                <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                                    <h4 class="mt-1 mb-5 pb-1">${login_side_welcome_text}</h4>
                                    <P>${signup_side_welcome_text2}</P>

                                </div>
                            </div>
                            <div class="col-12 col-lg-6">
                                <div class="card-body p-md-5 mx-md-4">

                                    <div class="text-center">
                                        <img src="./images/shrimp.jpg" alt="logo">
                                        <h4 class="">${login_welcome_text}</h4>

                                    </div>

                                    <form action="signup" method="post">
                                        <p>${signup_choose_role_text}</p>
                                        <select class="form-select form-select-sm mb-2"  name="signup_role" aria-label=".form-select-sm example"  id="signup_role">
                                            <option  value="signup_type_fowner">${login_login_role_facility_owner_text}</option>
                                            <option  value="signup_type_employee">${login_login_role_employee_text}</option>
                                            <option  value="signup_type_coop">${login_login_role_cooperative_text}</option>

                                        </select>

                                        <div class="form-outline mb-2">
                                            <input type="text" name="signup_username" value="${signup_user}"  class="form-control"  required="required" title="Nhập 6 đến 20 kí tự bao gồm chữ cái và số." placeholder="${signup_full_name_text}"/><p class="text-danger"> ${error1}</p>

                                        </div>

                                        <!--                                        <div class="form-outline mb-2">
                                                                                    <input type="text" name="signup_email" value="${signup_email}" class="form-control"  placeholder="Email" required="required" pattern="[^@\s]+@[^@\s]+\.[^@\s]+" title="Email không hợp lệ." /><p class="text-danger"> ${error3}</p>
                                        
                                                                                </div>-->
                                        <div class="form-outline mb-2">
                                            <input type="text" name="signup_email" value="${signup_email}" class="form-control"  placeholder="Email" required="required"title="Email không hợp lệ." />
                                            <p class="text-danger"> ${error3}</p>
                                            <p class="text-danger"> ${errorMail}</p>

                                        </div>

                                        <div class="form-outline mb-2">
                                            <input type="text" pattern="[0][0-9]{9}" name="signup_phoneNum" value="${signup_phoneNum}" required="required" class="form-control" title="Số điện thoại không hợp lệ." placeholder="${signup_phone_text}"/>
                                            <p class="text-danger"> ${error2}</p>
                                            <p class="text-danger"> ${errorPhone}</p>

                                        </div>

                                        <div class="form-outline mb-2">
                                            <input type="text" id="address" name="address" value=""  class="form-control" placeholder="Addresss"/>
                                            <p class="text-danger"> ${error2}</p>
                                            <p class="text-danger"> ${errorPhone}</p>

                                        </div> 

                                        <div class="form-outline mb-2">
                                            <input type="password" name="signup_pass" value="${signup_pass}" onmouseover="mouseoverPass();" onmouseout="mouseoutPass();" id="pass1" class="form-control" placeholder="${signup_password_text}" required="required" />

                                        </div>

                                        <div class="form-outline mb-2">
                                            <input type="password" name="signup_repass" value="${signup_repass}" onmouseover="mouseoverPass2();" onmouseout="mouseoutPass2();" id="pass2" class="form-control" placeholder="${signup_re_type_password_text}" required="required" /><p class="text-danger"> ${error5}</p>

                                        </div>

                                            
                                        <div class="text-center pt-1 mb-5">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">${signup_signup_btn_text}</button>

                                        </div>

                                        <div class="d-flex align-items-center justify-content-center">
                                            <p class="mb-0 me-2">${signup_already_have_account_text}? </p>
                                            <button type="button" class="btn btn-outline-danger"> <a href="login" class="text-decoration-none">${signup_sign_in_now_text}</a></button>
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

        <script>
            var e = document.getElementById("signup_role");
            function onChange() {
                var value = e.value;
                var text = e.options[e.selectedIndex].text;
                console.log(value, text);

                if (value === "signup_type_fowner") {
                    $("#address").hide();

                }

                if (value === "signup_type_employee") {
                    $("#address").hide();

                }

                if (value === "signup_type_coop") {
                    $("#address").show();

                }
            }

            e.onchange = onChange;
            onChange();

        </script>
    </body>
</html>
