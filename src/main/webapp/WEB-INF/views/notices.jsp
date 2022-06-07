<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notices Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
    <%@ include file="common/navbar.jspf" %>
    <div class="container">
        <h2 class="text-center mt-5 mb-5">Society Management App - Add/Update Notices Page</h2>
        <div class="row justify-content-center">
            <div class="card col-lg-8">
                <div class="card-body">
                    <form:form method="post" modelAttribute="notice">
                        <div class="form-group">
                            <form:hidden path="notice_id" />
                        </div>
                        <div class="form-group">
                            <form:label path="description">Enter Description:</form:label>
                            <form:textarea class="form-control" path="description" placeholder="Enter Description"></form:textarea>
                            <form:errors path="description" class="error" />
                        </div>
                        <div class="form-group">
                            <form:label path="date">Enter Date:</form:label>
                            <form:input type="text" path="date" class="form-control" id="date" required="true" placeholder="Select Date" />
                            <form:errors path="date" class="error" />
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
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js" integrity="sha512-T/tUfKSV1bihCnd+MxKD0Hm1uBBroVYBOYSk1knyvQ9VyZJpc/ALb4P0r6ubwVPSGB2GvjeoMAJJImBG12TiaQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script type="text/javascript">
        $("#date").datepicker({
            format: 'dd/mm/yyyy'
        });
    </script>
</body>
</html>