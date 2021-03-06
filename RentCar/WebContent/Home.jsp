<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html lang="en">
    <head>
    <title>HOME</title>	
        <!-- Required meta tags -->
        <meta charset="ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link rel="stylesheet" href="https://bootswatch.com/4/slate/bootstrap.min.css" >
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link rel="stylesheet" href="css/index-style.css">
        <link rel="shortcut icon" href="CSS/favicon.ico" type="image/x-icon" />
        <title>Homepage</title>

    </head>
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
                                <!--<img src="assets/img/preloader.gif">-->
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
                        <a href="Home.jsp" class="logo">
                            <img src="CSS/img/logo.png" alt="JSOFT">
                        </a>
                    </div>
		

  		<div class="collapse navbar-collapse" id="navbarColor02">
    	<ul class="navbar-nav mr-auto">
        <li class="nav-item active">
        <a href="Home.jsp" class="nav-link" href="#">HOME </a>
      	</li>
      	<li class="nav-item">
        <a href="vehicles.jsp" class="nav-link" href="#">AVAILABLE VEHICLES</a>
      	</li>
      	<li class="nav-item">
         <a href="booking.html" class="nav-link" href="#">BOOK A CAR</a>
      	</li>
      	<li class="nav-item">
        <a href="contactus.html" class="nav-link" href="#">CONTACT US</a>
      	</li>
      	<li class="nav-item">
        <a href="aboutus.jsp" class="nav-link" href="#">ABOUT US</a>
      	</li>
      	<li class="nav-item">
        <a href="feedback.jsp" class="nav-link" href="#">FEEDBACK</a>
      	</li>
    	</ul>
    	<li class="form-inline my-2 my-lg-0">
        <a href="login.jsp" class="nav-item nav-link"><button class="btn btn-outline-warning">Login</button></a>
    	</li>
  		</div>
		</nav>
  
	
		<div class = "slidewrapper">
		<div class="slide" style="max-width:auto">
 		<img class="Slides" src="CSS/img/slide/slide1.jpg" width="1515px" height="475px">
 		<img class="Slides" src="CSS/img/slide/slide5.jpg" width="1515px" height="475px">
 		<img class="Slides" src="CSS/img/slide/slide6.jpg" width="1515px" height="475px">
 		<img class="Slides" src="CSS/img/slide/slide7.jpg" width="1515px" height="475px">
 		
		</div>
		</div>

		<div>
		<div style="text-align:center">
		<span class="dot"></span> 
		<span class="dot"></span> 
		<span class="dot"></span> 
		<span class="dot"></span> 
		</div>
	
		<script>
		var slideIndex = 0;
		showSlides();

		function showSlides() {
			var i;
			var slides = document.getElementsByClassName("Slides");
			var dots = document.getElementsByClassName("dot");
			for (i = 0; i < slides.length; i++) {
				slides[i].style.display = "none";  
			}
		slideIndex++;
		if (slideIndex > slides.length) {slideIndex = 1}    
		for (i = 0; i < dots.length; i++) {
			dots[i].className = dots[i].className.replace(" active", "");
		}
		slides[slideIndex-1].style.display = "block";  
		dots[slideIndex-1].className += " active";
		setTimeout(showSlides, 3000);
		
		
		}
		</script>
	
        <section id="home-icons" class="py-5" style=" background-color: #121210;" >
            <h2 class="text-center text-warning">Solutions We Offer <i class="fas fa-long-arrow-alt-down  mb-2"></i></h2><br>
            <div class="container">
                <div class="row">
                    <div class="col-md-4 mb-4 text-center">
                        <div class="card">
                            <img src="CSS/img/service/service1.png" class="card-img-top" alt="...">
                            <div class="card-body"  style="background:#d19d19;">
                                <h5 class="card-title">Self Drive Rental</h5>
                                <p class="card-text">A wide range of self drive cars in Sri Lanka from economical to luxury on daily, weekly terms.</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 mb-4 text-center">
                        <div class="card">
                            <img src="CSS/img/service/service4.png" class="card-img-top" alt="...">
                            <div class="card-body"  style="background:#d19d19;">
                                <h5 class="card-title">Tours / Chauffeur Driven</h5>
                                <p class="card-text">A unique range of chauffeur driven cars that exceedingly surpass the norm on daily, weekly terms. </p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 mb-4 text-center">
                        <div class="card">
                            <img src="CSS/img/service/service5.jpg" class="card-img-top" alt="...">
                            <div class="card-body"  style="background:#d19d19;">
                                <h5 class="card-title">Airport / City Transfers</h5>
                                <p class="card-text">We offer city and airport transfers in Sri Lanka from the Colombo International Airport to any location in the island. </p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 mb-4 text-center">
                        <div class="card">
                            <img src="CSS/img/service/service6.jpg" class="card-img-top" alt="...">
                            <div class="card-body" style="background:#d19d19;">
                                <h5 class="card-title">Weddings / Events</h5>
                                <p class="card-text">A fleet of luxury wedding cars in Sri Lanka, we are well geared for weddings and special occasions.</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 mb-4 text-center">
                        <div class="card">
                            <img src="CSS/img/service/service3.png" class="card-img-top" alt="...">
                            <div class="card-body"  style="background:#d19d19;">
                                <h5 class="card-title">Optional Equipment</h5>
                                <p class="card-text">We offer a wide range of optional equipment for those searching for a rent a car service in Sri Lanka.</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 mb-4 text-center">
                        <div class="card">
                            <img src="CSS/img/service/service7.png" class="card-img-top" alt="...">
                            <div class="card-body"  style="background:#d19d19;">
                                <h5 class="card-title">Road Side Assistance</h5>
                                <p class="card-text">We offer 24/7/365 roadside assistance islandwide with a team ready for action &nbsp; &nbsp; &nbsp;&nbsp;[ 1st time in Sri Lanka ]</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    	</section>



    <!-- Footer Bottom Start -->
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
  




    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

	</body>
	</html>

	





