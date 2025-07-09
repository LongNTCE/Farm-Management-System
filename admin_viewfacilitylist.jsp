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

        <link rel="stylesheet" href="./css/home.css" />
        <link rel="stylesheet" href="./css/manage2.css" />
        <link rel="stylesheet" href="./css/admin_viewfownerlist.css" />


        <!--Pagination-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simplePagination.js/1.6/simplePagination.css">
    </head>
    <body>
                <div class="container mb-5">

            <c:import url="NavBarControl" />           

        </div>

        <!--Main layout-->
        <div class="container mt-5">
            <div class="mt-5">
                <div class="mt-5">
                    <a href="home" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-4" aria-hidden="true"></i>Back to previous page</h6> 
                    </a>
                </div>


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
                                    Facility List
                                </button>
                                <a
                                    href="addfacility"
                                    id="add-farm-button"
                                    class="ms-2 m-1 btn btn-primary add-farm-button"
                                    >
                                    Add Facility 
                                </a>
                            </div>


                        </nav>


                        <div class="tab-content mt-3" id="nav-tabContent">
                            <!--Facility List-->
                            <div class="row">
                                <div class="row list-wrapper">
                                    <c:forEach items="${listF}" var="o">
                                        <!--                                        <div class="col col-lg-4">
                                                                                    <div class="card mb-3 farm-card">
                                                                                        <div class="row no-gutters">
                                                                                            <div class="col-md-4" style="max-height: 100%">
                                                                                                <img
                                                                                                src="./images/jumbotron.jpg"
                                                                                                class="card-img"
                                                                                                style="width: 100%; height: 135.6px; overflow: scroll"
                                                                                                alt="..."
                                                                                                />
                                                                                            </div>
                                                                                            <div class="col-md-8">
                                                                                                <div class="card-body">
                                                                                                     <h4 class="card-title"  style="height: 55px; overflow: auto">${o.fName}</h4>
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
                                                                                </div>-->

                                        <div  onclick="location.href = 'facilityDetail?facilityID=${o.facilityID}'"  class="col-md-4 col-lg-4 mt-3 clickable list-item" >
                                            <div class="two">
                                                <div class="d-flex justify-content-end pt-1">
                                                    <i class="mdi mdi-star-outline pr-1 star"></i>
                                                    <i class="mdi mdi-dots-horizontal dot"></i>
                                                </div>

                                                <div class="pt-3">

                                                    <h4 class="card-title"  style="height: 60px; overflow: auto; word-break: break-all;">${o.fName}</h4>

                                                </div>

                                                <div class="d-flex justify-content-start px-3 align-items-center">
                                                    <i class="mdi mdi-view-comfy task"></i>
                                                    <span class="quote2 pl">Address: <b name="foID">${o.fAddress}</b> </span>
                                                </div>
                                                <div class="d-flex justify-content-start px-3 align-items-center">
                                                    <i class="mdi mdi-view-comfy task"></i>
                                                    <span class="quote2 pl">Phone Number: <b>${o.fPhone}</b> </span>
                                                </div>
                                                <div class="d-flex justify-content-start px-3  align-items-center pb-2">
                                                    <i class="mdi mdi-view-comfy task"></i>
                                                    <span class="quote2 pl">Cultivating Time: <b>${o.fCultivatingTime}</b> </span>
                                                </div>


                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>

                                <div class="mt-3 d-flex justify-content-center mt-2">
                                    <div id="pagination-container"></div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/simplePagination.js/1.6/jquery.simplePagination.js"></script>
        <script>
                                            var items = $('.list-wrapper .list-item');
                                            var numItems = items.length;
                                            var perPage = 9;

                                            items.slice(perPage).hide();

                                            $('#pagination-container').pagination({
                                                items: numItems,
                                                itemsOnPage: perPage,
                                                prevText: "<",
                                                nextText: ">",
                                                onPageClick: function (pageNumber) {
                                                    var showFrom = perPage * (pageNumber - 1);
                                                    var showTo = showFrom + perPage;
                                                    items.hide().slice(showFrom, showTo).show();
                                                }
                                            });


        </script>
    </body>
</html>