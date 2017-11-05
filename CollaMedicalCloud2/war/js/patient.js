function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
        return false;
    }
    return true;
}



$(document).ready(function(){
	$("#span_patientName").hide();
	$("#span_patientage").hide();
	$("#span_problem").hide();
	$("#span_contact").hide();
	$("#span_address").hide();
});

function validation(){
	var patientName=$("#patientName").val();
	var patientage=$("#patientage").val();
	var problem=$("#problem").val();
	var contact=$("#contact").val();
	var address=$("#address").val();
	if(patientName==null || patientName=="")
	{
		$("#span_patientName").show();
		return false;
	}else if(patientage==null || patientage==""){
		$("#span_patientage").show();
		return false;
	}else if(problem==null || problem==""){
		$("#span_qualification").show();
		return false;
	}else if(contact==null || contact==""){
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
	$("#span_patientName").hide();
	$("#span_patientage").hide();
	$("#span_problem").hide();
	$("#span_contact").hide();
	$("#span_address").hide();
}