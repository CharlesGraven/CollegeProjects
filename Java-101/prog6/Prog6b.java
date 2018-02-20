package prog6;

public class Prog6b {

	public static void main(String[] args){
		recursion(100);
		
	}
	
	/**
	 * 
	 * @param i
	 */
	public static void recursion(int i){
		if(i<10){
			System.out.println(i);
			return;
		}else{
			System.out.print(i%10);
			recursion(i/10);
		}
	}
}
