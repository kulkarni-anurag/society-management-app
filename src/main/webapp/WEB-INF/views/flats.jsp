<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List Flats Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <%@ include file="common/navbar.jspf" %>
    <div class="container">
        <h2 class="text-center mt-5 mb-5">Society Management App - Add/Update Flats Page</h2>
        <div class="row justify-content-center">
            <div class="card col-lg-8">
                <div class="card-body">
                    <form:form method="post" modelAttribute="flat">
                        <div class="form-group">
                            <form:label path="fl_no">Flat Number:</form:label>
                            <form:input type="text" class="form-control" path="fl_no" placeholder="Enter Flat Number" />
                        </div>
                        <div class="form-group">
                            <form:label path="rooms">No. of Rooms:</form:label>
                            <form:input type="number" class="form-control" path="rooms" placeholder="Enter Flat Number" />
                        </div>
                        <div class="form-group">
                            <div class="form-check">
                                <form:checkbox class="form-check-input" path="balcony" value="true" />
                                <form:label path="balcony" class="form-check-label">Balcony</form:label>
                            </div>
                        </div>
                        <div class="form-group">
                            <form:label path="area">Area:</form:label>
                            <form:input type="number" class="form-control" path="area" placeholder="Enter Area" />
                        </div>
                        <div class="form-group">
                            <center>
                                <input type="submit" class="btn btn-success" />
                            </center>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>