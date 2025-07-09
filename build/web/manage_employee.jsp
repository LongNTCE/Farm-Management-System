
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>

        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
            crossorigin="anonymous"
        ></script>

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
        <script src="./js/modal.js"></script>
        <script src="./js/manage.js"></script>
        <link rel="stylesheet" href="./css/manage.css" />

        <!-- Latest compiled and minified JavaScript -->
        <!--JQuery 3.6.1-->
        <script
            src="//ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"
            language="javascript"
            type="text/javascript"
        ></script>

        <script
            src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"
        ></script>
        <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"
        ></script>


        <script>
            $("#myModal").on("shown.bs.modal", function () {
                $("#myInput").trigger("focus");
            });

            jQuery(document).ready(function ($) {
                $(".clickable-row").click(function () {
                    window.location = $(this).data("href");
                });
            });
        </script>
    </head>
    <body>
        <div class="container mb-5">
            <nav class="navbar navbar-dark navbar-expand-lg bg-success fixed-top">
                <div class="container">
                    <button
                        class="navbar-toggler"
                        type="button"
                        data-toggle="collapse"
                        data-target="#Navbar"
                        >
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <a class="navbar-brand" href="#"
                       ><img src="./images/logo.png" height="30" width="61" alt=""
                          /></a>
                    <div class="collapse navbar-collapse" id="Navbar">
                        <ul class="navbar-nav ms-auto">
                            <!--Navbar-->
                            <li
                                class="nav-item dropdown dropdown-mega dropdown-mega-home position-static"
                                >
                                <a
                                    class="nav-link dropdown-toggle"
                                    href="#"
                                    data-bs-toggle="dropdown"
                                    data-bs-auto-close="outside"
                                    >Home</a
                                >
                                <div class="dropdown-menu shadow">
                                    <div class="mega-content mega-content-home px-4">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <div class="col-12 col-sm-4 col-md-3 py-4">
                                                    <h6>At manage page, you can see the</h6>
                                                    <div class="list-group">
                                                        <a class="list-group-item" href="#">Accomodations</a>
                                                        <a class="list-group-item" href="#"
                                                           >Terms & Conditions</a
                                                        >
                                                        <a class="list-group-item" href="#">Privacy</a>
                                                    </div>
                                                </div>
                                                <div class="col-12 col-sm-4 col-md-3 py-4">
                                                    <h5>Card</h5>
                                                    <div class="card">
                                                        <img
                                                            src="img/banner-image.jpg"
                                                            class="img-fluid"
                                                            alt="image"
                                                            />
                                                        <div class="card-body">
                                                            <p class="card-text">
                                                                Some quick example text to build on the card title
                                                                and make up the bulk of the card's content.
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-12 col-sm-4 col-md-3 py-4">
                                                    <h5>About CodeHim</h5>
                                                    <p>
                                                        <b>CodeHim</b> is one of the BEST developer websites
                                                        that provide web designers and developers with a
                                                        simple way to preview and download a variety of free
                                                        code & scripts.
                                                    </p>
                                                </div>
                                                <div class="col-12 col-sm-12 col-md-3 py-4">
                                                    <h5>Damn, so many</h5>
                                                    <div class="list-group">
                                                        <a class="list-group-item" href="#">Accomodations</a>
                                                        <a class="list-group-item" href="#"
                                                           >Terms & Conditions</a
                                                        >
                                                        <a class="list-group-item" href="#">Privacy</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <!--Navbar Manage-->
                            <li class="nav-item dropdown dropdown-mega position-static">
                                <a
                                    class="nav-link dropdown-toggle"
                                    href="https://getbootstrap.com/docs/4.0/utilities/spacing/"
                                    data-bs-toggle="dropdown"
                                    data-bs-auto-close="outside"
                                    >Manage</a
                                >
                                <div class="dropdown-menu shadow">
                                    <div class="mega-content px-4">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <div class="col-12">Choose what you want to manage</div>
                                                <div class="col-12 col-sm-4 col-md-3 py-4 mega-container">
                                                    <img src="./images/morenews1.jpg" alt="" />
                                                    <div class="bottom-left">
                                                        <a
                                                            href="https://www.facebook.com/groups/205080044376292/?multi_permalinks=504860877731539&notif_id=1662210974078658&notif_t=group_highlights&ref=notif"
                                                            class="text-white"
                                                            >Farm</a
                                                        >
                                                    </div>
                                                </div>
                                                <div class="col-12 col-sm-4 col-md-3 py-4 mega-container">
                                                    <img src="./images/morenews1.jpg" alt="" />
                                                    <div class="bottom-left">
                                                        <a
                                                            href="https://www.facebook.com/groups/205080044376292/?multi_permalinks=504860877731539&notif_id=1662210974078658&notif_t=group_highlights&ref=notif"
                                                            class="text-white"
                                                            >Pond</a
                                                        >
                                                    </div>
                                                </div>
                                                <div class="col-12 col-sm-4 col-md-3 py-4 mega-container">
                                                    <img src="./images/morenews1.jpg" alt="" />
                                                    <div class="bottom-left">
                                                        <a
                                                            href="https://www.facebook.com/groups/205080044376292/?multi_permalinks=504860877731539&notif_id=1662210974078658&notif_t=group_highlights&ref=notif"
                                                            class="text-white"
                                                            >Season</a
                                                        >
                                                    </div>
                                                </div>
                                                <div class="col-12 col-sm-4 col-md-3 py-4 mega-container">
                                                    <img src="./images/morenews1.jpg" alt="" />
                                                    <div class="bottom-left">
                                                        <a
                                                            href="https://www.facebook.com/groups/205080044376292/?multi_permalinks=504860877731539&notif_id=1662210974078658&notif_t=group_highlights&ref=notif"
                                                            class="text-white"
                                                            >Storehouse</a
                                                        >
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="./aboutus.html"> Feedback</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="#">Information </a>
                            </li>

                            <li class="submenu menu-item">
                                <a href="" class="toggle"></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        <div class="container mt-5">
            <div>
                <h2>Quản lý nhân công</h2>
                <div class="row">
                    <a href="./employee_add.jsp" type="button" class="btn btn-primary ms-auto col-4 ms-3 m-1">
                        Thêm nhân công
                    </a>
                </div>

                <table class="table table-striped">
                    <thead>
                        <tr>  
                            <th scope="col">STT</th>
                            <th scope="col">Họ và tên</th>
                            <th scope="col">Email</th>
                            <th scope="col">Số điện thoại</th>
                            <th scope="col">Mật khẩu</th>
                            <th>Thao tác</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listEmployee}" var="fe">

                            <tr class="clickable-row" data-href='AuthorizeEmployee?employeeID=${fe.employeeID}'>

                                <td>${fe.employeeID}</td>
                                <td>${fe.employeeFullName}</td>
                                <td>${fe.employeeEmail}</td>
                                <td>${fe.employeePhone}</td>
                                <td>${fe.employeePassword}</td>

                                <td><a href="DeleteEmployeeControl?employeeID=${fe.employeeID}" class="btn btn-danger"><i class="fa fa-trash" aria-hidden="true"></i></a></td>

                            </tr>
                        </c:forEach>


                        <!--                  <tr>
                                       
                                           
                                            <td>Banh Thi B</td>
                                            <td>tuilab@gmail.com</td>
                                            <td>09876780322</td>
                                            <td>038423</td>
                                            <td><button class="btn btn-danger"><i class="fa fa-trash" aria-hidden="true"></i></button></td>
                                          </tr>-->

                    </tbody>
                </table>






            </div>
        </div>
    </body>
</html>