<%-- 
    Document   : index
    Created on : Sep 8, 2022, 12:17:35 AM
    Author     : Admin
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"crossorigin="anonymous"></script>

        <!--Bootstrap 5-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />

        <!--Font awesome-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
              integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="./css/home.css" />

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

    </head>
    <body>

        <header style="background-image: url(./images/jumbotron.jpg)" class="jumbotron align-item-center">
            <div class="container">
                <div class="row row-header">
                    <div class="col-12 col-sm-6">
                        <h1><b>Phần mềm quản lý nuôi tôm chuẩn VIETGAP</b></h1>
                        <p>
                            Chúng tôi hướng tới trải nghiệm thân thiện người dùng trong quy trình quản lý. Trải nghiệm của bạn cũng là niềm vui đối với chúng tôi 

                        </p>
                    </div>
                    <div class="col-12 col-sm justify-content-center align-items-center align-self-center">
                        <img src="./images/img/logo.png" class="img-fluid" alt="" />
                    </div>
                    <div class="col-12 col-sm justify-content-center align-items-center align-self-center">
                        <button type="submit" class="btn btn-warning btn-block nav-link align-self-center">
                            <span>Bắt đầu quy trình quản lý của bạn</span>
                            <h1>${sessionScope.accEmp.employeeEmail}</h1>
                            <h1>${sessionScope.acc.foEmail}</h1>
                            <h1>${sessionScope.acc.foID}</h1>
                            <h1>${sessionScope.accEmp.employeeID}</h1>
                        </button>
                    </div>
                </div>
            </div>
        </header>


        <nav class="navbar navbar-dark navbar-expand-lg  bg-success fixed-top">
            <div class="container">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#Navbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href="#"><img src="./images/logo.png" height="30" width="61" alt="" /></a>
                <div class="collapse navbar-collapse " id="Navbar">
                    <ul class=" navbar-nav ms-auto" >

                        <!--Home-->
                        <li class="nav-item dropdown dropdown-mega dropdown-mega-home position-static">
                            <a class="nav-link " href="#" data-bs-toggle="dropdown" data-bs-auto-close="outside">Trang chú</a>


                        </li>


                        <c:if test="${sessionScope.acc != null}">
                            <!--Manage-->
                            <li class="nav-item dropdown dropdown-mega position-static">
                                <a class="nav-link dropdown-toggle" href="https://getbootstrap.com/docs/4.0/utilities/spacing/" data-bs-toggle="dropdown" data-bs-auto-close="outside">Quản lý</a>
                                <div class="dropdown-menu shadow">

                                    <div class="mega-content px-4">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <div class="col-12">Bạn muốn quản lý??</div>
                                                <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div1">

<!--                                        <img src="./images/morenew1withblur.jpg" alt="">-->
                                                    <div onclick="location.href='manage_viewall'" class="bottom-left justify-content-center">
                                                        Cơ sở</div>
                                                </div>
                                                

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </c:if>
                            
                            <c:if test="${sessionScope.accEmp != null}">
                            <!--Manage-->
                            <li class="nav-item dropdown dropdown-mega position-static">
                                <a class="nav-link dropdown-toggle" href="https://getbootstrap.com/docs/4.0/utilities/spacing/" data-bs-toggle="dropdown" data-bs-auto-close="outside">Quản lý</a>
                                <div class="dropdown-menu shadow">

                                    <div class="mega-content px-4">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <div class="col-12">Bạn muốn quản lý??</div>
                                                <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div1">

<!--                                        <img src="./images/morenew1withblur.jpg" alt="">-->
                                                    <div onclick="location.href='manage_viewall'" class="bottom-left justify-content-center">
                                                        Cơ sở</div>
                                                </div>
                                                

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </c:if>




                        <c:if test="${sessionScope.acc == null }">
                            <li class="nav-item">
                                <a class="nav-link" href="./login.jsp">Đăng nhập </a>
                            </li>
                        </c:if>


                        <li class="nav-item">
                            <a class="nav-link" href="logout">Đăng xuất </a>
                        </li>



                    </ul>
                </div>
            </div>
        </nav>


        <div class="container">
            <section class="stories-s-1 mt-5 mb-5 p-3">
                <div class="container">
                    <div class="content-section free-text-wrap">
                        <h2>Những gì chúng tôi có thể làm</h2>
                        <p>
                            Sau đây là những gì phần mềm của chúng tôi có thể đem tới cho 
                            những người nuôi tôm để họ có thể thuận tiện hơn trong việc
                            quản lý nuôi tôm cũng như xuất báo cáo.


                        </p>


                    </div>
                </div>
            </section>

            <div class="row news-card-row p-3">
                <div class="card col-6">
                    <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                    <div class="card-body">
                        <h5 class="card-title">Quản lý cơ sở</h5>
                        <p class="card-text">
                            This is a wider card with supporting text below as a natural
                            lead-in to additional content. This content is a little bit
                            longer.
                        </p>

                    </div>
                </div>
                <div class="card col-6">
                    <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                    <div class="card-body">
                        <h5 class="card-title">Quản lý vụ mùa</h5>
                        <p class="card-text">
                            This is a wider card with supporting text below as a natural
                            lead-in to additional content. This content is a little bit
                            longer.
                        </p>

                    </div>
                </div>
                <div class="card col-6 mt-4">
                    <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                    <div class="card-body">
                        <h5 class="card-title">Quản lý ao canh tác</h5>
                        <p class="card-text">
                            This is a wider card with supporting text below as a natural
                            lead-in to additional content. This content is a little bit
                            longer.
                        </p>

                    </div>
                </div>
                <div class="card col-6 mt-4">
                    <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                    <div class="card-body">
                        <h5 class="card-title">Các chức năng của nhân công</h5>
                        <p class="card-text">
                            This is a wider card with supporting text below as a natural
                            lead-in to additional content. This content is a little bit
                            longer.
                        </p>

                    </div>
                </div>
                <div class="card col-6 mt-4">
                    <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                    <div class="card-body">
                        <h5 class="card-title">Quản lý các báo cáo VIETGAP</h5>
                        <p class="card-text">
                            This is a wider card with supporting text below as a natural
                            lead-in to additional content. This content is a little bit
                            longer.
                        </p>
                    </div>
                </div>
                <div class="card col-6 mt-4">
                    <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                    <div class="card-body">
                        <h5 class="card-title">Xuất báo cáo theo tiêu chuẩn VIETGAP</h5>
                        <p class="card-text">
                            This is a wider card with supporting text below as a natural
                            lead-in to additional content. This content is a little bit
                            longer.
                        </p>

                    </div>
                </div>
            </div>

            <div class="footer-connect ">
                <div class="row mt-5">
                    <div class="col-xl-4 col-md-6">
                        <h2>Chúng tôi muốn đem tới <br /><b>Trải nghiệm tốt nhất</b></h2>
                        <h4>
                            Nếu có thắc mắc hãy điền vào biểu mẫu dưới dây và liên hệ với chúng tôi</h4>
                        <img class="footer-connect-image1 offset-1" src="./images/morenews1.jpg">
                        <img class="footer-connect-image2 offset-4 " src="./images/morenews2.jpg">
                    </div>
                    <div class="col-xl-4">
                        <!-- Bootstrap 5 starter form -->
                        <form id="contactForm">
                            <!-- Name input -->
                            <div class="mb-3">
                                <input class="form-control" id="name" type="text" placeholder="Tên của bạn" />
                            </div>

                            <!-- Email address input -->
                            <div class="mb-3">
                                <input class="form-control" id="emailAddress" type="email" placeholder="Địa chỉ Email" />
                            </div>

                            <!-- Phone number input -->
                            <div class="mb-3">
                                <input class="form-control" placeholder="Số điện thoại" />
                            </div>

                            <!-- Message input -->
                            <div class="mb-3">
                                <textarea class="form-control" id="message" type="text" placeholder="Tin nhắn"
                                          style="height: 10rem"></textarea>
                            </div>

                            <!-- Form submit button -->
                            <div class="d-grid">
                                <button class="btn btn-success btn-lg" type="submit">
                                    Liên hệ ngay
                                </button>
                            </div>


                        </form>
                    </div class="near-footer">
                    <div class="col-xl-4">
                        <img class="near-footer-img" src="./images/nuoitomsu.jpg" />
                    </div>
                </div>
            </div>

            <div class="contact-us-link">
                <a href="https://rivulis.com/about/#contact" class="p-2">
                    Chúng tôi tạo ra phần mềm này để tạo nên <b>TRẢI NGHIỆM TỐT NHẤT</b>. Hãy liên hệ với chúng tôi ngay hôm nay 
                </a>

            </div>

            <footer class="mt-5">
                <div class="row">
                    <div class="col-2">
                        <h5 class="mb-2">Contact</h5>
                        <ul class="nav">
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted"><i class="fas fa-phone-alt"></i> 0123456789</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted"><i class="fas fa-envelope-open-text"></i> abc@gmail.com</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted"><i class="fas fa-map"></i> Number 400, NVC noi dai, Ninh Kieu,
                                    Can Tho</a>
                            </li>

                        </ul>
                    </div>

                    <div class="col-2">
                        <h5 class="mb-3">Standards</h5>
                        <ul class="nav flex-column">

                            <li class="nav-item mb-3">
                                <a href="#" class="nav-link p-0 text-muted"><img src="./images/globalgap.jpg" height="40px"
                                                                                 width="40px" /></a>
                            </li>
                            <li class="nav-item mb-3">
                                <a href="#" class="nav-link p-0 text-muted"><img src="./images/vietgap.jpg" height="40px"
                                                                                 width="40px" /></a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-2">
                        <h5>Explore</h5>
                        <ul class="nav flex-column">
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted">Home</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted">Features</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted">Pricing</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted">FAQs</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted">About</a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-4 offset-1">
                        <form>
                            <h5>Subscribe to our newsletter</h5>
                            <p>Monthly digest of whats new and exciting from us.</p>
                            <div class="d-flex w-100 gap-2">
                                <label for="newsletter1" class="visually-hidden">Email address</label>
                                <input id="newsletter1" type="text" class="form-control" placeholder="Email address" />
                                <button class="btn btn-primary" type="button">Subscribe</button>
                            </div>
                        </form>
                    </div>
                </div>

                <div class="d-flex justify-content-between py-4 my-4 border-top">
                    <p>© 2021 Company, Inc. All rights reserved.</p>
                    <ul class="list-unstyled d-flex">
                        <li class="ms-3">
                            <a class="link-dark" href="#"><svg class="bi" width="24" height="24">
                                <use xlink:href="#twitter"></use>
                                </svg></a>
                        </li>
                        <li class="ms-3">
                            <a class="link-dark" href="#"><svg class="bi" width="24" height="24">
                                <use xlink:href="#instagram"></use>
                                </svg></a>
                        </li>
                        <li class="ms-3">
                            <a class="link-dark" href="#"><svg class="bi" width="24" height="24">
                                <use xlink:href="#facebook"></use>
                                </svg></a>
                        </li>
                    </ul>
                </div>
            </footer>
        </div>
    </body>
</html>
