<%-- 
    Document   : test
    Created on : Oct 24, 2022, 3:09:41 PM
    Author     : msi-pc
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <c:set var = "owner" scope = "session" value = "${true}"/>
    <c:set var = "employee" scope = "session" value = "${true}"/>
    <c:set var = "employeeA" scope = "session" value = "${true}"/>
    <body>
        <c:if test="${owner == true}">
        <h1>Hello Owner</h1>
        </c:if>
        <c:if test="${employee != null}">
        <a href="facilityBreed_Management" type="button" class="btn btn-primary col-8 ms-3">
                                Báo cáo giống
                            </a>
        <c:if test="${employeeA == true}">
            <h1>Hello Emloyee CMM  </h1>
        </c:if>
        </c:if>
    </body>
</html>
