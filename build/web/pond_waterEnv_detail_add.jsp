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

                            <div class="col-12 offset-lg-3 col-lg-6">
                                <div class="card-body p-md-5 mx-md-4">

                                    <a href="#" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i> Back to previous</h6> 
                                    </a>
                                    <h3 class="mt-1 mb-3 pb-1 text-center">Thêm báo cáo môi trường nước</h3>


                                    <form action="AddWaterEnvRecord" method="post">

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Ngày tháng năm</label>
                                            <input
                                                class="col-5"
                                                type="date"
                                                id=""
                                                required="required"
                                                name="add_envDate"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="form-outline mb-2">        

                                        </div>        

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Oxy hòa tan sáng (mg/l)</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_dissolveOxygen_morning"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Oxy hòa tan chiều (mg/l)</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_dissolveOxygen_afternoon"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Độ pH sáng</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_pH_morning"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Độ pH chiều</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_pH_afternoon"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class=" row form-outline mb-2">
                                            <label class="col-7">Nhiệt độ buổi sáng</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_temperature_morning"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Nhiệt độ buổi chiều</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_temperature_afternoon"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Độ mặn (phần nghìn)</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_salinity"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Độ trong (cm3)</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_purity"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">NH3 (mg/l)</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_NH3"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Độ kiềm (mg/l)</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_alkali"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">H2S (mg/l)</label>
                                            <input
                                                class="col-5"
                                                type="double"
                                                id=""
                                                required="required"
                                                name="add_H2S"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>







                                        <div class="text-center pt-1 mb-5">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">Thêm chi tiết</button>

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
