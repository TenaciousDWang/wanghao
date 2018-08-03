<!DOCTYPE html>
<html lang="en">
<head>
    <title>Getting Started: Serving Web Content</title>
    <#include "../common-css.ftl"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p>Get your greeting <a href="${request.contextPath}/file/index">here</a></p>
<form action="${request.contextPath}/file/upload" method="POST" enctype="multipart/form-data">
    文件：<input type="file" name="test"/>
    <input type="submit" />
</form>
<a href="${request.contextPath}/file/download">下载test</a>
<p>多文件上传</p>
<form method="POST" enctype="multipart/form-data" action="${request.contextPath}/file/batch/upload">
    <p>文件1：<input type="file" name="file" /></p>
    <p>文件2：<input type="file" name="file" /></p>
    <p><input type="submit" value="上传" /></p>
</form>


<body>
    <form class="form-horizontal" action="${request.contextPath}/file/upload" method="POST" enctype="multipart/form-data">
        <div class="container">
            <div class="row" style="padding: 20px 0">
                <h3>超文件上传</h3>
            </div>
            <div class="row form-group">
                <label class="control-label col-lg-1" for="name">名称</label>
                <div class="col-lg-5 col-md-6">
                    <input name="fileToUpload" id="fileToUpload" type="file" />
                    <input type="submit" class="glyphicon glyphicon-open"/>
                </div>
            </div>
            <div class="row form-group">
                <label class="control-label col-lg-1">附件</label>
                <div class="col-lg-5 col-md-6">
                    <div id="upLoadDiv"></div>
                </div>
            </div>
            <div class="row form-group">
                <div class="col-lg-5 col-md-6">
                    <button type="button" class="button-primary button-rounded" id="addTeamBtn"><i class="glyphicon glyphicon-open"></i>上传</button>
                </div>
            </div>
        </div>
    </form>
</body>


<#include "../common-js.ftl"/>
</body>
</html>