
import java.io.*;

// Throws keyword use for Indicate the exception to caller method



class ReadAndWrite {


	void readFile()throws FileNotFoundException{
	
	
		FileInputStream in = new FileInputStream("testfile.txt");
	
	}
	
	
	void writeFile() throws FileNotFoundException{
	
	
		FileOutputStream out = new FileOutputStream("testfile.txt");
	
	
	}
	



}


class Test{


	public static void main(String args[]){
	
	
	
	ReadAndWrite rw = new ReadAndWrite();
	
	
		try{
			rw.readFile();
			
		}
		catch(FileNotFoundException e){
		
		
		
		e.printStackTrace();
		
		}
		
		
		try{
			
			rw.writeFile();
			
		}
		catch(FileNotFoundException e){
		
		
		
		e.printStackTrace();
		
		}
	
	
	
		System.out.println("Sucesss");
	
	
	
	
	}





}
