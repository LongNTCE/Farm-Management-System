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

        <div class="container mt-5">
            <div>

                <div class="mt-5">
                    <a href="facilityInventory_Management" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-4" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                    </a>
                </div>
                <h2>${facility_inventory_report_detail_text}</h2>
                <c:if test="${sessionScope.accCoop == null}">


                    <form method="post" action="UploadFacilityInventoryRecordControl" enctype="multipart/form-data" class="mt-5">
                        <b>${record_select_upload_file_text}:</b>  <input type="file" id="file" name="file" />
                        <input type="submit" value="Upload File" />
                    </form>
                    <p class="text-danger">${errormess}</p>


                    <div class="row">

                        <form class="col-2 ms-auto" action="facilityInventoryDetail"  method="post" >
                            <input name ="export" hidden value="export" />
                            <button type="submit" class=" col-12 btn btn-secondary ms-">
                                ${record_export_file_text} 
                            </button>
                        </form>




                        <a href="AddFacilityInventoryRecord" type="button" class="btn btn-primary  col-2 me-2">
                            ${record_add_record_text} 
                        </a>

                        <form action="DeleteAllFInventoryControl" method ="post" class="col-2" id="myform_deleteall" hidden="hidden">
                            <input hidden disable value="${inventoryS.fInventoryTID}" name="ccc"/>
                            <button href="facilityBreedDetail"class="btn btn-danger pt-2 pe-4 ps-4 pt-2 pb-2" type="submit"> ${record_delete_all_record_text}</button>
                        </form>

                        <!-- Button trigger modal -->
                        <button class="col-2 btn btn-danger" type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal2">
                            ${record_delete_all_record_text}
                        </button>

                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal2" tabindex="-1" aria-labelledby="exampleModalLabel2" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">${confirmation_header_all_record}</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        ${confirmation_header_all_record_desc}
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">${confirmation_cancel}</button>
                                        <input class="btn btn-danger" type="submit" form="myform_deleteall" value="${report_delete_report_text}"/>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <table class="table table-striped table-bordered mt-2">
                        <thead>
                            <tr>
                                <th scope="col">${facility_inventory_record_product_name_text}</th>
                                <th scope="col">${facility_inventory_record_import_date_text}</th>
                                <th scope="col">${facility_inventory_record_quantity_text}</th>
                                <th scope="col">${facility_inventory_record_source_name_text}</th>
                                <th scope="col">${facility_inventory_record_manufactoring_date_text}</th>
                                <th scope="col">${facility_inventory_record_expire_date_text}</th>
                                <th scope="col">${facility_inventory_record_product_code_text}</th>

                                <th scope="col">${record_action_text}</th>
                            </tr>
                        </thead>
                        <tbody>





                            <c:forEach items="${listFInventoryDetail}" var="fi">

                                <tr>

                                    <td>${fi.productName}</td>
                                    <td>${fi.importDate}</td>
                                    <td>${fi.quantity}</td>

                                    <td>${fi.sourceName}</td>
                                    <td>${fi.manurfacturingDate}</td>
                                    <td>${fi.expireDate}</td>
                                    <td>${fi.productCode}</td>


                                    <td> <div class="row">
                                            <div class="col-5"> <a href="EditFInventoryRecordControl?fInventoryID=${fi.faInventoryID}" class="btn btn-success"> ${report_edit_report_text}</a></div>
                                            <div class="col-5">
                                                <form action="facilityInventoryDetail" method ="post" id="myform${fi.faInventoryID}" hidden>

                                                    <button href="facilityInventoryDetail"class="btn btn-danger" type="submit"> ${report_delete_report_text}</button>
                                                    <input hidden disable value="${fi.faInventoryID}" name="ccc"/>
                                                </form>

                                                <!-- Button trigger modal -->
                                                <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal${fi.faInventoryID}">
                                                    ${report_delete_report_text}
                                                </button>

                                                <!-- Modal -->
                                                <div class="modal fade" id="exampleModal${fi.faInventoryID}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                    <div class="modal-dialog">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <h5 class="modal-title" id="exampleModalLabel">${confirmation_header_record}</h5>
                                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                            </div>
                                                            <div class="modal-body">
                                                                ${confirmation_header_desc_facility_inventory_record}
                                                            </div>
                                                            <div class="modal-footer">
                                                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                                                <input class="btn btn-danger" type="submit" form="myform${fi.faInventoryID}" value="${report_delete_report_text}"/>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div></td>

                                </c:forEach>
                        </tbody>
                    </table>
                </c:if>
                <%-----Coop------%>



                <c:if test="${sessionScope.accCoop != null}">

                    <form class="" action="facilityInventoryDetail"  method="post" >
                        <input name ="export" hidden value="export" />
                        <button type="submit" class=" col-2 btn btn-secondary mb-2">
                            Xuất File Excel 
                        </button>
                    </form>

                    <table class="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th scope="col">Tên sản phẩm</th>
                                <th scope="col">Ngày nhập</th>
                                <th scope="col">Số lượng</th>
                                <th scope="col">Tên nguồn</th>
                                <th scope="col">Ngày sản xuất</th>
                                <th scope="col">Ngày hết hạn</th>
                                <th scope="col">Product Code</th>

                            </tr>
                        </thead>
                        <tbody>





                            <c:forEach items="${listFInventoryDetail}" var="fi">

                                <tr>

                                    <td>${fi.productName}</td>
                                    <td>${fi.importDate}</td>
                                    <td>${fi.quantity}</td>

                                    <td>${fi.sourceName}</td>
                                    <td>${fi.manurfacturingDate}</td>
                                    <td>${fi.expireDate}</td>
                                    <td>Product Code</td>



                                </c:forEach>
                        </tbody>
                    </table>
                </c:if>
            </div>
        </div>
    </body>
</html>
