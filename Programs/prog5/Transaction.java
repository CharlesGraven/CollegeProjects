package prog5;

/**
 *  Program #5
 *  Transaction class handles the transactions
 *  that the people make to the bank
 *  CS108-3
 *  Date 3/20/17
 *  @author Charles Graven
 */
public interface Transaction {

	/**
	 * See if people can deposit the amount
	 * @param amt, amount being deposited
	 * @return can the money be deposited
	 */
	public boolean deposit(double amt);
	
	/**
	 * See if the amount can be withdrawn
	 * @param amt, amount being withdrawn
	 * @return can the money be withdrawn
	 */
	public boolean withdraw(double amt);
}
