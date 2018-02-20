package prog3;

import java.util.Scanner;

/**
 *  Program #3
 *  prog3 tests the ImageConverter class
 *  for functionality and correctness
 *  CS108-3
 *  Date 2/25/17
 *  @author Charles Graven
 */
public class Prog3b {
	public static void main(String[] args){
		System.out.println("Program 3, Charles Graven, cssc0505");
		
		testImageConverter();
	}
	
	/**
	 * Tester that calls every method in 
	 * ImageConverter to evaluate functionality
	 */
	public static void testImageConverter(){
		Scanner s = new Scanner(System.in);
		String file = s.next();
		
		ImageConverter ic = new ImageConverter();
		ic.readImage(file);
		ic.test(50, 100);
		ic.toBlue();
		ic.toRed();
		ic.toGreen();
		ic.toGrayscale();
	}
}
