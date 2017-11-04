$(document).ready(function(){
	$("#span_usename").hide();
	$("#span_password").hide();
});





function validation(){
	var usename=$("#username").val();
	var password=$("#password").val();
	if(username==null || usename==""){
		$("#span_usename").show();
		return false;
	}else if(password==null || password==""){
		$("#span_password").show();
		return false;
	}
	else{
		return true;
	}	
};

function clearAll(){
	$("#span_usename").hide();
	$("#span_password").hide();
}