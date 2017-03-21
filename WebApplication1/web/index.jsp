<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
    
    <div class="col-sm-8 text-left"> 
      <h1>Security tips</h1>
      <p>IMPORTANT SECURITY TIPS FOR SAFE ONLINE BANKING

<p>    Access your bank website only by typing the URL in the address bar of your browser.
    Do not click on any links in any e-mail message to access the site.
    State Bank never sends e-mail and embedded links asking you to update or verify personal, confidential and security details. NEVER RESPOND to such e-mails/phone calls/SMS if you receive.
    Do not be lured if you receive an e-mail/SMS/phone call promising reward for providing your personal information or for updating your account details in the bank site.
    Having the following will improve your internet security:
</p>
   <p> Newer version of Operating System with latest security patches.
    Latest version of Browsers (IE 7.0 and above , Mozilla Firefox 3.1 and above, Opera 9.5 and above, Safari 3.5 and above, Google chrome,etc.)
    Firewall is enabled.
    Antivirus signatures applied
</p>
<p>
    Scan your computer regularly with Antivirus to ensure that the system is Virus/Trojan free.
    Change your Internet Banking password at periodical intervals.
    Always check the last log-in date and time in the post login page.
    Avoid accessing Internet banking accounts from cyber cafes or shared PCs.
</p>

      <hr>
      
    </div>
   
  </div>
</div>

<footer class="container-fluid text-center">
  <p>copyrights     @lps_team     </p>
</footer>

</body>
</html>

