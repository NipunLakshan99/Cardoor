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
         <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
         <style>
body {
  font-family: Arial;
  font-size: 17px;
  padding: 8px;
}

* {
  box-sizing: border-box;
}

.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
}

.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}

.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-50,
.col-75 {
  padding: 0 16px;
}

.container1 {
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}

input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

label {
  margin-bottom: 10px;
  display: block;
}

.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
}

.btn {
  background-color: #4CAF50;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: #45a049;
}

a {
  color: #2196F3;
}

hr {
  border: 1px solid lightgrey;
}

div.ex1 {
  width: 500px;
  margin: auto;
}

span.price {
  float: right;
  color: grey;
}

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
@media (max-width: 800px) {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
</style>
		<title>Add a Booking</title>
</head>
<style>
 body{
  font-family: 'Nunito';
  background-image:url(images/img17.jpg);
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
        <a href="login.jsp" class="nav-item nav-link"><button class="btn btn-outline-warning">LogOut</button></a>
    	</li>
  		</div>
		</nav>
		<br/><br/><br/>  
  
		
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 <div class="ex1">
  <div class="col-50">
    <div class="container1">
      <form action="<%= request.getContextPath() %>/PaymentServelet" method="post">
          <div class="col-50">
            <h3>Payment</h3>
            <label for="fname">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
            <label for="cname">First Name on Card</label>
            <input type="text" id="cname" name="firstName" placeholder="John">
            <label for="cname">Last Name on Card</label>
            <input type="text" id="cname" name="lastName" placeholder="Doe">
            <label for="ccnum">Credit card number</label>
            <input type="text" id="ccnum" name="cardNo" placeholder="1111-2222-3333-4444">
            <label for="expmonth">Exp Date</label>
            <input type="text" id="expmonth" name="expDate" placeholder="MM/YY">
            <label for="cvv">CVV</label>
            <input type="text" id="cvv" name="ccv" placeholder="352">
            <label for="cvv">Contact</label>
            <input type="text" id="cname" name="contact" placeholder="94 77 000 000 0">
        <input type="submit" value="Continue to checkout" class="btn">
      </form>
    </div>
  </div>

</div>

  <br/><br/><br/> 

</body>
</html>