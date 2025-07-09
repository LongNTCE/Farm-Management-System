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
                <h2>Kho cơ sở</h2>
                <div class="row">
                    <a href="AddFacilityInventoryRecord" type="button" class="btn btn-primary ms-auto col-2">
                        Thêm 
                    </a>

                    <button type="button" class="btn btn-danger  col-2">
                        Xóa
                    </button>
                </div>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Tên sản phẩm</th>
                            <th scope="col">Ngày nhập</th>
                            <th scope="col">Số lượng</th>
                            <th scope="col">Tên nguồn</th>
                            <th scope="col">Ngày sản xuất</th>
                            <th scope="col">Ngày hết hạn</th>
                            <th scope="col">Thao tác</th>
                        </tr>
                    </thead>
                    <tbody>





                        <c:forEach items="${listFInventoryDetail}" var="fi">

                            <tr>

                                <td>${fi.productName}</td>
                                <td>${fi.importDate}</td>
                                <td>${fi.quantity}</td>

                                <td>${fi.sourceName}</td>
                                <td>${fi.manurfacturingDate}</td>
                                <td>${fi.expireDate}</td>

                                <td> <div class="row">
                                        <div class="col-5"> <a href="EditFInventoryRecordControl?fInventoryID=${fi.faInventoryID}" class="btn btn-success"> Sửa</a></div>
                                        <div class="col-5"> <form action="facilityInventoryDetail" method ="post">
                                                
                                                <button href="facilityInventoryDetail"class="btn btn-danger" type="submit"> Xóa</button>
                                                <input hidden disable value="${fi.faInventoryID}" name="ccc"/>
                                            </form></div>
                                    </div></td>

                            </c:forEach>
                    </tbody>
                </table>


            </div>
        </div>
    </body>
</html>
