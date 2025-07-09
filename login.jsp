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
        <div class="preloader justify-content-center center" id="preloader" >

            <img  src="./images/preloading2forever.gif" style=""/>

            <!--        <div class="loader" id="loader" >
                        <label><span></span></label>
                        <label><span></span></label>
                        <label><span></span></label>
                        <label><span></span></label>
            
                    </div>-->

            <style>
                .center {

                    display: flex;
                    align-items: center;
                    justify-content: center;

                }
            </style>

        </div>

    <div class="container py-5 h-150">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-xl-10">
                <div class="card rounded-3 text-black">
                    <div class="row g-0">
                        <div class="col-12 col-lg-6">
                            <div class="card-body p-md-5 mx-md-4">

                                <div class="text-center">
                                    <img src="./images/shrimp.jpg" alt="logo">
                                    <h4 class="mt-1 mb-5 pb-1">${login_welcome_text}</h4>
                                </div>






                                <form action="login" method="post">             



                                    <div class="form-outline">
                                        <input type="text" name="login_username" value="${login_username}" class="form-control" placeholder="Email" required="required"/><p class="text-danger"> ${mess}</p><p class="text-danger"> ${successMess}</p>
                                    </div>

                                    <div class="form-outline">
                                        <input type="password" name="login_pass" value="${login_pass}" class="form-control" placeholder="${signup_password_text}" required="required"/><p class="text-danger"> ${mess2}</p>
                                    </div>

                                    <input type ="checkbox" name="checkBox" value="checked">${login_remember_me_text}



                                    <h5 class=" text-center">${login_login_with_role_text}</h5>
                                    <select class="form-select form-select-sm mb-2"  id="login_role" name="login_role" aria-label=".form-select-sm example">

                                        <option  value="login_type_employee">${login_login_role_employee_text}</option>
                                        <option  value="login_type_fowner">${login_login_role_facility_owner_text}</option>
                                        <option  value="login_type_coop">${login_login_role_cooperative_text}</option>

                                    </select>


                                    <div class="text-center pt-1 mb-5 py-3">
                                        <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5 pe-5 ps-5" type="submit">${login_login_btn_text}</button><br>

                                        <a class="btn btn-sm btn-outline-dark mt-2 pe-4 ps-4 " href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://nuoitomchuanvietgap.website:8080/Graduation-Java-Web-Project/login&response_type=code
                                           &client_id=694411138395-q77lsflkdt8d9ce0pqaubarb4ct2nb41.apps.googleusercontent.com&approval_prompt=force" role="button" style="text-transform:none">
                                            <img width="20px" style="margin-bottom:1px; margin-right:10px" alt="Google sign-in" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/512px-Google_%22G%22_Logo.svg.png" />
                                            ${login_login_with_google_account_text}
                                        </a>


                                        <!--                                       <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/Graduation-Java-Web-Project/login&response_type=code
                                                                                   &client_id=694411138395-65v71t6s2uvod07jgerlslr37v48qsj5.apps.googleusercontent.com&approval_prompt=force">Login With Google</a> -->
                                    </div>




                                </form>


                                <div class="d-flex align-items-center justify-content-center">
                                    <p class="mb-0 me-2">${login_create_new_account_text} </p>
                                    <button type="submit" class="btn btn-outline-danger"><a class="text-decoration-none" href="signup">${login_create_new_account_btn_text}</a>
                                    </button>

                                    <!--                                            <button type="submit" class="btn btn-outline-danger"> <a class="text-decoration-none" href="./employee_signup.jsp">Tạo tài khoản cho nhân công</a>
                                                                                </button>-->
                                </div>

                            </div>
                        </div>
                        <div class="col-12 col-lg-6 d-flex align-items-center signup-panel gradient-custom-2">
                            <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                                <h4 class="mb-4">${login_side_welcome_text}</h4>
                                <p class="small mb-0">${login_side_welcome_text2}</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>




    <script>
        var loader = document.getElementById("preloader");

        window.addEventListener("load", function () {
            loader.style.display = "none";
        })
    </script>
</body>
</html>
