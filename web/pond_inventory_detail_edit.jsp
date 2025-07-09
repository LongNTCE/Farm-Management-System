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
    <body class="add-crop-body">
        <div class="container py-3 h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-10">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">

                            <div class="col-12 offset-lg-3 col-lg-6">
                                <div class="card-body p-md-5 mx-md-4">

                                    <a href="#" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i> Trở về trang trước</h6> 
                                    </a>
                                    <h3 class="mt-1 mb-3 pb-1 text-center">Sửa chi tiết báo cáo kho của ao</h3>


                                    <form action="EditPInventoryRecord" method="post">

                                        <div class="row form-outline mb-2">
                                            <label class="col-6">Ngày tháng năm</label>
                                            <input
                                                 class="col-6"
                                                type="date"
                                                id=""
                                                required="required"
                                                value ="${pondInventoryDetail.usageDate}"
                                                name="edit_usageDate"
                                                class="form-control"
                                               
                                                />
                                        </div>


                                        <div class="row form-outline mb-2">
                                             <label class="col-6">Liều lượng</label>
                                            <input
                                                class="col-6"
                                                type="text"
                                                id=""
                                                required="required"
                                                value ="${pondInventoryDetail.dosage}"
                                                name="edit_dosage"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>


                                        <div class="row form-outline mb-2">
                                              <label class="col-6">Khối lượng</label>
                                            <input
                                                class="col-6"
                                                type="text"
                                                id=""
                                                required="required"
                                                value ="${pondInventoryDetail.usageWeight}"
                                                name="edit_usageWeight"
                                                class="form-control"
                                                placeholder="Khối lượng"
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-6">Mục đích sử dụng</label>
                                            <input
                                                class="col-6"
                                                type="text"
                                                id=""
                                                required="required"
                                                value="${pondInventoryDetail.usagePurpose}"
                                                name="edit_usagePurpose"
                                                class="form-control"
                                                placeholder="Mục đích sử dụng"
                                                />
                                        </div>





                                        <div class="text-center pt-1 mb-5">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">Sửa chi tiết</button>

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
