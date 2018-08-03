<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>欢迎登陆</title>
        <#include "../common-css.ftl"/>   
        <!-- CSS -->
        <link href="${request.contextPath}/static/login/form.css" rel="stylesheet">
        <link href="${request.contextPath}/static/login/style.css" rel="stylesheet">
        <link href="${request.contextPath}/static/login/animate.css" rel="stylesheet">
        <link href="${request.contextPath}/static/login/generics.css" rel="stylesheet"> 
    </head>
    <body style="background-image:url(${request.contextPath}/static/img/login/Sierra18.jpg)">
        <section id="login">
            <header>
                <h1>欢迎</h1>
                <p>The best way to cheer yourself up is to try to cheer somebody else up.让自己高兴起来的最好办法就是设法让别人高兴起来。</p>
            </header>
        
            <div class="clearfix"></div>
            
            <!-- Login -->
            <form  class="box tile animated active" id="box-login">
                <h2 class="m-t-0 m-b-15">登录</h2>
				<h4 id="erro"></h4>
                <input id="username" name="username" type="text" class="login-control m-b-10" placeholder="登录名">
                <input id="password" name="password" type="password" class="login-control m-b-10" placeholder="密码">               
                <input class="btn btn-sm m-r-5 m-t-0" type="button" onclick="loginVerify();" value="提交" />
            </form>
        </section>                      
        
        <!-- Javascript Libraries -->

        
        <!--  Form Related -->
        <!-- <script src="${request.contextPath}/static/login/icheck.js"></script> --> <!-- Custom Checkbox + Radio -->
        
        <!-- All JS functions -->
        <!-- <script src="${request.contextPath}/static/login/functions.js"></script> -->
		<script src="${request.contextPath}/static/login/login.js"></script>
        <#include "../common-js.ftl"/>
    </body>
</html>
