<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
	<link rel="stylesheet" type="text/css" href="/css/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/css/style.css" />
<script type="text/javascript"
	src="http://libs.baidu.com/jquery/1.9.1/jquery.js"></script>
<script type="text/javascript" src="/css/js/verificationNumbers.js"></script>
<script type="text/javascript" src="/css/js/Particleground.js"></script>
<script type="text/javascript" src="/css/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/login.js"></script>
<script>
	$(document).ready(function() {
		//粒子背景特效
		$('body').particleground({
			dotColor : '#5cbdaa',
			lineColor : '#5cbdaa'
		});
		//验证码
		createCode();
		//测试提交，对接程序删除即可
	});
</script>
<style>
body {
	height: 100%;
	background: #16a085;
	overflow: hidden;
}
canvas {
	z-index: -1;
	position: absolute;
}
</style>
</head>
<body>
	<dl class="admin_login">
		<dt>
			<strong>站点后台管理系统</strong> <em>Management System</em>
		</dt>
		<dd class="user_icon">
			<input type="text" placeholder="账号" class="login_txtbx" name="username"/>
		</dd>
		<dd class="pwd_icon">
			<input type="password" placeholder="密码" class="login_txtbx" name="password"/>
		</dd>
		<dd class="val_icon">
			<div class="checkcode">
				<input type="text" id="J_codetext" placeholder="验证码" maxlength="4"
					class="login_txtbx">
				<canvas class="J_codeimg" id="myCanvas" onclick="createCode()">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
			</div>
			<input type="button" value="验证码核验" class="ver_btn"
				onClick="validate();">
		</dd>
		<dd>
			<input type="button" value="立即登陆" class="submit_btn" onclick="submitBackstageLogin()"/>
		</dd>
	</dl>
</body>
<!--  
<head>
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="../../../css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="/css/css/bootstrap.min.css" />
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.1/jquery.js"></script>
<script type="text/javascript" src="/css/js/bootstrap.js"></script>
<script type="text/javascript" src="/css/js/bootstrap.min.js"></script>
</head>
<body>
<div style="    height:100px;
    line-height:100px;
    background:white;
    width:100%;
    position:absolute;
    z-index:5;
    top:0;
    text-align:center;"><b>LOGO</b></div>
	<!--  <div  class="container">
		<div class="row" >
		<div id="time">
		</div>
		<ul class="nav nav-pills">
	<li class="active"><a href="#">Home</a></li>
	<li><a href="#">首页</a></li>
	<li><a href="#">iOS</a></li>
	<li><a href="#">VB.Net</a></li>
	<li class="dropdown">
		<a class="dropdown-toggle" data-toggle="dropdown" href="#">
			Java <span class="caret"></span>
		</a>
		<ul class="dropdown-menu">
			<li><a href="#">Swing</a></li>
			<li><a href="#">jMeter</a></li>
			<li><a href="#">EJB</a></li>
			<li class="divider"></li>
			<li><a href="#">分离的链接</a></li>
		</ul>
	</li>
	<li><a href="#">PHP</a></li>
</ul>
			
		</div> -->
<!--  		<div class="col-md-6 col-lg-4"  style="background-color: gray; width:100%;height:30%;text-align:center;
         box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
			<img src="../DEMOWeb/css/img/head1.png" class="img-responsive" alt="head">
			</div>
		</div> -->
<!--  <div  style="   background:#16a085;
    width:100%;
    overflow:auto;
    top:100px;
    position:absolute;
    z-index:10;
    bottom:100px;">
<form class="form-horizontal" role="form" style="">
<div style=" width: 500px;
  height: 300px;
  text-align: center;
  margin:0px auto;">
  <div class="form-group"  >
    <label for="users" class="col-sm-2 control-label">用户名:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="users" placeholder="请输入用户名">
    </div>
  </div>
  <div class="form-group">
    <label for="psw" class="col-sm-2 control-label">密码:</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="psw" placeholder="请输入密码">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox">请记住我
        </label>
      </div>
      <button type="submit" class="btn btn-default" id="login">登录</button>
           <button type="button" class="btn btn-default" id="regist">注册</button>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
    <a href="">忘记密码？</a>
    </div>
  </div>
  </div>
</form>
	</div>
	<div style="height:100px;
    line-height:100px;
    background:white;
    width:100%;
    position:absolute;
    z-index:200;
    bottom:0;
    text-align:center;">网站声明</div>
	<script type="text/javascript" src="/js/index.js"></script>
</body>  -->
</html>