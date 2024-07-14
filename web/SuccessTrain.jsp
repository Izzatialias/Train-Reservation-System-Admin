

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    </head>
    <body background-repeat:no-repeat; background-size:cover;" background="image/bg.jpg">
      
        
        <div class="container-fluid p-5 text-center"></div>
        
        <div class="container-fluid col-md-4 p-5 bg-body-tertiary">
            <h2>Add Booking Success!</h2>
            You have add the following Booking : <br/>
            Ticket ID: <jsp:getProperty name="ticket" property="ticket_ID" /> <br>
            Ticket No: <jsp:getProperty name="ticket" property="ticket_num" /> <br>
            Date: <jsp:getProperty name="ticket" property="date_avail" /> <br>
            Depart: <jsp:getProperty name="ticket" property="depart" /> <br>
            Destination: <jsp:getProperty name="ticket" property="destination" /> <br>

            <a class="btn btn-outline-secondary" href='home.jsp' style="margin-left: 80%">Done</a>
        </div>
    </body>
</html>