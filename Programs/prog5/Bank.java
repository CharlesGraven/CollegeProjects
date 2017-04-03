package prog5;

import java.util.ArrayList;

/**
 *  Program #5
 *  The bank class holds all of the accounts
 *  ran by the bank
 *  CS108-3
 *  Date 3/20/17
 *  @author Charles Graven
 */
public class Bank implements Transaction{

	private ArrayList<Account> accounts;
	private int id = 0;
	
	/**
	 * Default Constructor
	 */
	public Bank(){
		accounts = new ArrayList<Account>();
	}
	
	/**
	 * Add a new account
	 * @param a new account to add
	 */
	public void addNewAccount(Account a){
		a.setId(id);
		accounts.add(a);
		id++;
	}
	
	/**
	 * Get the account by index
	 * @param idx, index of the account
	 * @return the specific account
	 */
	public Account getAccountByIndex(int idx){
		for(Account a : accounts){
			if(a.getId()==idx){
				return a;
			}
		}
		return null;
	}
	
	/**
	 * Get the list of accounts
	 * @return the arraylist of accounts
	 */
	public java.util.ArrayList getAccounts(){
		return this.accounts;
	}
	
	/**
	 * Print an accounts toString method
	 */
	public java.lang.String toString(){
		return "";
	}
	
	@Override
	public boolean deposit(double amt) {
		
		return false;
	}

	@Override
	public boolean withdraw(double amt) {
		
		return false;
	}

}
