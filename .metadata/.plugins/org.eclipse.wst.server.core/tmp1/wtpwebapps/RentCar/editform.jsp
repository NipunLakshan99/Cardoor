<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link rel="stylesheet" href="https://bootswatch.com/4/slate/bootstrap.min.css" >
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/stylesheet.css">
        <link rel="shortcut icon" href="CSS/favicon.ico" type="image/x-icon" />
		
		<title>Edit Vehicle Form</title>  
</head>
<style>
 body{
  font-family: 'Nunito';
  background-image:url(images/img11.jpg);
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

	<%@page import="com.javaUtil.DB.VehicleDao,com.javaClass.vehicle"%>  
  
	<%  
			String id=request.getParameter("id");  
			vehicle u=VehicleDao.getRecordById(Integer.parseInt(id));  
	%>  
  		<div class="adddriverform">  	
  		<h1>EDIT VEHICLE FORM</h1>  
		<form action="editvehicle.jsp" method="post">  
		<input type="hidden" name="id" value="<%=u.getId() %>"/>  

		<table>
		
		<div class="form-group">
  		<tr><td><label class="col-form-label" for="inputDefault">Owner Name :</label>
  		<input type="text" class="form-control" placeholder="" name="ownername" value="<%= u.getOwnername()%>"/>
		</div><tr><td>  
		
		
		<fieldset class="form-group">
     	 <legend><tr><td>Vehicle Type :
     	 </legend>
     	 <div class="form-check">
       	 <label class="form-check-label">
          <input type="radio" class="form-check-input" name="vehicletype"  value="ZIP"/>General Cars<br/>
          <input type="radio" class="form-check-input" name="vehicletype"  value="Premier"/>Premium cars<br/>
          <input type="radio" class="form-check-input" name="vehicletype"  value="BroomXL"/>Luxury Cars<br/>
          <input type="radio" class="form-check-input" name="vehicletype"  value="HireZIP"/>4WD & SUV<br/>
          <input type="radio" class="form-check-input" name="vehicletype"  value="HirePremier"/>Buses,Vans<br/>
          <input type="radio" class="form-check-input" name="vehicletype"  value="HirePremier"/>Classic cars<br/>
         </label>
     	 </div>

		<div class="form-group">
	  	<tr><td>Vehicle Brand: 
	  	<select class="custom-select" name="vehiclebrand">
      		<option selected="">Open this select menu</option>
      		<option>Suzuki Alto</option>
            <option>Perodua Axia</option>
            <option>Suzuki Celerio</option>
            <option>Toyota Axio</option>  
            <option>Toyota Allion</option>  
			<option>Mercedes Benz s Class AMG</option>
			<option>Toyota Land Cruiser 200</option>
			<option>Toyota Land Cruiser Prado</option>  
			<option>Mitsubishi Montero</option>  
			<option>Nissan X Trail</option> 
			<option>Toyota Regius</option>  
			<option>Mitsubishi L300</option> 
			<option>Toyota Grand Cabin</option> 
			<option>Toyota Coaster Luxury</option>
			<option>HILLMAN grand tourer (1934)</option> 
     	</select>
     	</td></tr>	 
  		</div>

		<div class="form-group">
  		<tr><td><label class="col-form-label" for="inputDefault">Rate per 1km (Rs.):</label>
  		<input type="text" class="form-control" placeholder="" name="rateper1km">
		</div><tr><td>  
		
		<div class="form-group">
  		<tr><td><label class="col-form-label" for="inputDefault">Rate per 1day(Rs.):</label>
  		<input type="text" class="form-control" placeholder="" name="rateper1day">
		</div><tr><td>  
		

			<tr><td colspan="2"><input type="submit" value="Edit Vehicle"/></td></tr>  
		</table>  
		</form> 
		</div> 
		<a href="SystemU"><button type="button" class="btn btn-primary">SystemUser Home</button></a><br/>
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