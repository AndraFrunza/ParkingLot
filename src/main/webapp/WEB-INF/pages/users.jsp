<%-- 
    Document   : users
    Created on : Nov 22, 2021, 11:02:51 AM
    Author     : Andra Frunza
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>
    <c:forEach var="user" items="${users}" varStatus="status">
        <div class="row">
            <div class="col-md-4">
                ${user.username}
            </div>
            <div class="col-md-4">
                ${user.email}
            </div>
            <div class="col-md-4">
                ${user.position}
            </div>
        </div>
    </c:forEach>

</t:pageTemplate>