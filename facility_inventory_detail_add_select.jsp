<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <body class="add-crop-body">
        <div class="container py-3 h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-10">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">

                            <div class="col-12 offset-lg-2 col-lg-8">
                                <div class="card-body p-md-5 mx-md-4">

                                    <a href="#" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                                    </a>
                                    <h3 class="mt-1 mb-3 pb-1 text-center">${add_record_facility_inventory_text}</h3>




                                    <form action="AddFacilityInventoryRecord" method="post">

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">FIR</label>
                                            <select class="form-select" name="cID" aria-label="Default select example" onchange="this.form.submit()">

                                                <option selected value="${teo.cropID}">${teo.cropName}</option>
                                                <c:forEach items="${listCName}" var="pc">
                                                    <option value="${pc.cropID}">${pc.cropName}</option>
                                                </c:forEach>

                                            </select>
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_inventory_record_product_name_text}</label>
                                            <input
                                                class="col-7"
                                                value="${inventoryRecordName}"
                                                type="text"
                                                id=""
                                                required="required"
                                                name="inventoryRecordName"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>



                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_inventory_record_import_date_text}</label>
                                            <input
                                                class="col-7"
                                                value="${inventoryRdate}"
                                                type="date"
                                                id=""
                                                required="required"
                                                name="inventoryRdate"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_inventory_record_quantity_text}</label>
                                            <input
                                                class="col-7"
                                                value="${inventoryRQuantity}"
                                                type="number"

                                                id=""
                                                required="required"
                                                name="inventoryRQuantity"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>



                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_inventory_record_source_name_text}</label>
                                            <input
                                                class="col-7"
                                                value="${inventoryRsource}"
                                                type="text"
                                                id=""
                                                required="required"
                                                name="inventoryRsource"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_inventory_record_manufactoring_date_text}</label>
                                            <input
                                                class="col-7"
                                                value="${inventoryRManuDate}"
                                                type="date"
                                                id=""
                                                required="required"
                                                name="inventoryRManuDate"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${facility_inventory_record_expire_date_text}</label>
                                            <input
                                                class="col-7"
                                                value="${inventoryRExpireDate}"
                                                type="date"
                                                id=""
                                                required="required"
                                                name="inventoryRExpireDate"
                                                class="form-control"
                                                placeholder="Ngày hết hạn"
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">Product Code</label>
                                            <input
                                                class="col-7"

                                                type="text"
                                                id=""
                                                name="inventoryRProductCode"
                                                required="required"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <p class="text-danger"> ${error}</p>



                                        <div class="text-center pt-1 mb-5">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">${add_report_detail_btn_text}</button>

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
