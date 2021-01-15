

class Basic{


	public static void main(String a[]){
	
	
		int num1 = 10 , num2 = 0 ;
		int div = 0;
		
		System.out.println("1");
		
		try{
		
		System.out.println("2");
		
		 div = num1 / num2 ; // if exeception occured then 
		 
		 System.out.println("3");	// it will skip this code
		 
		
		}
		
		//System.out.println("4");   u cant add any statement between try catch
		
		catch(Exception e){		// if exeception not occured then it will skip this catch block
		
		System.out.println("4");
		
		
		System.out.println(e); 	// java.lang.ArithmeticException: / by zero

		e.printStackTrace();	// whole Description
		
		System.out.println(e.toString());// java.lang.ArithmeticException: / by zero

		System.out.println(e.getMessage());// / by zero

		System.out.println("5");
		
		
		}
		finally{
		
			// use : clean up code
		
		System.out.println("Finally block always Execute");
		
		/* Except 
				1. System.exit(0);
				2. Error or Exception
				3. Death of Thread
				
		*/
		
		
		
		}
		
		
		System.out.println("Success");
		
	
	}





}
