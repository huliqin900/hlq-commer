function submitBackstageLogin(){
	var username = $('input[name="username"]').val();
	var password = $('input[name="password"]').val();
	
	if(validate() == false){
		return;
	}
	
	if("" == username || "" == password){
		alert('用户名或密码不能为空');
		return;
	}
	$.ajax({
		url : "/user/submitBackstageLogin",
		type : 'post',
		dataType : 'json',
		data : {username: username, password: password},
		success : function(data){
			if(!data){
				alert('用户名或密码错误');
				return;
			}
			window.location.href = "/user/customer_index";
		}
	})
	
}