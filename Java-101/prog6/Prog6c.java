package prog6;

public class Prog6c {

	public static void main(String[] args){
		System.out.println(recursion(4,3));
		
	}
	
	/**
	 * 
	 * @param i
	 */
	public static double recursion(double number, double base){
		if(base == 1){
			return number;
		}else if(base==0){
			return 1;
		}else{
			return number*recursion(number,base-1);
		}
	}
}
