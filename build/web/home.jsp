<%-- 
    Document   : home
    Created on : Jun 10, 2023, 10:56:11 PM
    Author     : Izzati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>Home Page</title>
	<meta name="viewport" content="width=device-width, intial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
        <link rel="stylesheet" type="text/css" href="css/adminaddnew.css">
	</head>
	<body style="font-family: BR Firma; background-repeat:no-repeat; background-size:cover;" background="image/bg.jpg">
			<!-----navigation------>
			<nav>
				<!--logo-->
				<div class="head">
					<a href="Navigation.html" class="logo" ><img src= "image/logo.png" alt="" height="115px"></a>
					<div class="acc">
						<a href="./LogoutServlet" style="margin-left:20px;padding-top:15px;">Logout</a>
					</div>
				</div>
			</nav><br>
            <!--Home Section -->
                <div class="contain">
                           <form action="Search" method="post">
                                        <h4><b>Hi, where would you like to go?:</b></h4>

					<p><b>From:</b></p>
					<input type="text" name="departing_location" placeholder="" style="height:30px; width:400px;"><br><br>
					<p><b>To:</b></p>
					<input type="text" name="arriving_location" placeholder="" style="height:30px; width:400px;"><br><br>
					                                     		
                                        <input type ="submit" value="search" name="search" class="button"><br>
			</form>
		</div>
	   
    </body>
</html>
