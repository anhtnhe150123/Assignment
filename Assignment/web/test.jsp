<%-- 
    Document   : test
    Created on : Mar 3, 2022, 1:03:26 AM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="update" method="POST">
                    <div class="container">

                        <h1>Edit Profile</h1>
                        <hr>

                        <div class="row">
                            <!-- left column -->
                            <div class="col-md-3">
                            </div>

                            <!-- edit form column -->
                            <div class="col-md-7 personal-info">

                                <h3>Personal info</h3>

                                <form class="form-horizontal" role="form">
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">ID:</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" name="id" type="text" value="${employee.id}" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Full name:</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" name="name" type="text" value="${employee.name}">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Date of birth:</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" name="dob" type="date" value="${employee.dob}">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Gender:</label>
                                        <div class="col-lg-8">
                                            <select name="gender" >
                                                <option ${emloyee.gender == Male ?"selected":""} value="Male">Male</option>
                                                <option ${emloyee.gender == Female ?"selected":""} value="Female">Female</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Position:</label>
                                        <div class="col-lg-8">
                                            <select name="position">
                                                <c:forEach items="${listEmployees}" var="E">
                                                    <option ${E.position == employee.position ?"selected":""} value="${emplyee.position}">${employee.position}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Start Date:</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" name="startdate" type="date" value="${employee.startDate}">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-3 control-label"></label>
                                        <div class="col-md-8">
                                            <input type="submit" class="btn btn-primary" value="Save Changes">
                                            <span></span>
                                            <a href="/home2"> <input type="button" href="/home2" class="btn btn-default"
                                                                     value="Cancel">
                                                </div>
                                                </div>
                                                </form>

                                                </div>
                                                </div>
                                                </div>
                                                </form>
    </body>
</html>
