<html>
  <title>login-page</title>
  <head>
    <link rel="stylesheet" type="text/css" href="logincss.css" media="screen" />
  </head>
<body>
  
  
  <div class="login">
    <h1>Login</h1>
    <form action="TestingServlet" method="post">
   <div class="form-group ">
     <input type="text" class="form-control" name="username"  value="Enter user name">

     </div>
   
  
    <div class="form-group ">
        
       <input type="password" class="form-control" name="password" value="password" id="Passwod">
       <i class="fa fa-lock"></i>
    
	</div>
      
        
	  
        <ul class="list-inline">
            <li><input type="submit" class="log-btn" name="loginbutton" value="login as user" /></li>
            <li><input type="submit" class="log-btn" name="loginbutton" value="login as admin" /></li>
        </ul>    
        <a class="link" href="#">forgot password?</a>
      
      
      </form>
    
  </div>
 
</body>

</html>