<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.*,com.bhu.lpl.vo.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<form method="post" action="AddPlayersServlet">
			<fieldset>
				<legend>注册队员</legend>
			姓名：<input type="text" placeholder="请输入姓名" name="playername" /><br/>
			年龄：<input type="text" placeholder="请输入年龄" name="playerage" /><br/>
			<%List<Club> clublist = (ArrayList<Club>)request.getAttribute("clublist"); %>
			俱乐部：<select name="club"><br />
				<%for(Club club:clublist){ %>
					<option value="<%=club.getClubid() %>"><%=club.getClubname() %></option>
				<%} %>
			</select><br />
			员工位置：<select name="role">
				<option value="1">上单</option>
				<option value="2">打野</option>
				<option value="3">中单</option>
				<option value="4">射手</option>
				<option value="5">辅助</option>	
			</select><br/>
			<input type="submit" name="提交"></fieldset>
		</form>
	</body>
</html>