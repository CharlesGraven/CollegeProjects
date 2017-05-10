package prog7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *  Program #7
 *  This class tests the generic couple class
 *  CS108-3
 *  Date 4/26/17
 *  @author Charles Graven
 */
public class CoupleClient<T> {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner fReader = new Scanner(System.in);
		String file = fReader.next();
		try {
			File fInput = new File(file);
			fReader = new Scanner(fInput);
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("File not found");
			System.exit(0);
		}
		Couple<String> cs = new Couple<String>(fReader.next(), fReader.next());
	    Couple<Double> cd = new Couple<Double>(fReader.nextDouble(), fReader.nextDouble());
	    Couple<Integer> ci = new Couple<Integer>(fReader.nextInt(), fReader.nextInt());		
	    
	      System.out.println(cs);
	      System.out.println(cd);
	      cs.setFirst("moonlit");
	      cd.setSecond(-12.34);
	      System.out.println(cs);
	      System.out.println(cd);

	      Couple<String> cs2 = new Couple<String>("one", "Couple");
	      Couple<Couple<String> > ccs = new Couple<Couple<String> >(cs, cs2);
	      System.out.println(ccs);
	      
	      Couple<String> cs3 = new Couple<String>("dark", "night");
	      
	      System.out.println("cs equals cd: " + cs.equals(cd));
	      System.out.println("cs equals cs2: " + cs.equals(cs2));
	      System.out.println("cs equals cs3: " + cs.equals(cs3));
	      System.out.println("cs equals ccs: " + cs.equals(ccs));
	      System.out.println("cs equals ccs.first: " + cs.equals(ccs.getFirst()));
	      System.out.println("cs equals ccs.second: " + cs.equals(ccs.getSecond()));
	      
	      System.out.println(cs2.getFirst() + " " + cs.getFirst() + " " + cs3.getSecond());
	}
	/**
	 * Making sure that the program is used properly
	 * @param args the arguments of the program
	 */
	public static void checkUsage(String[] args)
	{
		if (args.length != 1) 
		{
			System.out.println("Usage: java CoupleClient inputFileName");
			System.exit(0);
		}
	}
}

