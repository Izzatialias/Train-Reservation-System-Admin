<%-- 
    Document   : login
    Created on : Jun 10, 2023, 10:54:46 PM
    Author     : Izzati
--%>
<%@page import="java.sql.*,java.util.*"%>
<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
    <head><title>Login Page</title>
	<meta name="viewport" content="width=device-width, intial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
        <link rel="stylesheet" type="text/css" href="css/login.css">
        <style>
.dropbtn {
  background-color: white;
  color: black;
  padding: 16px;
  font-size: 20px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: white;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: white;}
</style>
	</head>
		<body style="font-family: BR Firma; background-repeat:no-repeat; background-size:cover;" background="image/bg.jpg">
			<!-----navigation------>
			<nav>
				<!--logo-->
				<div class="head">
					<a href="Navigation.html" class="logo" ><img src= "image/logo.png" alt="" height="115px"></a>
					<div class="acc">
						<a href="https://www.instagram.com/izzati.alias/" target="_blank" ><img src="image/account.png" style="width:47px;"></a>
						<div class="dropdown">
                                                <button class="dropbtn">Login As</button>
                                                <div class="dropdown-content">
                                                  <a href="adminlogin.jsp">Admin</a>
                                                  <a href="login.jsp">Customer</a>
                                                </div>
                                            </div>
					</div>
				</div>
			</nav><br>
			
	    <!--Login Section -->
	        <div class="contain">
				<form action="LoginServlet" method="post">
					<h1>Login</h1>
					<p>Please enter your email and password:</p>
					<input type="text" name="cust_email" placeholder="Email" style="height:30px; width:400px;"><br><br>
					<input type="password" name="cust_pss" placeholder="Password" style="height:30px; width:400px;"><br><br>
					<input type ="submit" value="Login" name="login" class="button"><br><br>
					<p>Don't you have an account?<a href="register.jsp">Create One</a></p
                                        
				</form>
		    </div>
    </body>
</html>
