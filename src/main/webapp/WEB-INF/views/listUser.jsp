<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title><base>
<%@ include file="header.jsp"%>
</head>
<body>
<div >
<a href = "add_user" > Add Student</a>
  <c:if test = "${!empty users }" >
  
  
  
  <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">SN</th>
      <th scope="col">Id</th>
      <th scope="col">User Name </th>
      <th scope="col">Password</th>
      <th scope="col">Gender</th>
      <th scope="col">Hobbies</th>
      <th scope="col">Email </th>
      <th scope="col">Verification Type</th>
      <th scope="col">DOB</th>
      <th scope="col">Mobile No</th>
      <th scope="col">Photo</th>
      <th scope="col">city Name </th>
      <th scope="col">country Name</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items = "${users}" var = "user" varStatus = "i">
             <tr>
              <th scope="row">${i.count}</th>
               <td> ${user.id}</td>
               <td> ${user.name}</td>
               <td> ${user.password}</td>
               <td> ${user.gender}</td>
               <td> ${user.hobbies}</td>
               <td> ${user.email}</td>
               <td> ${user.verificationType}</td>
               <td> ${user.dob}</td>
               <td> ${user.mobileNo}</td>
               <td> <img src ="image_display?id=${user.id}" width = "50px" height = "50px" alt="no pic"></td>
               <td> ${user.city}</td>
               <td> ${user.country}</td>
               <td> <a href = "" > Edit</a> | <a href = "delete_user?id =${user.id}"> Delete</a>  </td>
              
    </tr>
    </c:forEach>
  </tbody>
</table>
 </c:if>




</body>
</html>