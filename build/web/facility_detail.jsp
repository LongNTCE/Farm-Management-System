<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    </head>
    <body>
        <div class="container mb-5">

            <jsp:include page="./navBar.jsp" />

        </div>

        <!--Main layout-->
        <div class="container mt-5">
            <div class="container dark-grey-text mt-5">
                <!--Grid row-->
                <div class="row wow fadeIn mt-5">
                    <div class="row mt-3">
                        <a href="manage_viewall" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i> Trở về trang trước</h6> 
                        </a>
                        <h2 class="d-flex justify-content-center">Chi tiết cơ sở</h2>
                    </div>
                    <!--Grid column-->
                    <div class="col-md-6 mb-4">
                        <!--Content-->
                        <div class="p-4">
                            <h3>${facilityDetail.fName}</h3>
                               <table class="table-borderless">

                                <tbody>
                                    <tr>

                                        <td>Địa chỉ:</td>
                                        <td><b>${facilityDetail.fAddress}</b> </td>
                                    </tr>
                                    <tr>

                                        <td>Số điện thoại:</td>
                                        <td><b>${facilityDetail.fPhone}</b></td>
                                    </tr>
                                    <tr>

                                        <td>Tổng diện tích ao canh tác:</td>
                                        <td><b>${facilityDetail.fCultivatingPondSquare}</b> </td>
                                    </tr>
                                    <tr>

                                        <td>Tổng diện tích ao chứa:</td>
                                        <td><b>${facilityDetail.fStoragePondSquare}</b></td>
                                    </tr>
                                    <tr>

                                        <td>Tổng diện tích ao chứa bùn thải:</td>
                                        <td><b>${facilityDetail.fWastePondSquare}</b></td>
                                    </tr>
                                    <tr>

                                        <td>Loài canh tác:</td>
                                        <td><b>${facilityDetail.fCultivatingObject}</b></td>
                                    </tr>
                                    <tr>

                                        <td>Thời gian canh tác:</td>
                                        <td><b>${facilityDetail.fCultivatingTime}</b></td>
                                    </tr>
                                   
                                </tbody>
                            </table>

                         
                        </div>
                        <!--Content-->
                    </div>

                    <!--Grid column-->
                    <c:if test="${sessionScope.acc != null}">
                    <div class="col-md-6 mt-5">

                        <h5>Lựa chọn thao tác của bạn</h5>
                        <div class="row mb-2">
                            <a href="./facility_edit.jsp" type="button" class="btn btn-primary col-4 ms-3 m-1">
                                Sửa chi tiết cơ sở
                            </a>
                            <a href="deletefacility" type="submit" class="btn btn-danger col-4 m-1">
                                Xóa cơ sở
                            </a>



                            <a href="Manage_ViewEmployeeControl?facilityID=${facilityDetail.facilityID}" type="button" class="btn btn-primary col-8 m-1 ms-3">
                                Quản lý nhân công
                            </a>
                        </div>
                        <div class="row mb-2">
                            <a href="./crop_add.jsp" type="button" class="btn btn-success col-8 m-1 ms-3">
                                Thêm vụ mùa
                            </a>
                        </div>


                    </div>
                    </c:if>
                    <!--Grid column-->
                </div>
                <!--Grid row-->

                <hr />

                <!--Grid row-->
                <div class="row d-flex justify-content-center wow fadeIn">
                    <!--Grid column-->
                    <div class="col-md-6 text-center">
                        <div class="row mt-3">
                            <h2 class="d-flex justify-content-center">
                                Danh sách vụ mùa của cơ sở
                            </h2>
                        </div>
                    </div>
                    <!--Grid column-->
                </div>
                <!--Grid row-->

                <!--Grid row-->
                <div class="row wow fadeIn">
                    <!--Grid column-->
                    <div class="row">
                        <div class="row mt-3">
                            <c:forEach items="${listCropByFacilityID}" var="ol">
                                <div class="col-4 col-lg-4 ">
                                    <div class="card mb-3 farm-card">
                                        <div class="row no-gutters">
                                            <div class="col-md-4" style="max-height: 100%">
                                                <img
                                                    src="./images/jumbotron.jpg"
                                                    class="card-img"
                                                    alt="..."
                                                    />
                                            </div>
                                            <div class="col-md-8">
                                                <div class="card-body">
                                                    <h4 class="card-title">${ol.cropName}</h4>
                                                    <div class="row mt-2">
                                                        <div class="col-12">
                                                            <a
                                                                href="cropDetail?cropID=${ol.cropID}"
                                                                type="button"
                                                                class="col-12 btn btn-success"
                                                                >
                                                                Chi tiết
                                                            </a>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>


                          


                <!--Footer-->
                <div class="container mb-5">
                    <jsp:include page="./footer.jsp" />
                </div>
                <!--/.Footer-->
                </body>
                </html>