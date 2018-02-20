package prog5;

/**
 *  Program #5
 *  The IRAAccount is a type of savings account
 *  commonly used for retirement
 *  CS108-3
 *  Date 3/20/17
 *  @author Charles Graven
 */
public class IRAAccount extends SavingsAccount{
	
	private int disbursementAge;
	private double earlyWithdrawalPenalty;
	
	/**
	 * Constructer that sets everything up for
	 * IRAAcounts
	 * @param holderName, name of the account holder
	 * @param amount, initial amount deposited
	 * @param rate, interest rate
	 * @param disbursementAge, when can the person take money out
	 * @param earlyWithdrawalPenalty, penatly for taking money out
	 */
	public IRAAccount(java.lang.String holderName, double amount
			, double rate, int disbursementAge, double earlyWithdrawalPenalty){
		this.customerName = holderName;
		this.balance = amount;
		this.rate = rate;
		this.setDisbursementAge(disbursementAge);
		this.setEarlyWithdrawalPenalty(earlyWithdrawalPenalty);
		
	}

	/**
	 * @return the disbursementAge
	 */
	public int getDisbursementAge() {
		return disbursementAge;
	}

	/**
	 * @param disbursementAge the disbursementAge to set
	 */
	public void setDisbursementAge(int disbursementAge) {
		this.disbursementAge = disbursementAge;
	}

	/**
	 * @return the earlyWithdrawalPenalty
	 */
	public double getEarlyWithdrawalPenalty() {
		return earlyWithdrawalPenalty;
	}

	/**
	 * @param earlyWithdrawalPenalty the earlyWithdrawalPenalty to set
	 */
	public void setEarlyWithdrawalPenalty(double earlyWithdrawalPenalty) {
		this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
	}
	
	@Override
	public java.lang.String toString(){
		return new String("IRA Savings account "+this.getId()+" Balance: $"
				+ this.getAccountBalance()+", Disbursement Age="+this.getDisbursementAge()+
				", Early Withdrawl Penaty="+this.getEarlyWithdrawalPenalty());
	}
}
