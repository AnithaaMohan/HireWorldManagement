
<form action="action_page.php" method="post">

<html>
<head>
    <title>Text alignment</title>
    <style>
        h1{text-align: center;
        color: Black;
        padding: 6px 8px;
        }
    .button {
  border: none;
  color: White;
  padding: 10px 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.button1 {background-color: #4CAF50;} /* Green */
.button2 {background-color: #008CBA;} /* Blue */
.button3 {background-color: #8A2BE2;} /* Brown */
.button4 {background-color: #008B8B;} /* Blue */

h2{
text-align:center
}

</style>

</head>

<body>
    <h1>Please Choose the User</h1>

     
 <h1> <a href= "applicantIndex.jsp"> 
 
 <button class="button button3" type="button"><h1>Applicant</h1></button> <br> <br></h1> </a>
 
    
    <h1>
     <a href= "recruiterIndex.jsp"> 
    <button class="button button4" type="button"><h1>Recruiter</h1></button>  <br> <br> 
    </h1> </a>
<h2><button class="button button1">Login </button> &nbsp;&nbsp;
<button class="button button2">Exit </button> &nbsp;&nbsp;
</h2>
</body>
</html>
</form>