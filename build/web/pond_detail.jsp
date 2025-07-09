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
                    <div class="row">
                        <div >
                            <a href="#" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto mt-3" aria-hidden="true"></i>Trở về trang trước</h6> 
                            </a>
                        </div>
                        <h2 class="d-flex justify-content-center">Chi tiết ao</h2>
                    </div>
                    <!--Grid column-->
                    <div class="col-md-6 mb-4">
                        <!--Content-->
                        <div class="p-4">
                            <h3>${pondDetail.pondName}</h3>


                            <table class="table-borderless">

                                <tbody>
                                    <tr>

                                        <td>Diện tích ao</td>
                                        <td><b> ${pondDetail.pondSquare}</b> </td>
                                    </tr>
                                    <tr>

                                        <td>Mã số ao</td>
                                        <td><b>${pondDetail.pondCode}</b></td>
                                    </tr>


                                </tbody>
                            </table>
                        </div>
                        <!--Content-->
                    </div>

                    <!--Grid column-->
                    <c:if test="${sessionScope.acc != null}">
                    <div class="col-md-6 mt-3">





                        <div class="row">




                            <h5>Lựa chọn báo cáo của bạn</h5>
                            <a href="pondInventory_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                Báo cáo kho của ao 
                            </a>




                            <a href="./pondSurvivalRate_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                Báo cáo tỷ lệ sống
                            </a>







                            <a href="pondWaterEnv_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                Báo cáo môi trường nước 
                            </a>

                        </div>





                        <h5>Lựa chọn thao tác của bạn</h5>
                        <div class="row mb-2">
                            <a href="./pond_edit.jsp" type="button" class="btn btn-primary col-5 m-1">
                                Sửa chi tiết ao
                            </a>
                            <a href="DeletePondControl" type="button" class="btn btn-danger col-5 m-1">
                                Xóa ao
                            </a>
                        </div>
                        <h5>Chuyển tới vụ mùa khác</h5>
                        <form action="movepond" method="post">
                            <div class="row mb-2">
                                <div class="col-6">
                                    <select class="form-select"  name="selectcrop" aria-label="Default select example">
                                        <option selected disabled>Open this select menu</option>
                                        <c:forEach items="${listCropByFacilityID}" var="o">
                                            <option value="${o.cropID}">${o.cropName}</option>
                                        </c:forEach>

                                    </select>
                                </div>
                                <div class="col-6">
                                    <button href="" type="submit" class="btn btn-primary col-6">
                                        Chuyển
                                    </button>
                                </div>

                            </div>
                        </form>

                    </div>
                    </c:if>
                    
                    <%-- EMPLOYEE --%>
                    
                    <c:if test="${sessionScope.accEmp != null}">
                    <div class="col-md-6 mt-3">





                        <div class="row">




                            <h5>Lựa chọn báo cáo của bạn</h5>
                            <c:if test="${pondEmployeeAuthorization.allowInventoryRecord == true}">
                            <a href="pondInventory_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                Báo cáo kho của ao 
                            </a>
                            </c:if>
                            <c:if test="${pondEmployeeAuthorization.allowInventoryRecord == false}">
                            <button href="" style="background-color: gray" type="submit" class="col-10 m-1 btn btn-secondary">
                                Báo cáo kho của ao 
                            </button>
                            </c:if>



                            <c:if test="${pondEmployeeAuthorization.allowSurvivalRecord == true}">
                            <a href="./pondSurvivalRate_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                Báo cáo tỷ lệ sống
                            </a>
                            </c:if>
                            <c:if test="${pondEmployeeAuthorization.allowSurvivalRecord == false}">
                            <button href="" style="background-color: gray" type="submit" class="col-10 m-1 btn btn-secondary">
                                Báo cáo tỷ lệ sống
                            </button>
                            </c:if>






                            <c:if test="${pondEmployeeAuthorization.allowWaterRecord == true}">
                            <a href="pondWaterEnv_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                Báo cáo môi trường nước 
                            </a>
                            </c:if>
                            <c:if test="${pondEmployeeAuthorization.allowWaterRecord == false}">
                            <button href="" style="background-color: gray" type="submit" class="col-10 m-1 btn btn-secondary">
                                Báo cáo môi trường nước 
                            </button>
                            </c:if>

                        </div>





                        <h5>Lựa chọn thao tác của bạn</h5>
                        <div class="row mb-2">
                            <a href="./pond_edit.jsp" type="button" class="btn btn-primary col-5 m-1">
                                Sửa chi tiết ao
                            </a>
                            <a href="DeletePondControl" type="button" class="btn btn-danger col-5 m-1">
                                Xóa ao
                            </a>
                        </div>
                        <h5>Chuyển tới vụ mùa khác</h5>
                        <form action="movepond" method="post">
                            <div class="row mb-2">
                                <div class="col-6">
                                    <select class="form-select"  name="selectcrop" aria-label="Default select example">
                                        <option selected disabled>Open this select menu</option>
                                        <c:forEach items="${listCropByFacilityID}" var="o">
                                            <option value="${o.cropID}">${o.cropName}</option>
                                        </c:forEach>

                                    </select>
                                </div>
                                <div class="col-6">
                                    <button href="" type="submit" class="btn btn-primary col-6">
                                        Chuyển
                                    </button>
                                </div>

                            </div>
                        </form>

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

                    </div>
                    <!--Grid column-->
                </div>
                <!--Grid row-->

                <!--Grid row-->
                <div class="row wow fadeIn">
                    <!--Grid column-->
                    <div class="row">
                        <div class="row mt-3">














                        </div>

                    </div>
                </div>
                <!--Grid row-->
            </div>
        </div>
        <!--Main layout-->

        <!--Footer-->
        <div class="container mb-5">
            <jsp:include page="./footer.jsp" />
        </div>
        <!--/.Footer-->
    </body>
</html>
