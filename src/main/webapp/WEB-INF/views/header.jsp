<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<script type = "text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resources/css/bootstrap.css" />
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
<script type = "text/javascript" src="resources/jquery.js"></script>

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light ml-auto">
  <a class="navbar-brand" href="home">UserInfoSystem</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="list_user">User</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">${name}</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="logout">logout</a>
      </li>
      </ul>
  </div>
</nav>



 

</body>
</html>