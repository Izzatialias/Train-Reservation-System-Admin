<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>Admin Login Page</title>
	<meta name="viewport" content="width=device-width, intial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
        <link rel="stylesheet" type="text/css" href="css/adminlogin.css">

	</head>
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
		<body style="font-family: BR Firma; background-repeat:no-repeat; background-size:cover;" background="images/bg.jpg">
			<!-----navigation------>
			<nav>
				<!--logo-->
				<div class="head">
					<a href="Navigation.html" class="logo" ><img src= "images/logo.jpg" alt="" height="115px"></a>
					<div class="acc">
                                            <img src="images/account.jpg" style="width:47px;"></a>
                                            
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
				<form action="AdminLoginServlet" method="post" onsubmit="return validate"()>
					<h1>Admin Login</h1>
					<p>Please enter your email and password:</p>
					<input type="text" name="admin_email" placeholder="Admin Email" style="height:30px; width:400px;"><br><br>
					<input type="password" name="admin_pss" placeholder="Password" style="height:30px; width:400px;"><br><br>
                                        <span style="color:red">
                                            <%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>
                                        </span><br>
					<input type ="submit" value="Login" name="login" class="button"><br><br>
                                </form>
		 </div>
                </body>
</html>