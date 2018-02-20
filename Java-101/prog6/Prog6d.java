package prog6;

import java.util.ArrayList;

public class Prog6d {
	public static void main(String[] args){
		System.out.println(factorial(5));
	}
	
	static ArrayList l = new ArrayList<Integer>();
	public static int factorial(int i){
		int tempVal = 0;
		l.add(i);
		if(i==1){
			System.out.println("factorial(1)");
			int other = 1;
			for(int j =1; j<=l.size(); j++){
				System.out.println("return "+j+"*"+other+" = "+(other*j));
				other *= j;
			}
			return 1;
		}else{
			System.out.println("factorial("+i+")");
			return factorial(i-1)*i;
		}
	}
}
