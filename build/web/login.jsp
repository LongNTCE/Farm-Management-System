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

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js" integrity="sha512-2rNj2KJ+D8s1ceNasTIex6z4HWyOnEYLVC3FigGOmyQCZc2eBXKgOxQmo3oKLHyfcj53uz4QMsRCWNbLd32Q1g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>

        <!--Font awesome-->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
            integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />

        <link rel="stylesheet" href="./css/login.css" />
    </head>
    <body class="login-body">
        <div class="container py-5 h-150">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-10">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">
                            <div class="col-12 col-lg-6">
                                <div class="card-body p-md-5 mx-md-4">

                                    <div class="text-center">
                                        <img src="./images/shrimp.jpg" alt="logo">
                                        <h4 class="mt-1 mb-5 pb-1">Phần mềm quản lý quy trình nuôi tôm theo chuẩn VIETGAP</h4>
                                    </div>


                                    <form action="login" method="post">             



                                        <div class="form-outline">
                                            <input type="text" name="login_username" value="${login_username}" class="form-control" placeholder="Email" required="required"/><p class="text-danger"> ${mess}</p>
                                        </div>

                                        <div class="form-outline">
                                            <input type="password" name="login_pass" value="${login_pass}" class="form-control" placeholder="Mật khẩu" required="required"/><p class="text-danger"> ${mess2}</p>
                                        </div>
                                        
                                        <input type ="checkbox" name="checkBox" value="checked">Remember me



                                        <h5 class=" text-center">Đăng nhập với vai trò</h5>
                                        <select class="form-select form-select-sm mb-2"  id="login_role" name="login_role" aria-label=".form-select-sm example">

                                            <option  value="login_type_employee">Nhân Công</option>
                                            <option  value="login_type_fowner">Chủ cơ sở</option>

                                        </select>


                                        <div class="text-center pt-1 mb-5 py-3">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">Đăng nhập</button>

                                        </div>



                                    </form>
                                    <div class="d-flex align-items-center justify-content-center">
                                        <p class="mb-0 me-2">Tạo tài khoản mới cho </p>
                                        <button type="submit" class="btn btn-outline-danger"><a class="text-decoration-none" href="signup">Chủ cơ sở</a>
                                        </button>
                                        <button type="submit" class="btn btn-outline-danger ms-2"><a class="text-decoration-none" href="SignUp_EmployeeControl">Nhân công</a>
                                        </button>
                                        <!--                                            <button type="submit" class="btn btn-outline-danger"> <a class="text-decoration-none" href="./employee_signup.jsp">Tạo tài khoản cho nhân công</a>
                                                                                    </button>-->
                                    </div>

                                </div>
                            </div>
                            <div class="col-12 col-lg-6 d-flex align-items-center signup-panel gradient-custom-2">
                                <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                                    <h4 class="mb-4">We are more than just a company</h4>
                                    <p class="small mb-0">Login now so you can experience the new thing in shrimp management process</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
