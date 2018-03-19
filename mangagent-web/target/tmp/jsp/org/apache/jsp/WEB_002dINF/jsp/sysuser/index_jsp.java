/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.0.M1
 * Generated at: 2018-03-19 07:12:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.sysuser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<script type=\"text/javascript\" src=\"easyui/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"easyui/jquery.easyui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"easyui/locale/easyui-lang-zh_CN.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/material/easyui.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/icon.css\"/>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$(\"#userTable\").datagrid({\n");
      out.write("\t\t\tpagination : true\n");
      out.write("\t\t});\n");
      out.write("\t})\n");
      out.write("\t\n");
      out.write("\tfunction roleFormatter(value,row,index){\n");
      out.write("\t\tif(value.length == 0){\n");
      out.write("\t\t\treturn \"-\";\n");
      out.write("\t\t}\n");
      out.write("\t\tvar str = \"\";\n");
      out.write("\t\tfor(var i = 0; i < value.length; i++){\n");
      out.write("\t\t\tstr += value[i].name;\n");
      out.write("\t\t\tif(i < value.length -1){\n");
      out.write("\t\t\t\tstr += \", \";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\treturn str;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction setCondition(){\n");
      out.write("\t\tvar postData = {username : $(\"#username\").val()};\n");
      out.write("\t\tvar ids = $(\"#roles\").combobox(\"getValues\");\n");
      out.write("\t\tfor(var i = 0; i < ids.length ; i++){\n");
      out.write("\t\t\tpostData[\"sysRoles[\"+i+\"].id\"] = ids[i];\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#userTable\").datagrid(\"reload\",postData);\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"easyui-panel\" title=\"设置查询条件\" style=\"padding:15px 10px;\">\n");
      out.write("\tusername : <input type=\"text\" name=\"\" id=\"username\" />\n");
      out.write("\troles : \n");
      out.write("\t<input id=\"roles\" class=\"easyui-combobox\" name=\"dept\"\n");
      out.write("    \t\tdata-options=\"valueField:'id',textField:'name',url:'role/all',panelHeight:'auto',panelMaxHeight:250,multiple:true\">\n");
      out.write("\t<a id=\"btn\" href=\"javascript:void(0)\" onclick=\"setCondition();\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">Search</a>\n");
      out.write("\t<a id=\"btn\" href=\"javascript:void(0)\" onclick=\"resetCondition()\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-undo'\">Reset</a>\n");
      out.write("</div>\n");
      out.write("<table id=\"userTable\"  title=\"User List\"\n");
      out.write("        data-options=\"url:'user/list',fitColumns:true,striped:true,rownumbers:true,iconCls:'icon-search'\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("        \t\t<th data-options=\"field:'tyu',checkbox:true\"></th>\n");
      out.write("        \t\t<th data-options=\"field:'id',width:30,sortable:true,order:'desc'\">Id</th>\n");
      out.write("            <th data-options=\"field:'username',width:100,sortable:true\">Username</th>\n");
      out.write("            <th data-options=\"field:'password',width:200\">Password</th>\n");
      out.write("            <th data-options=\"field:'salt',width:100\">Salt</th>\n");
      out.write("            <th data-options=\"field:'sysRoles',width:120,formatter:roleFormatter\">Roles</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}