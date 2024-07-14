<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "com.mvc.bean.Schedule" %>
<%@page import = "com.mvc.dao.SchedDAO" %>
<%@page import ="util.DBConnection" %>
<%@page import ="java.sql.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="css/nav.css">
<link rel="stylesheet" type="text/css" href="css/adminaddnew.css">
<%
String admin_email = (String)session.getAttribute("admin_email"); //get attributes from session
if (admin_email == null) { //if null (user not login) redirect to login page
request.setAttribute("errMessage", "You have not login");
out.println( "<script> location.href='./adminlogin.jsp'; </script>");
}
%>
<!DOCTYPE html>
<html>
    <head><title>DELETE Schedule</title>
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
	        <div class="contain">
            <span>
                <%
                    int sched_id = Integer.parseInt(request.getParameter("sched_id"));
                    Schedule sched;
                    SchedDAO dao = new SchedDAO();
                    sched = dao.getSchedule(sched_id);
                %>
                <div class="contain">
				<form action="Scheduler" method="POST">
				<input type="hidden" name="operation" value="D">

                                    <div style="text-align: left;">
                                        <h1>DELETE SCHEDULE</h1>
                                    </div>
                                    <div style="text-align: left;">
                                        <h3>Train Information</h3>
                                    </div>
                                        <div style="text-align: left;">
                                            <p><%=sched.getSchedId() %>
                                        <input type="hidden" name="operation" value="U">                                                                            
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>From:</h4>
                                        <p><%=sched.getArrival() %>
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>To</h4>
                                        <p><%=sched.getDepart() %>
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>Date</h4>
                                        <p><%=sched.getDepartDate() %>     
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>Time:</h4>
                                        <p><%=sched.getDepartTime() %>
                                    </div><br>
                                <input type="hidden" name="sched_id" value="<%=sched.getSchedId() %>">	
                                <input type ="submit" value="Delete" name="delete" class="button"><br><br>

				</form>
		    </div>
    </body>
<script>
      let arrow = document.querySelectorAll(".arrow");
      for (var i = 0; i < arrow.length; i++) {
        arrow[i].addEventListener("click", (e)=>{
      let arrowParent = e.target.parentElement.parentElement;//selecting main parent of arrow
      arrowParent.classList.toggle("showMenu");
        });
      }
      let sidebar = document.querySelector(".sidebar");
      let sidebarBtn = document.querySelector(".bx-menu");
      console.log(sidebarBtn);
      sidebarBtn.addEventListener("click", ()=>{
        sidebar.classList.toggle("close");
      });
    </script>
</html>