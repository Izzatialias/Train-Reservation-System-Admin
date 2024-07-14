<%-- 
    Document   : register
    Created on : Jun 10, 2023, 10:55:38 PM
    Author     : Izzati
--%>
<%@page import="util.DBConnection"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.*,java.util.*"%>
<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<sql:setDataSource var="myDatasource"
                   driver="org.apache.derby.jdbc.ClientDriver"
                   url="jdbc:derby://localhost:1527/trainDB" user="root" password="root"
/>

<!DOCTYPE html>

<html>
    <head><title>Register Page</title>
	<meta name="viewport" content="width=device-width, intial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
        <link rel="stylesheet" type="text/css" href="css/login.css">
	</head>
		<body style="font-family: BR Firma; background-repeat:no-repeat; background-size:cover;" background="image/bg.jpg">

                        <!-----navigation------>
			<nav>
				<!--logo-->
				<div class="head">
					<a href="Navigation.html" class="logo" ><img src= "image/logo.png" alt="" height="115px"></a>
					<div class="acc">
						<a href="" target="_blank" ><img src="image/account.png" style="width:47px;"></a>
						<a href="login.jsp" style="margin-left:20px;padding-top:15px;">Log in</a>
					</div>
				</div>
			</nav><br>	
	    <!--Register Section -->
	        <div class="contain">
				<form action="CustController" method="POST">
					<h1>Sign up</h1>
					<p><b>Contact Information:</b></p>
					<input type="text" name="custID" placeholder="Username" style="height:30px; width:400px;"><br><br>
					<input type="password" name="cust_pss" placeholder="Password" style="height:30px; width:400px;"><br><br>
					<p><b>Personal Detail:</b></p>
					<input type="text" name="cust_name" placeholder="Full Name" style="height:30px; width:400px;"><br><br>
                                        <input type="text" name="age" placeholder="age" style="height:30px; width:400px;"><br><br>
					<input type="text" name="phoneNo" placeholder="Phone Number" style="height:30px; width:400px;"><br><br>
					<input type="text" name="cust_email" placeholder="E-mail" style="height:30px; width:400px;"><br><br>
                                        <input type ="hidden" value="C" name="operation">
					<input type ="submit" value="Submit" name="submit" class="button">
                                        <br>
				</form>
				
		    </div>
    </body>
</html>
