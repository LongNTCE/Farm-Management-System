<%-- 
    Document   : error500
    Created on : Oct 26, 2022, 5:34:23 PM
    Author     : msi-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<html lang="en">
    <head>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"crossorigin="anonymous"></script>

        <!--Bootstrap 5-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />

        <!--Font awesome-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
              integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="./css/home.css" />
        <link rel="stylesheet" href="./css/manage2.css" />
        <link rel="stylesheet" href="./css/admin_viewfownerlist.css" />

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

        <!--Pagination-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simplePagination.js/1.6/simplePagination.css">


    </head>
    <body style="background-color: #6495ED">
            <nav class="navbar navbar-dark navbar-expand-lg  bg-success fixed-top">
            <div class="container">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#Navbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href="#"><img src="./images/logo.png" height="30" width="61" alt="" /></a>
                <div class="collapse navbar-collapse " id="Navbar">
                    <ul class=" navbar-nav ms-auto" >

                        <!--Home-->
                        <li class="nav-item dropdown dropdown-mega dropdown-mega-home position-static">
                            <a class="nav-link " href="#" data-bs-toggle="dropdown" data-bs-auto-close="outside">Trang chú</a>


                        </li>


                        <c:if test="${sessionScope.acc != null}">
                            <!--Manage-->
                            <li class="nav-item dropdown dropdown-mega position-static">
                                <a class="nav-link dropdown-toggle" href="https://getbootstrap.com/docs/4.0/utilities/spacing/" data-bs-toggle="dropdown" data-bs-auto-close="outside">Quản lý</a>
                                <div class="dropdown-menu shadow">

                                    <div class="mega-content px-4">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <div class="col-12">Bạn muốn quản lý??</div>
                                                <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div1">

                                                    <!--                                        <img src="./images/morenew1withblur.jpg" alt="">-->
                                                    <div onclick="location.href = 'manage_viewall'" class="bottom-left justify-content-center">
                                                        Cơ sở</div>
                                                </div>


                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </c:if>

                        <c:if test="${sessionScope.accEmp != null}">
                            <!--Manage-->
                            <li class="nav-item dropdown dropdown-mega position-static">
                                <a class="nav-link dropdown-toggle" href="https://getbootstrap.com/docs/4.0/utilities/spacing/" data-bs-toggle="dropdown" data-bs-auto-close="outside">Quản lý</a>
                                <div class="dropdown-menu shadow">

                                    <div class="mega-content px-4">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <div class="col-12">Bạn muốn quản lý??</div>
                                                <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div1">

                                                    <!--                                        <img src="./images/morenew1withblur.jpg" alt="">-->
                                                    <div onclick="location.href = 'manage_viewall'" class="bottom-left justify-content-center">
                                                        Cơ sở</div>
                                                </div>


                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </c:if>


                        <c:if test="${sessionScope.accCoop != null}">
                            <!--Manage-->
                            <li class="nav-item dropdown dropdown-mega position-static">
                                <a class="nav-link dropdown-toggle" href="https://getbootstrap.com/docs/4.0/utilities/spacing/" data-bs-toggle="dropdown" data-bs-auto-close="outside">Quản lý</a>
                                <div class="dropdown-menu shadow">

                                    <div class="mega-content px-4">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <div class="col-12">Bạn muốn quản lý??</div>
                                                <div class="col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div1">

                                                    <!--                                        <img src="./images/morenew1withblur.jpg" alt="">-->
                                                    <div onclick="location.href = 'manage_viewall'" class="bottom-left justify-content-center">
                                                        Cơ sở</div>
                                                </div>


                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </c:if>

                        <c:if test="${sessionScope.accAdmin != null}">


                            <li class="nav-item dropdown dropdown-mega position-static">
                                <a class="nav-link dropdown-toggle" href="https://getbootstrap.com/docs/4.0/utilities/spacing/" data-bs-toggle="dropdown" data-bs-auto-close="outside">Quản lý</a>
                                <div class="dropdown-menu shadow">
                                    <div class="mega-content px-4">
                                        <div class="container-fluid">
                                            <div class="row">
                                                <div class="col-12">Bạn muốn quản lý??</div>
                                                <div class=" col-4  py-3 mega-container mega-container-div1">
                                                    
                                                    <div onclick="location.href = 'ViewAllFownerControl'" class="bottom-left justify-content-center">
                                                        Tất cả chủ cơ sở</div>
                                                </div>
                                                
                                                <div class="col-4  py-3 mega-container mega-container-div1" style="background: #cccccc">
                                                    
                                                    <div onclick="location.href = 'ViewAllEmployeeControl'" class="bottom-left justify-content-center">
                                                        Tất cả nhân viên</div>
                                                </div>
                                                
                                                 <div class="col-4  py-3 mega-container mega-container-div1">
                                                    
                                                    <div onclick="location.href = 'ShowAllCoopControl'" class="bottom-left justify-content-center">
                                                        Tất cả hợp tác xã</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mega-content px-4">
                                        <div class="container-fluid">
                                           
                                      
                                               
                                           
                                        </div>
                                    </div>
                                    <div class="mega-content px-4">
                                        <div class="container-fluid">
                                            
                                             
                                               
                                           
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </c:if>






                        <c:if test="${sessionScope.acc == null }">
                            <c:if test="${sessionScope.accEmp == null }">
                                <c:if test="${sessionScope.accCoop == null }">
                                    <c:if test="${sessionScope.accAdmin == null }">
                                        <li class="nav-item">
                                            <a class="nav-link" href="./login.jsp">Đăng nhập </a>
                                        </li>
                                    </c:if>

                                </c:if>
                            </c:if>

                        </c:if>




                        <li class="nav-item">
                            <a class="nav-link" href="logout">Đăng xuất </a>
                        </li>



                    </ul>
                </div>
            </div>
        </nav>
        
                                        <div class="container mt-2 justify-content-center mx-auto">
                                            <img class="rounded mx-auto d-block" src="./images/b4b1640525ecadfa1030e6096f3ec842.gif"/>
                                            <h1 class="text-center">Có lỗi 500 kìa fix đi a trai</h1>
                                        </div>
                                        
                                        <!--                                                <h1>Lỗi 500 r kìa anh trai!</h1>
                                                <image src="https://cdn.discordapp.com/attachments/647383873780580353/1034433668334239775/unknown.png" />-->
        
    </body>
</html>
