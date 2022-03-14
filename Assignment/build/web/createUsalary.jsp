<%-- 
    Document   : createUsalary
    Created on : Mar 14, 2022, 10:18:20 PM
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
    <title>Static Navigation - SB Admin</title>
    <link href="css/styles.css" rel="stylesheet" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js"
        crossorigin="anonymous"></script>
</head>

<body>
    <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
        <!-- Navbar Brand-->
        <a class="navbar-brand ps-3" href="index.html">Start Bootstrap</a>
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
                        <a class="nav-link" href="tables.html">
                            <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                            Tables
                        </a>
                    </div>
                </div>
            </nav>
        </div>
        
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Static Navigation</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
                            <li class="breadcrumb-item active">Static Navigation</li>
                        </ol>


                    </div>
                </main>
                <form action="usalary" method="POST">
                    <div class="container">

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
                                            <input class="form-control" name="id" type="text" value="">
                                        </div>
                                    </div> 
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Date:</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" name="date" type="date" value="">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Money:</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" name="money" type="text" value="">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-3 control-label">Status:</label>
                                        <div class="col-lg-8">
                                            <select name="status">
                                                <option>Not Completed </option>
                                                <option>Completed </option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label"></label>
                                        <div class="col-md-8">
                                            <input type="submit" class="btn btn-primary" value="Save Changes">
                                            <span></span>
                                            <a href="usahome"> <input type="button" href="usahome" class="btn btn-default"
                                                    value="Cancel">
                                        </div>
                                    </div>
                                </form>

                            </div>
                        </div>
                    </div>
                </form>

                <hr>

            </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                crossorigin="anonymous"></script>
            <script src="js/scripts.js"></script>
        </body>

        </html>