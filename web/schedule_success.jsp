<%-- 
    Document   : schedule_success
    Created on : Jun 27, 2023, 11:31:40 PM
    Author     : HANIPUTERI
--%>
<%
String admin_email = (String)session.getAttribute("admin_email"); //get attributes from session
if (admin_email == null) { //if null (user not login) redirect to login page
request.setAttribute("errMessage", "You have not login");
out.println( "<script> location.href='./adminlogin.jsp'; </script>");
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Schedule" scope="request" type="com.mvc.bean.Schedule" />

<!DOCTYPE html>
<html>
    <head><title>New schedule</title>
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
                        
                        <%-- Display success message if redirected from the add schedule form --%>
                        <c:if test="${not empty successMsg}">
                            <div class="success-message">
                                ${successMsg}
                            </div>
                        </c:if>
                        
                        <%-- Displaying the successfully added schedule data --%>
                        <div class="contain">
                            <form>
                            <div style="text-align: left;">
                                        <h1>New Schedule have been added</h1>
                            </div>
                                    <div style="text-align: left;">
                                        <h4>From:</h4>
                                        <jsp:getProperty name="schedule" property="depart" /><br>
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>To</h4>
                                                <jsp:getProperty name="schedule" property="arrival" /><br>
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>Date</h4>
                                            <jsp:getProperty name="schedule" property="departDate" /><br>
                                    </div>
                                    <div style="text-align: left;">
                                        <h4>Time:</h4>
                                        <jsp:getProperty name="schedule" property="departTime" /><br>
                                    </div><br>
					<input type ="submit" value="ADD NEW" name="submit" class="button"><br><br>
                            </form>
                        </div>
    </body>
</html>