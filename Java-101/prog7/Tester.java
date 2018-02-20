package prog7;

import java.util.Scanner;

/**
 *  Program #7
 *  1-2 Line Description of class/program
 *  CS108-3
 *  Date 4/26/17
 *  @author Charles Graven
 */
public class Tester {

	/**
	 * linearSearch will check which each element for the index
	 * @param list to check
	 * @param key the Object to search for
	 * @return the index the object is at
	 */
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
		for(int i = 0; i < list.length; i++){
			if(list[i].equals(key)){
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Compare each element in the list to find the largest one
	 * @param list to sort through
	 * @return the largest Object
	 */
	public static <E extends Comparable<E>> E max(E[] list){
		E maximum = list[0];
		
		for(int i = 0; i < list.length; i++){
			if(list[i].compareTo(maximum)>0){
				maximum = list[i];
			}
		}
		return maximum;
	}
	
	/**
	 * Print out the array
	 * @param list to be printed
	 */
	private static <E> void print(E[] list){
		System.out.print("[");
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i]+", ");
		}
		System.out.print("]");
	}
	
	//Main method demonstrates the functionality
	@SuppressWarnings({"unchecked", "rawtypes"})
	public static <E> void main(String[] arguments){
		Scanner scnr = new Scanner(System.in);
		
		//Start at null and then find out what they will be
		Comparable key = null;
		Comparable[] elements = null;
		
		//Check if the first character is an I
		if(scnr.hasNext("I")){
			scnr.next(); //Increment
			
			int length = scnr.nextInt();
			elements = new Integer[length];//Get length
			for(int i = 0; i < elements.length; i++){
				//Add in each object to the array
				elements[i] = scnr.nextInt();
			}
			key = scnr.nextInt(); //Get the key
		}
		//Check if the first character is an S
		else if(scnr.hasNext("S")){
			scnr.next(); //Increment
			
			int length = scnr.nextInt();//Get length
			elements = new String[length];
			for(int i = 0; i < elements.length; i++){
				//Add in each object to the array
				elements[i] = scnr.next();
			}
			key = scnr.next(); //Get the key
		}
		//Check if the first character makes is D
		else if(scnr.hasNext("D")){
			scnr.next(); //Increment
			
			int length = scnr.nextInt(); //Get length
			elements = new Double[length];
			for(int i = 0; i < elements.length; i++){
				//Add in each object to the array
				elements[i] = scnr.nextDouble();
			}
			key = scnr.nextDouble(); //Get the key
		}
		
		System.out.println("Program 5, Charles Graven, cssc0505"); //masc ID
		
		//Demonstrate each of the methods
		System.out.println(max(elements));
		System.out.println(linearSearch(elements, key));
		print(elements);
	}
}

