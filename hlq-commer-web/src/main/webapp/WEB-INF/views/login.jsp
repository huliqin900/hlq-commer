<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>选课系统</title>
<link sc="res" rel="stylesheet" type="text/css" href="/css/css/bootstrap.css">
<link sc="res" rel="stylesheet" type="text/css" href="/css/css/bootstrap.min.css">
<link sc="res" rel="stylesheet" type="text/css" href="/css/css/hlq.css">
<script type="text/javascript"></script>
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.1/jquery.js"></script>
<script type="text/javascript" src="/css/js/bootstrap.js"></script>
<script type="text/javascript" src="/css/js/bootstrap.min.js"></script>
</head>

<body>
<div id="dHead">固定头部100px;</div>
<!--  	<div  class="container">
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
<div >
<form class="form-horizontal" role="form" style="width:50%">
  <div class="form-group" >
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
           <button type="button" class="btn btn-primary">（首选项）Primary</button>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
    <a href="">忘记密码？</a>
    </div>
  </div>
</form>
	</div>
	<div id="dFoot">固定尾部100px</div>
	<script type="text/javascript" src="/js/index.js"></script>
</body>
</html>