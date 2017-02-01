package prog1;

/**
 *  Program #1
 *  The program will measure the weight of every 
 *  cell in a 2D array
 *  CS108-3
 *  1/27/17
 *  @author Charles Graven
 */
public class Prog1A {
	
	public static void main(String arguments[]){

		int[][] args = {{245,248,255,255,216,213,211},
				{245,158,158,158,101,100,85},
				{245,158,160,160,160,100,100},
				{245,245,245,200,200,130,100},
				{245,245,245,245,240,240,130}};
		
		double[][] newArray = new double[5][7];
		
		for(int i = 0; i < args.length; i++){
			for(int j = 0; j < args[0].length; j++){
				
				//Get weight of the cell and put it in newArray
				double x = xWeight(args,i,j);
				double y = yWeight(args,i,j);
				newArray[i][j] = x+y;
				
				//Properly display newArray in rows and columns
				if(j==args[0].length-1)
					System.out.println(newArray[i][j]);
				else
					System.out.printf("%f \t", newArray[i][j]);
			}
		}
		
		System.out.println("****************************");
		
		//Printing the lowest weights of each row
		for(int i = 0; i < args.length; i++){
			System.out.println("Row "+i+"'s lowest weight is "+lowestWeight(newArray, i));
		}
	}
	
	/**
	 * Find the xWeight(Row weight) of the cell in the 2D array
	 * 
	 * @param ar, 2D array being calculated
	 * @param row, the target row of the array
	 * @param col, the target column of the array
	 * @return the targeted cells weight in its row(x axis)
	 */
	public static double xWeight(int[][] ar, int row, int col){
		int left = 0;
		int right = 0; 
		int abs = 0;
		
		if(col == 0){
			left = ar[row][ar[0].length-1];
			right = ar[row][col+1];
		}else if(col == ar[0].length-1){
			left = ar[row][col-1];
			right = ar[row][0];
		}else{
			left = ar[row][col-1];
			right = ar[row][col+1];
		}
		
		abs = Math.abs(left-right);
		return abs*abs;
	}
	
	/**
	 * Find the yWeight(Column weight) of the cell in the 2D array
	 * 
	 * @param ar, 2D array being calculated
	 * @param row, the target row of the array
	 * @param col, the target column of the array
	 * @return the targeted cells weight in its column(y axis)
	 */
	public static double yWeight(int[][] ar, int row, int col){
		int top = 0;
		int bottom = 0;
		int abs = 0;
		
		if(row==0){
			top = ar[ar.length-1][col];
			bottom = ar[row+1][col]; 
		}else if(row==ar.length-1){
			top = ar[row-1][col];
			bottom = ar[0][col];
		}else{
			top = ar[row-1][col];
			bottom = ar[row+1][col];
		}
		
		abs = Math.abs(top-bottom);
		return abs*abs;
	}
	
	/**
	 * Find the lowest weight in a certain row
	 * 
	 * @param ar, target array to find lowest
	 * @param row, the target row in the array
	 * @return the lowest weight in the row
	 */
	public static double lowestWeight(double[][] ar, int row){
		double lowest = 10000.0;
		
		for(int i = 0; i < ar[0].length; i++){
			if(ar[row][i]<lowest){
				lowest = ar[row][i];
			}
		}
		return lowest;
	}
	
}
