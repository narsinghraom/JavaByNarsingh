$(document).ready(function(){
	$("#span_patientId").hide();
	$("#span_prescription").hide();
	
	
});

function validation(){
	var patientId=$("#patientId").val();
	var prescription=$("#prescription").val();
	
	if(patientId==null || patientId=="")
	{
		$("#span_patientId").show();
		return false;
	}else if(prescription==null || prescription==""){
		$("#span_prescription").show();
		return false;
	}
	else{
		return true;
	}	
};


function clearAll(){
	$("#span_patientId").hide();
	$("#span_prescription").hide();
	
}