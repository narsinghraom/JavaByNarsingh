package colla.medical.logics;



import java.util.Random;

public class BussinessLogic 
{
	public static String patientId(){
	String adimissionId="PUI";
	adimissionId=adimissionId+unqiueNumber();
	return adimissionId;

}
	public static String doctorId(){
		String adimissionId="DUI";
		adimissionId=adimissionId+unqiueNumber();
		return adimissionId;

	}

private  static String unqiueNumber()
{
	String unqiueNo=null;
	Random random=new Random();
	int randomNo=random.nextInt(100);
	unqiueNo=factorial(randomNo);
	return unqiueNo;
	
}
private static String factorial(int randomNo)
{
	String factString=" ";
	int fact=1;
	for(int i=0;i<=randomNo-1;i++){
		fact=(fact*1)+randomNo;
	}
	if(fact<0){
		fact=fact*(-1);
	}
	Integer inter=new Integer(fact);
	String factstr=inter.toString();
	if(factstr.length()>4){
		for(int i=0;i<=3;i++){
			factString=factString+factstr.charAt(i);
		}
	}
	else{
		fact=fact+10000;
		Integer integer=new Integer(fact);
		factstr=integer.toString();
	}
	return factstr;
	
}

public static void main(String[] args) {
	System.out.println(BussinessLogic.patientId());
	System.out.println(BussinessLogic.doctorId());
}
}


