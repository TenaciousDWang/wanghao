function loginVerify(){
    var username = $("#username").val();
    var password = $("#password").val();

    jQuery.ajax({
		type : "POST",
		url : webpath + '/ajaxLogin',
		data : {
            username: username,
            password: password
        },
		dataType : "json",
		async : false,
		success : function(data) {
			if (data.status == 200) {
				location.href = webpath+"/bootstrapCalendar/index";
			} else {
				$("#erro").html(data.message);
			}
		}
	});
}