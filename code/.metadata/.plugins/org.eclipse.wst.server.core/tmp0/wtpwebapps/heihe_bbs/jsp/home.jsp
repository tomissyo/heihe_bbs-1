<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>基于 layui 的极简社区页面模版</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="keywords" content="fly,layui,前端社区">
  <meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/layui/css/layui.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/global.css">
</head>
<body>

<div class="header">
  <div class="main">
    <a class="logo" href="/" title="Fly">Fly社区</a>
    <div class="nav">
      <a class="nav-this" href="jie/index.html">
        <i class="iconfont icon-wenda"></i>问答
      </a>
      <a href="http://www.layui.com/" target="_blank">
        <i class="iconfont icon-ui"></i>框架
      </a>
    </div>
    
    <div class="nav-user">

    <c:if test="${empty userinfo}">
         <!-- 未登入状态 -->
       <a class="unlogin" href="${pageContext.request.contextPath}/jsp/login.jsp"><i class="iconfont icon-touxiang"></i></a>
      <span><a href="${pageContext.request.contextPath}/jsp/login.jsp">登入</a>
      <a href="${pageContext.request.contextPath}/jsp/reg.jsp">注册</a></span>
      <p class="out-login">
        <a href="" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" class="iconfont icon-qq" title="QQ登入"></a>
        <a href="" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" class="iconfont icon-weibo" title="微博登入"></a>
      </p>  
    </c:if>
 
      
      <!-- 登入后的状态 -->
       <c:if test="${!empty userinfo}">
      <a class="avatar" href="user/index.html">
        <img src="http://tp4.sinaimg.cn/1345566427/180/5730976522/0">
        <cite>${userinfo.nickname}</cite>
        <i>VIP2</i>
      </a>
      <div class="nav">
        <a href="/user/set/"><i class="iconfont icon-shezhi"></i>设置</a>
        <a href="/user/logout/"><i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>退了</a>
      </div> 
         </c:if>
    </div>
  </div>
</div>


<div class="main layui-clear">
  <div class="wrap">
    <div class="content">
      <div class="fly-tab fly-tab-index">
        <span>
          <a href="jie/index.html">全部</a>
          <a href="jie/index.html">未结帖</a>
          <a href="jie/index.html">已采纳</a>
          <a href="jie/index.html">精帖</a>
          <a href="user/index.html">我的帖</a>
        </span>
        <form action="http://cn.bing.com/search" class="fly-search">
          <i class="iconfont icon-sousuo"></i>
          <input class="layui-input" autocomplete="off" placeholder="搜索内容，回车跳转" type="text" name="q">
        </form>
        <a href="${pageContext.request.contextPath}/add_topic.do" class="layui-btn jie-add">发布问题</a>
      </div>
      
      
      <ul class="fly-list fly-list-top">
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="http://tp4.sinaimg.cn/1345566427/180/5730976522/0" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">基于 layui的轻量级问答社区页面模版 V2版本</a>
            <span class="fly-tip-stick">置顶</span>
            <span class="fly-tip-jing">精帖</span>
          </h2>
          <p>
            <span><a href="user/home.html">贤心</a></span>
            <span>刚刚</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 317
              <i class="iconfont" title="人气">&#xe60b;</i> 6830
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/00.jpg" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">基于 layui的轻量级问答社区页面模版 V2版本</a>
            <span class="fly-tip-stick">置顶</span>
          </h2>
          <p>
            <span><a href="user/home.html">纸飞机</a></span>
            <span>30分钟前</span>
            <span>技术闲谈</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
          </p>
        </li>
      </ul>
      
      <ul class="fly-list">
      
      <c:forEach items="${topics}" var = "topic">
      
      <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="${pageContext.request.contextPath}/upload/${topic.head_url}" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="${pageContext.request.contextPath}/topic_detail.do?id=${topic.id}">${topic.title}</a>
          </h2>
          <p>
            <span><a href="user/home.html">${topic.nickname}</a></span>
            <span>${topic.createtime}</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> ${topic.viewCount}
            </span>
          </p>
        </li>
      
      </c:forEach>
        
       
      </ul>
      
      <div style="text-align: center">
        <div class="laypage-main">
          <a href="${pageContext.request.contextPath}/jsp/home_page.jsp" class="laypage-next">更多求解</a>
        </div>
      </div>
      
    </div>
  </div>
  
  <div class="edge">
    <div class="fly-panel leifeng-rank"> 
      <h3 class="fly-panel-title">近一月回答榜 - TOP 12</h3>
      <dl>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
      </dl>
    </div>
    
    <dl class="fly-panel fly-list-one"> 
      <dt class="fly-panel-title">最近热帖</dt>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局（基本结构）</a>
        <span><i class="iconfont">&#xe60b;</i> 6087</span>
      </dd>
      <dd>
        <a href="jie/detail.html">Java实现LayIM后端的核心代码</a>
        <span><i class="iconfont">&#xe60b;</i> 767</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局（基本结构）</a>
        <span><i class="iconfont">&#xe60b;</i> 6087</span>
      </dd>
      <dd>
        <a href="jie/detail.html">Java实现LayIM后端的核心代码</a>
        <span><i class="iconfont">&#xe60b;</i> 767</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局（基本结构）</a>
        <span><i class="iconfont">&#xe60b;</i> 6087</span>
      </dd>
      <dd>
        <a href="jie/detail.html">Java实现LayIM后端的核心代码</a>
        <span><i class="iconfont">&#xe60b;</i> 767</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局（基本结构）</a>
        <span><i class="iconfont">&#xe60b;</i> 6087</span>
      </dd>
      <dd>
        <a href="jie/detail.html">Java实现LayIM后端的核心代码</a>
        <span><i class="iconfont">&#xe60b;</i> 767</span>
      </dd>
    </dl>
    
    <dl class="fly-panel fly-list-one"> 
      <dt class="fly-panel-title">近期热议</dt>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
    </dl>
    
    <div class="fly-panel fly-link"> 
      <h3 class="fly-panel-title">友情链接</h3>
      <dl>
        <dd>
          <a href="http://www.layui.com/" target="_blank">layui</a>
        </dd>
        <dd>
          <a href="http://layim.layui.com/" target="_blank">LayIM</a>
        </dd>
        <dd>
          <a href="http://layer.layui.com/" target="_blank">layer</a>
        </dd>
      </dl>
    </div>


  </div>
</div>

<div class="footer">
  <p><a href="http://fly.layui.com/">Fly社区</a> 2017 &copy; <a href="http://www.layui.com/">layui.com</a></p>
  <p>
    <a href="http://fly.layui.com/auth/get" target="_blank">产品授权</a>
    <a href="http://fly.layui.com/jie/8157.html" target="_blank">获取Fly社区模版</a>
    <a href="http://fly.layui.com/jie/2461.html" target="_blank">微信公众号</a>
  </p>
</div>
<script src="../res/layui/layui.js"></script>
<script>
layui.cache.page = '';
layui.cache.user = {
  username: '游客'
  ,uid: -1
  ,avatar: '../res/images/avatar/00.jpg'
  ,experience: 83
  ,sex: '男'
};
layui.config({
  version: "2.0.0"
  ,base: '../res/mods/'
}).extend({
  fly: 'index'
}).use('fly');
</script>

</body>
</html>