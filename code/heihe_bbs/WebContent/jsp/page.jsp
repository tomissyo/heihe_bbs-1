<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>layPage快速使用</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/layui/css/layui.css" media="all">
</head>
<body>
 <div id = "content"></div>
<div id="test1"></div>
 
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
				    elem: 'test1', //注意，这里的 test1 是 ID，不用加 # 号
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
									var div = document.getElementById("content");
									//alert(req.responseText);
									var jsonObj = JSON.parse(req.responseText);//json字符串转成json对象
									var html = "<ul>";
									for(var i = 0; i < jsonObj.length; i++)
									{
										html += "<li>"+ jsonObj[i].title +"</li>"
									}
									
									var str = html+"</ul>";
									
									
									alert(str);
									div.innerHTML = str;
									
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
</body>
</html>