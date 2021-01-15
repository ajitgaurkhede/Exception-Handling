
// throws keyword specially use for throw user define exception

import java.util.Scanner;

class YoungerAgeException extends RuntimeException{

	YoungerAgeException(String msg){
	
	super(msg);
	
	
	}



}




class Demo{


	public static void main(String args[]){
	
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter your age : ");
	
	int age = sc.nextInt();
	
	try{
	
	if(age >= 18)
	System.out.println("You can vote");
	else{
	
		throw new YoungerAgeException("You can not vote");
		
		//System.out.println("Statements"); error unreachable statement
	
	}
	
	}
	
	catch(YoungerAgeException e){
	
	e.printStackTrace();
	
	
	}
	
	
	System.out.println("Successs");
	
	sc.close();
	
	
	
	}





}
