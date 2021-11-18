<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!-- 常见充重置样式表 -->
    <link rel="stylesheet" href="css/meyer.css">
    <!-- 自己写的样式 -->
    <link rel="stylesheet" href="css/popup.css">
    <!-- 针对表单元素的样式 -->
    <link rel="stylesheet" href="css/myform.css">
    <link rel="stylesheet" type="text/css" href="css/index.css"/>
</head>
<body>
 <div id="top">
			<div id="top-left">
				<img src="img/logo-public.png" align="center">
				<img src="img/logolpl.png" align="center">
			</div>
			<div id="top-right">
				<div id="top-right-left">
					<img src="img/icon-search.png" id="img"/>
				</div>
				<div id="top-right-right">
					<a href="javascript:window.location.href='login.jsp'"><img src="img/admin.png" align="center"></a>
				</div>
			</div>
		</div>
		<div id="main">
			<img src="img/main.png" id="imgmain"/>
		</div>
		<div id="down">
			<div id="down-left">
				<div class="one"><h2>赛事预告</h2></div>
				<div class="one"><h2>赛事查询</h2></div>
				<div class="one">
					<h2><a href="ShowClubsServlet" target="kuang">战队查询</a></h2>
				</div>
				<div class="one">
					<h2><a href="ShowPlayersServlet" target="kuang">队员查询</a></h2>
				</div>	
			</div>
			<div id="down-right">
				<!-- 内容框架 -->
				<iframe class="content" src="default.jsp" name="kuang"></iframe>
			</div>
		</div>
    <!-- 遮罩层 -->
    <div class="modal">
        <div class="container">
            <!-- 登录 -->
            <div class="login-top-img">

            </div>
            <div class="login-bottom clearfix">
                <div class="left">
                    <img src="img/login-left.png" alt="">
                </div>
                <div class="center">
                    <form name="form1" method="POST" action="LoginServlet" >
                        <input type="text" class="name" name="name">
                        <input type="password" class="password" name="password">
                        <p class="radio-item">
                            <label class="remember">
                                    <input type="checkbox" name="remember">
                                    <span>记住密码</span>
                            </label>
                            <label class="auto">
                                    <input type="checkbox" name="auto">
                                    <span>自动登录</span>
                            </label>
                        </p>
                        <input type="submit" value="登录" class="submit">
                    </form>
                </div>
       <!--     <div class="right">
                    <div class="register">
                        <a href="">注册账号</a>
                    </div>
                    <div class="get-back-password">
                        <a href="">找回密码</a>
                    </div>
                </div>
         -->
            </div>
            <!-- 关闭 -->
            <div class="close">
               <a href="javascript:window.location.href='index.jsp'"> X </a>
            </div>
        </div>
    </div>

</body>
</html>