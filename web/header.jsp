<%-- 
    Document   : header
    Created on : Dec 24, 2021, 10:52:43 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<title>JSP Page</title>-->
        <!--Fonts-->
        <link rel="dns-prefetch" href="//fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">
        
        <!--Styles-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@2.0.7/css/boxicons.min.css">
        <style>
            body{
                background-image: url('https://i.redd.it/vdhgv54ndnj21.png');
                background-repeat: repeat;
                background-size: cover;
            }
        </style>
        
        <!--Script-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-light bg-white shadow-sm">
            <div class="container">
                <a class="navbar-brand" href="index.html">
                    FoodPanzu
                </a>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <!-- Left Side Of Navbar -->
                    <ul class="navbar-nav mr-auto">

                    </ul>

                    <!-- Right Side Of Navbar -->
                    <ul class="navbar-nav ms-auto">
                        <!-- Authentication Links -->
                        <!--@guest-->
                            <li class="nav-item">
                                <a class="nav-link" href="login.jsp">Login</a>
                            </li>
                            <!--@if (Route::has('register'))-->
                                <li class="nav-item">
                                    <a class="nav-link" href="register.jsp">Register</a>
                                </li>
                            <!--@endif-->
<!--                        @else
                            <li class="nav-item">
                                <a class="nav-link" href="{{ url('/home') }}">
                                {{ __('Home') }} <span class="caret"></span>
                                </a>
                            </li>
                            
                            <li class="nav-item">
                                <a class="nav-link" href="{{ url('/profile') }}">
                                {{ Auth::user()->name }} <span class="caret"></span>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="{{ route('logout') }}"
                                  onclick="event.preventDefault();
                                                 document.getElementById('logout-form').submit();">
                                    {{ __('Logout') }}
                                </a>

                                <form id="logout-form" action="{{ route('logout') }}" method="POST" style="display: none;">
                                   @csrf
                                </form>    
                            </li>
                        @endguest-->
                    </ul>
                </div>
            </div>
        </nav>
    </body>
</html>