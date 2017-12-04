<%@ include file="/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="./js/page/user/userInfo.js"></script>
    <title>用户管理</title>
</head>
<body>
<h2>用户管理</h2>
<h2><a href="<%=basePath %>user/index.shtml">返回首页</a></h2>
<h2><a href="#" onclick="httpGet('1230021')">获取用户(REST)</a></h2
<h2><a href="#" onclick="httpPost()">添加用户(REST)</a></h2>
</body>
</html>
