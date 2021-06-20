<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Packages</title>


<style type="text/css">
      body{
		font-family: Hind SemiBold;
     }
     
     
     
 ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 48px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: red;
}

.active {
  background-color: #4CAF50;
}


.bottomButton{ 
  background-color: darkgreen;
  color:white;
  padding:35px 90px;
  border-radius:12px;
  border-style: solid;
  border-color: yellow;
  border-width: 3px;
 
  
}

.bottomButton:hover:not(.active){
	background-color: red;
	 -ms-transform: rotate(20deg); /* IE 9 */
 	 transform: rotate(20deg); /* Standard syntax */
}


.tablePosition{
	padding:0px 400px;
	margin:0px;
	
}

.form{
	background-color: grey;
	padding:10px;
	margin:50px 375px;
	color:white;
	width:50%;
	
	} 


footer {
  text-align: center;
  padding: 3px;
  background-color: black;
  color: white;
}


.upfooter{
	background-color:lightblue;
    padding:5px;
   }
   
 .submitButton:hover:not(.active){
	background-color: red;
	 -ms-transform: rotate(20deg); /* IE 9 */
 	 transform: rotate(20deg); /* Standard syntax */
}
.submitButton{ 
  background-color: black;
  color:white;
  padding:05px 75px;
  border-radius:12px;
 
 }
 
 .bgcolor{
 
 	 background-color: grey;
 	padding:0px 100px
 }


.buttonup {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 50%;
  float:right;
  margin-right:20px
  
}
 .buttonup:hover{
 	background-color:red;
 }
 

  .search{
   float:right;
   margin-right:80px;
   border:2px solid black;

}
.upbtn{
 float :right;
 padding:2px 8px;
 background-color:black;
 color:white;
 margin-right:10px;
 border-radius: 50%;
 border-color:red
 

}
.upbtn:hover{
 background-color:red;

}

.uplink{

float:right;
text-decoration:none;
color:red;
margin-right:70px;



}


.behind{

background-color:#F0FFFF;

}    



     
     

</style>












</head>
<body>

   <img border="0" src="images/techtalk.jpg" alt="Pulpit rock"  width=200 height=100>
   
   <button class="buttonup">logout</button>
   <input class="search" type="text" name="search" size=50 placeholder="search" > 
    
   <input class="upbtn" type="submit" value="search">
   
   <a href="#" class=" uplink">personal</a>
   <a href="#" class=" uplink" >business</a>
   <a href="#" class=" uplink" >language</a>
   
      
      

  <!--start NAVIGATION BAR -->
<ul>
  <li><a href="#home">Home</a></li>
  <li><a href="#news">Explore Packages</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
  <li><a href="#about">My Account</a></li>
  <li><a href="#about">Reload /Pay Bill</a></li>
  <li><a href="#about">Cart</a></li>
  <li><a class="active"href="adminPanel.jsp">Admin Panel </a></li>

</ul>

<!-- END OF NAVIGATION BAR -->
 










 <div class="behind"> 


<form class="form" action="addPackages" method="post">
<h1 style="padding:10px; text-align:center;color:lightgreen">ADD PACKAGES</h1>
 
 package Name <br>
 <input type="text" name="packageName" id="packageName" size="100" placeholder="name"  required><br><br>
 
 
 package Description<br>
 <input type="text" name="description" id="description" size="100" placeholder="description" required><br><br>
 
 package type <br>
 <input type="text" name="packageType" id="packageType" size="100" placeholder="type" required><br><br>
 
 package Price<br>
 <input type="text" name="price" id="price" size="100"  placeholder="price" required><br>
 <pre><input type="submit" name="submit" value="add package" class="submitButton">                               <input  type="reset" value="reset" name="reset" id="reset"  class="submitButton "></pre>

</form>




<!-- this is options and page buttons -->

<a href="AddPackages.jsp"><input type="button" class="bottomButton" name="AddPackages" value="Add Packages"></a>

<a href="UpdatePackage.jsp"><input type="button" class="bottomButton"  name="UpdatePackage" value="UpdatePackage"></a>

<a href="ViewPackages.jsp"><input type="button" class="bottomButton"  name="ViewPackages" value="ViewPackages"></a>

<a href="DeletePackage.jsp"><input type="button" class="bottomButton"  name="DeletePackage" value="DeletePackage"></a>

<a href="#"><input type="button" class="bottomButton"  name="AddService" value="Add Service"></a>

<!-- end of page buttons -->



 <br><br><br><br></div>
<!-- LAST PART OF THE PAGE -->

<div class="upfooter">  
<pre>		<b>Explore and Shop</b>                   <b>Contact Us</b>                           <b>Support</b> <br> <br>	      <a href="#" style="text-decoration:none">  mobile</a>                             <a href="#" style="text-decoration:none">contact info  </a>         <a href="#" style="text-decoration:none">    How to get 4G Unlimited ? </a><br> 		<a href="#" style="text-decoration:none">Broadband </a>            <a href="#" style="text-decoration:none">             online chat  </a>        <a href="#" style="text-decoration:none">      How to check balance ?</a>
 		<a href="#" style="text-decoration:none;">loyality  </a>                 	   <a href="#" style="text-decoration:none">Skype </a>                     <a href="#" style="text-decoration:none">How to activate package ? </a> <br>              <a href="#" style="text-decoration:none">  International</a>                    <a href="#" style="text-decoration:none">  facebook</a>                 <a href="#" style="text-decoration:none">  want to be a loyal customer ?</a>                  


</pre>
</div>


<footer>
  All rights reserved for techtalk.com  <br>
  <a href="#" style="text-decoration:none">techtalk.com</a><br>
  


</footer>










</body>
</html>