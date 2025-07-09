<%-- 
    Document   : footer
    Created on : Oct 1, 2022, 5:54:04 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Bootstrap 5-->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <footer class="mt-5">
            <div class="container">
                <hr>
                <div class="row">
                    <div class="col-2">
                        <h5 class="mb-2">Thông tin liên hệ</h5>
                        <ul class="nav">
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted"><i class="fas fa-phone-alt"></i><strong>Số điện thoại:</strong> 0123456789</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted"><i class="fas fa-envelope-open-text"></i><strong>Gmail</strong> abc@gmail.com</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted"><i class="fas fa-map"></i><strong>Địa chỉ:</strong> Number 400, NVC noi dai, Ninh Kieu,
                                    Can Tho</a>
                            </li>

                        </ul>
                    </div>

                    <div class="col-2">
                        <h5 class="mb-3">Tiêu chuẩn</h5>
                        <ul class="nav flex-column">

                            <li class="nav-item mb-3">
                                <a href="#" class="nav-link p-0 text-muted"><img src="./images/globalgap.jpg" height="40px"
                                                                                 width="40px" /></a>
                            </li>
                            <li class="nav-item mb-3">
                                <a href="#" class="nav-link p-0 text-muted"><img src="./images/vietgap.jpg" height="40px"
                                                                                 width="40px" /></a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-2">
                        <h5>Khám phá thêm</h5>
                        <ul class="nav flex-column">
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted">Trang chủ</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted">Tính năng</a>
                            </li>
                          
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted">FAQs</a>
                            </li>
                            <li class="nav-item mb-2">
                                <a href="#" class="nav-link p-0 text-muted">Về trang web này</a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-4 offset-1">
                        <form>
                            <h5>Đăng ký để nhận những cập nhật mới nhất</h5>
                            <p>Những thông tin mới nhất về cập nhật sẽ được gửi tới mail của bạn.</p>
                            <div class="d-flex w-100 gap-2">
                                <label for="newsletter1" class="visually-hidden"></label>
                                <input id="newsletter1" type="text" class="form-control" placeholder="Địa chỉ email của bạn" />
                                <button class="btn btn-primary" type="button">Nhập
                    </div>
                </div>

                <div class="d-flex justify-content-center py-4 my-4 border-top ">
                    <p>© 2021 Company, Inc. All rights reserved.</p>

                </div>
            </div>

        </footer>
    </body>
</html>
