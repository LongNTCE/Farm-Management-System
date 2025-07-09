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
                            <div class="col-12">
                                <div class="card-body p-md-5 mx-md-4">

                                    <div class="text-center">

                                        <h4 class="mt-1 mb-3 pb-1">Sửa thông tin cá nhân</h4>
                                    </div>






                                    <form id="contactForm">
                                        <!-- Name input -->
                                         
                                        <div class="mb-3">
                                            <h6 style="opacity: 0.6">Tên của bạn</h6>
                                            <input class="form-control" id="name" type="text" placeholder="" />
                                        </div>

                                        <!-- Email address input -->
                                      
                                            
                                        

                                        <!-- Phone number input -->
                                        <div class="mb-3">
                                             <h6 style="opacity: 0.6">Địa chỉ Email</h6>
                                            <input class="form-control" placeholder="" />
                                        </div>

                                        <!-- Message input -->
                                         <div class="mb-3">
                                              <h6 style="opacity: 0.6">Số điện thoại</h6>
                                            <input class="form-control" placeholder="" />
                                        </div>
                                        
                                        <div class="mb-3">
                                             <h6 style="opacity: 0.6">Mật khẩu</h6>
                                            <input class="form-control" id="emailAddress" type="email" placeholder="" />
                                        </div>

                                        <!-- Form submit button -->
                                        <div class="d-grid">
                                            <button class="btn btn-success btn-lg" type="submit">
                                                Chỉnh sửa thông tin
                                            </button>
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
            var loader = document.getElementById("preloader");

            window.addEventListener("load", function () {
                loader.style.display = "none";
            })
        </script>
    </body>
</html>
