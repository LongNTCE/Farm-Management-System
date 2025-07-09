<%-- 
    Document   : index
    Created on : Sep 8, 2022, 12:17:35 AM
    Author     : Admin
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>





        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>


        <!--CSS-->
        <link rel="stylesheet" href="./css/home.css" />
        <link rel="stylesheet" href="./css/admin_viewfownerlist.css" />
        <link rel="stylesheet" href="./css/manage2.css" />


        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simplePagination.js/1.6/simplePagination.css">


    </head>
    <body>




        <c:import url="NavBarControl" />

        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="./images/pond.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>${home_carousel_header_text}</h5>
                        <p>${home_carousel_desc1_text}</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="./images/carouselpic.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>${home_carousel_header_text}</h5>
                        <p>${home_carousel_desc2_text}</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="./images/carouselpic1.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>${home_carousel_desc3_text}</h5>
                        <p>${home_carousel_desc3_text}</p>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>

        <div class="container">
            <section class="stories-s-1 mt-1 p-3">
                <div class="container">
                    <div class="content-section free-text-wrap">
                        <h2>${home_what_we_can_do_text}</h2>
                        <p>
                            ${home_what_we_can_do_desc_text}

                        </p>


                    </div>
                </div>
            </section>

            <!--            <div class="row news-card-row p-3">
            
            
            
            
                            <div class="card col-6">
                                <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                                <div class="card-body">
                                    <h5 class="card-title">Quản lý cơ sở</h5>
                                    <p class="card-text">
                                        This is a wider card with supporting text below as a natural
                                        lead-in to additional content. This content is a little bit
                                        longer.
                                    </p>
            
                                </div>
                            </div>
                            <div class="card col-6">
                                <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                                <div class="card-body">
                                    <h5 class="card-title">Quản lý vụ mùa</h5>
                                    <p class="card-text">
                                        This is a wider card with supporting text below as a natural
                                        lead-in to additional content. This content is a little bit
                                        longer.
                                    </p>
            
                                </div>
                            </div>
                            <div class="card col-6 mt-4">
                                <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                                <div class="card-body">
                                    <h5 class="card-title">Quản lý ao canh tác</h5>
                                    <p class="card-text">
                                        This is a wider card with supporting text below as a natural
                                        lead-in to additional content. This content is a little bit
                                        longer.
                                    </p>
            
                                </div>
                            </div>
                            <div class="card col-6 mt-4">
                                <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                                <div class="card-body">
                                    <h5 class="card-title">Các chức năng của nhân công</h5>
                                    <p class="card-text">
                                        This is a wider card with supporting text below as a natural
                                        lead-in to additional content. This content is a little bit
                                        longer.
                                    </p>
            
                                </div>
                            </div>
                            <div class="card col-6 mt-4">
                                <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                                <div class="card-body">
                                    <h5 class="card-title">Quản lý các báo cáo VIETGAP</h5>
                                    <p class="card-text">
                                        This is a wider card with supporting text below as a natural
                                        lead-in to additional content. This content is a little bit
                                        longer.
                                    </p>
                                </div>
                            </div>
                            <div class="card col-6 mt-4">
                                <img class="card-img-top" src="./images/home_banner.jpg" alt="Card image cap" />
                                <div class="card-body">
                                    <h5 class="card-title">Xuất báo cáo theo tiêu chuẩn VIETGAP</h5>
                                    <p class="card-text">
                                        This is a wider card with supporting text below as a natural
                                        lead-in to additional content. This content is a little bit
                                        longer.
                                    </p>
            
                                </div>
                            </div>
                        </div>-->

            <div id="cards_landscape_wrap-2">

                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                        <a href="">
                            <div class="card-flyer">
                                <div class="text-box">
                                    <div class="image-box">
                                        <img src="./images/home_feature1.jpg" alt="" />
                                    </div>
                                    <div class="text-container">
                                        <h6>${home_feature_text}</h6>
                                        <p>${home_feature_desc_text}</p>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                        <a href="">
                            <div class="card-flyer">
                                <div class="text-box">
                                    <div class="image-box">
                                        <img src="./images/home_feature2.jpg" alt="" />
                                    </div>
                                    <div class="text-container">                                    
                                        <h6>${home_feature2_text}</h6>
                                        <p>${home_feature2_desc_text}</p>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                        <a href="">
                            <div class="card-flyer">
                                <div class="text-box">
                                    <div class="image-box">
                                        <img src="./images/home_feature3.jpg" alt="" />
                                    </div>

                                    <div class="text-container">
                                        <h6>${home_feature3_text}</h6>
                                        <p>${home_feature3_desc_text}</p>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                        <a href="">
                            <div class="card-flyer">
                                <div class="text-box">
                                    <div class="image-box">
                                        <img src="./images/home_feature4.jpg" alt="" />
                                    </div>
                                    <div class="text-container">
                                        <h6>${home_feature4_text}</h6>
                                        <p>${home_feature4_desc_text}</p>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                        <a href="">
                            <div class="card-flyer">
                                <div class="text-box">
                                    <div class="image-box">
                                        <img src="./images/home_feature5.jpg" alt="" />
                                    </div>
                                    <div class="text-container">
                                        <h6>${home_feature5_text}</h6>
                                        <p>${home_feature5_desc_text}</p>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                        <a href="">
                            <div class="card-flyer">
                                <div class="text-box">
                                    <div class="image-box">
                                        <img src="./images/home_feature6.jpg" alt="" />
                                    </div>
                                    <div class="text-container">                                    
                                        <h6>${home_feature6_text}</h6>
                                        <p>${home_feature6_desc_text}</p>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>

            </div>

            <div class="footer-connect ">
                <div class="row mt-5">
                    <div class="col-xl-4 col-md-6">
                        <h2>${home_near_contact_form_text}  <br /><b>${home_near_contact_form2_text}</b> </h2>
                        <h4>
                            ${home_near_contact_form3_text} </h4>
                        <img class="footer-connect-image1 offset-1" src="./images/morenews1.jpg">
                        <img class="footer-connect-image2 offset-4 " src="./images/morenews2.jpg">
                    </div>
                    <div class="col-xl-4">
                        <!-- Bootstrap 5 starter form -->
                        <form id="contactForm">
                            <!-- Name input -->
                            <div class="mb-3">
                                <input class="form-control" id="name" type="text" placeholder="${home_contact_form_name_text}" />
                            </div>

                            <!-- Email address input -->
                            <div class="mb-3">
                                <input class="form-control" id="emailAddress" type="email" placeholder="Email" />
                            </div>

                            <!-- Phone number input -->
                            <div class="mb-3">
                                <input class="form-control" placeholder="${signup_phone_text}" />
                            </div>

                            <!-- Message input -->
                            <div class="mb-3">
                                <textarea class="form-control" id="message" type="text" placeholder="${home_contact_form_message_text}"
                                          style="height: 10rem"></textarea>
                            </div>

                            <!-- Form submit button -->
                            <div class="d-grid">
                                <button class="btn btn-success btn-lg" type="submit">
                                    ${home_contact_form_contact_btn_text}
                                </button>
                            </div>


                        </form>
                    </div class="near-footer">
                    <div class="col-xl-4">
                        <img class="near-footer-img" src="./images/nuoitomsu.jpg" />
                    </div>
                </div>
            </div>

            <div class="contact-us-link">
                <a href="" class="p-2">
                    ${home_near_footer_text} <b>${home_near_footer2_text}</b>${home_near_footer3_text}
                </a>

            </div>

            <c:import url="footer.jsp" />

        </div>

    </body>
</html>
