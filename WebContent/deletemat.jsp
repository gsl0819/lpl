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
			form #Playername{
				width: 30%;
				display: inline-block;
			}
			#top{
				margin-top: 20px;
			}
		</style>
	</head>
	<body>
		<%List<Match> matlist = (ArrayList<Match>)request.getAttribute("matlist");%>
		<div class="table-responsive">
			<table class="table">
				<caption>比赛信息</caption>
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
				<tbody>
				<%for(Match mat:matlist){ %>
					<tr class="danger">
						<td><%=mat.getMatchid() %></td>
						<td><%=mat.getHometeam() %></td>
						<td><%=mat.getAwayteam() %></td>
						<td><%=mat.getStarttime() %></td>
						<td><%=mat.getEndtime() %></td>
						<td><%=mat.getResult() %></td>
						<td><%=mat.getVideo() %></td>
						<td>
							<button type="button" class="btn btn-danger">
							<a href="DeleteMatServlet?matchid=<%=mat.getMatchid() %>">删除</a>
							</button>
						</td>
					</tr>
					<%} %>
				</tbody>
			</table>
		</div>
	</body>
</html>