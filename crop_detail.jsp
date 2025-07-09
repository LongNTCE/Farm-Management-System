<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"crossorigin="anonymous"></script>
        <link
            rel="stylesheet"
            href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
            integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
            crossorigin="anonymous"
            />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />
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

        <!--Main layout-->
        <div class="container mt-5">
            <div class="container dark-grey-text mt-5">
                <!--Grid row-->

                <div class="row wow fadeIn mt-5">
                    <div class="row mt-4">
                        <a href="facilityDetail" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                        </a>
                        <h2 class="d-flex justify-content-center">${crop_detail_text}</h2>
                    </div>
                    <!--Grid column-->
                    <div class="col-md-6 mb-4">
                        <!--Content-->
                        <div class="p-4">
                            <div class="hide-scrollbar">

                                <h3>${crop_name_text}: ${cropDetail.cropName}</h3>
                            </div>

                            <table class="table-borderless">

                                <tbody>
                                    <tr>

                                        <td>${crop_start_date_text}:</td>
                                        <td><b>${cropDetail.cropStartDate}</b> </td>
                                    </tr>
                                    <tr>

                                        <td>${crop_end_date_text}: </td>
                                        <td><b>${cropDetail.cropEndDate}</b></td>
                                    </tr>


                                </tbody>
                            </table>


                        </div>
                        <!--Content-->
                    </div>

                    <!--Grid column-->


                    <c:if test="${sessionScope.acc != null }">
                        <div class="col-md-6 mt-3">
                            <h5>${choose_action_text} </h5>
                            <div class="row mb-2">
                                <div class="col-5">
                                    <a href="editcrop" type="button" class="btn btn-primary col-12">
                                        ${crop_edit_crop_info_text}
                                    </a>
                                </div>
                                <div class="col-5">
                                    <button href="deletecrop" type="submit" class="btn btn-danger col-12"  data-bs-toggle="modal" data-bs-target="#deleteModal">
                                        ${crop_delete_crop_text}
                                    </button>
                                </div>

                                <!--Delete Modal -->
                                <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel">${crop_delete_crop_text}</h5>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                ${confirmation_are_you_sure_text}
                                            </div>

                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">${confirmation_cancel}</button>
                                                <a href="deletecrop"  type="submit" class="btn btn-danger">${report_delete_report_text}</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="row mb-2">
                                <h5>${choose_your_report_text}</h5>
                                <div class="col-10">
                                    <a href="facilityBreed_Management" type="button" class="btn btn-primary col-12">
                                        ${crop_breed_report_text}
                                    </a>
                                </div>

                                <div class="col-10 mt-1">
                                    <a href="facilityHarvest_Management" type="submit" class="btn btn-primary col-12">
                                        ${crop_harvest_report_text}
                                    </a>
                                </div>

                                <div class="col-10 mt-1">
                                    <a href="facilityInventory_Management" type="button" class="btn btn-primary col-12">
                                        ${crop_facility_inventory_report_text}
                                    </a>
                                </div>

                                <div class="col-10 mt-3">
                                    <a href="AddPondControl" type="button" class="btn btn-warning col-12">
                                        ${crop_add_pond_text}
                                    </a> 
                                </div>

                            </div>
                        </c:if>
                        <!--Grid column COOP-->
                        <c:if test="${sessionScope.accAdmin != null }">
                            <div class="col-md-6 mt-3">

                                <h5>${choose_action_text} ${sessionScope.acc}</h5>
                                <div class="row mb-2">
                                    <div class="col-5">
                                        <a href="editcrop" type="button" class="btn btn-primary col-12">
                                            ${crop_edit_crop_info_text}
                                        </a>
                                    </div>
                                    <div class="col-5">
                                        <button href="deletecrop" type="submit" class="btn btn-danger col-12"  data-bs-toggle="modal" data-bs-target="#deleteModal">
                                            ${crop_delete_crop_text}
                                        </button>
                                    </div>

                                    <!--Delete Modal -->
                                    <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <h5 class="modal-title" id="exampleModalLabel">Xóa mùa vụ</h5>
                                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                </div>
                                                <div class="modal-body">
                                                    Bạn có chắc chắn muốn xóa mùa vụ này hong?
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
                                                    <a href="deletecrop"  type="submit" class="btn btn-danger">Xóa</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>


                                <div class="row mb-2">
                                    <div class="col-10">
                                        <a href="facilityBreed_Management" type="button" class="btn btn-primary col-12">
                                            ${crop_breed_report_text}
                                        </a>
                                    </div>

                                    <div class="col-10 mt-1">
                                        <a href="facilityHarvest_Management" type="submit" class="btn btn-primary col-12">
                                            ${crop_harvest_report_text}
                                        </a>
                                    </div>

                                    <div class="col-10 mt-1">
                                        <a href="facilityInventory_Management" type="button" class="btn btn-primary col-12">
                                            ${crop_facility_inventory_report_text}
                                        </a>
                                    </div>

                                    <div class="col-10 mt-3">
                                        <a href="./pond_add.jsp" type="button" class="btn btn-warning col-12">
                                            Thêm ao
                                        </a> 
                                    </div>

                                </div>
                            </div>
                        </c:if>
                        <!--Grid column COOP-->
                        <c:if test="${sessionScope.accCoop != null}">
                            <div class="col-md-6 mt-3">

                                <h5>${choose_action_text} ${sessionScope.acc}</h5>


                                <div class="row mb-2">
                                    <div class="col-10">
                                        <a href="facilityBreed_Management" type="button" class="btn btn-primary col-12">
                                            ${crop_breed_report_text}
                                        </a>
                                    </div>

                                    <div class="col-10 mt-1">
                                        <a href="facilityHarvest_Management" type="submit" class="btn btn-primary col-12">
                                            ${crop_harvest_report_text}
                                        </a>
                                    </div>

                                    <div class="col-10 mt-1">
                                        <a href="facilityInventory_Management" type="button" class="btn btn-primary col-12">
                                            ${crop_facility_inventory_report_text}
                                        </a>
                                    </div>



                                </div>

                                <div class="row m">

                                </div>
                            </div>
                        </c:if>
                        <!--Grid column employee -->
                        <c:if test="${sessionScope.accEmp != null}">
                            <div class="col-md-6 mt-3">

                                <h5>${choose_action_text}</h5>


                                <div class="row mb-2">
                                    <c:if test="${cropEmployeeAuthorization.allowBreedRecord == true}">
                                        <a href="facilityBreed_Management" type="button" class="btn btn-primary col-8 ms-3">
                                            ${crop_breed_report_text}
                                        </a>
                                    </c:if>
                                    <c:if test="${cropEmployeeAuthorization.allowBreedRecord == false}">
                                        <button href="" style="background-color: gray" class="btn btn-secondary col-8 ms-3" >
                                            ${crop_breed_report_text}
                                        </button>
                                    </c:if>


                                    <c:if test="${cropEmployeeAuthorization.allowHarvestRecord == true}">

                                        <a href="facilityHarvest_Management" type="submit" class="btn btn-primary col-8 ms-3 mt-1">
                                            ${crop_harvest_report_text}
                                        </a>
                                    </c:if>
                                    <c:if test="${cropEmployeeAuthorization.allowHarvestRecord == false}">

                                        <button href="" style="background-color: gray" type="submit" class="btn btn-secondary col-8 ms-3 mt-1" >
                                            ${crop_harvest_report_text}
                                        </button>
                                    </c:if>


                                    <c:if test="${cropEmployeeAuthorization.allowInventoryRecord == true}">
                                        <a href="facilityInventory_Management" type="button" class="btn btn-primary col-8 ms-3 mt-1">
                                            ${crop_facility_inventory_report_text}
                                        </a>
                                    </c:if>
                                    <c:if test="${cropEmployeeAuthorization.allowInventoryRecord == false}">
                                        <button href="" style="background-color: gray" type="button" class="btn btn-secondary col-8 ms-3 mt-1" >
                                            ${crop_facility_inventory_report_text}
                                        </button>
                                    </c:if>

                                </div>


                                <div class="row m">

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
                                    ${crop_list_pond_text}
                                </h2>
                            </div>
                        </div>
                        <!--Grid column-->
                    </div>
                    <!--Grid row-->

                    <!--Grid row-->
                    <div class="row wow fadeIn">
                        <!--Grid column-->
                        <div class=" row">

                            <div class="list-wrapper row mt-3">
                                <c:forEach items="${listPondByCropID}" var="pc">
                                    <!--                                <div class="list-item col-lg-4 mt-2">
                                                                        <div class="card mb-3 farm-card">
                                                                            <div class="row no-gutters">
                                                                                <div class="col-md-4" >
                                                                                    <img
                                                                                        src="./images/pond.jpg"
                                                                                        class="card-img"
                                                                                        style="width: 100%; height: 135.6px; overflow: scroll"
                                                                                        alt="..."
                                                                                        />
                                                                                </div>
                                                                                <div class="col-md-8">
                                                                                    <div class="card-body">
                                                                                        <h4 class="card-title" style="height: 55px; overflow: auto">${pc.pondName}</h4>
                                                                                        <div class="row mt-2">
                                                                                            <div class="col-12">
                                                                                                <a
                                                                                                    href="pondDetail?pondID=${pc.pondID}"
                                                                                                    type="button"
                                                                                                    class="col-12 btn btn-warning"
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
                                                                    </div>-->

                                </c:forEach>


                                <div class="list-wrapper row mt-3"> 
                                    <c:forEach items="${listPondByCropID}" var="pc">
                                        <div onclick="location.href = 'pondDetail?pondID=${pc.pondID}'"  class="col-md-4 col-lg-4 mt-3 clickable list-item" >
                                            <div class="two">
                                                <div class="d-flex justify-content-end pt-1">
                                                    <i class="mdi mdi-star-outline pr-1 star"></i>
                                                    <i class="mdi mdi-dots-horizontal dot"></i>
                                                </div>
                                                <p class="justtify-content-center fw-bold">${pond_name_text}</p>

                                                <div class="pt-0">

                                                    <h4 class="card-title" style="height: 50px; overflow: auto"> ${pc.pondName}</h4>

                                                    <div class="d-flex justify-content-center align-items-center">
                                                        <i class="mdi mdi-view-comfy task"></i>
                                                        <span class="quote2 pl">${pond_code_text}: <b>${pc.pondCode}</b> </span>
                                                    </div>
                                                    <div class="d-flex justify-content-center   align-items-center pb-2">
                                                        <i class="mdi mdi-view-comfy task"></i>
                                                        <span class="quote2 pl">${pond_square_text}: <b>${pc.pondSquare}</b> </span>
                                                    </div>
                                                </div>


                                                <!--                                                <div class="d-flex justify-content-start px-3 align-items-center">
                                                                                                    <div class="col-12 pb-3">
                                                                                                        <a
                                                                                                            href="pondDetail?pondID=${pc.pondID}"
                                                                                                            type="button"
                                                                                                            class="col-12 btn btn-warning"
                                                                                                            >
                                                                                                            Chi tiết
                                                                                                        </a>
                                                
                                                                                                    </div>
                                                                                                </div>-->

                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>















                            </div>
                            <div class="d-flex justify-content-center mt-2">
                                <div id="pagination-container"></div>
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

            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/simplePagination.js/1.6/jquery.simplePagination.js"></script>
            <script>
                                            var items = $('.list-wrapper .list-item');
                                            var numItems = items.length;
                                            var perPage = 6;

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
