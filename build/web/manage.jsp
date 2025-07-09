<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
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

        <div class="container mb-5">
            <jsp:include page="./navBar.jsp" />
        </div>



        <!--Main layout-->
        <div class="container mt-5">
            <div class="mt-5">
                <div class="mt-5">
                    <a href="home" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-3" aria-hidden="true"></i>Trở về trang trước</h6> 
                    </a>
                </div>
                
                               

                <h2>Quản lý danh sách cơ sở</h2>
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
                                    Danh sách cơ sở
                                </button>

                                <!--Nav Link-->
                                <c:if test="${sessionScope.acc != null}">
                                <a
                                    href="./facility_add.jsp"
                                    id="add-farm-button"
                                    class="ms-2 m-1 btn btn-primary add-farm-button"

                                    >
                                    Thêm cơ sở
                                </a>
                                </c:if>


                            </div>
                        </nav>
                        <div class="tab-content mt-3" id="nav-tabContent">
                            <!--Facility List-->
                            <div class="row">

                                <div class="row">
                                    <c:forEach items="${listF}" var="o">
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
                                                            <h4 class="card-title">${o.fName}</h4>
                                                            <div class="row mt-2">
                                                                <div class="col-12">
                                                                    <a
                                                                        href="facilityDetail?facilityID=${o.facilityID}"
                                                                        type="button"
                                                                        class="col-12 btn btn-primary"
                                                                        >
                                                                        Xem chi tiết
                                                                    </a>
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
        </div>


    </body>
</html>
