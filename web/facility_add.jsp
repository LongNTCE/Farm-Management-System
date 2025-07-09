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
    <body class="add-facility-body">
        <div class="container py-3 h-50">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-xl-10">
                    <div class="card rounded-3 text-black">
                        <div class="row g-0">

                            <div class="col-12 offset-lg-3 col-lg-6">
                                <div class="card-body p-md-5 mx-md-4">

                                    <div class="">
                                        <a href="manage_viewall" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i> Trở về trang trước</h6> 
                                        </a>
                                        <h3 class="mt-1 mb-3 pb-1 text-center">Thêm cơ sở</h3>
                                    </div>

                                    <form action="addfacility" method="post">


                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Tên cơ sở</label>
                                            <input class="col-5" required="required" type="text" name="add_fName" title="Nhập tối đa 20 kí tự bao gồm chữ cái và số." id="" minlenght='1' maxlength="20" class="form-control" placeholder=""/>

                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Địa chỉ</label>
                                            <input  class="col-5" required="required" type="text" name="add_fAddress"  title="Nhập tối đa 20 kí tự bao gồm chữ cái và số." minlenght='1' maxlength="20" class="form-control" placeholder="" />

                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Số điện thoại cơ sở</label>
                                            <input class="col-5" required="required" type="text" id="" name="add_fPhone" pattern="[0][0-9]{9}" title="Số điện thoại không hợp lệ." class="form-control" placeholder=""/>
                                            <p class="text-danger"> ${error}</p>
                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Tổng diện tích ao</label>
                                            <input  class="col-5"  required="required" type="number" id=""  name="add_fTotalSquare" min="0" max="100000"  title="Tối đa 100000 mét vuông" class="form-control" placeholder="" />

                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Tổng diện tích ao canh tác</label>
                                            <input  class="col-5"  required="required" type="number" id=""  name="add_fCultivatingPondSquare" min="0" max="100000"  title="Tối đa 100000 mét vuông" class="form-control" placeholder="" />

                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Tổng diện tích ao chứa</label>
                                            <input  class="col-5" required="required" type="number" id="" name="add_fStoragePondSquare" min="0" max="100000" class="form-control" placeholder="" />

                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Diện tích ao chứa bùn thải</label>
                                            <input class="col-5" required="required" type="number" id="" name="add_fWastePonsSquare" min="0" max="100000"  title="Tối đa 100000 mét vuông" class="form-control" placeholder="" />

                                        </div>

                                        <div class="row form-outline mb-2">
                                            <label class="col-7">Loài canh tác</label>
                                            <input class="col-5" required="required" type="text" id="" name="add_fCultivatingObject" class="form-control"  placeholder="" />

                                        </div>

                                        <div class="row form-outline mb-2">
                                              <label class="col-7">Thời gian canh tác</label>
                                            <input class="col-5" required="required" type="number" id="" name="add_fCultivatingTime"  min="0" max="120" title="Vui lòng nhập số" class="form-control" placeholder="" />

                                        </div>

                                        <div class="text-center pt-1 mb-5">
                                            <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5" type="submit">Thêm cơ sở</button>

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
