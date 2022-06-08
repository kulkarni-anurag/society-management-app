<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List Complaints Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <%@ include file="common/navbar.jspf" %>
    <div class="container">
        <h2 class="text-center mt-5 mb-5">Society Management App - List Complaints Page</h2>
        <div class="row justify-content-center">
            <div class="col-lg-10">
                <table class="table table-bordered table-striped .table-responsive-md">
                    <thead>
                        <tr>
                            <th>Flat Number</th>
                            <th>Description</th>
                            <th>Status</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${complaints}" var="complaint">
                            <tr>
                                <td>${complaint.fl_no}</td>
                                <td>${complaint.description}</td>
                                <td>
                                    <c:if test="${status == true}">
                                        <a href="#" class="btn btn-info disabled">Resolved</a>
                                    </c:if>
                                    <c:if test="${status == false}">
                                        <a href="/resolve?id=${complaint.id}" class="btn btn-success">Resolve</a>
                                    </c:if>
                                </td>
                                <td><a href="/delete-complaint?id=${complaint.id}" class="btn btn-danger">Delete</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>