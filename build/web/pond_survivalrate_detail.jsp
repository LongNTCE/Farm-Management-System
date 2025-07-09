<%-- 
    Document   : pond_breed
    Created on : Sep 28, 2022, 1:44:21 AM
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
        </script>
    </head>
    <body>
        <div class="container mb-5">
            <jsp:include page="./navBar.jsp" />
        </div>

        <div class="container mt-5">
            <div>
                <div class="mt-5">
                    <a href="#" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-3" aria-hidden="true"></i>Trở về trang trước</h6> 
                    </a>
                </div>
                <h2>Chi tiết báo cáo </h2>
                <div class="row">
                    <a href="AddSurvivalRateRecord" type="button" class="btn btn-primary ms-auto col-2">
                        Thêm 
                    </a>
                 
                    <button type="button" class="btn btn-danger  col-2">
                        Xóa
                    </button>
                </div>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Ngày tháng năm</th>
                            <th scope="col">Khối lượng tôm trung bình</th>
                            <th scope="col">Số tôm chết</th>
                            <th scope="col">Số tôm thất thoát</th>
                            <th scope="col">Số tôm bị bệnh</th>
                            <th scope="col">Mô tả dấu hiệu</th>
                            <th scope="col">Ước tính tỷ lệ sống</th>
                            <th scope="col">Thao tác</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach items="${listPSurvivalRateDetail}" var="ps">
                            <tr>

                                <td>${ps.survivalDate}</td>
                                <td>${ps.survivalMediumWeight}</td>
                                <td>${ps.deathNumber}</td>
                                <td>${ps.lossNumber}</td>
                                <td>${ps.diseaseNumber}</td>
                                <td>${ps.diseaseSign}</td>
                                <td>${ps.estimateSurvivalRate}</td>
                                <td>

                                    <div class="row g-0">
                                        <div class="col-6 g-0"> <a href="editSurvivalRateRecord?pondSurvivalRateID=${ps.pondSurvivalRateID}" class="btn btn-success"> Sửa</a></div>
                                        <div class="col-6 g-0"> <form action="pondSurvivalRateDetail" method ="post">
                                                <input hidden disable value="${ps.pondSurvivalRateID}" name="ccnek"/>
                                                <button href="pondSurvivalRateDetail"class="btn btn-danger" type="submit"> Xóa</button>
                                            </form></div>
                                    </div>



                                </td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>


            </div>
        </div>
    </body>
</html>
