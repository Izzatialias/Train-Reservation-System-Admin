<%-- 
    Document   : options
    Created on : Jun 10, 2023, 10:56:36 PM
    Author     : Izzati
--%>
<%@ page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>Options Tickets Page</title>
	<meta name="viewport" content="width=device-width, intial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
        <link rel="stylesheet" type="text/css" href="css/adminaddnew.css">
        <script>
            function onclick() {
            INT sched_ID = document.getElementById("sched_ID").value;
            window.location.href = "book.jsp?sched_ID=" + sched_ID;
            }
        </script>
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
			</nav>
            <!--Options Section -->
            
                
                    <h1 align="center" style="background-color:white; font-size:200%">Available Train</h1>

            <%
                int count = 0;
                String color = "white";
                if (request.getAttribute("piList") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("piList");
                    System.out.println(al);
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {

                        if ((count % 2) == 0) {
                            color = "white";
                        }
                        count++;
                        ArrayList pList = (ArrayList) itr.next();
            %>
            <div style="background-color:<%=color%>;">
                <td>
                    <font size="0.5px" face ="consolas">
                    <h1>ID: <%=pList.get(0)%></h1>
                    <h1>Date: <%=pList.get(1)%></h1>
                    <h1>Time: <%=pList.get(2)%></h1>
                    <h1>Arriving: <%=pList.get(3)%></h1>
                    <h1>Departing: <%=pList.get(4)%></h1>
                </td>

                 <div  class="button">
                <a style="font-color:white; font-size:100%" href="book.jsp">Book</a>
            </div>
            </div>
            <%
                    }
                }
                if (count == 0) {
            %>
            <div>
                <td colspan=4 align="center"
                    style="background-color:#eeffee"><b>No Record Found..</b></td>
            </div>
            <%          }
            %>

    </body>
</html>
