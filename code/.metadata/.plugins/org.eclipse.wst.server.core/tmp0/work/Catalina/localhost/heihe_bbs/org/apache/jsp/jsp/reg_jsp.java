/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.61
 * Generated at: 2017-11-07 03:21:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>注册</title>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("  <meta name=\"keywords\" content=\"fly,layui,前端社区\">\r\n");
      out.write("  <meta name=\"description\" content=\"Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/layui/css/layui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/css/global.css\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.red{\r\n");
      out.write("\t\tcolor:red;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\twindow.onload = function()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar email = document.getElementById('L_email');\r\n");
      out.write("\t\t\tvar msg = document.getElementById('msg'); \r\n");
      out.write("\t\t\temail.onblur = function()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\t//alert('leave')\r\n");
      out.write("\t\t\t\t//向服务器发起ajax请求，验证用户输入的用户名是否存在\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar request = new XMLHttpRequest();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trequest.open(\"get\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkuser.do?email=\"+email.value,true);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trequest.send();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trequest.onreadystatechange = function()\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif(request.readyState === 4)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tif(request.status === 200)\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tif(request.responseText==0)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg.innerHTML = \"恭喜，可以注册\";\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg.innerHTML = \"用户名已存在\";\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("  <div class=\"main\">\r\n");
      out.write("    <a class=\"logo\" href=\"/\" title=\"Fly\">Fly社区</a>\r\n");
      out.write("    <div class=\"nav\">\r\n");
      out.write("      <a class=\"nav-this\" href=\"index.html\">\r\n");
      out.write("        <i class=\"iconfont icon-wenda\"></i>问答\r\n");
      out.write("      </a>\r\n");
      out.write("      <a href=\"http://www.layui.com/\" target=\"_blank\">\r\n");
      out.write("        <i class=\"iconfont icon-ui\"></i>框架\r\n");
      out.write("      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"nav-user\">      \r\n");
      out.write("      <!-- 登入后的状态 -->\r\n");
      out.write("      \r\n");
      out.write("      <a class=\"avatar\" href=\"../user/index.html\">\r\n");
      out.write("        <img src=\"http://tp4.sinaimg.cn/1345566427/180/5730976522/0\">\r\n");
      out.write("        <cite>贤心</cite>\r\n");
      out.write("        <i>VIP2</i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"nav\">\r\n");
      out.write("        <a href=\"../user/set.html\"><i class=\"iconfont icon-shezhi\"></i>设置</a>\r\n");
      out.write("        <a href=\"\"><i class=\"iconfont icon-tuichu\" style=\"top: 0; font-size: 22px;\"></i>退了</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"main layui-clear\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"fly-panel fly-panel-user\" pad20>\r\n");
      out.write("    <div class=\"layui-tab layui-tab-brief\">\r\n");
      out.write("      <ul class=\"layui-tab-title\">\r\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/login.jsp\">登入</a></li>\r\n");
      out.write("        <li class=\"layui-this\">注册</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <div class=\"layui-form layui-tab-content\" id=\"LAY_ucm\" style=\"padding: 20px 0;\">\r\n");
      out.write("        <div class=\"layui-tab-item layui-show\">\r\n");
      out.write("          <div class=\"layui-form layui-form-pane\">\r\n");
      out.write("            <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/reg.do\">\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_email\" class=\"layui-form-label\">邮箱</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"text\" id=\"L_email\" name=\"email\" required lay-verify=\"email\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"layui-form-mid layui-word-aux\">将会成为您唯一的登入名</div>\r\n");
      out.write("                 <div class=\"layui-form-mid layui-word-aux red\" id=\"msg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_username\" class=\"layui-form-label\">昵称</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"text\" id=\"L_username\" name=\"username\" required lay-verify=\"required\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_pass\" class=\"layui-form-label\">密码</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"password\" id=\"L_pass\" name=\"pass\" required lay-verify=\"required\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"layui-form-mid layui-word-aux\">6到16个字符</div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_repass\" class=\"layui-form-label\">确认密码</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"password\" id=\"L_repass\" name=\"repass\" required lay-verify=\"required\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("             <!--  <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_vercode\" class=\"layui-form-label\">人类验证</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"text\" id=\"L_vercode\" name=\"vercode\" required lay-verify=\"required\" placeholder=\"请回答后面的问题\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"layui-form-mid\">\r\n");
      out.write("                  <span style=\"color: #c00;\">{{d.vercode}}</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div> -->\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <button class=\"layui-btn\" lay-filter=\"*\" lay-submit>立即注册</button>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item fly-form-app\">\r\n");
      out.write("                <span>或者直接使用社交账号快捷注册</span>\r\n");
      out.write("                <a href=\"http://fly.layui.com:8098/app/qq\" onclick=\"layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})\" class=\"iconfont icon-qq\" title=\"QQ登入\"></a>\r\n");
      out.write("                <a href=\"http://fly.layui.com:8098/app/weibo/\" onclick=\"layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})\" class=\"iconfont icon-weibo\" title=\"微博登入\"></a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("  <p><a href=\"http://fly.layui.com/\">Fly社区</a> 2017 &copy; <a href=\"http://www.layui.com/\">layui.com</a></p>\r\n");
      out.write("  <p>\r\n");
      out.write("    <a href=\"http://fly.layui.com/auth/get\" target=\"_blank\">产品授权</a>\r\n");
      out.write("    <a href=\"http://fly.layui.com/jie/8157.html\" target=\"_blank\">获取Fly社区模版</a>\r\n");
      out.write("    <a href=\"http://fly.layui.com/jie/2461.html\" target=\"_blank\">微信公众号</a>\r\n");
      out.write("  </p>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"../../res/layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("layui.cache.page = 'user';\r\n");
      out.write("layui.cache.user = {\r\n");
      out.write("  username: '游客'\r\n");
      out.write("  ,uid: -1\r\n");
      out.write("  ,avatar: '../../res/images/avatar/00.jpg'\r\n");
      out.write("  ,experience: 83\r\n");
      out.write("  ,sex: '男'\r\n");
      out.write("};\r\n");
      out.write("layui.config({\r\n");
      out.write("  version: \"2.0.0\"\r\n");
      out.write("  ,base: '../../res/mods/'\r\n");
      out.write("}).extend({\r\n");
      out.write("  fly: 'index'\r\n");
      out.write("}).use('fly');\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
