<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="easyui/themes/material/easyui.css"/>
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"/>
<link rel="stylesheet" href="css/wu.css" type="text/css"/>
<style type="text/css">
   #header{
   	    margin:0PX;
   		position: relative;
   		
    	color: #fff;
    	height:60px;
    	
   }
   #header table {
    width: 100%;
    border-spacing: 1;
    border-collapse: collapse;
}
#header table tr {
	background-color: #1475BB;
}
#header table td {
    padding: 10px 0px;
    border-left: 0px solid;
    border-right:0px solid;
}
#header a.title {
    font-weight: bold;
    font-size: 24px;
    text-decoration: none;
    line-height: 30px;
    color: #fff;
}
.my-header{
	overflow: hidden;
	 margin-bottom:0px;
}
.bottomtable {
    width: 100%;
    font-size: 12px;
    background-color: #1475BB;
    color: #fff;
}
</style>
</head>
<body class="easyui-layout">
	<div class="my-header" data-options="region:'north',border:false,split:true"style="height:106px">
    	<div id="header">
    		<table>
    			<tr style="border-bottom:1px solid black;">
    				<td style="width:50px;padding:0px;">
    					<img src="images/main/logo.png" />
    				</td>
    				<td style="width:700px">
    					<a class="title" href="#">物业管理系统</a>
    				</td>
    				<td align="right" style="color:white">
    					<font style="color:white">
    					  2018年3月20日
    					<script type="text/javascript">
                                            // JavaScript Document
                                            function RunGLNL() {
                                                var today = new Date();
                                                var d = new Array("周日", "周一", "周二", "周三", "周四", "周五", "周六");
                                                var DDDD = d[today.getDay()];
                                                DDDD = DDDD + (CnDateofDateStr(today)); //显示农历
                                                document.write(DDDD);
                                            }
                                            function DaysNumberofDate(DateGL) {
                                                return parseInt((Date.parse(DateGL) - Date.parse(DateGL.getFullYear() + "/1/1")) / 86400000) + 1;
                                            }
                                            function CnDateofDate(DateGL) {
                                                var CnData = new Array(
0x16, 0x2a, 0xda, 0x00, 0x83, 0x49, 0xb6, 0x05, 0x0e, 0x64, 0xbb, 0x00, 0x19, 0xb2, 0x5b, 0x00,
0x87, 0x6a, 0x57, 0x04, 0x12, 0x75, 0x2b, 0x00, 0x1d, 0xb6, 0x95, 0x00, 0x8a, 0xad, 0x55, 0x02,
0x15, 0x55, 0xaa, 0x00, 0x82, 0x55, 0x6c, 0x07, 0x0d, 0xc9, 0x76, 0x00, 0x17, 0x64, 0xb7, 0x00,
0x86, 0xe4, 0xae, 0x05, 0x11, 0xea, 0x56, 0x00, 0x1b, 0x6d, 0x2a, 0x00, 0x88, 0x5a, 0xaa, 0x04,
0x14, 0xad, 0x55, 0x00, 0x81, 0xaa, 0xd5, 0x09, 0x0b, 0x52, 0xea, 0x00, 0x16, 0xa9, 0x6d, 0x00,
0x84, 0xa9, 0x5d, 0x06, 0x0f, 0xd4, 0xae, 0x00, 0x1a, 0xea, 0x4d, 0x00, 0x87, 0xba, 0x55, 0x04
);
                                                var CnMonth = new Array();
                                                var CnMonthDays = new Array();
                                                var CnBeginDay;
                                                var LeapMonth;
                                                var Bytes = new Array();
                                                var I;
                                                var CnMonthData;
                                                var DaysCount;
                                                var CnDaysCount;
                                                var ResultMonth;
                                                var ResultDay;
                                                var yyyy = DateGL.getFullYear();
                                                var mm = DateGL.getMonth() + 1;
                                                var dd = DateGL.getDate();
                                                if (yyyy < 100) yyyy += 1900;
                                                if ((yyyy < 1997) || (yyyy > 2020)) {
                                                    return 0;
                                                }
                                                Bytes[0] = CnData[(yyyy - 1997) * 4];
                                                Bytes[1] = CnData[(yyyy - 1997) * 4 + 1];
                                                Bytes[2] = CnData[(yyyy - 1997) * 4 + 2];
                                                Bytes[3] = CnData[(yyyy - 1997) * 4 + 3];
                                                if ((Bytes[0] & 0x80) != 0) { CnMonth[0] = 12; }
                                                else { CnMonth[0] = 11; }
                                                CnBeginDay = (Bytes[0] & 0x7f);
                                                CnMonthData = Bytes[1];
                                                CnMonthData = CnMonthData << 8;
                                                CnMonthData = CnMonthData | Bytes[2];
                                                LeapMonth = Bytes[3];
                                                for (I = 15; I >= 0; I--) {
                                                    CnMonthDays[15 - I] = 29;
                                                    if (((1 << I) & CnMonthData) != 0) {
                                                        CnMonthDays[15 - I]++;
                                                    }
                                                    if (CnMonth[15 - I] == LeapMonth) {
                                                        CnMonth[15 - I + 1] = -LeapMonth;
                                                    }
                                                    else {
                                                        if (CnMonth[15 - I] < 0) { CnMonth[15 - I + 1] = -CnMonth[15 - I] + 1; }
                                                        else { CnMonth[15 - I + 1] = CnMonth[15 - I] + 1; }
                                                        if (CnMonth[15 - I + 1] > 12) { CnMonth[15 - I + 1] = 1; }
                                                    }
                                                }
                                                DaysCount = DaysNumberofDate(DateGL) - 1;
                                                if (DaysCount <= (CnMonthDays[0] - CnBeginDay)) {
                                                    if ((yyyy > 1901) && (CnDateofDate(new Date((yyyy - 1) + "/12/31")) < 0)) {
                                                        ResultMonth = -CnMonth[0];
                                                    }
                                                    else { ResultMonth = CnMonth[0]; }
                                                    ResultDay = CnBeginDay + DaysCount;
                                                }
                                                else {
                                                    CnDaysCount = CnMonthDays[0] - CnBeginDay;
                                                    I = 1;
                                                    while ((CnDaysCount < DaysCount) && (CnDaysCount + CnMonthDays[I] < DaysCount)) {
                                                        CnDaysCount += CnMonthDays[I];
                                                        I++;
                                                    }
                                                    ResultMonth = CnMonth[I];
                                                    ResultDay = DaysCount - CnDaysCount;
                                                }
                                                if (ResultMonth > 0) {
                                                    return ResultMonth * 100 + ResultDay;
                                                }
                                                else { return ResultMonth * 100 - ResultDay; }
                                            }
                                            function CnYearofDate(DateGL) {
                                                var YYYY = DateGL.getFullYear();
                                                var MM = DateGL.getMonth() + 1;
                                                var CnMM = parseInt(Math.abs(CnDateofDate(DateGL)) / 100);
                                                if (YYYY < 100) YYYY += 1900;
                                                if (CnMM > MM) YYYY--;
                                                YYYY -= 1864;
                                                return CnEra(YYYY) + "年";
                                            }
                                            function CnMonthofDate(DateGL) {
                                                var CnMonthStr = new Array("零", "正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "冬", "腊");
                                                var Month;
                                                Month = parseInt(CnDateofDate(DateGL) / 100);
                                                if (Month < 0) { return "闰" + CnMonthStr[-Month] + "月"; }
                                                else { return CnMonthStr[Month] + "月"; }
                                            }
                                            function CnDayofDate(DateGL) {
                                                var CnDayStr = new Array("零",
    "初一", "初二", "初三", "初四", "初五",
    "初六", "初七", "初八", "初九", "初十",
    "十一", "十二", "十三", "十四", "十五",
    "十六", "十七", "十八", "十九", "二十",
    "廿一", "廿二", "廿三", "廿四", "廿五",
    "廿六", "廿七", "廿八", "廿九", "三十");
                                                var Day;
                                                Day = (Math.abs(CnDateofDate(DateGL))) % 100;
                                                return CnDayStr[Day];
                                            }
                                            function DaysNumberofMonth(DateGL) {
                                                var MM1 = DateGL.getFullYear();
                                                MM1 < 100 ? MM1 += 1900 : MM1;
                                                var MM2 = MM1;
                                                MM1 += "/" + (DateGL.getMonth() + 1);
                                                MM2 += "/" + (DateGL.getMonth() + 2);
                                                MM1 += "/1";
                                                MM2 += "/1";
                                                return parseInt((Date.parse(MM2) - Date.parse(MM1)) / 86400000);
                                            }
                                            function CnEra(YYYY) {
                                                var Tiangan = new Array("甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸");
                                                //var Dizhi=new Array("子(鼠)","丑(牛)","寅(虎)","卯(兔)","辰(龙)","巳(蛇)",
                                                //"午(马)","未(羊)","申(猴)","酉(鸡)","戌(狗)","亥(猪)");
                                                var Dizhi = new Array("子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥");
                                                return Tiangan[YYYY % 10] + Dizhi[YYYY % 12];
                                            }
                                            function CnDateofDateStr(DateGL) {
                                                if (CnMonthofDate(DateGL) == "零月") return "　请调整您的计算机日期!";
                                                else return "【农历" + CnMonthofDate(DateGL) + CnDayofDate(DateGL) + "】";
                                            }

                                            function CAL()
                                            { }
                                            RunGLNL();
</script>
</font>
    				</td>
    			</tr>
    		
    			<tr>
    				<td style="width:100px;text-align:center;font-size:14px; color: rgb(255, 255, 0);">您好,王冰</td>
    				<td style="color:white"></td>
    				<td align="right" style="color:white;padding:10px 40px">
    					<a id="btn"  href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">注销退出</a>
    				</td>
    			</tr>
    		</table>
    	</div>
    </div>
    <div data-options="region:'south',split:true" style="height:30px;">
    	<div>
    		<table class="bottomtable">
                                <tbody><tr>
                                    <td>&nbsp;<span id="RegionPanel1_bottomPanel_ctl00_lblBottom">所属公司：北京测试集团有限责任公司&nbsp;&nbsp;&nbsp;&nbsp;部门：海淀子公司&nbsp;&nbsp;&nbsp;&nbsp;职位：部门经理&nbsp;&nbsp;&nbsp;&nbsp;角色：物业住宅版角色&nbsp;&nbsp;&nbsp;&nbsp;登录时间：2018-03-20 23:23:44</span>
                                    </td>
                                </tr>
                            </tbody></table>
    	</div>
    </div>
    <div data-options="region:'west',title:'系统菜单',split:true" style="width:200px;">
    	<div class="easyui-accordion" data-options="border:false,fit:true"> 
		       		<div title="用户管理">
		       			<ul class="easyui-tree wu-side-tree">
		       				<li iconCls="icon-tip"><a href="javascript:void(0)" data-icon="icon-tip" data-link="user/add" iframe="1">图书管理</a></li>
		       			</ul>
		       		</div>
		       		<div title="用户管理">
		       			<ul class="easyui-tree wu-side-tree">
		       				<li iconCls="icon-tip"><a href="javascript:void(0)" data-icon="icon-tip" data-link="user/add" iframe="1">图书管理</a></li>
		       			</ul>
		       		</div>
		       		<div title="用户管理">
		       			<ul class="easyui-tree wu-side-tree">
		       				<li iconCls="icon-tip"><a href="javascript:void(0)" data-icon="icon-tip" data-link="user/add" iframe="1">图书管理</a></li>
		       			</ul>
		       		</div>
        </div>
    </div>
     <div data-options="region:'center'," style="padding:5px;background:#eee;">
     	 <div id="wu-tabs" class="easyui-tabs" data-options="border:false,fit:true">  
            <div title="首页" data-options="closable:false,iconCls:'icon-tip',cls:'pd3'"></div>
        </div>
     </div>
    <script type="text/javascript">
		$(function(){
			$('.wu-side-tree a').bind("click",function(){
				var title = $(this).text();
				var url = $(this).attr('data-link');
				var iconCls = $(this).attr('data-icon');
				var iframe = $(this).attr('iframe')==1?true:false;
				addTab(title,url,iconCls,iframe);
			});	
		})
		
		/**
		* Name 载入树形菜单 
		*/
		$('#wu-side-tree').tree({
			url:'temp/menu.php',
			cache:false,
			onClick:function(node){
				var url = node.attributes['url'];
				if(url==null || url == ""){
					return false;
				}
				else{
					addTab(node.text, url, '', node.attributes['iframe']);
				}
			}
		});
		
		/**
		* Name 选项卡初始化
		*/
		$('#wu-tabs').tabs({
			tools:[{
				iconCls:'icon-reload',
				border:false,
				handler:function(){
					$('#wu-datagrid').datagrid('reload');
				}
			}]
		});	
		/**
		* Name 添加菜单选项
		* Param title 名称
		* Param href 链接
		* Param iconCls 图标样式
		* Param iframe 链接跳转方式（true为iframe，false为href）
		*/	
		function addTab(title, href, iconCls, iframe){
			var tabPanel = $('#wu-tabs');
			if(!tabPanel.tabs('exists',title)){
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+ href +'" style="width:100%;height:100%;"></iframe>';
				if(iframe){
					tabPanel.tabs('add',{
						title:title,
						content:content,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
				else{
					tabPanel.tabs('add',{
						title:title,
						href:href,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
			}
			else
			{
				tabPanel.tabs('select',title);
			}
		}
		/**
		* Name 移除菜单选项
		*/
		function removeTab(){
			var tabPanel = $('#wu-tabs');
			var tab = tabPanel.tabs('getSelected');
			if (tab){
				var index = tabPanel.tabs('getTabIndex', tab);
				tabPanel.tabs('close', index);
			}
		}
	</script>
</body>
</html>