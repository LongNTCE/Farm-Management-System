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
            <jsp:include page="./navBar.jsp" />
        </div>
        <div class="container mt-5">
            <div>

                <div class="mt-5">
                    <a href="" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-3" aria-hidden="true"></i>Trở về trang trước</h6> 
                    </a>
                </div>
                <h2>Danh sách chủ cơ sở</h2>

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

<!--                            <tr class="clickable-row" data-href='AuthorizeEmployee?employeeID=${fe.employeeID}'>
          <td>${fe.employeeID}</td>
          <td>${fe.employeeFullName}</td>
          <td>${fe.employeeEmail}</td>
          <td>${fe.employeePhone}</td>
          <td>${fe.employeePassword}</td>
          <td><a href="DeleteEmployeeControl?employeeID=${fe.employeeID}" class="btn btn-danger"><i class="fa fa-trash" aria-hidden="true"></i></a></td>
      </tr>
                        -->
                        <tr onclick="location.href = './all_facility.jsp'">


                            <td>Nguyễn Văn Tiến</td>
                            <td>tuilab@gmail.com</td>
                            <td>09876780322</td>
                            <td>038423</td>
                            <td>123523</td>
                            <td><button class="btn btn-danger"><i class="fa fa-trash" aria-hidden="true"></i></button></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>