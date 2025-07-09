<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
            crossorigin="anonymous"
        ></script>
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
        <script src="./js/modal.js"></script>
        <script src="./js/manage.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <!--JQuery 3.6.1-->
        <script
            src="//ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"
            language="javascript"
            type="text/javascript"
        ></script>
        <script
            src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"
        ></script>
        <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"
        ></script>
        <script>
            $("#myModal").on("shown.bs.modal", function () {
                $("#myInput").trigger("focus");
            });
        </script>
        <!--Table Pagination-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/datatables/1.10.2/css/jquery.dataTables.min.css" integrity="sha512-bwiuC9VseMvzbXDLXj14XYpaUF/83K0C/rn1JDrUxGrDCL8tHlxMXK5wkvsldSaOi91iSMSBJ3zFRyyYbe3WHQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <script src="./js/jquery.dataTables.min.js"></script>

        <!--Table Pagination-->
       
        <script>
          
        </script>

        <style>
            #tableA {
                display: none;
            }
            #tableB {
                display: none;
            }
        </style>
    </head>
    <body>
        <div class="container mb-5">
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

                                    <option value="ENG">ENG</option>



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
    </nav>        </div>
        
        
        <div class="container mt-5">
            <!--            <div>
                            <div class="mt-5">
                                <a href="#" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-3" aria-hidden="true"></i>Trở về trang trước</h6> 
                                </a>
                            </div>
                            <h2>Lời mời vào hợp tác xã</h2>
            
                            <table class="table table-striped table-bordered">
                                <thead>
                                    <tr>
            
                                        <th scope="col" style="width: 70%">Tên hợp tác xã</th>
            
                                        <th scope="col" style="width: 30%">Thao tác</th>
                                    </tr>
                                </thead>
                                <tbody>
            <%--- <c:forEach items="${listFInventoryDetail}" var="fi"> ---%>


            <tr>
                <td>Hợp tác xã 1 </td>
                <td> <div class="row">
                        <div class="col-5"> <a href="#" class="btn btn-success"> Chấp nhận</a></div>
                        <div class="col-5"> <form action="#" method ="post">
                                <button href="#"class="btn btn-danger" type="submit"> Từ chối</button>
                                <input hidden disable value="" name="ccc"/>
                            </form></div>
                    </div></td>
            </tr>



        </tbody>
    </table>


    <h2>Danh sách hợp tác xã đã tham gia</h2>

    <table class="table table-striped table-bordered">
        <thead>
            <tr>

                <th scope="col" style="width: 70%">Tên hợp tác xã</th>
                <th scope="col" style="width: 70%">Địa chỉ</th>
                <th scope="col" style="width: 30%">Thao tác</th>
            </tr>
        </thead>
        <tbody>
            <%--- <c:forEach items="${listFInventoryDetail}" var="fi"> ---%>


            <tr>
                <td>Hợp tác xã 1 </td>
                <td> <div class="row">
                        <div class="col-5"> <a href="#" class="btn btn-success"> Chấp nhận</a></div>
                        <div class="col-5"> <form action="#" method ="post">
                                <button href="#"class="btn btn-danger" type="submit"> Từ chối</button>
                                <input hidden disable value="" name="ccc"/>
                            </form></div>
                    </div></td>
            </tr>



        </tbody>
    </table>
</div>-->

            <div class="container">
                <div class="mt-5">
                    <a href="facilityDetail" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-4" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                    </a>
                </div>
            </div>

            <h2>${cooperative_invitation_management_text}</h2>



            <button type="button " class="btn btn-primary mt-3" id="showTableA" value="">${cooperative_invitation_list_text}</button>


            <button type="button" class="btn btn-success mt-3" id="showTableB" value="">${cooperative_invitation_participated_coop_text}</button>


            <!--Cooperative Invitation-->
            <table class="table table-striped table-bordered mt-2" id="tableA">
                <thead>
                    <tr>

                        <th scope="col" style="width: 25%">${cooperative_invitation_cooperative_name_text}</th>
                        <th scope="col" style="width: 30%">${facility_address_text}</th>
                        <th scope="col" style="width: 15%">${signup_phone_text}</th>
                        <th scope="col" style="width: 30%">${record_action_text}</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listC}" var="fi">


                        <tr>
                            <td>${fi.coName} </td>
                            <td>${fi.coAddress} </td>
                            <td>${fi.coPhone} </td>
                            <td> <div class="row">
                                    <div class="col-5"> 
                                        <form action="AcceptCoopInv?operation=accept" method ="post">
                                            <button class="btn btn-success" type="submit"> ${cooperative_invitation_accept_text}</button>
                                            <input hidden disable value="${fi.coID}" name="coID"/>
                                        </form>
                                    </div>
                                    <div class="col-5"> 
                                        <form action="AcceptCoopInv?operation=deny" method ="post">
                                            <button class="btn btn-danger" type="submit">${cooperative_invitation_reject_text}</button>
                                            <input hidden disable value="${fi.coID}" name="coID"/>
                                        </form>
                                    </div>
                                </div></td>
                        </tr>

                    </c:forEach>

                </tbody>
            </table>

            <!--Participated Cooperative-->
            <table class="table table-striped table-bordered mt-2" id="tableB">
                <thead>
                    <tr>

                        <th scope="col" style="width: 25%">${cooperative_invitation_cooperative_name_text}</th>
                        <th scope="col" style="width: 30%">${facility_address_text}</th>
                        <th scope="col" style="width: 15%">${signup_phone_text}</th>
                        <th scope="col" style="width: 30%">${record_action_text}</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listCAccepted}" var="ci"> 


                        <tr>
                            <td>${ci.coName} </td>
                            <td>${ci.coAddress} </td>
                            <td>${ci.coPhone} </td>
                            <td> <div class="row">
                                    <div class="col-5"> 
                                        <form action="AcceptCoopInv?operation=deny" method ="post" id="myform_deleteall${ci.coID}" hidden="hidden">
                                            <button class="btn btn-danger" type="submit">${cooperative_invitation_leave_cooperative_text}</button>
                                            <input hidden disable value="${ci.coID}" name="coID"/>
                                        </form>
                                        
                                        
                        <!-- Button trigger modal -->
                        <button class="col-12 btn btn-danger" type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal2${ci.coID}">
                             ${cooperative_invitation_leave_cooperative_text}
                        </button>

                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal2${ci.coID}" tabindex="-1" aria-labelledby="exampleModalLabel2" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">${leave_cooperative_header_text}</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        ${leave_cooperative_body_text}
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                                        <input class="btn btn-danger" type="submit" form="myform_deleteall${ci.coID}" value="${leave_cooperative_leave_text}"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                                    </div>
                                </div></td>
                        </tr>
                    </c:forEach>



                </tbody>
            </table>
        </div>



        <script>
            var tableA = document.getElementById("tableA");
            var tableB = document.getElementById("tableB");

            var btnTabA = document.getElementById("showTableA");
            var btnTabB = document.getElementById("showTableB");
            tableA.style.display = "table";
            btnTabA.onclick = function () {
                tableA.style.display = "table";
                tableB.style.display = "none";
            }
            btnTabB.onclick = function () {
                tableA.style.display = "none";
                tableB.style.display = "table";
            }
        </script>
    </body>
</html>