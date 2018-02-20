package prog5;

/**
 *  Program #5
 *  The Account class lays out all of the
 *  perks a basic account needs
 *  CS108-3
 *  Date 3/20/17
 *  @author Charles Graven
 */
public abstract class Account implements Transaction{

	protected String customerName;
	protected double balance;
	protected int id;
	protected double lastPurchase;
	
	/**
	 * Default Account constructor that sets up
	 * the basics of an account
	 * @param customerName, name of the person
	 * @param initialInvestment, the initial ammount deposited
	 */
	public Account(java.lang.String customerName, double initialInvestment) {
		this.customerName = customerName;
		this.balance = initialInvestment;
	}
	
	/**
	 * Gets the account balance
	 * @return the accounts balance
	 */
	public abstract double getAccountBalance();
	
	/**
	 * Gets the account number
	 * @return the account number
	 */
	public abstract int getAccountNumber();
	
	/**
	 * Gets the name of the person holding the account
	 * @return name of the holder
	 */
	public abstract java.lang.String getHolder();
	
	/**
	 * Gets the last account Id
	 * @return las account id
	 */
	public abstract int getLastAccountId();
	
	/**
	 * Sets the accounts balance
	 * @param monies being set into the account
	 */
	public abstract void setAccountBalance(double monies);
	
	/**
	 * Sets the name of the holder
	 * @param name of the holder
	 */
	public abstract void setHolder(java.lang.String name);
	
	/**
	 * Sets the id of the account
	 * @param id of the account
	 */
	public abstract void setId(int id);
	
	/**
	 * Gets the id of the account
	 * @return the id 
	 */
	public abstract int getId();
	
	/**
	 * Builds a string that displays the important
	 * elements of an account class
	 */
	public abstract java.lang.String toString();
	
	/**
	 * updates the necessary parts of an account
	 */
	public abstract void updateAccount();
	
	/**
	 * Tests the deposit
	 * @return if the deposit went through
	 */
	public abstract boolean deposit(double depositAmount);
	
	/**
	 * Tests the withdraw
	 * @return if the withdraw allowed
	 */
	public abstract boolean withdraw(double withdraw);
}
