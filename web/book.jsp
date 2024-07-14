<%-- 
    Document   : book
    Created on : Jun 13, 2023, 6:33:31 AM
    Author     : muizzuddin roslan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>Book Page</title>
	<meta name="viewport" content="width=device-width, intial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
        <link rel="stylesheet" type="text/css" href="css/adminaddnew.css">
	</head>
        
	<body style="font-family: BR Firma; background-repeat:no-repeat; background-size:cover;" background="image/bg.jpg">
            <nav>
				<!--logo-->
				<div class="head">
					<a href="Navigation.html" class="logo" ><img src= "image/logo.png" alt="" height="115px"></a>
					<div class="acc">
						<a href="./LogoutServlet" style="margin-left:20px;padding-top:15px;">Logout</a>
					</div>
				</div>
			</nav><br>
            <!--Tickets Section -->
            <br><div class="contain">
                        <form action="TicketServlet" method="POST">
                        <h3 style="text-align: center"><b>Booking Ticket</b></h3>

                        <input type="text" name="ticket_ID" placeholder="Enter Ticket" style="height:30px; width:400px;"><br>
                        <input type="text" name="ticket_num" placeholder="Enter Number of Tickets" style="height:30px; width:400px;"><br>
                        <input type="date" name="date_avail" placeholder="Enter Date" style="height:30px; width:400px;"><br>
                        <input type="text" name="depart" placeholder="From" style="height:30px; width:400px;"><br>
                        <input type="text" name="destination" placeholder="Destination" style="height:30px; width:400px;"><br>
                        <input type ="hidden" value="C" name="operation">
                        <input type="submit" value="Book" name="submit" class="button">
                        </form>
		</div>
	   
    </body>
</html>

