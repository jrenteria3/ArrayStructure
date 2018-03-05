package tutorial111;

import java.util.*;
import java.io.*;

public class FileReader {

	public Scanner x;
	public static int count;
	
	public static double MPG;
	public static double Cyl;
	public static double HP;
	
	public static double mpg_count = 0;
	public static double cyl_count = 0;
	public static double hp_count = 0;
	
	public static LinkedList<Double> mpg_ll = new LinkedList<Double>();
	public static LinkedList<Double> cyl_ll = new LinkedList<Double>();
	public static LinkedList<Double> hp_ll = new LinkedList<Double>();
	
	public void openFile(){
		
		try{
			x = new Scanner(new File("numbers.txt"));
			
		}catch(Exception e){
			System.out.println("Could not find File");
		}	
	}
	
	public void readFile(){
		
		while(x.hasNext()){						// Loop through each LINE and add variable dependent on spacing
			
			String a = x.next();				// Takes first sequence and adds as string(a)
			MPG = Double.parseDouble(a);		// Converts MPG String to double
			mpg_ll.add(MPG);					// Adds converted MPG to LL
			mpg_count++;						// Adds to a count for every MPG instance
			System.out.println("MPG: " + MPG);	// Prints each MPG value
			
			String b = x.next();
			Cyl = Double.parseDouble(b);
			cyl_ll.add(Cyl);
			cyl_count++;
			System.out.println("Cylinders: " + Cyl);
			
			String c = x.next();;
			HP = Double.parseDouble(c);
			hp_ll.add(HP);
			hp_count++;
			System.out.println("HorsePower: " + HP + "\n");
			
			count++;
			
			//System.out.printf("MPG:%s    Cylinders:%s    HorsePower:%s\n", a,b,c);
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
	
	//This is just to check if Data is being counted and added to LL correctly
	
	System.out.println("Original MPG Order: " + mpg_ll);		//Prints Original List
	Collections.sort(mpg_ll);									//Sorts List
	System.out.println("Sorted List: " + mpg_ll);				//Prints Sorted List
	System.out.println("MPG instances: " + mpg_count + "\n");	//Prints # of MPG Counts
	
	System.out.println("Original Cyl Order: " + cyl_ll);
	Collections.sort(cyl_ll);
	System.out.println("Sorted List: " + cyl_ll);
	System.out.println("Cylinder instances: " + cyl_count + "\n");
	
	System.out.println("Original HP Order: " + hp_ll);
	Collections.sort(hp_ll);
	System.out.println("Sorted List: " + hp_ll);
	System.out.println("Horsepower instances: " + hp_count + "\n");
	
	System.out.println("\nThe number of instances is: " + count);
	
	
	}
}