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
        <script
            src="//ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"
            language="javascript"
            type="text/javascript"

        ></script>
        <script>
            function check() {
                // alert("Yeah!");
                var fit_start_time = $("#startDate").val(); //2013-09-5

                document.getElementById("endDate").min = fit_start_time;

            }

        </script>


    </head>
    <body class="add-crop-body">
        <div class="container py-3 h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-10">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">

                            <div class="col-12 offset-lg-3 col-lg-6">
                                <div class="card-body p-md-5 mx-md-4">

                                    <a href="facilityDetail" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i> Trở về trang trước</h6> 
                                    </a>
                                    <h3 class="mt-1 mb-3 pb-1 text-center">Thêm vụ mùa</h3>


                                    <form action="addcrop" method="post">

                                        <div class="row form-outline mb-2">
                                            <label class="col-6">Tên vụ mùa</label>
                                            <input
                                                class="col-6"
                                                type="text"
                                                id=""
                                                name="add_cropName"
                                                class="form-control"
                                                placeholder=""
                                                required="required"
                                                maxlength="20"
                                                title="Nhập tối đa 20 kí tự bao gồm chữ cái và số."
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-6">Ngày bắt đầu</label>
                                            <input
                                                class="col-6"
                                                type="date"
                                                id="startDate"
                                                required="required"
                                                name="add_cropStartDate"
                                                class="form-control"
                                                placeholder=""
                                                min = "2012-01-01"

                                                onchange='check()'
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-6">Ngày kết thúc</label>
                                            <input
                                                class="col-6"
                                                type="date"
                                                id="endDate"
                                                value=''
                                                required="required"
                                                name="add_cropEndDate"
                                                class="form-control col-6"
                                                placeholder=""
                                                min=''
                                                />
                                        </div>

                                        <div class="text-center pt-1 mb-5">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">Thêm vụ mùa</button>

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
