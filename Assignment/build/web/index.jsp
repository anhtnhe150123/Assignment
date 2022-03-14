<%-- 
    Document   : index.jsp
    Created on : Feb 24, 2022, 10:33:41 PM
    Author     : Apple
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Dashboard - SB Admin</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js"
        crossorigin="anonymous"></script>
    </head>

    <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="index.jsp">Start Bootstrap</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i
                    class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..."
                           aria-describedby="btnNavbarSearch" />
                    <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i
                            class="fas fa-search"></i></button>
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="logout">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">Core</div>
                            <a class="nav-link" href="index.html">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Dashboard
                            </a>
                            <div class="sb-sidenav-menu-heading">Interface</div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapsePages"
                               aria-expanded="false" aria-controls="collapsePages">
                                <div class="sb-nav-link-icon"><i class="fas fa-book-open"></i></div>
                                Pages
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapsePages" aria-labelledby="headingTwo"
                                 data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="password.html">Change Password</a>
                                </nav>
                            </div>
                            <div class="sb-sidenav-menu-heading">Addons</div>
                            <a class="nav-link" href="table">
                                <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                                Tables
                            </a>
                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <c:choose>
                            <c:when test="${sessionScope.acc != null}">
                                <div class="small">Logged in as: ${sessionScope.acc.username}</button</div>
                            </c:when>
                            <c:otherwise>
                                <a href="login" class="btn btn-outline-primary ms-lg-2">Login</a>
                            </c:otherwise>
                        </c:choose>
                    </div>
                </nav>
            </div>


            <div id="layoutSidenav_content">
                <main>
                    <form action="attendance" method="POST">
                        <div class="container-fluid px-4">
                            <h1 class="mt-4">Dashboard</h1>
                            <ol class="breadcrumb mb-4">
                                <li class="breadcrumb-item active">Dashboard</li>
                            </ol>
                            <div class="row">
                                <div class="col-xl-4 col-md-4">
                                    <button type="button" class="btn btn-outline-success" onclick="date()">Start
                                        check</button>
                                </div>
                                <div class="col-xl-4 col-md-4">
                                    <input id="hvn" type="text" name="startTime">
                                </div>
                                <div class="col-xl-4 col-md-4">
                                    <input type="submit" value="SEND" class="btn btn-outline-primary">
                                </div>
                            </div>
                            <div class="card mb-4" style="margin-top: 20px">
                                <div class="card-body">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>User Name</th>
                                                <th>Time</th>
                                                <th>Date</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${listAttends}" var="A">
                                                <tr>

                                                    <td>${A.userName}</td>
                                                    <td>${A.startTime}</td>
                                                    <td>${A.date}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <a href="stahis">View details</a>
                    </form>
                    <br>
                    <hr>
                    <br>
                    <form action="dance" method="POST">
                        <div class="container-fluid px-4">
                            <div class="row">
                                <div class="col-xl-4 col-md-4">
                                    <button type="button" class="btn btn-outline-danger" onclick="date2()">End
                                        check</button>
                                </div>
                                <div class="col-xl-4 col-md-4">
                                    <input id="hvn1" type="text" name="endTime">
                                </div>
                                <div class="col-xl-4 col-md-4">
                                    <input type="submit" value="SEND" class="btn btn-outline-primary">
                                </div>
                            </div>
                            <div class="card mb-4" style="margin-top: 20px">
                                <div class="card-body">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>User Name</th>
                                                <th>Time</th>
                                                <th>Date</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${listEnd}" var="L">
                                                <tr>
                                                    <td>${L.userName}</td>
                                                    <td>${L.endTime}</td>
                                                    <td>${L.date}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </form>
                    <div class="container-fluid px-4" style="text-align: right">
                        <a href="detail">View details</a>
                    </div>

                    <script>
                        function date() {

                            var today = new Date();
                            var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
                            var dateTime = time;

                            document.getElementById("hvn").value = dateTime;
                        }
                        ;
                        function date2() {

                            var today = new Date();
                            var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
                            var dateTime = time;

                            document.getElementById("hvn1").value = dateTime;
                        }
                        ;
                    </script>
                    <br>
                    <hr>
                </main>  
            </div>

        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="assets/demo/chart-area-demo.js"></script>
        <script src="assets/demo/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="js/datatables-simple-demo.js"></script>
    </body>

</html>