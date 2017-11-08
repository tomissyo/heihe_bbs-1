<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>基于Layui的轻量级问答社区页面模版</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="keywords" content="fly,layui,前端社区">
  <meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/layui/css/layui.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/global.css">
  <script type="text/javascript" src="${pageContext.request.contextPath}/res/js/template.js" ></script>
</head>
<body>

<div class="header">
  <div class="main">
    <a class="logo" href="/" title="Fly">Fly社区</a>
    <div class="nav">
      <a class="nav-this" href="index.html">
        <i class="iconfont icon-wenda"></i>问答
      </a>
      <a href="http://www.layui.com/" target="_blank">
        <i class="iconfont icon-ui"></i>框架
      </a>
    </div>
    
    <div class="nav-user">
      <!-- 未登入状态 -->
      <a class="unlogin" href="user/login.html"><i class="iconfont icon-touxiang"></i></a>
      <span><a href="user/login.html">登入</a><a href="user/reg.html">注册</a></span>
      <p class="out-login">
        <a href="" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" class="iconfont icon-qq" title="QQ登入"></a>
        <a href="" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" class="iconfont icon-weibo" title="微博登入"></a>
      </p>   
      
      <!-- 登入后的状态 -->
      <!-- 
      <a class="avatar" href="user/index.html">
        <img src="http://tp4.sinaimg.cn/1345566427/180/5730976522/0">
        <cite>贤心</cite>
        <i>VIP2</i>
      </a>
      <div class="nav">
        <a href="/user/set/"><i class="iconfont icon-shezhi"></i>设置</a>
        <a href="/user/logout/"><i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>退了</a>
      </div> -->
      
    </div>
  </div>
</div>

<div class="main layui-clear">
  <div class="wrap">
    <div class="content" style="margin-right:0">
      <div class="fly-tab">
        <span>
          <a href="" class="tab-this">全部</a>
          <a href="">未结帖</a>
          <a href="">已采纳</a>
          <a href="">精帖</a>
          <a href="../user/index.html">我的帖</a>
        </span>
        <form action="http://cn.bing.com/search" class="fly-search">
          <i class="iconfont icon-sousuo"></i>
          <input class="layui-input" autocomplete="off" placeholder="搜索内容，回车跳转" type="text" name="q">
        </form>
        <a href="add.html" class="layui-btn jie-add">发布问题</a>
      </div>
    
      <ul class="fly-list" id = "content">
       
     

        
      </ul>
      
      <!-- <div class="fly-none">并无相关数据</div> -->
    
      <div style="text-align: center">
        <!-- 分页<div class="laypage-main"><span class="laypage-curr">1</span><a href="/jie/page/2/">2</a><a href="/jie/page/3/">3</a><a href="/jie/page/4/">4</a><a href="/jie/page/5/">5</a><span>…</span><a href="/jie/page/148/" class="laypage-last" title="尾页">尾页</a><a href="/jie/page/2/" class="laypage-next">下一页</a></div> -->
      	<div id="pagebar"></div>
      </div>
      
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

<script type = "text/html" id = "item">
{{each list as value}}
<li class="fly-list-li">
<a href="user/home.html" class="fly-list-avatar">
  <img src="${pageContext.request.contextPath}/upload/{{value.head_url}}" alt="">
</a>
<h2 class="fly-tip">
  <a href="${pageContext.request.contextPath}/topic_detail.do?id={{value.id}}"> {{value.title}} </a>
  <span class="fly-tip-stick">置顶</span>
</h2>
<p>
  <span><a href="user/home.html">{{value.nickname}}</a></span>
  <span>{{value.createtime}}</span>
  <span>技术闲谈</span>
  <span class="fly-list-hint"> 
    <i class="iconfont" title="回答">&#xe60c;</i> 502
    <i class="iconfont" title="人气">&#xe60b;</i> {{value.viewCount}}
  </span>
</p>
</li>
  {{/each}}
</script>


<script src="${pageContext.request.contextPath}/res/layui/layui.all.js"></script>
<script>
layui.use('laypage', function(){
  var laypage = layui.laypage;
  
	//创建ajax对象
	var request = new XMLHttpRequest();
	
	//与服务器建立连接
	request.open("get","${pageContext.request.contextPath}/totalcount.do",true);
	//第一次发送ajax请求，向服务器索要当前表一共有多少条记录
	request.send();
	
	//监控当前ajax请求状态，绑定事件处理函数
	request.onreadystatechange = function(){
		//alert(req.readyState);//输出当前ajax请求 所处的状态
		//已经成功获得服务器回应
		if(request.readyState===4){
			//服务器响应成功
			if(request.status === 200)
			{
				var totalcount = request.responseText;
				
				//发第二次ajax请求，向服务器索要第一页数据
				
				//执行一个laypage实例
				  laypage.render({
				    elem: 'pagebar', //注意，这里的 test1 是 ID，不用加 # 号
				    limit:3,
				    count:totalcount, //数据总数，从服务端得到
				    jump: function(obj, first){
				        //obj包含了当前分页的所有参数，比如：
				        console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
				        console.log(obj.limit); //得到每页显示的条数
				        
				      //创建ajax对象
						var req = new XMLHttpRequest();
						
						//与服务器建立连接
						req.open("get","${pageContext.request.contextPath}/page.do?pageIndex="+obj.curr+"&pageSize="+obj.limit,true);
						//发送请求
						req.send();
						
						//监控当前ajax请求状态，绑定事件处理函数
						req.onreadystatechange = function(){
							//alert(req.readyState);//输出当前ajax请求 所处的状态
							//已经成功获得服务器回应
							if(req.readyState===4){
								//服务器响应成功
								if(req.status === 200)
								{
									var ul = document.getElementById("content");
									console.log(req.responseText);
									var jsonObj = JSON.parse(req.responseText);//json字符串转成json对象
									  
									var html = template('item',jsonObj);

							       
									ul.innerHTML = html;
									
								}
								else//响应失败
								{
									
								}
								
							}
							
						}
				        
				        
				        //首次不执行
				        if(!first){
				          //do something
				        }
				      }
				  });
				
			}
			else//响应失败
			{
				
			}
			
		}
	}
  
  
  
  
});


</script>











<script src="${pageContext.request.contextPath}/res/layui/layui.js"></script>




<script>
layui.cache.page = 'jie';
layui.cache.user = {
  username: '游客'
  ,uid: -1
  ,avatar: '${pageContext.request.contextPath}/res/images/avatar/00.jpg'
  ,experience: 83
  ,sex: '男'
};
layui.config({
  version: "2.0.0"
  ,base: '${pageContext.request.contextPath}/res/mods/'
}).extend({
  fly: 'index'
}).use('fly');
</script>

</body>
</html>