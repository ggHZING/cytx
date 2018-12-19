$(function(){
   //通过按钮点击事件条用后台接口返回
   $("#register").click(function() {
   	//通过AJAX的post方式传递一个参数
   	$.ajax({
   		url: 'http://localhost:8080/畅游天下/register.html',
   		type: 'post',
   		dataType: 'json',
   		data: {"username": $("#username").val(),
               "password":$("#password").val(),
               "rpassword":$("#rpassword").val(),
               "email":$("#email").val(),
               "phone":$("#phone").val(),
               "yzm":$("#yzm").val(),
   	           },
   	     success: function(data) {
                    alert(data.message)
                },
         error: function() {
                    alert("注册信息错误");
                }
   	});
   });
});