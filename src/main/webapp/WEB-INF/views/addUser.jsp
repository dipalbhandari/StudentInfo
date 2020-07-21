<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> User Registration Form</title>

<%@ include file="header.jsp"%>

<link rel="stylesheet" href="resources/bootstrap/bootstrap.min.css"/>
<script type = "text/javascript" src="resources/jquery.js"></script>
<script type = "text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resources/style.css"/>




</head>
<body>


<div class = "container" >
<form action="save_user" method = "post" enctype = "multipart/form-data" >
  <fieldset>
    <legend> User Registration</legend>
    
    <label for="name">name:</label>
    <input type="text" id="name" name="name"><br><br>
    
    <label for="password">Password:</label>
    <input type="password" id="lname" name="password"><br><br>
   
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br><br>
    
    <label for="mobileNo">mobileNo:</label>
    <input type="number" id="mobileNo" name="mobileNo"><br><br>
    
    
    <label for="dob">Date of birth:</label>
  <input type="date" id="dob" name="dob"><br><br>
  

  
  
  <div >
    <label> Gender</label>
    <input type = "radio" name = "gender" value = "Male" > Male
    <input type = "radio" name = "gender" value = "Female" > Female
    
  </div> <br><br>
  
  <div>
    <label> Hobbies</label>
    <input type = "checkbox" name = "hobbies" value = "	Reading" > Reading
    <input type = "checkbox" name = "hobbies" value = "Playing" > Playing
    
  </div> <br><br>
  
  <div>
   <label > Verification Type</label>
    <select name = "verificationType" > 
      <option value = "Citizenship"> Citizenship</option>
      <option value = "Passport"> Passport</option>
      <option value = "SSN"> SSN</option>
      
    </select>
  </div> <br><br>
  
  
  
  
  <label for="city">city:</label>
  <input type="text" id="city" name="city"><br><br>
  
  <label for="country">country:</label>
  <input type="text" id="country" name="country"><br><br>
  
  <div class = "form-group" >
      <label> Upload Photo</label>
      <input type="file" name = "file" class = "form-control" >
  </div>
    
    
    <input type="submit" value="Submit"> <br><br>
   
  </fieldset>
</form>
</div>





</body>
</html>