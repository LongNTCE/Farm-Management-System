<!DOCTYPE html>
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
        <script>

            $(document).ready(function () {
                if ($("button.nav-link").hasClass("active")) {
                    $(".add-pond-button").hide();
                    $(".add-season-button ").hide();
                }
                ;
            });
        </script>



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

        <div class="container">
            <div class="mt-3">
                 <div class="mt-5">
                    <a href="cropDetail" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-3" aria-hidden="true"></i>Trở về trang trước</h6> 
                    </a>
                </div>
                
               

                <h2>Quản lý báo cáo giống</h2>
                <div class="row">
                    <div class="col-12">
                        <nav>
                            <div class="nav nav-tabs" id="nav-tab" role="tablist">




                                <button
                                    class="nav-link active nav-link-farm"
                                    id="nav-link-farm"
                                    data-bs-toggle="tab"
                                    data-bs-target="#nav-home"
                                    type="button"
                                    role="tab"
                                    aria-controls="nav-home"
                                    aria-selected="true"
                                    >
                                    Danh sách báo cáo giống
                                </button>

                                <!-- Button trigger modal -->
                                <!--Nav Link-->
                                <a
                                    href="./facility_breed_add.jsp"
                                    type="button nav-link"
                                    id="add-farm-button"
                                    class="ms-2 m-1 btn btn-primary add-farm-button"


                                    >
                                    Thêm báo cáo mới
                                </a>




                                <!--Select Option-->



                            </div>
                        </nav>
                        <div class="tab-content mt-3" id="nav-tabContent">
                            <!--Tab Pane Farm-->
                            <div
                                class="tab-pane fade show active"
                                id="nav-home"
                                role="tabpanel"
                                aria-labelledby="nav-home-tab"
                                >
                                <div class="row">
                                    <c:forEach items="${listBreedRecordByCID}" var="br">
                                        <div class="col col-lg-4">
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

                                                            <h4 class="card-title">${br.fBreedTName}</h4>

                                                            <div class="row mt-2  g-0">
                                                                <div class="col-3 ms-1">
                                                                    <a
                                                                        href="facilityBreedDetail?fBreedTID=${br.fBreedTID}"
                                                                        type="button nav-link"
                                                                        id="add-farm-button"
                                                                        class="btn btn-primary add-farm-button col-12"


                                                                        >
                                                                        Xem
                                                                    </a>
                                                                </div>
                                                                <div class="col-3 ms-1">
                                                                    <a
                                                                        href="EditFacilityBreedTableButton?fBreedTID=${br.fBreedTID}"
                                                                        type="button nav-link"
                                                                        id="add-farm-button"
                                                                        class="btn btn-primary add-farm-button col-12"


                                                                        >
                                                                        Sửa
                                                                    </a>
                                                                </div>
                                                                <div class="col-3 ms-1">
                                                                    <form action="facilityBreed_Management" method ="post">
                                                                        <input hidden disable value="${br.fBreedTID}" name="ccc"/>
                                                                        <button
                                                                            href="facilityBreed_Management"
                                                                            type="button nav-link"
                                                                            id="add-farm-button"
                                                                            class="btn btn-danger add-farm-button col-12"
                                                                            type="submit"

                                                                            >
                                                                            Xóa
                                                                        </button>

                                                                    </form>
                                                                </div>

                                                            </div>


                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>




                                </div>
                            </div>

                        </div>

                    </div>

                </div>
            </div>

            <!--Bookmark-->


    </body>
</html>
