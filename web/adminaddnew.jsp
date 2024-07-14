<%@page import= "util.DBConnection" %>
<%@page contentType= "text/html" pageEncoding="UTF-8"%>
<%@page import = "com.mvc.bean.Schedule" %>
<%@page import = "com.mvc.dao.SchedDAO" %>
<%@page import = "java.sql.*" %>


<%
String admin_email = (String)session.getAttribute("admin_email"); //get attributes from session
if (admin_email == null) { //if null (user not login) redirect to login page
request.setAttribute("errMessage", "You have not login");
out.println( "<script> location.href='./adminlogin.jsp'; </script>");
}
%>
<!DOCTYPE html>
<html>
    <head><title>Add New Schedule</title>
	<meta name="viewport" content="width=device-width, intial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
        <link rel="stylesheet" type="text/css" href="css/adminaddnew.css">
	</head>
		<body style="font-family: BR Firma; background-repeat:no-repeat; background-size:cover;" background="images\bg.jpg">
			<!-----navigation------>
			<nav>
				<!--logo-->
				<div class="head">
					<a href="Navigation.html" class="logo"><img src= "images\logo.jpg" alt="" height="75px"></a>
					<div class="acc">
                                            <a href="./AdminLogoutServlet">Logout</a>
					</div>
				</div>
			</nav><br>
                 <%-- Display error messages if any --%>
                <c:if test="${not empty errorMsgs}">
                    <div class="error-messages">
                        <ul>
                            <c:forEach items="${errorMsgs}" var="errorMsg">
                                <li>${errorMsg}</li>
                            </c:forEach>
                        </ul>
                    </div>
                </c:if>
                
                <%-- Add Schedule Form --%>
	        <div class="contain">
                                
				<form action="Scheduler" method="POST">
                                    <div style="text-align: left;">
                                        <h1>ADD SCHEDULE</h1>
                                    </div>
                                    <div style="text-align: left;">
                                        <h3>Schedule Information</h3>
                                    </div>
                                    <div style="text-align: left;">
                                        <input type="text" name="sched_id" id="sched_id" required style="height:30px; width:400px;">
                                        <input type="hidden" name="operation" value="C">                                                                            
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>From:</h4>
                                        <input type="text" name="depart" id="depart" required style="height:30px; width:400px;">
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>To</h4>
                                                <input type="text" name="arrival" id="arrival" required style="height:30px; width:400px;">
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>Date</h4>
                                            <input type="date" name="departDate" id="departDate" required style="height:30px; width:400px;">     
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>Time:</h4>
                                        <p><input type="time" name="departTime" id="departTime" required style="height:30px; width:400px;">
                                    </div><br>
					<input type ="submit" value="ADD NEW" name="submit" class="button"><br><br>
				</form>
		    </div>
    </body>
</html>