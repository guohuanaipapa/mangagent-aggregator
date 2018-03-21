<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<base href="<%=basePath%>">
<head>
<link href="css/login/login.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="web">
<p style="height:180px;"></p>
<p align="center"><img src="images/login/logzi.png" /></p>
<p style="height:40px;"></p>
<div class="login">
   <div class="banner"style="background:url(../../images/login/banner1.jpg) no-repeat; margin:0px auto;">
  
   </div>
   <div class="logmain">
      <h1>&nbsp;</h1>
     <form id="form1" action="admin/login" method="post">
      <div class="logdv">
         <span class="logzi">用户名：</span>
        <input name="username" type="text" id="userName" class="ipt" />
      </div>
      <div class="logdv">
      <span class="logzi">密 码：</span>
        <input name="password" type="passWord" id="textarea" class="ipt" />
      </div>
      <div class="logdv">
        <p class="logzi">&nbsp;</p>
        <a href="#" class="more">忘记密码</a>
        <input name="" type="checkbox" value=""  class="cex"/>记住密码
      </div>
      <div class="logdv" style="height:40px;">
        <p class="logzi">&nbsp;</p>    
        <input name="提交" type="submit" class="btnbg" value="点击登录" />
      </div>
       </form> 
      <div>
        <a href="#" class="more">注册</a>
      </div>
   </div>
  
</div>
<p style="height:100px;"></p>
<p align="center">技术支持:xxxxxxxxxx</p>
</div>
</body>
</html>