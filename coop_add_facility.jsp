<%-- 
    Document   : coop_add_facility
    Created on : Oct 28, 2022, 3:25:56 PM
    Author     : Admin
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <link rel="stylesheet" href="./css/manage2.css" />
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

        <!--Pagination-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simplePagination.js/1.6/simplePagination.css">

        <link rel="stylesheet" href="./css/crud.css" />

    </head>
    <body class="add-crop-body">



        <div class="container py-3 h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-11">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">
                            <div class="col-12 offset-lg-3 col-lg-6">
                                <div class="card-body p-md-5 mx-md-4">
                                    <div class="">
                                        <a href="manage_viewall" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                                        </a>
                                        <h3 class="mt-1 mb-3 pb-1 text-center">${cooperative_enter_facility_owner_email_text}</h3>
                                    </div>

                                    <form action="AddFacilityToCoopControl" method="post">



                                        <div class="form-outline mb-2">
                                            <input
                                                type="text"
                                                id=""
                                                required="required"
                                                name="foEmail"
                                                class="form-control"
                                                placeholder="Email"
                                                value="${emaill}"
                                                />
                                        </div>

                                        <p class="text-danger"> ${error}</p>


                                        <div class="text-center pt-1 mb-5">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 px-5" type="submit">${cooperative_find_facility_add_text}</button>

                                        </div>
                                    </form>


                                </div>

                            </div>
                            <div class="col-10 offset-1">
                                <div>
                                    <h3>${ano}</h3>
                                    <h2>${cooperative_facility_list_text}</h2>



                                            <c:forEach items="${listFacility}" var="f">
                                                <div class="facility-info col-12">
                                                    <div
                                                        class="facility-info-preview col-4 "
                                                        style="word-break: break-all; overflow: hidden"
                                                        >
                                                        <h6>${cooperative_facility_owner_email_text}</h6>
                                                        <h3 class="fhide-scrollbar">
                                                            ${emaill}
                                                        </h3>
                                                    </div>
                                                    <div class="facility-info-info col-4">
                                                        <h6>${cooperative_facility_name_text}</h6>
                                                        <h3 class="fhide-scrollbar"  style="word-break: break-all; overflow: hidden">
                                                            ${f.fName}
                                                        </h3>
                                                    </div>
                                                    <div class="facility-info-info col-4">
                                                        <h6>${cooperative_facility_address_text}</h6>
                                                        <h4 class="fhide-scrollbar"  style="word-break: break-all; overflow: hidden">
                                                            ${f.fAddress}
                                                        </h4>
                                                        <form action="AddFacilityToCoopControl" method ="post">

                                                            <button class="addfacilitybtn"  type="submit">${cooperative_facility_add_facility_btn}</button>

                                                            <input hidden disable value="${emaill}" name="foEmail"/>
                                                            <input hidden disable value="${f.facilityID}" name="fID"/>
                                                        </form></div>

                                                </div>

                                            </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="container">


        </div>
    </div>


</body>
</html>
