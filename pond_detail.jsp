<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                <div class="row wow fadeIn mt-5 mb-2">
                    <div class="row mt-4">

                        <div >
                            <a href="cropDetail" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto mt-6" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                            </a>
                        </div>
                        <h2 class="d-flex justify-content-center">${pond_detail_text}</h2>
                    </div>
                    <!--Grid column-->
                    <div class="col-md-6 mb-4">
                        <!--Content-->
                        <div class="p-4">
                            <h3>${pond_name_text}: ${pondDetail.pondName}</h3>


                            <table class="table-borderless">

                                <tbody>
                                    <tr>

                                        <td>${pond_square_text}</td>
                                        <td><b> ${pondDetail.pondSquare}</b> </td>
                                    </tr>
                                    <tr>

                                        <td>${pond_code_text}</td>
                                        <td><b>${pondDetail.pondCode}</b></td>
                                    </tr>


                                </tbody>
                            </table>
                        </div>
                        <!--Content-->
                    </div>

                    <!--Grid column-->
                    <c:if test="${sessionScope.acc != null || sessionScope.accAdmin != null}">
                        <div class="col-md-6 mt-3">





                            <div class="row">


                                <h5>${choose_action_text}</h5>
                                <div class="row mb-2">
                                    <a href="editPond" type="button" class="btn btn-primary col-5 m-1">
                                        ${pond_edit_crop_info_text}
                                    </a>
                                    <a href="DeletePondControl" type="button" class="btn btn-danger col-5 m-1" data-bs-toggle="modal" data-bs-target="#deleteModal">
                                        ${pond_delete_crop_text}
                                    </a>

                                    <!--Delete Modal -->
                                    <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <h5 class="modal-title" id="exampleModalLabel">${confirmation_header_pond}</h5>
                                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                </div>
                                                <div class="modal-body">
                                                    ${confirmation_are_you_sure_text}
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">${confirmation_cancel}</button>
                                                    <a href="DeletePondControl"  type="submit" class="btn btn-danger">${report_delete_report_text}</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <h5>${pond_move_pond_harvest_report_text}</h5>
                                <form action="movepond" method="post">
                                    <div class="row mb-2">
                                        <div class="col-6">
                                            <select class="form-select"  name="selectcrop" aria-label="Default select example">
                                                <c:forEach items="${listCropByFacilityID}" var="o">
                                                    <option value="${o.cropID}">${o.cropName}</option>
                                                </c:forEach>

                                            </select>
                                        </div>
                                        <div class="col-6">
                                            <button href="" type="submit" class="btn btn-primary col-8">
                                                ${pond_move_pond_btn_text}
                                            </button>
                                        </div>

                                    </div>
                                </form>

                                <h5>${choose_your_report_text}</h5>
                                <a href="pondInventory_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                    ${pond_inventory_report_text}
                                </a>




                                <a href="./pondSurvivalRate_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                    ${pond_survival_rate_report_text}
                                </a>







                                <a href="pondWaterEnv_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                    ${pond_water_env_report_text} 
                                </a>

                            </div>







                        </div>
                    </c:if>
                    <%-- Coop --%>
                    <c:if test="${sessionScope.accCoop != null}">
                        <div class="col-md-6 mt-3">





                            <div class="row">




                                <h5>${choose_your_report_text}</h5>
                                <a href="pondInventory_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                    ${pond_inventory_report_text}
                                </a>




                                <a href="./pondSurvivalRate_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                    ${pond_survival_rate_report_text}
                                </a>







                                <a href="pondWaterEnv_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                    ${pond_water_env_report_text} 
                                </a>

                            </div>


                        </div>
                    </c:if>
                    <%-- EMPLOYEE --%>

                    <c:if test="${sessionScope.accEmp != null}">
                        <div class="col-md-6 mt-3">





                            <div class="row">




                                <h5>${choose_your_report_text}</h5>
                                <c:if test="${pondEmployeeAuthorization.allowInventoryRecord == true}">
                                    <a href="pondInventory_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                        ${pond_inventory_report_text}
                                    </a>
                                </c:if>
                                <c:if test="${pondEmployeeAuthorization.allowInventoryRecord == false}">
                                    <button href="" style="background-color: gray" type="submit" class="col-10 m-1 btn btn-secondary">
                                        ${pond_inventory_report_text}
                                    </button>
                                </c:if>



                                <c:if test="${pondEmployeeAuthorization.allowSurvivalRecord == true}">
                                    <a href="./pondSurvivalRate_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                        ${pond_survival_rate_report_text}
                                    </a>
                                </c:if>
                                <c:if test="${pondEmployeeAuthorization.allowSurvivalRecord == false}">
                                    <button href="" style="background-color: gray" type="submit" class="col-10 m-1 btn btn-secondary">
                                        ${pond_survival_rate_report_text}
                                    </button>
                                </c:if>






                                <c:if test="${pondEmployeeAuthorization.allowWaterRecord == true}">
                                    <a href="pondWaterEnv_Management?pondID=${pondDetail.pondID}" type="submit" class="col-10 m-1 btn btn-primary">
                                        ${pond_water_env_report_text}  
                                    </a>
                                </c:if>
                                <c:if test="${pondEmployeeAuthorization.allowWaterRecord == false}">
                                    <button href="" style="background-color: gray" type="submit" class="col-10 m-1 btn btn-secondary">
                                        ${pond_water_env_report_text} 
                                    </button>
                                </c:if>

                            </div>







                        </div>
                    </c:if>


                    <!--Grid column-->
                </div>
                <!--Grid row-->



                <!--Grid row-->

                <!--Grid row-->

                <!--Grid row-->

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
