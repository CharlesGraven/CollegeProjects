package prog5;

/**
 *  Program #5
 *  CheckingAccount is a class written to match
 *  the style of a checking account
 *  CS108-3
 *  Date 3/20/17
 *  @author Charles Graven
 */
public class CheckingAccount extends Account{
	
	private double costPerMonth;
	
	public CheckingAccount(){
		super("", 0);
	}
	public CheckingAccount(java.lang.String holderName, double amount,
			double costPerMonth) {
		super(holderName, amount);
		this.balance = amount;
		this.costPerMonth = costPerMonth;
	}

	@Override
	public boolean deposit(double depositAmount) {
		if(depositAmount>0){
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
		return new String("Checking account "+this.getId()+" Balance: $"
				+ this.getAccountBalance());
	}

	@Override
	public void updateAccount() {
		
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
