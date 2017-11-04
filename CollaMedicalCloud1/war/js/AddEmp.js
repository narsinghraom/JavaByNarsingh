function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
        return false;
    }
    return true;
}


$(document).ready(function(){
	$("#span_usename").hide();
	$("#span_password").hide();
	$("#span_usertype").hide();
	$("#span_qualification").hide();
	$("#span_contact").hide();
	$("#span_address").hide();
	
});

function validation(){
	var usename=$("#usename").val();
	var password=$("#password").val();
	var qualification=$("#qualification").val();
	var contactno=$("#contactno").val();
	var address=$("#address").val();
	if(usename==null || usename=="")
	{
		$("#span_usename").show();
		return false;
	}else if(password==null || password==""){
		$("#span_password").show();
		return false;
	}else if(qualification==null || qualification==""){
		$("#span_qualification").show();
		return false;
	}else if(contactno==null || contactno==""){
		$("#span_contact").show();
		return false;
	}else if(address==null || address==""){
		$("#span_address").show();
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
	$("#span_qualification").hide();
	$("#span_contact").hide();
	$("#span_address").hide();
}