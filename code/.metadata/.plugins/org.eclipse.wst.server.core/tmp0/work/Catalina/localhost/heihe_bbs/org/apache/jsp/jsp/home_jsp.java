/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.61
 * Generated at: 2017-11-02 07:24:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>基于 layui 的极简社区页面模版</title>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("  <meta name=\"keywords\" content=\"fly,layui,前端社区\">\r\n");
      out.write("  <meta name=\"description\" content=\"Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/layui/css/layui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/css/global.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("  <div class=\"main\">\r\n");
      out.write("    <a class=\"logo\" href=\"/\" title=\"Fly\">Fly社区</a>\r\n");
      out.write("    <div class=\"nav\">\r\n");
      out.write("      <a class=\"nav-this\" href=\"jie/index.html\">\r\n");
      out.write("        <i class=\"iconfont icon-wenda\"></i>问答\r\n");
      out.write("      </a>\r\n");
      out.write("      <a href=\"http://www.layui.com/\" target=\"_blank\">\r\n");
      out.write("        <i class=\"iconfont icon-ui\"></i>框架\r\n");
      out.write("      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"nav-user\">\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" \r\n");
      out.write("      \r\n");
      out.write("      <!-- 登入后的状态 -->\r\n");
      out.write("       ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"main layui-clear\">\r\n");
      out.write("  <div class=\"wrap\">\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("      <div class=\"fly-tab fly-tab-index\">\r\n");
      out.write("        <span>\r\n");
      out.write("          <a href=\"jie/index.html\">全部</a>\r\n");
      out.write("          <a href=\"jie/index.html\">未结帖</a>\r\n");
      out.write("          <a href=\"jie/index.html\">已采纳</a>\r\n");
      out.write("          <a href=\"jie/index.html\">精帖</a>\r\n");
      out.write("          <a href=\"user/index.html\">我的帖</a>\r\n");
      out.write("        </span>\r\n");
      out.write("        <form action=\"http://cn.bing.com/search\" class=\"fly-search\">\r\n");
      out.write("          <i class=\"iconfont icon-sousuo\"></i>\r\n");
      out.write("          <input class=\"layui-input\" autocomplete=\"off\" placeholder=\"搜索内容，回车跳转\" type=\"text\" name=\"q\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/add_topic.do\" class=\"layui-btn jie-add\">发布问题</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <ul class=\"fly-list fly-list-top\">\r\n");
      out.write("        <li class=\"fly-list-li\">\r\n");
      out.write("          <a href=\"user/home.html\" class=\"fly-list-avatar\">\r\n");
      out.write("            <img src=\"http://tp4.sinaimg.cn/1345566427/180/5730976522/0\" alt=\"\">\r\n");
      out.write("          </a>\r\n");
      out.write("          <h2 class=\"fly-tip\">\r\n");
      out.write("            <a href=\"jie/detail.html\">基于 layui的轻量级问答社区页面模版 V2版本</a>\r\n");
      out.write("            <span class=\"fly-tip-stick\">置顶</span>\r\n");
      out.write("            <span class=\"fly-tip-jing\">精帖</span>\r\n");
      out.write("          </h2>\r\n");
      out.write("          <p>\r\n");
      out.write("            <span><a href=\"user/home.html\">贤心</a></span>\r\n");
      out.write("            <span>刚刚</span>\r\n");
      out.write("            <span>layui框架综合</span>\r\n");
      out.write("            <span class=\"fly-list-hint\"> \r\n");
      out.write("              <i class=\"iconfont\" title=\"回答\">&#xe60c;</i> 317\r\n");
      out.write("              <i class=\"iconfont\" title=\"人气\">&#xe60b;</i> 6830\r\n");
      out.write("            </span>\r\n");
      out.write("          </p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"fly-list-li\">\r\n");
      out.write("          <a href=\"user/home.html\" class=\"fly-list-avatar\">\r\n");
      out.write("            <img src=\"../res/images/avatar/00.jpg\" alt=\"\">\r\n");
      out.write("          </a>\r\n");
      out.write("          <h2 class=\"fly-tip\">\r\n");
      out.write("            <a href=\"jie/detail.html\">基于 layui的轻量级问答社区页面模版 V2版本</a>\r\n");
      out.write("            <span class=\"fly-tip-stick\">置顶</span>\r\n");
      out.write("          </h2>\r\n");
      out.write("          <p>\r\n");
      out.write("            <span><a href=\"user/home.html\">纸飞机</a></span>\r\n");
      out.write("            <span>30分钟前</span>\r\n");
      out.write("            <span>技术闲谈</span>\r\n");
      out.write("            <span class=\"fly-list-hint\"> \r\n");
      out.write("              <i class=\"iconfont\" title=\"回答\">&#xe60c;</i> 502\r\n");
      out.write("              <i class=\"iconfont\" title=\"人气\">&#xe60b;</i> 81689\r\n");
      out.write("            </span>\r\n");
      out.write("          </p>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("      <ul class=\"fly-list\">\r\n");
      out.write("      \r\n");
      out.write("      ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("      <div style=\"text-align: center\">\r\n");
      out.write("        <div class=\"laypage-main\">\r\n");
      out.write("          <a href=\"jie/index.html\" class=\"laypage-next\">更多求解</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"edge\">\r\n");
      out.write("    <div class=\"fly-panel leifeng-rank\"> \r\n");
      out.write("      <h3 class=\"fly-panel-title\">近一月回答榜 - TOP 12</h3>\r\n");
      out.write("      <dl>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"user/home.html\">\r\n");
      out.write("            <img src=\"../res/images/avatar/default.png\">\r\n");
      out.write("            <cite>纸飞机</cite>\r\n");
      out.write("            <i>159次回答</i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <dl class=\"fly-panel fly-list-one\"> \r\n");
      out.write("      <dt class=\"fly-panel-title\">最近热帖</dt>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局（基本结构）</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60b;</i> 6087</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">Java实现LayIM后端的核心代码</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60b;</i> 767</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局（基本结构）</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60b;</i> 6087</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">Java实现LayIM后端的核心代码</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60b;</i> 767</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局（基本结构）</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60b;</i> 6087</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">Java实现LayIM后端的核心代码</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60b;</i> 767</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局（基本结构）</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60b;</i> 6087</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">Java实现LayIM后端的核心代码</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60b;</i> 767</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("    \r\n");
      out.write("    <dl class=\"fly-panel fly-list-one\"> \r\n");
      out.write("      <dt class=\"fly-panel-title\">近期热议</dt>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局之基本结构</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60c;</i> 96</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局之基本结构</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60c;</i> 96</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局之基本结构</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60c;</i> 96</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局之基本结构</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60c;</i> 96</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局之基本结构</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60c;</i> 96</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局之基本结构</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60c;</i> 96</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局之基本结构</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60c;</i> 96</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("      <dd>\r\n");
      out.write("        <a href=\"jie/detail.html\">使用 layui 秒搭后台大布局之基本结构</a>\r\n");
      out.write("        <span><i class=\"iconfont\">&#xe60c;</i> 96</span>\r\n");
      out.write("      </dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"fly-panel fly-link\"> \r\n");
      out.write("      <h3 class=\"fly-panel-title\">友情链接</h3>\r\n");
      out.write("      <dl>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"http://www.layui.com/\" target=\"_blank\">layui</a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"http://layim.layui.com/\" target=\"_blank\">LayIM</a>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dd>\r\n");
      out.write("          <a href=\"http://layer.layui.com/\" target=\"_blank\">layer</a>\r\n");
      out.write("        </dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
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
      out.write("<script src=\"../res/layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("layui.cache.page = '';\r\n");
      out.write("layui.cache.user = {\r\n");
      out.write("  username: '游客'\r\n");
      out.write("  ,uid: -1\r\n");
      out.write("  ,avatar: '../res/images/avatar/00.jpg'\r\n");
      out.write("  ,experience: 83\r\n");
      out.write("  ,sex: '男'\r\n");
      out.write("};\r\n");
      out.write("layui.config({\r\n");
      out.write("  version: \"2.0.0\"\r\n");
      out.write("  ,base: '../res/mods/'\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /jsp/home.jsp(32,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userinfo}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("         <!-- 未登入状态 -->\r\n");
        out.write("       <a class=\"unlogin\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/jsp/login.jsp\"><i class=\"iconfont icon-touxiang\"></i></a>\r\n");
        out.write("      <span><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/jsp/login.jsp\">登入</a>\r\n");
        out.write("      <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/jsp/reg.jsp\">注册</a></span>\r\n");
        out.write("      <p class=\"out-login\">\r\n");
        out.write("        <a href=\"\" onclick=\"layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})\" class=\"iconfont icon-qq\" title=\"QQ登入\"></a>\r\n");
        out.write("        <a href=\"\" onclick=\"layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})\" class=\"iconfont icon-weibo\" title=\"微博登入\"></a>\r\n");
        out.write("      </p>  \r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /jsp/home.jsp(45,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty userinfo}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      <a class=\"avatar\" href=\"user/index.html\">\r\n");
        out.write("        <img src=\"http://tp4.sinaimg.cn/1345566427/180/5730976522/0\">\r\n");
        out.write("        <cite>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userinfo.nickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</cite>\r\n");
        out.write("        <i>VIP2</i>\r\n");
        out.write("      </a>\r\n");
        out.write("      <div class=\"nav\">\r\n");
        out.write("        <a href=\"/user/set/\"><i class=\"iconfont icon-shezhi\"></i>设置</a>\r\n");
        out.write("        <a href=\"/user/logout/\"><i class=\"iconfont icon-tuichu\" style=\"top: 0; font-size: 22px;\"></i>退了</a>\r\n");
        out.write("      </div> \r\n");
        out.write("         ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/home.jsp(122,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/home.jsp(122,6) '${topics}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${topics}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /jsp/home.jsp(122,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("topic");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      \r\n");
          out.write("      <li class=\"fly-list-li\">\r\n");
          out.write("          <a href=\"user/home.html\" class=\"fly-list-avatar\">\r\n");
          out.write("            <img src=\"../res/images/avatar/default.png\" alt=\"\">\r\n");
          out.write("          </a>\r\n");
          out.write("          <h2 class=\"fly-tip\">\r\n");
          out.write("            <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/topic_detail.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("          </h2>\r\n");
          out.write("          <p>\r\n");
          out.write("            <span><a href=\"user/home.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.nickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a></span>\r\n");
          out.write("            <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.createtime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("            <span>layui框架综合</span>\r\n");
          out.write("            <span class=\"fly-list-hint\"> \r\n");
          out.write("              <i class=\"iconfont\" title=\"回答\">&#xe60c;</i> 8\r\n");
          out.write("              <i class=\"iconfont\" title=\"人气\">&#xe60b;</i> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.viewCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("            </span>\r\n");
          out.write("          </p>\r\n");
          out.write("        </li>\r\n");
          out.write("      \r\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
