package prog2;

import java.util.ArrayList;
/**
 *  Program #2 (part 2)
 *  The program will loop through a few cellphone objects
 *  and find the one that costs the most
 *  CS108-3
 *  2/9/17
 *  @author Charles Graven
 */
public class Prog2c {
	
	public static void main(String[] args){
		System.out.println("Program2, Charles Graven, cssc0505");
		
		CellPhone Iphone = new CellPhone("Apple","Iphone s6",111.1);
		CellPhone Galaxy = new CellPhone("Samsung", "Galaxy 9", 332.0);
		CellPhone Note = new CellPhone("Nokia","Lumia", 555.0);
		
		ArrayList<CellPhone> list = new ArrayList<CellPhone>();
		list.add(Iphone);
		list.add(Galaxy);
		list.add(Note);
		
		CellPhone lowest = new CellPhone("","",2000);
		
		for(CellPhone p : list){
			
			if(p.getRetailPrice() < lowest.getRetailPrice())
				lowest = p;
		}
		
		System.out.println("The lowest priced phone is:\n" + lowest.getManufact()+
				" "+lowest.getModel()+" for $"+lowest.getRetailPrice());
	}
}
