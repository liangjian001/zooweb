<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
String sessionID = session.getId();
%>
<!DOCTYPE html>
<html lang="cn">
<base href="<%=basePath%>">

<!-- Meta -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="测试" />
<meta name="description" content="测试" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<!-- 如果安装了GCF，则使用GCF来渲染页面，如果为安装GCF，则使用最高版本的IE内核进行渲染  -->
<!-- End of Meta -->

<title>测试系统</title>

<script type="text/javascript" src="./js/lib/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="./js/lib/jquery.easyui.min.js"></script>
<script type="text/javascript" src="./js/lib/easyui-lang-zh_CN.js"></script>

 <script type="text/javascript">
 var basePath = '<%=basePath%>';
 var sessionID = '<%=sessionID%>';
</script> 


<!-- End of Libraries -->