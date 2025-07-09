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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>



    </head>
    <body>

        <div class="container mb-5">

            <jsp:include page="./navBar.jsp" />

        </div>


        <div class="container mt-5">
            <div class="mt-5">

            </div>
            <div>Tên Người dùng: <b>Nguyễn A</b></div> 
            <div class="container">


                <div id="checkbox-value"></div>
                <form action="AuthorizeEmployee" method="post">
                    <table>
                        <tbody>
                            <tr>
                                <td><b>Báo cáo cơ sở ${be} ${he} ${ie}</b></td>
                            </tr>

                        </tbody>

                        <tbody>
                            <tr>
                                <td>
                                    <select name="cID" aria-label="Default select example" onchange="this.form.submit()">

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
                                <td>Báo cáo kho cơ sở </td>
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
                                <td>Báo cáo thu hoạch cơ sở</td>
                                <td>
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
                                <td>Báo cáo giống thả</td>
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

                        <tbody>
                            <tr>
                                <td><b>Báo cáo ao ${pie} ${pse} ${pwe}</b></td>
                            </tr>

                        </tbody>
                        <tbody>
                            <tr>
                                <td>
                                    <select name="pID" aria-label="Default select example" onchange="this.form.submit()">

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
                                <td>Báo cáo tỷ lệ sống</td>
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
                                <td>Báo cáo môi trường nước</td>
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
                                <td>Báo cáo kho ao</td>
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
                    <input type="submit" name="beo" value="Luu">
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