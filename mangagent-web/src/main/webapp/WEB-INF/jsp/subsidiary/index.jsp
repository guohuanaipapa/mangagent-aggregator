<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>子公司查询</title>        
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">    
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  
  <link rel="stylesheet" type="text/css" href="easyui/themes/material/easyui.css"/>
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"/>
  
 <script type="text/javascript" src="easyui/jquery.min.js"></script>
 <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
 
 </head>
<body class="main">
	
	<style>
 		.form-item{
 			text-align: right;
 		}
	</style>
	
	

	<form action="" id="form1" >
 	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="form">
        <tbody>
	        <tr>
	            <td width="20%" class="form-item">
	                <font color="red">*</font>企业编码：
	            </td>
	            <td width="30%">
	                <input name="coId" type="text" value="" maxlength="10" id="coId" disabled="disabled" class="aspNetDisabled mytext" style="width:90%;">
	            </td>
	            <td width="20%" class="form-item">
	                <font color="red">*</font>企业品牌：
	            </td>
	            <td width="30%">
	                <input name="coBrand" type="text" value="" maxlength="10" id="coBrand" class="mytext" style="width:90%;">
	            </td>
	        </tr>
        <tr>
            <td class="form-item">
                <font color="red">*</font>企业全称：
            </td>
            <td colspan="3">
                <input name="coName" type="text" value="" id="coName" class="mytext" style="width:96%;">
            </td>
        </tr>
        <tr>
            <td class="form-item">
                <font color="red">*</font>企业简称：
            </td>
            <td>
                <input name="coIntroduction" type="text" value="" id="coIntroduction" class="mytext" style="width:90%;">
            </td>
            <td class="form-item">英文名称：
            </td>
            <td>
                <input name="englistName" type="text" value="" id="englistName" class="mytext" style="width:90%;">
            </td>
        </tr>
        <tr>
            <td class="form-item">企业类型：
            </td>
            <td>
                <input name="coType" type="text" value="" id="coType" class="mytext" style="width:90%;">
            </td>
            <!-- <td class="form-item">所属行业：
            </td>
            <td>
                <input name="sshy" type="text" value="IT" id="sshy" class="mytext" style="width:90%;">
            </td> -->
        </tr>
        <tr>
            <td class="form-item">公司地址：
            </td>
            <td>
                <input name="coAddress" type="text" value="" id="dz" class="mytext" style="width:90%;">
            </td>
            <td class="form-item">邮政编码：
            </td>
            <td>
                <input name="postalNumber" type="text" maxlength="6" id="postalNumber" class="mytext" style="width:90%;">
            </td>
        </tr>
        <tr>
            <td class="form-item">公司电话：
            </td>
            <td>
                <input name="coPhone" type="text" value="" id=""coPhone"" class="mytext" style="width:90%;">
            </td>
            <td class="form-item">传真号码：
            </td>
            <td>
                <input name="faxNumber" type="text" id="faxNumber" class="mytext" style="width:90%;">
            </td>
        </tr>
        <tr>
            <td class="form-item">公司网站：
            </td>
            <td>
                <input name="coWebsite" type="text" value="" id="coWebsite" class="mytext" style="width:90%;">
            </td>
            <td class="form-item">电子邮箱：
            </td>
            <td>
                <input name="email" type="text" value="" id="email" class="mytext" style="width:90%;">
            </td>
        </tr>
        <tr>
            <td class="form-item">法人代表：
            </td>
            <td>
                <input name="leganperson" type="text" id="leganperson" class="mytext" style="width:90%;">
            </td>
            <td class="form-item">注册时间：
            </td>
            <td>
                <input name="registrationTime" type="text" value="" id="registrationTime" class="mytext" onclick="SelectDate(this,'yyyy-MM-dd')" style="width:90%;">
            </td>
        </tr>
        <tr>
            <td class="form-item">注册资金：
            </td>
            <td>
                <input name="registrationMoney" type="text" value="" id="registrationMoney" class="mytext" style="width:90%;">
            </td>
            <td class="form-item">员工人数：
            </td>
            <td>
                <input name="number" type="text" value="" id="number" class="mytext" style="width:90%;">
            </td>
        </tr>
        <tr>
            <td class="form-item">国税号：
            </td>
            <td>
                <input name="taxNumber" type="text" id="taxNumber" class="mytext" style="width:90%;">
            </td>
            <!-- <td class="form-item">地税号：
            </td>
            <td>
                <input name="dsh" type="text" id="dsh" class="mytext" style="width:90%;">
            </td> -->
        </tr>
        <tr>
            <td class="form-item">开户银行：
            </td>
            <td>
                <input name="openingBank" type="text" id="openingBank" class="mytext" style="width:90%;">
            </td>
            <td class="form-item">银行帐号：
            </td>
            <td>
                <input name="bankNumber" type="text" id="bankNumber" class="mytext" style="width:90%;">
            </td>
        </tr>
        <tr>
            <td class="form-item">企业简介：
            </td>
            <td colspan="3">
                <textarea name="qyjj" rows="2" cols="20" id="qyjj" class="mytext" style="width:96%;">
                	不好意思，数据库里没有这一列
                </textarea>
            </td>
        </tr>
    </tbody>
   </table> 
   </form>
   
   <table id="sub" style="width:100%; height:100px" 
   		data-options="url:'subsidiary/getAll',fitColumns:true,singleSelect:true,
   			 striped:true,rownumbers:true
   		"
   >
   		<thead>
   		
   			<tr>
   				<th data-options="field:'subId',width:100,">公司编号</th>
   				<th data-options="field:'subName',width:100,formatter:subName">公司名称</th>
   				<th data-options="field:'phone',width:100,">公司电话</th>
   				<th data-options="field:'fax',width:100,">公司传真</th>
   				<th data-options="field:'subAddress',width:100,">公司地址</th>
   			</tr>
   		</thead>
   </table>
   
   <script type="text/javascript"> 
		$(function(){
			$("#form1").form("load","subsidiary/getByOne"); 
			
			$("#sub").datagrid({
				 title:"子公司列表"
			});
			
		});
		
		function subName(index,row,value){
			return "<a href='javaScript:void(0)' onclick='getSub("+row.subId+")' style='text-decoration: none;color:#157FCC;'>"+row.subName+"</a>";
		}
		
		
		/* 打开所选择的子公司 */
		/* function getSub(index){
			 //先写一个div
			 var temp=$("<div></div>").appendTo("body");
			 temp.dialog({
				 title:"旗下子公司信息维护",
				 iconCls:"icon-edit",
				 width:500,
				 height:300,
				 modal:true;
			 	 href:"subsidiary/getSub/"+index,
			 	 onClonse:function(){$(this).dialog("destroy");},
			 	 button:[
			 		 {
				 		 iconCls:"icon-ok"
				 		 text:"确定",
				 		 handler:function(){
				 			 
				 		 }
			 	 	},{
			 			 iconCls:"icon-cancel",
			 			 text:"取消",
			 			 handler:function(){
			 				 temp.dialog("close");
			 			 }
		 		 	}
			 	 ]
			 })
		} */
		
	</script>
   
</body>
</html>