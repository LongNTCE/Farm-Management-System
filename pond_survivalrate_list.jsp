<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"crossorigin="anonymous"></script>


        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
              integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="./css/home.css" />


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>



        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>

        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
            crossorigin="anonymous"
        ></script>



        <!--Font awesome-->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
            integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />

        <!--CSS-->
        <link rel="stylesheet" href="./css/home.css" />
        <link rel="stylesheet" href="./css/admin_viewfownerlist.css" />
        <link rel="stylesheet" href="./css/manage2.css" />
        <script src="./js/modal.js"></script>



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

        <div class="container">
            <div class="mt-3">
                <div class="mt-5">
                    <a href="pondDetail" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-4" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                    </a>
                </div>
                <h2>${report_manage_survival_rate_report_text}</h2>
                <c:if test="${sessionScope.accCoop == null}">
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
                                        ${report_survival_rate_report_list_text}
                                    </button>

                                    <!-- Button trigger modal -->
                                    <!--Nav Link-->
                                    <a
                                        href="addPSurvivalRateTable"
                                        type="button nav-link"
                                        id="add-farm-button"
                                        class="ms-2 m-1 btn btn-primary add-farm-button"


                                        >
                                        ${report_add_report_text}
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
                                    <div class="row list-wrapper">


                                        <c:forEach items="${listPSurvivalRateRecordByPID}" var="ps">
                                            <!--                                            <div class="list-item col-lg-4 mt-2">
                                                                                            <div class="card mb-3 farm-card">
                                                                                                <div class="row no-gutters">
                                                                                                    <div class="col-md-4" style="max-height: 100%">
                                                                                                        <img
                                                                                                            src="./images/report.jpg"
                                                                                                            class="card-img"
                                                                                                            style="width: 100%; height: 135.6px; overflow: scroll"
                                                                                                            alt="..."
                                                                                                            />
                                                                                                    </div>
                                                                                                    <div class="col-md-8">
                                                                                                        <div class="card-body">
                                                                                                            <div class="dropdown">
                                            
                                            
                                            
                                                                                                            </div>
                                                                                                            <h4 class="card-title" style="height: 55px; overflow: auto">${ps.pondSurvivalRateTName}</h4>
                                            
                                                                                                            <div class="row mt-2 g-0">
                                            
                                            
                                                                                                                <div class="col-3 ms-1">
                                                                                                                    <a
                                                                                                                        href="pondSurvivalRateDetail?pondSurvivalRateTID=${ps.pondSurvivalRateTID}"
                                                                                                                        type="button nav-link"
                                                                                                                        id="add-farm-button"
                                                                                                                        class="btn btn-primary add-farm-button col-12"
                                            
                                            
                                                                                                                        >
                                                                                                                        Xem
                                                                                                                    </a>
                                                                                                                </div>
                                                                                                                <div class="col-3 ms-1">
                                                                                                                    <a
                                                                                                                        href="editPondSurvivalRateTableButton?pondSurvivalRateTID=${ps.pondSurvivalRateTID}"
                                                                                                                        type="button nav-link"
                                                                                                                        id="add-farm-button"
                                                                                                                        class="btn btn-primary add-farm-button col-12"
                                                                                                                        >
                                                                                                                        Sửa
                                                                                                                    </a>
                                                                                                                </div>
                                                                                                                <div class="col-3 ms-1">
                                                                                                                    <form action="pondSurvivalRate_Management" method ="post">
                                                                                                                        <input hidden disable value="${ps.pondSurvivalRateTID}" name="ccc"/>
                                                                                                                        <button
                                                                                                                            href="pondSurvivalRate_Management"
                                                                                                                            type="button nav-link"
                                                                                                                            id=""
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
                                                                                        </div>-->
                                        </c:forEach>

                                        <c:forEach items="${listPSurvivalRateRecordByPID}" var="ps">
                                            <div  class="col-md-4 col-lg-4 mt-3 clickable list-item" >
                                                <div class="two">
                                                    <div class="d-flex justify-content-end pt-1">
                                                        <i class="mdi mdi-star-outline pr-1 star"></i>
                                                        <i class="mdi mdi-dots-horizontal dot"></i>
                                                    </div>

                                                    <p class="justtify-content-center fw-bold">${report_report_name_text}</p>

                                                    <div class="pt-0">

                                                        <h4 class="card-title" style="height: 55px; max-height: 65px; overflow: auto; word-break: break-all;">${ps.pondSurvivalRateTName}</h4>

                                                    </div>


                                                    <div class="d-flex justify-content-center px-3 align-items-center">
                                                        <div class="col-3 list-card-btn pb-3">
                                                            <a
                                                                href="pondSurvivalRateDetail?pondSurvivalRateTID=${ps.pondSurvivalRateTID}"
                                                                type="button nav-link"
                                                                id="add-farm-button"
                                                                class="btn btn-primary add-farm-button col-12"


                                                                >
                                                                ${report_view_report_text}
                                                            </a>
                                                        </div>

                                                        <div class="col-3 list-card-btn pb-3">
                                                            <a
                                                                href="editPondSurvivalRateTableButton?pondSurvivalRateTID=${ps.pondSurvivalRateTID}"
                                                                type="button nav-link"
                                                                id="add-farm-button"
                                                                class="btn btn-primary add-farm-button col-12"
                                                                >
                                                                ${report_edit_report_text}
                                                            </a>
                                                        </div>

                                                        <div class="col-3 list-card-btn pb-3">

                                                            <form action="pondSurvivalRate_Management" method ="post" id="myform_deleteall${ps.pondSurvivalRateTID}">
                                                                <input hidden disable value="${ps.pondSurvivalRateTID}" name="ccc"/>
                                                                <button
                                                                    href="pondSurvivalRate_Management"
                                                                    type="button nav-link"
                                                                    id=""
                                                                    class="btn btn-danger add-farm-button col-12"
                                                                    hidden
                                                                    type="submit"
                                                                    >
                                                                    ${report_delete_report_text}
                                                                </button>

                                                                <!-- Button trigger modal -->
                                                                <button class="col-12 btn btn-danger" type="button" data-bs-toggle="modal" data-bs-target="#exampleModal2${ps.pondSurvivalRateTID}">
                                                                    ${report_delete_report_text}
                                                                </button>
                                                            </form>

                                                        </div>
                                                    </div>

                                                </div>

                                                <!-- Modal -->
                                                <div class="modal fade" id="exampleModal2${ps.pondSurvivalRateTID}" tabindex="-1" aria-labelledby="exampleModalLabel2" aria-hidden="true">
                                                    <div class="modal-dialog">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <h5 class="modal-title" id="exampleModalLabel">${confirmation_header_report}</h5>
                                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                            </div>
                                                            <div class="modal-body">
                                                                ${confirmation_header_report_desc}
                                                            </div>
                                                            <div class="modal-footer">
                                                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">${confirmation_cancel}</button>
                                                                <input class="btn btn-danger" type="submit" form="myform_deleteall${ps.pondSurvivalRateTID}" value="${report_delete_report_text}"/>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>


                                    </div>
                                    <div class="d-flex justify-content-center mt-2">
                                        <div id="pagination-container"></div>
                                    </div>
                                </div>

                            </div>

                        </div>

                    </div>
                </c:if>
                <c:if test="${sessionScope.accCoop != null}">
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
                                        ${report_survival_rate_report_list_text}
                                    </button>


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
                                    <div class="row list-wrapper">


                                        <c:forEach items="${listPSurvivalRateRecordByPID}" var="ps">
                                            <div  class="col-md-4 col-lg-4 mt-3 clickable list-item" >
                                                <div class="two">
                                                    <div class="d-flex justify-content-end pt-1">
                                                        <i class="mdi mdi-star-outline pr-1 star"></i>
                                                        <i class="mdi mdi-dots-horizontal dot"></i>
                                                    </div>

                                                    <p class="justify-content-center fw-bold">${report_report_name_text}</p>
                                                    <div class="pt-0">

                                                        <h4 class="card-title"  style="height: 55px; max-height: 65px; overflow: auto; word-break: break-all;">${ps.pondSurvivalRateTName}</h4>

                                                    </div>


                                                    <div class="d-flex justify-content-start px-3 align-items-center">
                                                        <div class="col-12 pb-3">
                                                            <a
                                                                href="pondSurvivalRateDetail?pondSurvivalRateTID=${ps.pondSurvivalRateTID}"
                                                                type="button nav-link"
                                                                id="add-farm-button"
                                                                class="btn btn-primary add-farm-button col-12"


                                                                >
                                                                ${report_view_report_text}

                                                            </a>
                                                        </div>




                                                    </div>

                                                </div>
                                            </div>
                                        </c:forEach>


                                    </div>
                                    <div class="d-flex justify-content-center mt-2">
                                        <div id="pagination-container"></div>
                                    </div>
                                </div>

                            </div>

                        </div>

                    </div>
                </c:if>
                <!--Coop-->
            </div>

            <!--Bookmark-->


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
