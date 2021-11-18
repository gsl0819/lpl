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
		<form action="#" method="post" id="top">
			检索队员：
			<input type="text" class="form-control" id="Playername" placeholder="请输入名字" />
			<input type="submit" class="btn btn-warning" />
		</form>
		<%List<Player> plalist = (ArrayList<Player>)request.getAttribute("plalist");%>
		<div class="table-responsive">
			<table class="table">
				<caption>队员信息</caption>
				<thead>
					<tr>
						<th>编号</th>
						<th>姓名</th>
						<th>年龄</th>
						<th>战队</th>
						<th>位置</th>
					</tr>
				</thead>
				<tbody>
				<%for(Player pla:plalist){ %>
					<tr class="danger">
						<td><%=pla.getPlayerid() %></td>
						<td><%=pla.getPlayername() %></td>
						<td><%=pla.getPlayerage() %></td>
						<td><%=pla.getClubid()%></td>
						<%if(pla.getRole()==1){ %>
							<td>上单</td>
						<%}else if(pla.getRole()==2){ %>
							<td>打野</td>
						<%}else if(pla.getRole()==3){ %>
							<td>中单</td>
						<%}else if(pla.getRole()==4){ %>
							<td>射手</td>
						<%}else{ %>
							<td>辅助</td>
						<%} %>
						<td>
							<button type="button" class="btn btn-success">
								<a href="ShowPlayersServlet?Playerid=<%=pla.getPlayerid()%>">
								编辑
								</a>
							</button>
						</td>
					</tr>
					<%} %>
				</tbody>
			</table>
		</div>
	</body>
</html>