package prog2;

import java.util.Scanner;

/**
 *  Program #2 (part 1)
 *  The program will get user input to create a cell phone object
 *  CS108-3
 *  2/9/17
 *  @author Charles Graven
 */
public class Prog2b {

	public static void main(String[] arguments){
		System.out.println("Program2, Charles Graven, cssc0505");
		
		String manufact;
		String model;
		double price;
		
		Scanner scnr = new Scanner(System.in);
		
		manufact = scnr.nextLine();
		model = scnr.nextLine();
		price = scnr.nextDouble();
		
		CellPhone cellPhone = new CellPhone(manufact, model,price);
		
		System.out.println("Here is the data you provided:");
		System.out.println("Manufacturer: "+cellPhone.getManufact());
		System.out.println("Model number: "+cellPhone.getModel());
		System.out.println("Retail price: $"+cellPhone.getRetailPrice());
	}
}
