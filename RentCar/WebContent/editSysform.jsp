<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link rel="stylesheet" href="https://bootswatch.com/4/slate/bootstrap.min.css" >
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/stylesheet.css">
        <link rel="shortcut icon" href="CSS/favicon.ico" type="image/x-icon" />
	
		<title>Edit SysUser</title>
</head>
<style>
 body{
  font-family: 'Nunito';
  background-image:url(images/img20.jpg);
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
        <br/>
        <br/>
 	
	<div class="adddriverform">  	
	<h1>Edit SystemUser</h1>  
	<form action="Sysinsert" method="post">  
	<table>  
	
	<div class="form-group">
  	<tr><td><label class="col-form-label" for="inputDefault">Name :</label>
  	<input type="text" class="form-control" placeholder="" name="name">
	</div><tr><td>

	<div class="form-group">
  	<tr><td><label class="col-form-label" for="inputDefault">Email :</label>
  	<input type="email" class="form-control" placeholder="" name="email">
	</div><tr><td>
				
	<div class="form-group">
  	<tr><td><label class="col-form-label" for="inputDefault">Phone Number :</label>
  	<input type="number" class="form-control" placeholder="" name="phone">
	</div><tr><td>
	
	<div class="form-group">
  	<tr><td><label class="col-form-label" for="inputDefault">Username :</label>
  	<input type="text" class="form-control" placeholder="" name="uid">
	</div><tr><td>
	
	<div class="form-group">
  	<tr><td><label class="col-form-label" for="inputDefault">Password :</label>
  	<input type="password" class="form-control" placeholder="" name="psw">
	</div>
     	</td></tr>	 
  	</div>
	 
		<tr><td colspan="2"><br/><br/><input type="submit" value="Edit SystemUser"/></td></tr>
	</table>  
	</form>
	</div>
	<br/><br/>
	 
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