<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.*,com.bhu.lpl.vo.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<form method="post" action="AddMatServlet">
			<fieldset>
				<legend>添加赛事</legend>
			主场战队：<input type="text" placeholder="请输入主场战队" name="hometeam" /><br/>
			客场战队：<input type="text" placeholder="请输入客场战队" name="awayteam" /><br/>
			开始时间：<input type="text" placeholder="请输入开始时间" name="starttime" /><br/>
			结束时间：<input type="text" placeholder="请输入结束时间" name="endtime" /><br/>
			比赛结果：<input type="text" placeholder="请输入比赛结果" name="result" /><br/>
			视频地址：<input type="text" placeholder="请输入视频地址" name="video" /><br/>
			<input type="submit" name="提交"></fieldset>
		</form>
	</body>
</html>