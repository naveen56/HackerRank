<%-- 
    Document   : successpage
    Created on : 9 Mar, 2017, 10:46:30 AM
    Author     : naveen
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <title>loan</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
////      function addRowHandlers() {
//    var table = document.getElementById("tableid");
//    var rows = table.getElementsByTagName("tr");
//    for (i = 0; i < rows.length; i++) {
//        var currentRow = table.rows[i];
////        var createClickHandler = 
////            function(row) 
////            {
////                return function() { 
////                                        var cell = row.getElementsByTagName("td")[0];
////                                        var id = cell.innerHTML;
////                                        alert("id:" + id);
////                                 };
////            };
//
//        currentRow.onclick = display;
//        function display(){
//            document.getElementById("result").innerHTML = Date();
//        }
//    }
//}
      </script>
  
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #0c376a;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
    <body>
        
        <%
//            if(request.getParameter("username")!=null){
//            request.setAttribute("username",request.getParameter("username").trim());
//            session.setAttribute("username",request.getParameter("username").toString().trim());
//            }
        %>
<nav class="navbar navbar-inverse" style=" background-color: #0c376a;
border-color: #0c376a;">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="mjlogin.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    
    <div class="col-sm-8 text-center">
        
          <h1>  loan details</h1>
        <div class="table-responsive">
        <table class="table table-striped table-borderd table-hover" id="tableid">
        <thead>
                    <th>
                        name
                    </th>
                    <th>
                        loantype
                    </th>
                    <th>
                        loansanctioned
                    </th>
                    <th>
                        accountnumber
                    </th>
                    
                    <th>
                        status
                    </th>
                    
            </thead>
            <%
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1444:XE","naveenkalyan","naveen56");
             PreparedStatement st=con.prepareStatement("select * from loan ");
//             if(request.getParameter("username")==null){
//                 st.setString(1,request.getAttribute("username").toString().trim());
//             }
//             else
//             st.setString(1, request.getParameter("username").trim());
//           
             ResultSet rs=st.executeQuery();
             while(rs.next()){
            %>
            
            <tr>
                <td>
                <%= rs.getString(1)%>
                   </td>
            <td>
                <%= rs.getString(2)%>
                   </td>   <td>
                <%= rs.getString(3)%>
                   </td>   <td>
                <%= rs.getString(4)%>
                   </td>   
            <td>
                <%= rs.getString(5)%>
                   </td> </tr>
            
                 <%
                        }

%>
            </table> 
        </div>
    </div>
  </div>
</div>
            <button id="myBtn">Try it</button>

<p id="demo"></p>

<script>
document.getElementById("myBtn").onclick = displayDate;

var table = document.getElementById("tableid");
    var rows = table.getElementsByTagName("tr");
    System.out.println(rows.length);
    for (i = 0; i < rows.length; i++) {
        var currentRow = table.rows[i];
        currentRow.onclick=displayDate;
        
        
    }
    
function displayDate() {
    document.getElementById("demo").innerHTML = Date();
}
    
</script>

<footer class="container-fluid text-center">
  <p>copyrights     @lps_team     </p>
</footer>
        
    </body>
</html>
