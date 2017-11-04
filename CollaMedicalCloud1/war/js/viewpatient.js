$(document).ready(function(){
	$("#span_patientId").hide();
	
});

function validation(){
	var patientId=$("#patientId").val();
	
	if(patientId==null || patientId==""){
		$("#span_patientId").show();
		return false;
	}
	else{
		return true;
	}	
};

function clearAll(){
	$("#span_patientId").hide();
}