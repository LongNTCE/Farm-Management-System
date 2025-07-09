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
                        <a href="manage_viewall" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                        </a>
                        <h2 class="d-flex justify-content-center">${facility_detail_text}</h2>
                    </div>
                    <!--Grid column-->
                    <div class="col-md-6 mb-4">
                        <!--Content-->
                        <div class="p-4">
                            <div class="hide-scrollbar">
                                <h3>${facility_facility_name_text}: ${facilityDetail.fName}</h3> 

                            </div>
                            <table class="table-borderless">

                                <tbody>
                                    <tr>

                                        <td>${facility_address_text}:</td>
                                        <td><b>${facilityDetail.fAddress}</b> </td>
                                    </tr>
                                    <tr>

                                        <td>${facility_phone_text}:</td>
                                        <td><b>${facilityDetail.fPhone}</b></td>
                                    </tr>
                                    <tr>

                                        <td>${facility_cultivating_pondsquare_text}:</td>
                                        <td><b>${facilityDetail.fCultivatingPondSquare}</b> </td>
                                    </tr>
                                    <tr>

                                        <td>${facility_storage_pondsquage_text}:</td>
                                        <td><b>${facilityDetail.fStoragePondSquare}</b></td>
                                    </tr>
                                    <tr>

                                        <td>${facility_waste_pondsquage_text}:</td>
                                        <td><b>${facilityDetail.fWastePondSquare}</b></td>
                                    </tr>
                                    <tr>

                                        <td>${facility_cultivating_object_text}:</td>
                                        <td><b>${facilityDetail.fCultivatingObject}</b></td>
                                    </tr>
                                    <tr>

                                        <td>${facility_cultivating_time_text}:</td>
                                        <td><b>${facilityDetail.fCultivatingTime}</b></td>
                                    </tr>

                                </tbody>
                            </table>


                        </div>
                        <!--Content-->
                    </div>

                    <!--Grid column-->
                    <c:if test="${sessionScope.accCoop != null}">
                        <div class="col-6 mt-5">

                            <h5>Lựa chọn thao tác của bạn</h5>
                            <div class="row">
                                <form action="facilityDetail" method ="post" class="col-10" id="myform_deleteall" hidden="hidden">
                                    <input hidden disable value="${facilityID}" name="aaaaabbbbb"/>
                                    <button href="facilityDetail"class="btn btn-danger col-12" type="submit">${facility_delete_facility_from_coop_text}</button>
                                </form>


                                <!-- Button trigger modal -->
                                <button class="col-10 btn">

                                    <label  data-bs-toggle="modal" data-bs-target="#exampleModal2"  class="col-12 btn btn-danger">  ${facility_delete_facility_from_coop_text}</label>
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="exampleModal2" tabindex="-1" aria-labelledby="exampleModalLabel2" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel">${facility_delete_facility_from_coop_text}</h5>
                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                ${delete_facility_from_coop_modal_body}
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">${confirmation_cancel}</button>
                                                <input class="btn btn-danger" type="submit" form="myform_deleteall" value="${report_delete_report_text}"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>





                            </div>
                            <div class="row mb-2">


                                <form class="col-10" action="facilityDetail"  method="post" hidden="hidden">
                                    <input name ="export" hidden value="export" />
                                    <button type="submit" class=" col-12 btn btn-danger" id="submit-form">
                                        Export Facility Detail
                                    </button>
                                </form>

                                <div class="col-10">
                                    <label for="submit-form" tabindex="0" class=" col-12 btn btn-primary">${facility_detail_export_facility_detail_text}</label>

                                </div>
                            </div>

                        </div>
                    </c:if>
                    <c:if test="${sessionScope.acc != null || sessionScope.accAdmin != null}">
                        <div class="col-md-6 mt-5">

                            <h5>${choose_action_text}</h5>
                            <div class="row mb-2">
                                <div class="col-5">
                                    <a href="editFacility" type="button" class="btn btn-primary col-12">
                                        ${facility_edit_facility_info_text}
                                    </a>
                                </div>
                                <div class="col-5">
                                    <a href="deletefacility" type="submit" class="btn btn-danger col-12" data-bs-toggle="modal" data-bs-target="#deleteModal">
                                        ${facility_delete_facility_text}
                                    </a>
                                    <!--Delete Modal -->
                                    <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <h5 class="modal-title" id="exampleModalLabel">${confirmation_header_facility}</h5>
                                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                </div>
                                                <div class="modal-body">
                                                    ${confirmation_are_you_sure_text}
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">${confirmation_cancel}</button>
                                                    <a href="deletefacility"  type="submit" class="btn btn-danger">${report_delete_report_text}</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>




                            </div>

                            <div class="row mb-2">
                                <div class="col-10">
                                    <a href="Manage_ViewEmployeeControl?facilityID=${facilityDetail.facilityID}" type="button" class="btn btn-primary col-12">
                                        ${facility_manage_employee_text}
                                    </a>
                                </div>

                            </div>

                            <div class="row">
                                <form class="col-10" action="facilityDetail"  method="post" hidden="hidden">
                                    <input name ="export" hidden value="export" />
                                    <button type="submit" class=" col-12 btn btn-danger" id="submit-form">
                                        Export Facility Detail
                                    </button>
                                </form>

                                <div class="col-10">
                                    <label for="submit-form" tabindex="0" class=" col-12 btn btn-primary">${facility_detail_export_facility_detail_text}</label>

                                </div>

                                <!--                                <div class="col-10">
                                                                    <a href="#" type="button" class="btn btn-primary col-12">
                                                                        Export Facility Detail
                                                                    </a>
                                                                </div>-->

                            </div>

                            <div class="row mb-2">
                                <div class="col-10">
                                    <a href="AcceptCoopInv?facilityID=${facilityDetail.facilityID}" type="button" class="btn btn-primary col-12">
                                        ${cooperative_invitation_text}
                                    </a>
                                </div>

                            </div>

                            <div class="row mb-2">
                                <div class="col-10">
                                    <a href="addcrop" type="button" class="btn btn-success col-12">
                                        ${facility_add_crop_text}
                                    </a>
                                </div>


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
                                ${facility_list_crop_text}
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
                            <c:forEach items="${listCropByFacilityID}" var="ol">

                                <!--                                <div class="list-item col-lg-4 mt-2">
                                                                    <div class="card mb-3 farm-card">
                                                                        <div class="row no-gutters">
                                                                            <div class="col-md-4" >
                                                                                <img
                                                                                    src="./images/cropdetailpic.jpg"
                                                                                    class="card-img"
                                                                                    style="width: 100%; height: 135.6px; overflow: scroll"
                                
                                                                                    alt="..."
                                                                                    />
                                                                            </div>
                                                                            <div class="col-md-8">
                                                                                <div class="card-body">
                                                                                    <h4 class="card-title"  style="height: 55px; overflow: auto">${ol.cropName}</h4>
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
                                
                                
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>-->


                            </c:forEach>


                            <div class="list-wrapper row mt-3"> 
                                <c:forEach items="${listCropByFacilityID}" var="ol">
                                    <div  onclick="location.href = 'cropDetail?cropID=${ol.cropID}'"  class="col-md-4 col-lg-4 mt-3 clickable list-item" >
                                        <div class="two">
                                            <div class="d-flex justify-content-end pt-1">
                                                <i class="mdi mdi-star-outline pr-1 star"></i>
                                                <i class="mdi mdi-dots-horizontal dot"></i>
                                            </div>


                                            <div>
                                                <p class="justtify-content-center fw-bold">${crop_name_text}</p>


                                                <h4 class="card-title" style="height: 70px; overflow: auto; word-break: break-all;"> ${ol.cropName}</h4>

                                                <div class="d-flex justify-content-center align-items-center">
                                                    <i class="mdi mdi-view-comfy task"></i>
                                                    <span class="quote2 pl">${crop_start_date_text}: <b>${ol.cropStartDate}</b> </span>
                                                </div>
                                                <div class="d-flex justify-content-center   align-items-center pb-2">
                                                    <i class="mdi mdi-view-comfy task"></i>
                                                    <span class="quote2 pl">${crop_end_date_text}: <b>${ol.cropEndDate}</b> </span>
                                                </div>
                                            </div>

                                            <!--
                                                                                        <div class="d-flex justify-content-start px-3 align-items-center">
                                                                                            <div class="col-12 pb-3">
                                                                                                <a
                                                                                                    href="cropDetail?cropID=${ol.cropID}"
                                                                                                    type="button"
                                                                                                    class="col-12 btn btn-success"
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
                        <div class="d-flex justify-content-center m-2">
                            <div id="pagination-container"></div>
                        </div>
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





                        <!--Footer-->
                        <div class="container mb-5">
                            <jsp:include page="./footer.jsp" />
                        </div>
                        <!--/.Footer-->
                        </body>
                        </html>