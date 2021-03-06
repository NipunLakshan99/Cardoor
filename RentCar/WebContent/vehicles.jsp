<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link rel="stylesheet" href="https://bootswatch.com/4/slate/bootstrap.min.css" >
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link rel="shortcut icon" href="CSS/favicon.ico" type="image/x-icon" />
        
  <title>Available vehicles</title>

  <!-- Bootstrap core CSS -->
  <link href="CSS/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/heroic-features.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<style>
 body{
  font-family: 'Nunito';
  background-image:url(images/veh/abc.jpg);
  background-size:cover;
  background-attachment:fixed;
}
</style>
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



  <!-- Navigation -->
 		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="col-lg-4">
                        <a href="index.html" class="logo">
                            <img src="CSS/img/logo.png" alt="JSOFT">
                        </a>
                    </div>
  		<div class="collapse navbar-collapse" id="navbarColor02">
    	<ul class="navbar-nav mr-auto">
        <li class="nav-item active">
        <a href="Home.jsp" class="nav-link" href="#">HOME </a>
      	</li>
      	<li class="nav-item">
        <a href="vehicles.html" class="nav-link" href="vehicles.jsp">AVAILABLE VEHICLES</a>
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

  		<!-- Page Content -->
  		<div class="container">

  		  <!-- Jumbotron Header -->
   		 <header class="jumbotron my-4">
    	 <h1 class="display-3">Welcome to CARDOOR</h1>
     	 <p class="lead">1. Easy Booking</br>Enter Pickup and Drop location to get your cab and estimated fare details..</br></br>
					  2. Get your cab</br>CARDOOR will find you the nearest available Cab..</br></br>
					  3. Track Your Cab</br>Know your Cab's location and estimated time of arrival in real-time...</br></br>

		</p>
   		   <a href="contactus.html" class="btn btn-primary btn-lg">Call to action!</a>
	  
   		 </header>
	
	
		
		<script type="text/javascript">
			document.getElementByTagName('video').play();
		</script>
 		</div>
		</div>



    	<!-- Page Features -->

    	<div class="row text-center">

      	<div class="col-lg-3 col-md-6 mb-4">

        <div class="card h-100">

          	<img class="card-img-top" src="CSS/img\vehicle\alto.jpg" alt="Suzuki Alto">

          	<div class="card-body">

		  
		  
	    	 <h4 class="card-title">Suzuki Alto</h4>
 
		 
			 <div class="test">
          	  <p class="card-text"> 3 seating capacity.</br>100Km for 2500 (Per day).</br>Rs 20 for each extra KM.</p>
			            
		  </div>
		</div>
			



          <div class="card-footer">

            <a href="booking.html" class="btn btn-primary">Book Now</a>
			          
          </div>
        </div>
      
	  
		</div>
     	 <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\perodua.jpg" alt="PERODUA (DAIHATSU) AXIA">
          <div class="card-body">
            <h4 class="card-title">PERODUA (DAIHATSU) AXIA</h4>
		 <div class="test">
            <p class="card-text"> 3 seating capacity.</br>100Km for 3000 (Per day).</br>Rs 30 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\celerio.jpg" alt="Suzuki Celerio">
          <div class="card-body">
            <h4 class="card-title">Suzuki Celerio</h4>
		 <div class="test">
            <p class="card-text">3 seating capacity.</br>100Km for 3000 (Per day).</br>Rs 30 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\aqua.jpg" alt="Toyota Aqua">
          <div class="card-body">
            <h4 class="card-title">Toyota Aqua</h4>
		 <div class="test">
            <p class="card-text">4 seating capacity.</br>100Km for 3500 (Per day).</br>Rs 30 for each extra KM.</p>
			           
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>


      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\axio.jpg" alt="Toyota AXIO">
          <div class="card-body">
            <h4 class="card-title">Toyota AXIO</h4>
		 <div class="test">
            <p class="card-text">4 seating capacity.</br>100Km for 4000 (Per day).</br>Rs 30 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\allion.jpg" alt="Toyota Allion">
          <div class="card-body">
            <h4 class="card-title">Toyota Allion</h4>
		 <div class="test">
            <p class="card-text">4 seating capacity.</br>100Km for 4500 (Per day).</br>Rs 30 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\mercedes.jpg" alt="MERCEDES BENZ S CLASS AMG">
          <div class="card-body">
            <h4 class="card-title">MERCEDES BENZ S CLASS AMG</h4>
		 <div class="test">
            <p class="card-text">With Driver</br>150Km for 22500 (Per day).</br>Rs 35 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>

      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\landcruiser.jpg" alt="TOYOTA LAND CRUISER 200 V8">
          <div class="card-body">
            <h4 class="card-title">TOYOTA LAND CRUISER 200 V8</h4>
		 <div class="test">
            <p class="card-text">5 seating capacity.</br>150Km for 22000 (Per day).</br>Rs 100 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>
	  
      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\landcruiserprado.jpg" alt="TOYOTA LAND CRUISER PRADO">
          <div class="card-body">
            <h4 class="card-title">TOYOTA LAND CRUISER PRADO</h4>
		 <div class="test">
            <p class="card-text">5 seating capacity.</br>150Km for 20000 (Per day).</br>Rs 100 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>
      
      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\montero.jpg" alt="MITSUBISHI MONTERO">
          <div class="card-body">
            <h4 class="card-title">MITSUBISHI MONTERO</h4>
		 <div class="test">
            <p class="card-text">5 seating capacity.</br>150Km for 18950 (Per day).</br>Rs 100 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>
      
       <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\xtrail.jpg" alt="NISSAN X TRAIL">
          <div class="card-body">
            <h4 class="card-title">NISSAN X TRAIL</h4>
		 <div class="test">
            <p class="card-text">5 seating capacity.</br>150Km for 18500 (Per day).</br>Rs 100 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>
      
      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\Hiace.jpg" alt="TOYOTA REGIUS">
          <div class="card-body">
            <h4 class="card-title">TOYOTA REGIUS</h4>
		 <div class="test">
            <p class="card-text">9 seating capacity.</br>150Km for 5000 (Per day).</br>Rs 90 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>
      
      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\L300.jpg" alt="MITSUBISHI L300">
          <div class="card-body">
            <h4 class="card-title">MITSUBISHI L300</h4>
		 <div class="test">
            <p class="card-text">6 seating capacity.</br>150Km for 4500 (Per day).</br>Rs 90 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>
      
      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\Hiacehighroof.jpg" alt="TOYOTA GRAND CABIN">
          <div class="card-body">
            <h4 class="card-title">TOYOTA GRAND CABIN</h4>
		 <div class="test">
            <p class="card-text">15 seating capacity.</br>150Km for 8950 (Per day).</br>Rs 90 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>
      
      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\coaster.jpg" alt="TOYOTA COASTER LUXURY">
          <div class="card-body">
            <h4 class="card-title">TOYOTA COASTER LUXURY</h4>
		 <div class="test">
            <p class="card-text">29 seating capacity.</br>250Km for 10000 (Per day).</br>Rs 90 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>
      
      <div class="col-lg-3 col-md-6 mb-4">
        <div class="card h-100">
          <img class="card-img-top" src="CSS/img\vehicle\hilman.jpg" alt="HILLMAN GRAND TOURER (1934)">
          <div class="card-body">
            <h4 class="card-title">HILLMAN GRAND TOURER (1934)</h4>
		 <div class="test">
            <p class="card-text">4Hours & 30KMS.</br>100Km for 29500 (only 1day).</br>Rs 90 for each extra KM.</p>
			            
		  </div>
          </div>
          <div class="card-footer">
            <a href="booking.html" class="btn btn-primary">Book Now</a>
          </div>
        </div>
      </div>
      
      
	  
	  
	  

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <div class="footer-bottom-area">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <p>Copyright &copy; <script>document.write(new Date().getFullYear());</script> All Rights Reserved | Sri Lanka</p>
                </div>
            </div>
        </div>
    </div>
  <!-- Bootstrap core JavaScript -->
  <script src="CSS/vendor/jquery/jquery.min.js"></script>
  <script src="CSS/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>


</body>
</html>