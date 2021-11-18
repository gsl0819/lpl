<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/index.css"/>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/jquery.datetimepicker.css"/>
		<script src="bootstrap-3.3.7-dist/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		<div id="top">
			<div id="top-left">
				<img src="img/logo-public.png" align="center">
				<img src="img/logolpl.png" align="center">
			</div>
			<div id="top-right">
<!-- 			<div id="top-right-left">
					<img src="img/icon-search.png" id="img"/>
				</div>
				 -->
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
				<div class="one">
					<h2><a href="MatchYGServlet" target="kuang">赛事预告</a></h2>
					</div>
				<div class="one">
					<h2><a href="ShowMatchsServlet" target="kuang">赛事查询</a></h2>
				</div>
				<div class="one">
					<h2><a href="ShowClubsServlet" target="kuang">战队查询</a></h2>
				</div>
				<div class="one">
					<h2><a href="ShowPlayersServlet" target="kuang">队员查询</a></h2>
				</div>	
			</div>
			<div id="down-right">
				<!-- 内容框架 -->
				<iframe class="content" src="MatchYGServlet" name="kuang"></iframe>
			</div>
		</div>
	</body>
</html>
