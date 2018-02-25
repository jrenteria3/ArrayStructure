public class ArrayStructure {
	
	private int[] theArray = new int [50];
	
	private int arraySize = 10;
	
	//--------------------------------------------------------------------------------
	// MAIN 
	public static void main(String[] args) {
		/*
		//-----------------------------------------------------\\
		// LINEAR SEARCH ALGORITHM
		
		//Sets up arrays
		ArrayStructures newArray = new ArrayStructures();
		
		//Generates a randomized array list
		newArray.generateRandomArray();
		
		//Prints out the array
		newArray.printArray();
		
		//Prints out the value of index 3 in the array
		System.out.println(newArray.getValueAtIndex(3));
		
		//Checks if the array has the value
		System.out.println(newArray.doesArrayContainThisValue(18));
		
		//Deletes the index at the value
		newArray.deleteIndex(4);
		
		//Prints out the array
		newArray.printArray();
        
		//Inserts the value at the end of the array list
		newArray.insertValue(55);
		
		//Prints out the array
		newArray.printArray();
		
		//Locates which indexs the value occurs
		newArray.linearSearchForvalue(17);
		
		// END LINEAR SEARCH
		//-----------------------------------------------------\\
		*/
		
		//-----------------------------------------------------\\
		// OTHER SORTING ALGORITM 
		
		ArrayStructures newArray = new ArrayStructures();
		
		newArray.generateRandomArray();

		//BUBBLE SORT
		newArray.bubbleSort();
		
		//BINARY SEARCH
		newArray.binarySearchForValue(11);
		
		//SELECTION SORT
		//newArray.selectionSort();
		
		//INSERTION SORT
		//newArray.instertionSort();
		
		// END SORTING ALGORITHM 
		//------------------------------------------------------\\
		
	}
	
	//--------------------------------------------------------------------------------
	//This will print a generated array horizontally 
	public void printHorzArray(int i, int j){
		
	for(int n = 0; n < 51; n++)System.out.print("-");
	
	System.out.println();
	
	for(int n = 0; n < arraySize; n++){
		
		System.out.print("| " + n + "  ");
		
	}
	
	System.out.println("|");
	
	for(int n = 0; n < 51; n++)System.out.print("-");
	
	System.out.println();
	
	for(int n = 0; n < arraySize; n++){
		
		System.out.print("| " + theArray[n] + " ");
		
	}
	
	System.out.println("|");
	
	for(int n = 0; n < 51; n++)System.out.print("-");
	
	System.out.println();
	
	if(j != -1){
		
		// ADDED THE +2 TO FIX SPACING
		
		for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");
		
		System.out.print(j);
		
	}
	
	if(i != -1){
		
		// ADDED THE -1 TO FIX SPACING
		
		for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");
		
		System.out.print(i);
		
	}
	
	System.out.println();
	
	}

	//--------------------------------------------------------------------------------	
	//Performs a swap of two value
	public void swapValues(int indexOne, int indexTwo){
		
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
		
	}
	
	//--------------------------------------------------------------------------------
	//This will print the array in a series of boxes
	public void printArray(){
		System.out.println("----------");
		for(int i=0; i<arraySize;i++){
			
			System.out.print("| "+ i + " | ");
			System.out.println(theArray[i] + " |");
			
			System.out.println("----------");
		}
	}
	
	//--------------------------------------------------------------------------------
	//This will generate a random set of numbers
	public void generateRandomArray(){
		
		for(int i =0; i<arraySize; i++){
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}
	//--------------------------------------------------------------------------------
	//This will get the value at a certain index
	public int getValueAtIndex(int index){
		
		if(index < arraySize) return theArray[index];
		
		return 0;	
	}
	//--------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------
	//Searches for a specific value inside an array
	public boolean doesArrayContainThisValue(int searchValue){
		
		boolean valueInArray = false;
		
		for(int i = 0; i<arraySize; i++){
			if(theArray[i] == searchValue){
			valueInArray = true;
			}
		}
		return valueInArray;
	}
	//--------------------------------------------------------------------------------
}