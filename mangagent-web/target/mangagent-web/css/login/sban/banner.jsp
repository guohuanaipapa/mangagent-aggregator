<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wowslider-container1">
	<div class="ws_images"><ul>
<li><img src="data1/images/banner1.jpg" alt="banner1" title="banner1" id="wows1_0"/></li>
<li><img src="data1/images/banner2.jpg" alt="banner2" title="banner2" id="wows1_1"/></li>
<li><img src="data1/images/banner3.jpg" alt="banner3" title="banner3" id="wows1_2"/></li>
</ul></div>
<div class="ws_bullets"><div>
<a href="#" title="banner1">1</a>
<a href="#" title="banner2">2</a>
<a href="#" title="banner3">3</a>
</div></div>
	</div>
	<script type="text/javascript" src="engine1/wowslider.js"></script>
	<script type="text/javascript" src="engine1/script.js"></script>
	<!-- End WOWSlider.com BODY section -->
</body>
</html>