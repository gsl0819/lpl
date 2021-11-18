<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/admin.css"/>
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
				<!-- <div id="top-right-left">
					<img src="img/icon-search.png" id="img"/>
				</div> -->
				<div id="top-right-right">
					<a href=""><img src="img/admin.png" align="center"></a>
				</div>
			</div>
		</div>
		<div id="main">
			<div id="left">
				<div class="one">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<h3 class="panel-title">
								<a href="#">赛事管理</a>
							</h3>
						</div>
						<div class="panel-body">
							<ul>
								<li><a href="javascript:window.location.href='addMat.jsp'" target="kuang">增加赛事</a></li>
								<li><a href=ShowMatDeleteServlet target="kuang">删除赛事</a></li>
								<li><a href=ShowMatUpdateServlet target="kuang">修改赛事</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="one">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<h3 class="panel-title">
								<a href="#">队员管理</a>
							</h3>
						</div>
						<div class="panel-body">
							<ul>
								<li><a href="AddPlayerServlet" target="kuang">增加队员</a></li>
								<li><a href="ShowPlayersDeleteServlet" target="kuang">删除队员</a></li>
								<li><a href="ShowPlayerXGServlet" target="kuang">修改队员</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="one">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<h3 class="panel-title">
								<a href="#">战队管理</a>
							</h3>
						</div>
						<div class="panel-body">
							<ul>
								<li>增加战队</li>
								<li>删除战队</li>
								<li>修改战队</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div id="main-right">
				<!-- 内容框架 -->
				<iframe class="content" src="default.jsp" name="kuang"></iframe>
			</div>
		</div>
	</body>
</html>
