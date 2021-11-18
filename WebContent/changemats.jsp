<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.bhu.lpl.vo.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/jquery.datetimepicker.css"/>
		<script src="bootstrap-3.3.7-dist/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
		<style type="text/css">
			form #employeename{
				width: 30%;
				display: inline-block;
			}
			#top{
				margin-top: 20px;
			}
		</style>
	</head>
	<body>
		这是修改页面
		<form action="#" method="post" id="top">
			检索员工：
			<input type="text" class="form-control" id="employeename" placeholder="请输入名字" />
			<input type="submit" class="btn btn-warning" />
		</form>
		<%List<Match> plalist = (ArrayList<Match>)request.getAttribute("plalist");
		  String player = (String)request.getAttribute("Playerid");
		  int playerid = Integer.parseInt(player);
		%>
		<div class="table-responsive">
			<table class="table">
				<caption>队员信息</caption>
				<thead>
					<tr>
						<th>战队编号</th>
						<th>主场战队</th>
						<th>客场战队</th>
						<th>开始时间</th>
						<th>结束时间</th>
						<th>比赛结果</th>
						<th>比赛视频</th>
					</tr>
				</thead>
				<form action="UpdateMatchServlet" method="post">
				<tbody>
				<%for(Match mat:plalist){ %>
					<tr class="danger">
					<% 
		      		if(mat.getMatchid() == playerid){%>
		    	 	<td><%=mat.getMatchid() %></td>
			        <td><input value="<%=mat.getHometeam() %>" name="hometeam"/></td>
			        <td><input value="<%=mat.getAwayteam() %>" name="awayteam"/></td>
					<td><input value="<%=mat.getStarttime() %>" name="starttime"/></td>
					<td><input value="<%=mat.getEndtime() %>" name="endtime"/></td>
					<td><input value="<%=mat.getResult() %>" name="result"/></td>
					<td><input value="<%=mat.getVideo() %>" name="video"/></td>
						<input type="hidden" value="<%=mat.getMatchid() %>" name="matchid"/>
					</td>
					<% }else{ %>
		       			 <td><%=mat.getMatchid() %></td>
						<td><%=mat.getHometeam() %></td>
						<td><%=mat.getAwayteam() %></td>
						<td><%=mat.getStarttime() %></td>
						<td><%=mat.getEndtime() %></td>
						<td><%=mat.getResult() %></td>
						<td><%=mat.getVideo() %></td>
					<%} %>
						<td>
							<input type="submit" class="btn btn-success" value="确定"/>
						</td>
					</tr>
					<%} %>
				</tbody>
			</table>
		</div>
	</body>
</html>
