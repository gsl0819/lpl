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
			form #Clubname{
				width: 30%;
				display: inline-block;
			}
			#top{
				margin-top: 20px;
			}
		</style>
	</head>
	<body>
		<%List<Club> clublist = (ArrayList<Club>)request.getAttribute("clublist");%>
		<div class="table-responsive">
			<table class="table">
				<caption>战队信息</caption>
				<thead>
					<tr>
						<th>编号</th>
						<th>名称</th>
					</tr>
				</thead>
				<tbody>
				<%for(Club club:clublist){ %>
					<tr class="danger">
						<td><%=club.getClubid() %></td>
						<td><%=club.getClubname() %></td>
					</tr>
					<%} %>
				</tbody>
			</table>
		</div>
	</body>
</html>
