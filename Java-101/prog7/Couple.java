package prog7;

/**
 *  Program #7
 *  Couple class will compare two objects
 *  of any type
 *  CS108-3
 *  Date 4/18/17
 *  @author Charles Graven
 */
class Couple<T> {
	//generic objects
	private T first;
	private T second;
	
	/**
	 * Constructor for couple class
	 * @param f, first object
	 * @param s, second object
	 */
	Couple(T f, T s) {
		first = f;
		second = s;
	}
	
	/**
	 * getter for first object
	 * @return first 
	 */
	T getFirst() {
		return first;
	}
	
	/**
	 * getter for second object
	 * @return second
	 */
	T getSecond() {
		return second;
	}
	
	/**
	 * setter for the first object
	 * @param f, object to pass
	 */
	void setFirst(T f) {
	first = f;
	}
	
	/**
	 * setter for the second object
	 * @param s, object to pass
	 */
	void setSecond(T s) {
		second = s;
	}
	
	// override an Object method
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public boolean equals(Object otherObj){
		boolean isEqual = false;
		Couple<T> o = null;
			if (this.getClass() == otherObj.getClass()) {
				o = (Couple<T>) otherObj;
				isEqual = (this.first.equals(o.first) && (this.second.equals(o.second)));
			}
			
			return isEqual;
	 }
	
}