<%-- 
    Document   : navBar.jsp
    Created on : Sep 13, 2022, 10:18:39 PM
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

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"crossorigin="anonymous"></script>


        <script src="./node_modules/jquery/dist/jquery.min.js"></script>
        <script src="./node_modules/jquery/dist/jquery.js"></script>

        <!--Bootstrap 5-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />

        <!--Font awesome-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
              integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="./css/home.css" />

        <script src="./js/carousel.js"></script>

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>



        <style>
            .carousel {
                background: #00A36C;
            }

            .carousel-item {
                height: 400px;
            }

            .carousel-item img {
                position: absolute;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;

            }

            #carouselButton {
                right:0px;
                position: absolute;
                bottom: 0px;
                z-index: 1;
            }
        </style>

        <style>
            /*----  Main Style  ----*/
            #cards_landscape_wrap-2{
                text-align: center;

                border-radius: 10px;
            }
            #cards_landscape_wrap-2 .container{
                padding-top: 80px; 
                padding-bottom: 100px;
            }
            #cards_landscape_wrap-2 a{
                text-decoration: none;
                outline: none;
            }
            #cards_landscape_wrap-2 .card-flyer {
                border-radius: 5px;
            }
            #cards_landscape_wrap-2 .card-flyer .image-box{
                background: #ffffff;
                overflow: hidden;
                box-shadow: 0px 2px 15px rgba(0, 0, 0, 0.50);
                border-radius: 5px;
            }
            #cards_landscape_wrap-2 .card-flyer .image-box img{
                -webkit-transition:all .9s ease; 
                -moz-transition:all .9s ease; 
                -o-transition:all .9s ease;
                -ms-transition:all .9s ease; 
                width: 100%;
                height: 200px;
            }
            #cards_landscape_wrap-2 .card-flyer:hover .image-box img{
                opacity: 0.7;
                -webkit-transform:scale(1.15);
                -moz-transform:scale(1.15);
                -ms-transform:scale(1.15);
                -o-transform:scale(1.15);
                transform:scale(1.15);
            }
            #cards_landscape_wrap-2 .card-flyer .text-box{
                text-align: center;
            }
            #cards_landscape_wrap-2 .card-flyer .text-box .text-container{
                padding: 30px 18px;
            }
            #cards_landscape_wrap-2 .card-flyer{
                background: #FFFFFF;
                margin-top: 50px;
                -webkit-transition: all 0.2s ease-in;
                -moz-transition: all 0.2s ease-in;
                -ms-transition: all 0.2s ease-in;
                -o-transition: all 0.2s ease-in;
                transition: all 0.2s ease-in;
                box-shadow: 0px 3px 4px rgba(0, 0, 0, 0.40);
            }
            #cards_landscape_wrap-2 .card-flyer:hover{
                background: #fff;
                box-shadow: 0px 15px 26px rgba(0, 0, 0, 0.50);
                -webkit-transition: all 0.2s ease-in;
                -moz-transition: all 0.2s ease-in;
                -ms-transition: all 0.2s ease-in;
                -o-transition: all 0.2s ease-in;
                transition: all 0.2s ease-in;
                margin-top: 50px;
            }
            #cards_landscape_wrap-2 .card-flyer .text-box p{
                margin-top: 10px;
                margin-bottom: 0px;
                padding-bottom: 0px; 
                font-size: 14px;
                letter-spacing: 1px;
                color: #000000;
            }
            #cards_landscape_wrap-2 .card-flyer .text-box h6{
                margin-top: 0px;
                margin-bottom: 4px; 
                font-size: 18px;
                font-weight: bold;
                text-transform: uppercase;
                font-family: 'Roboto Black', sans-serif;
                letter-spacing: 1px;
                color: #00acc1;
            }
        </style>

        <!--Font-awesome & bootstrap social-->

        <link
            rel="stylesheet"
            href="./node_modules/bootstrap-social/bootstrap-social.css"
            />

    </head>




    <nav class="navbar navbar-dark navbar-expand-lg  bg-success fixed-top">
        <div class="container">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#Navbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="home"><img src="./images/logo.png" height="42" width="70" alt="" /></a>
            <div class="collapse navbar-collapse " id="Navbar">
                <ul class=" navbar-nav ms-auto" >

                    <!--Home-->

                    <li class="nav-item dropdown dropdown-mega dropdown-mega-home mt-2">

                        <form action="NavBarControl" method="post"> 

                            <select name="languageValue" aria-label="Default select example" onchange="this.form.submit()">

                                <option selected value="${languageValue}">${languageValue}</option>
                                <c:forEach items="${listLanguage}" var="la">
                                    <option value="${la}">${la}</option>
                                </c:forEach>



                            </select>


                        </form>

                    </li>

                    <li class="nav-item dropdown dropdown-mega dropdown-mega-home position-static">

                        <a class="nav-link " href="home" data-bs-toggle="dropdown" data-bs-auto-close="outside">${home_text}</a>

                    </li>


                    <!--Manage-->




                    <li class="nav-item dropdown dropdown-mega position-static">
                        <a class="nav-link dropdown-toggle" href="https://getbootstrap.com/docs/4.0/utilities/spacing/" data-bs-toggle="dropdown" data-bs-auto-close="outside">${home_manage_text}</a>
                        <div class="dropdown-menu shadow">

                            <div class="mega-content px-4">
                                <div class="container-fluid">
                                    <div class="row">


                                        <!--                                        <img src="./images/morenew1withblur.jpg" alt="">-->

                                        
                                         <c:choose>
                                            <c:when test="${isAdmin != null}">
                                                
                                            </c:when>
                                            <c:when test="${sessionScope.accEmp != null }">
                                                
                                            
                                            <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div1">

                                                <!--                                        <img src="./images/morenew1withblur.jpg" alt="">-->
                                                <div onclick="location.href = 'manage_viewall'" class="bottom-left justify-content-center">
                                                    ${home_facility_management_text}</div>
                                            </div>
                                            <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div2">


                                                <div onclick="location.href = 'EditEmployeeControl'" class="bottom-left justify-content-center">
                                                    ${home_information_management_text}</div>
                                            </div>
                                            </c:when>

                                        </c:choose>





                                        <c:if test="${sessionScope.acc != null }">



                                            <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div1">

                                                <!--                                        <img src="./images/morenew1withblur.jpg" alt="">-->
                                                <div onclick="location.href = 'manage_viewall'" class="bottom-left justify-content-center">
                                                    ${home_facility_management_text}</div>
                                            </div>
                                            <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div2">


                                                <div onclick="location.href = 'EditFacilityOwnerControl'" class="bottom-left justify-content-center">
                                                    ${home_information_management_text}</div>
                                            </div>

                                        </c:if> 


                                        
                                        
                                        <c:choose>
                                            <c:when test="${isAdmin != null}">
                                                
                                            </c:when>
                                            <c:when test="${sessionScope.accCoop != null }">
                                                
                                            <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div1">

                                                <!--                                        <img src="./images/morenew1withblur.jpg" alt="">-->
                                                <div onclick="location.href = 'manage_viewall'" class="bottom-left justify-content-center">
                                                    ${home_facility_management_text}</div>
                                            </div>
                                            <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div2">


                                                <div onclick="location.href = 'EditCoopControl'" class="bottom-left justify-content-center">
                                                    ${home_information_management_text}</div>
                                            </div>
                                            </c:when>

                                        </c:choose>









                                        <c:if test="${sessionScope.accAdmin != null }">



                                            <div class=" col-4  py-3 mega-container mega-container-div1">


                                                <div onclick="location.href = 'ShowAllFacilityOwnerControl'" class="bottom-left justify-content-center">
                                                    ${home_all_facility_owner_management_text}</div>
                                            </div>

                                            <div class="col-4  py-3 mega-container mega-container-div1" style="background: #cccccc">

                                                <div onclick="location.href = 'ViewAllEmployeeControl'" class="bottom-left justify-content-center">
                                                    ${home_all_employee_management_text}</div>
                                            </div>

                                            <div class="col-4  py-3 mega-container mega-container-div1">

                                                <div onclick="location.href = 'ShowAllCoopControl'" class="bottom-left justify-content-center">
                                                    ${home_all_cooperative_management_text}</div>
                                            </div>

                                        </c:if>



                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>






                    <c:choose>
                        <c:when test="${sessionScope.accAdmin != null }">
                            <li class="nav-item">
                                <a class="nav-link" href="login"></a>
                            </li>
                        </c:when>
                        <c:when test="${sessionScope.accCoop != null }">
                            <li class="nav-item">
                                <a class="nav-link" href="login"></a>
                            </li>
                        </c:when>
                        <c:when test="${sessionScope.acc != null }">
                            <li class="nav-item">
                                <a class="nav-link" href="login"></a>
                            </li>
                        </c:when>
                        <c:when test="${sessionScope.accEmp != null }">
                            <li class="nav-item">
                                <a class="nav-link" href="login"></a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li class="nav-item">
                                <a class="nav-link" href="login">${home_login_navbar_text}</a>
                            </li>
                        </c:otherwise>
                    </c:choose>







                    <li class="nav-item">
                        <a class="nav-link" href="logout">${home_logout_text} </a>
                    </li>



                </ul>
            </div>
        </div>
    </nav>






</html>
