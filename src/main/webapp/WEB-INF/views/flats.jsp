<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
                    <form>
                        <div class="form-group">
                            <label for="fl_no">Flat Number:</label>
                            <input type="text" class="form-control" name="fl_no" placeholder="Enter Flat Number" />
                        </div>
                        <div class="form-group">
                            <label for="rooms">No. of Rooms:</label>
                            <input type="number" class="form-control" name="rooms" placeholder="Enter Flat Number" />
                        </div>
                        <div class="form-group">
                            <div class="form-check">
                                <input type="checkbox" class="form-check-input" name="balcony" value="true" />
                                <label for="balcony" class="form-check-label">Balcony</label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="area">Area:</label>
                            <input type="number" class="form-control" name="area" placeholder="Enter Area" />
                        </div>
                        <div class="form-group">
                            <center>
                                <input type="submit" class="btn btn-success" />
                            </center>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>