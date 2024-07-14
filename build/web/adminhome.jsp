<%@page import="java.sql.ResultSet"%>
<%@page import="util.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head><title>Admin Homepage</title>
	<meta name="viewport" content="width=device-width, intial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
        <link rel="stylesheet" type="text/css" href="css/home.css">
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
<%
String admin_email = (String)session.getAttribute("admin_email"); //get attributes from session
if (admin_email == null) { //if null (user not login) redirect to login page
request.setAttribute("errMessage", "You have not login");
out.println( "<script> location.href='./adminlogin.jsp'; </script>");
}
%>


<% 
    Connection con = DBConnection.createConnection();
    String sql="select * from schedule";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(sql);
%> 
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap');
        *{
          margin: 0;
          padding: 0;
          box-sizing: border-box;
          font-family: 'Poppins', sans-serif;
        }
        
        .box {
  width: 90%;
  margin: 0 auto;
}
table {
  font-family: arial;
  border-collapse: collapse;
  width: 90%;
  margin: 0 auto;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
        .sidebar{
          position: fixed;
          top: 0;
          left: 0;
          height: 100%;
          width: 260px;
          background: #11101d;
          z-index: 100;
          transition: all 0.5s ease;
        }
        .sidebar.close{
          width: 78px;
        }
        .sidebar .logo-details{
          height: 60px;
          width: 100%;
          display: flex;
          align-items: center;
        }
        .sidebar .logo-details i{
          font-size: 30px;
          color: #fff;
          height: 50px;
          min-width: 78px;
          text-align: center;
          line-height: 50px;
        }
        .sidebar .logo-details .logo_name{
          font-size: 22px;
          color: #fff;
          font-weight: 600;
          transition: 0.3s ease;
          transition-delay: 0.1s;
        }
        .sidebar.close .logo-details .logo_name{
          transition-delay: 0s;
          opacity: 0;
          pointer-events: none;
        }
        .sidebar .nav-links{
          height: 100%;
          padding: 30px 0 150px 0;
          overflow: auto;
        }
        .sidebar.close .nav-links{
          overflow: visible;
        }
        .sidebar .nav-links::-webkit-scrollbar{
          display: none;
        }
        .sidebar .nav-links li{
          position: relative;
          list-style: none;
          transition: all 0.4s ease;
        }
        .sidebar .nav-links li:hover{
          background: #1d1b31;
        }
        .sidebar .nav-links li .iocn-link{
          display: flex;
          align-items: center;
          justify-content: space-between;
        }
        .sidebar.close .nav-links li .iocn-link{
          display: block
        }
        .sidebar .nav-links li i{
          height: 50px;
          min-width: 78px;
          text-align: center;
          line-height: 50px;
          color: #fff;
          font-size: 20px;
          cursor: pointer;
          transition: all 0.3s ease;
        }
        .sidebar .nav-links li.showMenu i.arrow{
          transform: rotate(-180deg);
        }
        .sidebar.close .nav-links i.arrow{
          display: none;
        }
        .sidebar .nav-links li a{
          display: flex;
          align-items: center;
          text-decoration: none;
        }
        .sidebar .nav-links li a .link_name{
          font-size: 18px;
          font-weight: 400;
          color: #fff;
          transition: all 0.4s ease;
        }
        .sidebar.close .nav-links li a .link_name{
          opacity: 0;
          pointer-events: none;
        }
        .sidebar .nav-links li .sub-menu{
          padding: 6px 6px 14px 80px;
          margin-top: -10px;
          background: #1d1b31;
          display: none;
        }
        .sidebar .nav-links li.showMenu .sub-menu{
          display: block;
        }
        .sidebar .nav-links li .sub-menu a{
          color: #fff;
          font-size: 15px;
          padding: 5px 0;
          white-space: nowrap;
          opacity: 0.6;
          transition: all 0.3s ease;
        }
        .sidebar .nav-links li .sub-menu a:hover{
          opacity: 1;
        }
        .sidebar.close .nav-links li .sub-menu{
          position: absolute;
          left: 100%;
          top: -10px;
          margin-top: 0;
          padding: 10px 20px;
          border-radius: 0 6px 6px 0;
          opacity: 0;
          display: block;
          pointer-events: none;
          transition: 0s;
        }
        .sidebar.close .nav-links li:hover .sub-menu{
          top: 0;
          opacity: 1;
          pointer-events: auto;
          transition: all 0.4s ease;
        }
        .sidebar .nav-links li .sub-menu .link_name{
          display: none;
        }
        .sidebar.close .nav-links li .sub-menu .link_name{
          font-size: 18px;
          opacity: 1;
          display: block;
        }
        .sidebar .nav-links li .sub-menu.blank{
          opacity: 1;
          pointer-events: auto;
          padding: 3px 20px 6px 16px;
          opacity: 0;
          pointer-events: none;
        }
        .sidebar .nav-links li:hover .sub-menu.blank{
          top: 50%;
          transform: translateY(-50%);
        }

        .one {
          width: 80%;
          margin-left: 10%;
          background-color: black;
          height: 400px;
        }

        .sidebar .profile-details{
          position: fixed;
          bottom: 0;
          width: 260px;
          display: flex;
          align-items: center;
          justify-content: space-between;
          background: #1d1b31;
          padding: 12px 0;
          transition: all 0.5s ease;
        }
        .sidebar.close .profile-details{
          background: none;
        }
        .sidebar.close .profile-details{
          width: 78px;
        }
        .sidebar .profile-details .profile-content{
          display: flex;
          align-items: center;
        }
        .sidebar .profile-details img{
          height: 52px;
          width: 52px;
          object-fit: cover;
          border-radius: 16px;
          margin: 0 14px 0 12px;
          background: #1d1b31;
          transition: all 0.5s ease;
        }
        .sidebar.close .profile-details img{
          padding: 10px;
        }
        .sidebar .profile-details .profile_name,
        .sidebar .profile-details .job{
          color: #fff;
          font-size: 18px;
          font-weight: 500;
          white-space: nowrap;
        }
        .sidebar.close .profile-details i,
        .sidebar.close .profile-details .profile_name,
        .sidebar.close .profile-details .job{
          display: none;
        }
        .sidebar .profile-details .job{
          font-size: 12px;
        }
        .home-section{
          position: relative;
          background: white;
          height: 80%;
          left: 260px;
          width: calc(100% - 260px);
          transition: all 0.5s ease;
        }
        .sidebar.close ~ .home-section{
          left: 78px;
          width: calc(100% - 78px);
        }
        .home-section .home-header{
          height: 60px;
          display: flex;
          align-items: center;
        }
        .home-section .home-header .bx-menu,
        .home-section .home-header .text{
          color: #11101d;
          font-size: 35px;
        }
        .home-section .home-header .bx-menu{
          margin: 0 15px;
          cursor: pointer;
        }
        .home-section .home-header .text{
          font-size: 26px;
          font-weight: 600;
        }
        .home-section .home-content{
            /*height: 450px;*/
            display: flex;
            align-items: center;
            margin: 0 15px;
        }
        .home-section .home-content .bx-menu,
        .home-section .home-content .text{
            color: #11101d;
            font-size: 15px;
        }
        .home-section .home-content .bx-menu{
          margin: 0 15px;
          cursor: pointer;
        }
        .home-section .home-content .text{
          font-size: 26px;
          font-weight: 600;
        }
        @media (max-width: 420px) {
          .sidebar.close .nav-links li .sub-menu{
            display: none;
          }
        }
        
    </style>
    <!-- Boxiocns CDN Link -->
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
  <body>
    <div class="sidebar close">
      
      <ul class="nav-links">
        <li>
          <ul class="sub-menu blank">
            <li><a class="link_name" href="#">Category</a></li>
          </ul>
        </li>
        <li>
          <div class="iocn-link">
            <a href="#">
              <i class='bx bx-collection' ></i>
              <span class="link_name">Admin</span>
            </a>
            <i class='bx bxs-chevron-down arrow' ></i>
          </div>
          <ul class="sub-menu">
            <li><a class="link_name" href="#">Schedule</a></li>
            <li><a href="adminaddnew.jsp">Add Schedule</a></li>
            <li><a href="adminhome.jsp">View Schedule</a></li>
          </ul>
        </li>
        
        <li>
          <a href="./AdminLogoutServlet">
            <i class='bx bx-log-out' ></i>
            <span class="link_name">Logout</span>
          </a>
          <ul class="sub-menu blank">
            <li><a class="link_name" href="#">Logout</a></li>
          </ul>
        </li>
      </ul>
    </div>
    <section class="home-section">
      <div class="home-header">
        <i class='bx bx-menu' ></i>
        <span class="text">Train Booking system</span>
      </div>
            <span>            
        <table class="box">
            <!-- column headers -->
            <tr>
                <th width="10%">ID</th>
                <th>Depart</th>
                <th width="20%">Arrival</th>
                <th>Depart Date</th>
                <th>Depart Time</th>
                <th>Actions</th>

            </tr>
            <!-- column data -->
            <% while(rs.next()){ %>
                <tr>
                    <td><%= rs.getInt("sched_id") %></td>
                    <td><%= rs.getString("depart") %></td>
                    <td><%= rs.getString("arrival") %></td>
                    <td><%= rs.getString("departDate") %></td>
                    <td><%= rs.getString("departTime") %></td>

                    <td><a href='adminupdate.jsp?sched_id=<%=rs.getInt("sched_id") %>' title="Update Record">Edit</a>
                    <a href='admindelete.jsp?sched_id=<%=rs.getInt("sched_id") %>' type="submit" title="Delete Record">Delete</a></td>
                </tr>    
            <% } 
                rs.close();
                st.close();
                con.close();
            %>
        </table>
        <br><a style="padding-left:80% " href="adminaddnew.jsp" >ADD SCHEDULE</a>
            </span>
    </section>
    
    <!--<div class="one">test</div>-->
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
  </body>
</html>
    </body>
</html>
               