<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>日历</title>
<#include "../common-css.ftl"/>
</head>
<body>
<div id="calendar" class="calendar"></div>
<input type="button" id="logout" value="退出登录" />
<div class="modal modal-fade" id="event-modal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
				<h4 class="modal-title">
					事件
				</h4>
			</div>
			<div class="modal-body">
				<input type="hidden" name="event-index">
				<form class="form-horizontal">
					<div class="form-group">
						<label for="min-date" class="col-sm-4 control-label">名称</label>
						<div class="col-sm-7">
							<input name="event-name" type="text" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label for="min-date" class="col-sm-4 control-label">描述</label>
						<div class="col-sm-7">
							<input name="event-location" type="text" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label for="min-date" class="col-sm-4 control-label">时间</label>
						<div class="col-sm-7">
							<div class="input-group input-daterange" data-provide="datepicker">
								<input name="event-start-date" type="text" class="form-control" value="2012-04-05">
								<span class="input-group-addon">至</span>
								<input name="event-end-date" type="text" class="form-control" value="2012-04-19">
							</div>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				<button type="button" class="btn btn-primary" id="save-event">提交</button>
			</div>
		</div>
	</div>
</div>
<#include "../common-js.ftl"/>
<script src="${request.contextPath}/static/bootstrapCalendar/bootstrapCalendar-index.js"></script>
<script type="text/javascript">
	$("#logout").click(function(){
		location.href=webpath+"/logout";
	});
</script>
</body>
</html>