<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
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
        <link rel="stylesheet" href="./css/crud.css" />
        <link rel="stylesheet" href="./css/admin_viewfownerlist.css" />
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
        <script>
            $(document).ready(function () {
                $('.clickable').click(function () {
                    window.location = $(this).find("a").attr("href");
                });
            });
        </script>


        <!--Pagination-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simplePagination.js/1.6/simplePagination.css">
    </head>
    <body>
        <div class="container mb-5">
          <jsp:include page="navBar.jsp" />  
            
        </div>
        <!--Main layout-->
        <div class="container mt-5">
            <div class="mt-5">
                <div class="mt-5">
                    <a href="home" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-3" aria-hidden="true"></i>Trở về trang trước</h6> 
                    </a>
                </div>
                <h2>Danh sách tất cả chủ cơ sở</h2>
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
                                    Tất cả chủ cơ sở
                                </button>
                                <!--Nav Link-->

                            </div>
                        </nav>
                        <div class="tab-content mt-3" id="nav-tabContent">
                            <!--Facility List-->
                            <div class="row">
                                <div class="row list-wrapper">
                                    <c:forEach items="${listAllFOwner}" var="a">
                                        <div  class="col-md-4 col-lg-4 mt-3 clickable list-item" >
                                            <div class="two">
                                                <div class="d-flex justify-content-end pt-1">
                                                    <i class="mdi mdi-star-outline pr-1 star"></i
                                                    ><i class="mdi mdi-dots-horizontal dot"></i>
                                                </div>
                                                <div class="px-3">
                                                    <div class="round">
                                                        <img
                                                            src="https://img.icons8.com/bubbles/100/000000/girl-with-glasses-art-palette.png"
                                                            width="23"
                                                            />
                                                    </div>
                                                </div>
                                                <div class="px-3 pt-3">
                                                    <h3 class="name">${a.foFullName}</h3>
                                                    <a href="ViewListFacilityByFOwner?foID=${a.foID}"></a>
                                                </div>
                                                <div class="d-flex justify-content-start px-3 align-items-center">
                                                    <i class="mdi mdi-view-comfy task"></i>
                                                    <span class="quote2 pl">ID: <b name="foID">${a.foID}</b> </span>
                                                </div>
                                                <div class="d-flex justify-content-start px-3 align-items-center">
                                                    <i class="mdi mdi-view-comfy task"></i>
                                                    <span class="quote2 pl">Số điện thoại: <b>${a.foPhone}</b> </span>
                                                </div>
                                                <div class="d-flex justify-content-start px-3 align-items-center">
                                                    <i class="mdi mdi-view-comfy task"></i>
                                                    <span class="quote2 pl">Email: <b>${a.foEmail}</b> </span>
                                                </div>
                                                <div
                                                    class="d-flex justify-content-between px-3 align-items-center pb-3"
                                                    >
                                                    <div class="d-flex justify-content-start align-items-center">
                                                        <i class="mdi mdi-calendar-clock date"></i>
                                                        <span class="quote2 pl-2">Password: <b>${a.foPassword}</b></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>


                            <div class="mt-3 d-flex justify-content-center mt-2">
                                <div id="pagination-container"></div>
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