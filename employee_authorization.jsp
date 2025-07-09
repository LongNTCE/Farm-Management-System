<%-- 
    Document   : employee_authorization
    Created on : Oct 20, 2022, 1:36:40 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"crossorigin="anonymous"></script>
        <link
            rel="stylesheet"
            href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
            integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
            crossorigin="anonymous"
            />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
              integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="./css/home.css" />


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>



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

        <!--CSS-->
        <link rel="stylesheet" href="./css/home.css" />
        <link rel="stylesheet" href="./css/admin_viewfownerlist.css" />
        <link rel="stylesheet" href="./css/manage2.css" />
        <script src="./js/modal.js"></script>



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

        <!--Pagination-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simplePagination.js/1.6/simplePagination.css">


    </head>
    <body>

        <div class="container mb-5">
            <c:import url="NavBarControl" />     
        </div>



        <div class="container mt-6">
            <div class="mt-5">
                <a href="Manage_ViewEmployeeControl" class="text-decoration-none mt-5"> <h6><i class="fa fa-arrow-left ms-auto mt-4" aria-hidden="true"></i>${back_to_previous_text}</h6> 
                </a>
            </div>
          
            <div class="mt-6">
                <h2 class="mt-6">${employee_authorization_text}</h2>
            </div>

            <div class="container">

                <div id="checkbox-value"></div>
                <form action="AuthorizeEmployee" method="post">
                    <table>
                        <tbody>
                            <tr>
                                <td><b><h5 class="mt-3">${employee_facility_report_text}</h5> </b></td>
                            </tr>

                        </tbody>

                        <tbody>
                            <tr>
                                <td>
                                    <select class="form-select" name="cID" aria-label="Default select example" onchange="this.form.submit()">

                                        <option selected value="${teo.cropID}">${teo.cropName}</option>
                                        <c:forEach items="${listCName}" var="pc">
                                            <option value="${pc.cropID}">${pc.cropName}</option>
                                        </c:forEach>

                                    </select>
                                </td>
                            </tr>

                        </tbody>              
                        <tbody>
                            <tr>
                                <td><h6>${employee_breed_report_text}</h6></td>
                                <td>


                                    <c:choose>
                                        <c:when test="${be =='true'}">
                                            <input checked="checked" type="checkbox" id="custom7" name="bee"/>
                                            <br />
                                        </c:when>    
                                        <c:otherwise>
                                            <input type="checkbox" id="custom7" name="bee"/>
                                            <br />
                                        </c:otherwise>
                                    </c:choose>


                                </td>
                            </tr>
                            <tr>
                                <td><h6>${employee_harvest_report_text}</h6></td>
                                <td class="ms-1">
                                    <c:choose>
                                        <c:when test="${he =='true'}">
                                            <input checked="checked" type="checkbox" id="custom7" name="hee"/>

                                            <br />
                                        </c:when>    
                                        <c:otherwise>
                                            <input  type="checkbox" id="custom7" name="hee"/>
                                            <br />
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                            </tr>
                            <tr>
                                <td><h6>${employee_facility_inventory_report_text}</h6> </td>
                                <td> 
                                    <c:choose>
                                        <c:when test="${ie =='true'}">
                                            <input checked="checked" type="checkbox" id="custom7" name="iee"/>
                                            <br />
                                        </c:when>    
                                        <c:otherwise>
                                            <input type="checkbox" id="custom7" name="iee"/>
                                            <br />
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                            </tr>
                        </tbody>


                        <tbody >
                            <tr>
                                <td><b><h5 class="mt-3"> ${employee_pond_report_text}</h5></b></td>
                            </tr>

                        </tbody>
                        <tbody>
                            <tr>
                                <td>
                                    <select name="pID" class="form-select" aria-label="Default select example" onchange="this.form.submit()">

                                        <option selected value="${pondIni.pondID}">${pondIni.pondName}</option>
                                        <c:forEach items="${listPName}" var="pc">
                                            <option value="${pc.pondID}">${pc.pondName}</option>
                                        </c:forEach>

                                    </select>
                                </td>
                            </tr>

                        </tbody>  

                        <tbody>
                            <tr>
                                <td><h6>${employee_pond_inventory_report_text}</h6></td>
                                <td>

                                    <c:choose>
                                        <c:when test="${pie =='true'}">
                                            <input checked="checked" type="checkbox" id="custom7" name="piee"/>
                                            <br />
                                        </c:when>    
                                        <c:otherwise>
                                            <input type="checkbox" id="custom7" name="piee"/>
                                            <br />
                                        </c:otherwise>
                                    </c:choose>

                                </td>
                            </tr>
                            <tr>
                                <td><h6>${employee_survival_rate_report_text}</h6> </td>
                                <td> 

                                    <c:choose>
                                        <c:when test="${pse =='true'}">
                                            <input checked="checked" type="checkbox" id="custom7" name="psee"/>
                                            <br />
                                        </c:when>    
                                        <c:otherwise>
                                            <input type="checkbox" id="custom7" name="psee"/>
                                            <br />
                                        </c:otherwise>
                                    </c:choose>


                                </td>

                            </tr>
                            <tr>
                                <td><h6>${employee_water_env_report_text}</h6> </td>
                                <td> 

                                    <c:choose>
                                        <c:when test="${pwe =='true'}">
                                            <input checked="checked" type="checkbox" id="custom7" name="pwee"/>
                                            <br />
                                        </c:when>    
                                        <c:otherwise>
                                            <input type="checkbox" id="custom7" name="pwee"/>
                                            <br />
                                        </c:otherwise>
                                    </c:choose>

                                </td>

                            </tr>
                        </tbody> 

                    </table>
                    <input  class="btn btn-primary col-lg-1 mt-1" type="submit" name="beo" value="Save">
                </form>


            </div>

        </div>




        <!--Footer-->
        <div class="container mb-5">
            <jsp:include page="./footer.jsp" />
        </div>
        <!--/.Footer-->
    </body>
</html>