$(document).ready(function(){
	$("#span_usename").hide();
	$("#span_password").hide();
	$("#span_usertype").hide();
});


function validation(){
	var usename=$("#username").val();
	var password=$("#password").val();
	var usertype=$("#usertype").val();
	if(username==null || usename==""){
		$("#span_usename").show();
		return false;
	}else if(password==null || password==""){
		$("#span_password").show();
		return false;
	}
else if(usertype==0){
	$("#span_usertype").show();
	return false;
}
	else{
		return true;
	}	
};

function clearAll(){
	$("#span_usename").hide();
	$("#span_password").hide();
	$("#span_usertype").hide();
}