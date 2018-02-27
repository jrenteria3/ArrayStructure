package tutorial111;

import java.util.*;
import java.io.*;

public class FileReader {

	public Scanner x;
	public static int count;
	
	public void openFile(){
		
		try{
			x = new Scanner(new File("numbers.txt"));
			
		}catch(Exception e){
			System.out.println("Could not find File");
		}	
	}
	
	public void readFile(){
		
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			count++;
			System.out.printf("MPG:%s    Cylinders:%s    HorsePower:%s\n", a,b,c);
		}	
	}
	
	public void sortArray(){
		//TODO	
	}
	
	public void closeFile(){
		x.close();
	}

	public static void main(String[] args) {
	FileReader r = new FileReader();
	r.openFile();
	r.readFile();
	r.closeFile();
	
	System.out.println("\nThe number of instances is: " + count);
	
	}
}