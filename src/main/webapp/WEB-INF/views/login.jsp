<link rel="stylesheet" href="resources/bootstrap/bootstrap.min.css"/>
<script type = "text/javascript" src="resources/jquery.js"></script>
<script type = "text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resources/login.css"/>
<script type = "text/javascript" src="resources/login.js"></script>



<div class="container">
        <div class="card card-container">
            <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
            <img id="profile-img" class="profile-img-card" src="image_display?id=${user.id}" />
            <p id="profile-name" class="profile-name-card"></p>
            <form class="form-signin" action = "user-login" , method = "post">
            <span style="color:red;"> ${uname}  ${pass} </span>
               <span style="color:red;"> ${msg} </span>
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" id="inputEmail" class="form-control" placeholder="Username" name = "name" value = "${uname}"required autofocus>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" name = "password" value = "${pass}" required>
                <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me" name = "rememberMe"> Remember me
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>
            </form><!-- /form -->
            <a href="#" class="forgot-password">
                Forgot the password?
            </a>
        </div><!-- /card-container -->
    </div><!-- /container -->