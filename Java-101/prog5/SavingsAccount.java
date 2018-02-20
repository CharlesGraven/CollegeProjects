package prog5;

/**
 *  Program #5
 *  SavingAccount is a typical savings
 *  account layout written in java
 *  CS108-3
 *  Date 3/20/17
 *  @author Charles Graven
 */
public class SavingsAccount extends Account{

	protected double rate;
	
	/**
	 * Default constructor
	 * Defaults the account to a balance of 0
	 * and a blank name
	 */
	public SavingsAccount(){
		super("", 0);
	}
	
	/**
	 * Constructor for SavingsAccount that sets 
	 * up the account automatically
	 * @param holderName, name of the person
	 * @param amount, initial amount 
	 * @param rate, the interest rate
	 */
	public SavingsAccount(java.lang.String holderName, double amount
			, double rate){
		super(holderName, amount);
		this.rate = rate;
		this.balance = amount;
	}
	
	@Override
	public boolean deposit(double depositAmount) {
		if(depositAmount > 0){
			this.balance = this.balance+depositAmount;
			return true;
		}
		return false;
	}

	@Override
	public double getAccountBalance() {
		return this.balance;
	}

	@Override
	public int getAccountNumber() {
		return this.id;
	}

	@Override
	public String getHolder() {
		return this.customerName;
	}

	@Override
	public int getLastAccountId() {
		return 0;
	}

	@Override
	public void setAccountBalance(double monies) {
		this.balance = monies;
	}

	@Override
	public void setHolder(String name) {
		this.customerName = name;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return new String("Saving account "+this.getId()+" Balance: $"
				+ this.getAccountBalance());
	}

	@Override
	public void updateAccount() {
		this.balance = this.balance + (this.rate*this.balance);
	}

	@Override
	public boolean withdraw(double withdrawAmount) {
		if(this.getAccountBalance()>=withdrawAmount){
			this.balance = this.balance - withdrawAmount;
			return true;
		}
		return false;
	}

	@Override
	public int getId() {
		return this.id;
	}
	
}
