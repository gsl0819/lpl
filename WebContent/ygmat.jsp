<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.bhu.lpl.vo.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/yg.css"/>
	</head>
	<body>
		<%Match mat = (Match)request.getAttribute("mat");%>
		<div id="main">
			<div id="left">
				<img src="img/<%=mat.getHometeam() %>.png" id="img1" align="center">
			</div>
			<span id="vs">VS</span>
			<div id="right">
				<img src="img/<%=mat.getAwayteam() %>.png" id="img2" align="center">
			</div>
			<p>比赛时间：<%=mat.getStarttime() %></p>
		</div>
	</body>
</html>
