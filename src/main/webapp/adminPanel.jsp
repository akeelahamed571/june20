<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<style>
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
  padding:35px 55px;
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
	margin:50px 300px;
	color:white;
	
	
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
    margin5px;
    
}


.labelText{
	font-size:20px;
	color:lightgreen;


}

.labels{

text-align:center;


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








<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
  <li><a class="active" href="adminPanel.jsp">Admin Panel </a></li>
</ul>

<!-- END OF NAVIGATION BAR -->


 
   



<div class="behind">
<c:forEach var="admin" items="${adminDetails}">

<!-- TABLE START -->

<form action="#" method="post" class="form"  >

<!-- set values from column variables  -->
<c:set var="adminID" value="${admin.customerID}"/>
<c:set var="adminName" value="${admin.customerName}"/>
<c:set var="phone" value="${admin.phone}"/>
<c:set  var="email" value="${admin.email }"/>
<c:set  var="password" value="${admin.password}"/>
<c:set  var="userName" value="${admin.userName}"/>

<h1 style="font-family:Hind SemiBold;color:red;text-align:center;background-color:black;color:red">WELCOME  ADMIN &nbsp &nbsp ${admin.customerName} </h1>  
<br><br>

<p style="text-align:center;"> <img border="0" src="images/pfpic3.jpg" 
      alt="Pulpit rock"  width=200 height=200></p>
     
<h2 style="font-family:Hind SemiBold;color:red;text-align:center;color:lightgreen">P r o f i l e</h2>




<label class="labelText" >adminID</label><br>
<input type ="text" value="${admin.customerID}" size=125 readonly><br><br>




<label class="labelText">    adminName</label><br> 
<input type ="text" value="${admin.customerName}" size =125 readonly><br><br>




<label class="labelText">  phone</label><br> 
<input type ="text" value="${admin.phone}" size=125 readonly><br><br>




<label class="labelText">  Email</label><br> 
<input type ="text" value="${admin.email }" size=125 readonly><br><br>




<label class="labelText">  password</label><br> 
<input type ="text" value="**********"size=125 readonly><br><br>




<label class="labelText">  userName</label><br> 
<input type ="text" value="${admin.userName}"size=125 readonly><br> <br>  




</form>
</c:forEach>


<!-- END OF TABLE -->






<!--assign values of the set variables  -->
<c:url value="editProfile.jsp" var="editprofile" >
	<c:param  name="adminID"  value="${adminID}" />
	<c:param  name="adminname"  value="${adminName}" />
	<c:param  name="phone"  value="${phone}" />
	<c:param  name="email"  value="${email}" />
	<c:param  name="password"  value="${password}" />
	<c:param  name="userName"  value="${userName}" />
</c:url>

<br><br>

<!--when this button clicked then it performs "editprofile" variable and bring the variable values to edit
profile page  -->

<a href="${editprofile }"><input type="button" class="bottomButton"  name="editProfile" value="edit Profile"></a>

<a href="AddPackages.jsp"><input type="button" class="bottomButton" name="AddPackages" value="Add Packages"></a>

<a href="UpdatePackage.jsp"><input type="button" class="bottomButton"  name="UpdatePackage" value="UpdatePackage"></a>

<a href="ViewPackages.jsp"><input type="button" class="bottomButton"  name="ViewPackages" value="ViewPackages"></a>

<a href="DeletePackage.jsp"><input type="button" class="bottomButton"  name="DeletePackage" value="DeletePackage"></a>

<a href="#"><input type="button" class="bottomButton"  name="AddService" value="Add Service"></a>




<c:url value="DeleteAdmin.jsp" var="adminDelete">
<c:param name="ID"  value="${adminID}"/>
<c:param name="name" value="${adminName}"/>
<c:param name="phone"  value="${phone}"/>
<c:param name="email"   value="${email}"/>
<c:param name="userName" value="${userName}"/>
<c:param name="password" value="${password}"/>
</c:url> 


 <!-- when this clicked admin delete variable's values are sent to next page -->
<a href="${adminDelete}"> <input type="button" class="bottomButton"  name="delete" value="delete account">   </a>





<br><br><br><br></div>
<!-- LAST PART OF THE PAGE -->

<div class="upfooter">  
<pre>		<b>Explore and Shop</b>                   <b>Contact Us</b>                           <b>Support</b> <br> <br>	      <a href="#" style="text-decoration:none">  mobile</a>                             <a href="#" style="text-decoration:none">contact info  </a>         <a href="#" style="text-decoration:none">    How to get 4G Unlimited ? </a><br> 		<a href="#" style="text-decoration:none">Broadband </a>            <a href="#" style="text-decoration:none">             online chat  </a>        <a href="#" style="text-decoration:none">      How to check balance ?</a>
 		<a href="#" style="text-decoration:none">loyality  </a>                 	   <a href="#" style="text-decoration:none">Skype </a>                     <a href="#" style="text-decoration:none">How to activate package ? </a> <br>              <a href="#" style="text-decoration:none">  International</a>                    <a href="#" style="text-decoration:none">  facebook</a>                 <a href="#" style="text-decoration:none">  want to be a loyal customer ?</a>                  


</pre>
</div>


<footer>
  All rights reserved for techtalk.com  <br>
  <a href="#" style="text-decoration:none">techtalk.com</a><br>
  


</footer>


</body>
</html>