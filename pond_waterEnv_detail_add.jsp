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

                                    <a href="pondWaterEnvDetail" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                                    </a>
                                    <h3 class="mt-1 mb-3 pb-1 text-center">${add_record_water_env_text}</h3>


                                    <form action="AddWaterEnvRecord" method="post">

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${record_date_text}</label>
                                            <input
                                                class="col-7"
                                                value="${envDate}"
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
                                            <label class="col-5">${water_environment_record_dissolve_oxygen_text} ${water_environment_record_morning_text}(mg/l)</label>
                                            <input
                                                class="col-7"
                                                value="${dissolveOxygen_morning}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_dissolveOxygen_morning"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${water_environment_record_dissolve_oxygen_text} ${water_environment_record_afternoon_text}(mg/l)</label>
                                            <input
                                                class="col-7"
                                                value="${dissolveOxygen_afternoon}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_dissolveOxygen_afternoon"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5"> pH ${water_environment_record_morning_text}</label>
                                            <input
                                                class="col-7"
                                                value="${pH_morning}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_pH_morning"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">pH ${water_environment_record_afternoon_text}</label>
                                            <input
                                                class="col-7"
                                                value="${pH_afternoon}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_pH_afternoon"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class=" row form-outline mb-2">
                                            <label class="col-5">${water_environment_record_temperature_text} ${water_environment_record_morning_text} (C)</label>
                                            <input
                                                class="col-7"
                                                value="${temperature_morning}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_temperature_morning"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${water_environment_record_temperature_text} ${water_environment_record_afternoon_text}</label>
                                            <input
                                                class="col-7"
                                                value="${temperature_afternoon}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_temperature_afternoon"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${water_environment_record_salinity_text} (${water_environment_record_per_thousand_text})</label>
                                            <input
                                                class="col-7"
                                                value="${salinity}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_salinity"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${water_environment_record_purity_text} (cm3)</label>
                                            <input
                                                class="col-7"
                                                value="${purity}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_purity"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">NH3 (mg/l)</label>
                                            <input
                                                class="col-7"
                                                value="${NH3}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_NH3"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">${water_environment_record_alkali_text} (mg/l)</label>
                                            <input
                                                class="col-7"
                                                value="${alkali}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_alkali"
                                                class="form-control"
                                                placeholder=""
                                                />
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-5">H2S (mg/l)</label>
                                            <input
                                                class="col-7"
                                                value="${H2S}"
                                                type="number" step="0.00001"
                                                id=""
                                                required="required"
                                                name="add_H2S"
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
