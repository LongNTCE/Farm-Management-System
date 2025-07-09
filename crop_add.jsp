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

                                    <a href="facilityDetail" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                                    </a>
                                    <h3 class="mt-1 mb-3 pb-1 text-center">${crop_add_text}</h3>


                                    <form action="addcrop" method="post">

                                        <div class="row form-outline mb-2">
                                            <label class="col-4 offset-1">${crop_name_text}</label>
                                            <input
                                                class="col-7"
                                                type="text"
                                                id=""
                                                value="${add_cropName}"
                                                name="add_cropName"
                                                class="form-control"
                                                placeholder=""
                                                required="required"
                                                maxlength="100"
                                                title="Nhập tối đa 20 kí tự bao gồm chữ cái và số."
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-4 offset-1">${crop_start_date_text}</label>
                                            <input
                                                class="col-7"
                                                type="date"

                                                id="startDate"
                                                required="required"
                                                name="add_cropStartDate"
                                                class="form-control"
                                                placeholder=""
                                                min = "2012-01-01"
                                                value="${add_cropStartDate}"
                                                onchange='check()'
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-4 offset-1">${crop_end_date_text}</label>
                                            <input
                                                class="col-7"
                                                type="date"
                                                id="endDate"
                                                value=''
                                                required="required"
                                                value="${add_cropEndDate}"
                                                name="add_cropEndDate"
                                                class="form-control col-6"
                                                placeholder=""
                                                min=''
                                                />

                                        </div>

                                        <p class="text-danger offset-5"> ${error}</p>

                                        <div class="text-center pt-1 mb-5">

                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">${crop_add_text}</button>

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
