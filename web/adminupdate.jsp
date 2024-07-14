<%@page import="com.mvc.bean.Schedule" %>
<%@page import="com.mvc.dao.SchedDAO" %>
<%@page import="util.DBConnection" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String admin_email = (String)session.getAttribute("admin_email"); //get attributes from session
if (admin_email == null) { //if null (user not login) redirect to login page
request.setAttribute("errMessage", "You have not login");
out.println( "<script> location.href='./adminlogin.jsp'; </script>");
}
%>
<!DOCTYPE html>
<html>
<head><title>Update Schedule</title>
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
<body>
    <!-- Add your navigation and other HTML code here -->

    <%  
        int sched_id = Integer.parseInt(request.getParameter("sched_id"));
        Schedule sched;
        SchedDAO dao = new SchedDAO();
        sched = dao.getSchedule(sched_id);
    %>

    <div class="contain">
        <form action="Scheduler" method="POST">
            <input type="hidden" name="operation" value="U">

            <h1>UPDATE SCHEDULE</h1>

            <div style="text-align: left;">
                <h3>Train Information</h3>
            </div>

            <div style="text-align: left;">
                <input type="text" name="sched_id" id="depart" value="<%= sched.getSchedId() %>" required style="height:30px; width:400px;">
                <input type="hidden" name="operation" value="U">
            </div>

            <div style="text-align: left;">
                <h4>From:</h4>
                <input type="text" name="depart" id="depart" value="<%= sched.getDepart() %>" required style="height:30px; width:400px;">
            </div>

            <div style="text-align: left;">
                <h4>To</h4>
                <input type="text" name="arrival" id="arrival" value="<%= sched.getArrival() %>" required style="height:30px; width:400px;">
            </div>

            <div style="text-align: left;">
                <h4>Date</h4>
                <input type="date" name="departDate" id="departDate" value="<%= sched.getDepartDate() %>" required style="height:30px; width:400px;">     
            </div>

            <div style="text-align: left;">
                <h4>Time:</h4>
                <p><input type="time" name="departTime" id="departTime" value="<%= sched.getDepartTime() %>" required style="height:30px; width:400px;">
            </div><br>

            <input type ="submit" value="UPDATE" name="update" class="button"><br><br>
        </form>
    </div>

</body>
</html>
