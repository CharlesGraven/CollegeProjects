package prog7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *  Program #7
 *  This class uses a number of generic methods
 *  to cater to multiple types of Arraylists
 * 	CS108-3
 *  Date 4/26/17
 *  @author Charles Graven
 */
public class Prog7a {

	/**
	 * Removes any objects that are the same in a list
	 * @param list to sort through
	 * @return new array list with no duplicates
	 */
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		
		ArrayList<E> addedObjects = new ArrayList<E>();
		for(E object : list){
			if(!addedObjects.contains(object)){
				addedObjects.add(object);
			}
		}

		return addedObjects;
	}
	
	/**
	 * Shuffles the list in random form
	 * @param list, to be shuffled
	 */
	public static <E> void shuffle(ArrayList<E> list){
		long seed = System.nanoTime();
		Collections.shuffle(list, new Random(seed));
		//System.out.print(list);
	}
	
	/**
	 * Find the largest object in an arraylist and return it
	 * @param list to sort through
	 * @return largest object
	 */
	public static <E extends Comparable<E>>	E max(ArrayList<E> list){
		E maximum = list.get(0);
		
		for(E object : list){
			if(object.compareTo(maximum)>0){
				maximum = object;
			}
		}
		
		return maximum;
	}
	
	public static <E> void main(String[] arguments){
			Scanner scnr = new Scanner(System.in);
			System.out.println("Program 5, Charles Graven, cssc0505");
			
			String input = scnr.nextLine();
			
			//Split up the String
			@SuppressWarnings("unchecked")
			E[] inputs = (E[]) input.split(" ");
			
			ArrayList list = null;
			
				//Check if we are reading Strings
				if(((String) inputs[0]).equalsIgnoreCase("S")){
					
					list = new ArrayList<String>();
					
				//Check if we are reading doubles
				}else if(((String) inputs[0]).equalsIgnoreCase("D")){
					
					 list = new ArrayList<Double>();
					
				//Check if we are reading Integers
				}else if(((String) inputs[0]).equalsIgnoreCase("I")){
					
					 list = new ArrayList<Integer>();
				
				//If none of these exist then it is an error	 
				}else{
					
					System.out.println("invalid type");
				}
				
			//Place all of the values into the generic list
			for(int i = 2; i < inputs.length; i++){
				list.add(inputs[i]);
			}
			
			//Run all of the tests
			System.out.println("Original : " + list.toString());
			System.out.println("Unique " + removeDuplicates(list));
			shuffle(list);
			System.out.println("Shuffled " + list.toString());
			System.out.println("Maximum: "+max(list));
	}
}