<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>

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

        <link rel="stylesheet" href="./css/crud.css" />
    </head>




    <body class="edit-facility-body">

        <div class="container py-3 h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-10">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">
                            <div class="col-12 offset-lg-2 col-lg-8">
                                <div class="card-body p-md-5 mx-md-4">
                                    <div class="">
                                        <a href="facilityDetail" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                                        </a>
                                        <h3 class="mt-1 mb-3 pb-1 text-center">${facility_edit_btn_text}</h3>
                                    </div>

                                    <form action="editFacility" method="post">
                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_facility_name_text}</label>
                                            <input
                                                class="col-7"
                                                type="text"
                                                value="${sessionScope.facilityS.fName}"
                                                name="edit_fName"
                                                required="required"
                                                class="form-control"
                                                placeholder=""
                                                type="text" name="add_fName" title="Nhập tối đa 20 kí tự bao gồm chữ cái và số." id="" minlenght='1' maxlength="100"
                                                />
                                        </div>


                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_address_text}</label>
                                            <input
                                                class="col-7"
                                                type="text"
                                                value="${sessionScope.facilityS.fAddress}"
                                                name="edit_fAddress"
                                                required="required"
                                                class="form-control"
                                                placeholder=""
                                                title="Nhập tối đa 20 kí tự bao gồm chữ cái và số." minlenght='1' maxlength="100"
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_phone_text}</label>
                                            <input
                                                class="col-7"
                                                type="text"
                                                value="${sessionScope.facilityS.fPhone}"
                                                name="edit_fPhone"
                                                required="required"
                                                class="form-control"
                                                placeholder=""
                                                pattern="[0][0-9]{9}" title="Số điện thoại không hợp lệ."
                                                />
                                        </div>


                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_total_pondsquare_text}</label>
                                            <input
                                                class="col-7"
                                                required="required" type="number"
                                                value="${sessionScope.facilityS.fTotalSquare}"
                                                name="edit_fTotalSquare"
                                                class="form-control"
                                                placeholder=""

                                                />
                                        </div>


                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_cultivating_pondsquare_text}</label>
                                            <input
                                                class="col-7"
                                                required="required" type="number"
                                                value="${sessionScope.facilityS.fCultivatingPondSquare}"
                                                name="edit_fCultivatingPondSquare"
                                                class="form-control"
                                                placeholder=""
                                                min="0" max="100000"  title="Tối đa 100000 mét vuông" 
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_storage_pondsquage_text}</label>
                                            <input
                                                class="col-7"
                                                required="required" type="number"
                                                value="${sessionScope.facilityS.fStoragePondSquare}"
                                                name="edit_fStoragePondSquare"
                                                class="form-control"
                                                placeholder=""
                                                min="0" max="100000"
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_waste_pondsquage_text}</label>
                                            <input
                                                class="col-7"
                                                required="required" type="number"
                                                value="${sessionScope.facilityS.fWastePondSquare}"
                                                name="edit_fWastePondSquare"
                                                class="form-control"
                                                placeholder=""
                                                min="0" max="100000"
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_cultivating_object_text}</label>
                                            <input
                                                class="col-7"
                                                type="text"
                                                value="${sessionScope.facilityS.fCultivatingObject}"
                                                name="edit_fCultivatingObject"
                                                class="form-control"
                                                placeholder=""
                                                required="required"


                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_cultivating_time_text}</label>
                                            <input
                                                class="col-7"
                                                required="required" type="number"
                                                value="${sessionScope.facilityS.fCultivatingTime}"
                                                name="edit_fCultivatingTime"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>
                                        <p class="text-danger offset-5"> ${error}</p>

                                        <div class="text-center pt-1 mb-5">
                                            <button
                                                class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5"
                                                type="submit"
                                                >
                                                ${facility_edit_btn_text}
                                            </button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
