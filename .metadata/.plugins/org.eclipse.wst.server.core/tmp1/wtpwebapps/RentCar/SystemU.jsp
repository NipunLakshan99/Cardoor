<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link rel="stylesheet" href="https://bootswatch.com/4/slate/bootstrap.min.css" >
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/stylesheet.css">
        <link rel="shortcut icon" href="CSS/favicon.ico" type="image/x-icon" />

<title>System User Home</title>  
</head>
<style>
 body{
  font-family: 'Nunito';
  background-image:url(CSS/img/back.jpg);
  background-size:cover;
  background-attachment:fixed;
 }
 </style>
<title>Insert title here</title>
<body onload="startTime()">
<!--- Clock Display ------> 
        <script>
            function startTime() {
                var today = new Date();
                var h = today.getHours();
                var m = today.getMinutes();
                var s = today.getSeconds();
                m = checkTime(m);
                s = checkTime(s);
                document.getElementById('txt').innerHTML =
                        h + ":" + m + ":" + s;
                var t = setTimeout(startTime, 500);
            }
            function checkTime(i) {
                if (i < 10) {
                    i = "0" + i
                }
                ;  // add zero in front of numbers < 10
                return i;
            }
        </script>

        <!------------------------------->
        
        
        <div class="preloader bg-dark text-light" >
            <div class="preloader-spinner" >


                <div id="header-top" class="d-none d-xl-block">
                    <div class="container">
                        <div class="row">

                            <div class="loader-content">
                                <!--<img src="CSS/img/preloader.gif">-->
                                <p id="txt"></p>

                            </div>

                            <div class="col-lg-3 text-left ">
                                <i class="fas fa-map-marker-alt"></i> &nbsp; Orex Shopping Complex, Ja-Ela
                            </div>&nbsp;&nbsp;&nbsp;&nbsp;

                            <div class="col-lg-3 text-center">
                                <i class="fas fa-phone-volume"></i> 0112 249 249
                            </div>&nbsp;&nbsp;&nbsp;&nbsp;

                            <div class="col-lg-3 text-center">
                                <i class="far fa-clock"></i> Mon-Fri 09.00 - 17.00
                            </div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


                            <div class="header-social-icons text-right">
                                <a href="#"><i class="fab fa-twitter"></i></a>&nbsp;
                                <a href="#"><i class="fab fa-instagram"></i></a>&nbsp;
                                <a href="#"><i class="fab fa-facebook"></i></a>&nbsp;
                                <a href="#"><i class="fab fa-youtube"></i></a>&nbsp;
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
	 <nav class="navbar navbar-expand-lg navbar-dark bg-dark"> 
	 <div class="col-lg-4">
                        <a href="index.html" class="logo">
                            <img src="CSS/img/logo.png" alt="JSOFT">
                        </a>
                    </div>
  		<div class="collapse navbar-collapse" id="navbarColor02">
    	<ul class="navbar-nav mr-auto">
        <li class="nav-item active">

  		</div>
		</nav>
        <!-- /.row -->
        <section>
        
            <hr>
            <h1 class="page-header text-center text-dark"><b>SystemUser Panel</b></h1>
            <hr>
	
	<h1 style="color: #ffffff; margin-left: 580px;"></h1><br/><br/><br/> 
	
		

	 <div class="btn-group-vertical" data-toggle="buttons">
 		 <a href="Home.jsp"><button type="button" class="btn btn-primary">CARDOORHOMEPAGE</button></a>
 		 <a href="viewvehicles.jsp"><button type="button" class="btn btn-primary">VIEW AVAILABLE VEHICLES</button></a>
 		 <a href="agentfourm.jsp"><button type="button" class="btn btn-primary">ADD AGENT</button></a>
  		 <a href="viewagent.jsp"><button type="button" class="btn btn-primary">VIEW CURRENT AGENT</button></a>
  		 <a href="viewbookings.jsp"><button type="button" class="btn btn-primary">VIEW CUSTOMER'S BOOKINGS</button></a>
  		 <a href="payment-list.jsp"><button type="button" class="btn btn-primary">VIEW CUSTOMER'S PAYMENT</button></a>
 		 <a href="viewfeedback.jsp"><button type="button" class="btn btn-primary">Customer's FEEDBACK</button></a>
 		 <a href="Home.jsp"><button type="button" class="btn btn-primary">Exit</button></a>
  
	 </div>
	 <div class="wed">
	 <img src="CSS/img/vehicle/wedding.jpg" width="700" height="400" class="img"/>
	 </div>
	 <br/>
	 <br/>
 
 	<section id="adddriver" class="py-5" style=" background-color: #242422;">
		<div class="footer-bottom-area">
        	<div class="container">
           		 <div class="row">
               		 <div class="col-lg-12 text-center">
                    	<p style="color: #8a8a7c;">Copyright &copy; <script>document.write(new Date().getFullYear());</script> All Rights Reserved | Sri Lanka</p>
               		 </div>
            	 </div>
            </div>
        </div>
       
       
        </section>
</body>
</html>