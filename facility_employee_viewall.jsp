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
        <link rel="stylesheet" href="./css/crud.css" />
    </head>
    <body class="add-crop-body">
        <div class="container py-3 h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-10">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">

                            <div class="col-12">
                                <div class="card-body p-md-5 mx-md-4">
                                    <div class="text-center mb-3">
                                        <img src="./images/shrimp.jpg" alt="logo">
                                        <h4 class="">${edit_info_employee}</h4>
                                    </div>
                                    <form action="EditEmployeeControl" method="post">
                                        <div class="row form-outline mb-2">
                                            <label class="col-2 offset-2">${employee_management_fullname_text}</label>
                                            <input class="col-6" type="text" name="username" value="${tempEmp.employeeFullName}" id="" class="form-control"  required="required" title="Nhập 6 đến 20 kí tự bao gồm chữ cái và số." placeholder="Tên đầy đủ"/>
                                        </div>
                                        <div class="row form-outline mb-2" onclick="myFunction()">
                                            <label class="col-2 offset-2">Email</label>
                                            <input class="col-6" type="text" name="email" disabled value="${tempEmp.employeeEmail}" class="form-control"  placeholder="Email" required="required"title="Email không hợp lệ." />

                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-2 offset-2">${signup_phone_text}</label>
                                            <input class="col-6" type="text" pattern="[0][0-9]{9}" name="phoneNum" value="${tempEmp.employeePhone}" id="" required="required" class="form-control" title="Số điện thoại không hợp lệ." placeholder="Số điện thoại"/>

                                        </div>
                                        <div class="row form-outline mb-2">
                                            <label class="col-2 offset-2">${signup_password_text}</label>

                                            <input class="col-6" type="password" name="pass" value="${tempEmp.employeePassword}" onmouseover="mouseoverPass();" onmouseout="mouseoutPass();" id="pass1" class="form-control" placeholder="Mật khẩu" required="required" />
                                        </div>

                                        <p class="text-danger offset-2"> ${error}</p>


                                        <div class="text-center pt-1 mb-5">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">${edit_info_button}</button>
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
            function myFunction() {
                alert("${edit_info_cannot_edit_email}");
            }
        </script>
    </body>
</html>