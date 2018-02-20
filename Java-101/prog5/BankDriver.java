package prog5;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files; 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program #5
 * Description: Demonstrates polymorphism and inheritance
 * Dependencies: Bank, Account, Transactions, CheckingAccount, SavingsAccount <, IRAAccount> 
 *  CS108-3
 *  Date 3/20/17
 *  @author Charles Graven, PattyKraft
 */
public class BankDriver {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Program 5, Charles Graven, cssc0505");
		System.out.println("Please enter the file to be read from.");
		String inputFile = s.nextLine();
		
		//Readin the input from the file, C:/Users/cjgra/Desktop/my.txt
		List<String> lines;
		try {
			String[] tokens = null;
			lines = Files.readAllLines(java.nio.file.Paths.get(inputFile), StandardCharsets.UTF_8);
			for(String line: lines){
				   tokens = line.split(",");
				  
					if(Integer.parseInt(tokens[0])==2){
						bank.addNewAccount(new CheckingAccount(tokens[1],
								Double.parseDouble(tokens[2]),
								Double.parseDouble(tokens[3])));
					}else{
						bank.addNewAccount(new SavingsAccount(tokens[1],
								Double.parseDouble(tokens[2]),
								Double.parseDouble(tokens[3])));
					}
			  }
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Create all the accounts
		System.out.println("Creating accounts...");
		
		//Store the accounts
		@SuppressWarnings("unchecked")
		ArrayList<Account> list = bank.getAccounts();
		printAccts(list, true);
		
		//Test transactions
		System.out.println("\nPerforming transactions...");
		bank.getAccountByIndex(0).deposit(200.00);
		bank.getAccountByIndex(1).withdraw(213.13);
		
		printAccts(list);

		//Test the update method
		System.out.println("\nUpdating accounts...");
		for (Account a : list){
			a.updateAccount();
		}
		printAccts(list, false);
	}

	/**
	 * Tests the accounts toString methods
	 * @param list, arrayList being iterated through
	 */
	private static void printAccts(ArrayList<Account> list){
		for (Account a : list){
			System.out.println(a);
		} 
	}
	
	/**
	 * Tests the accounts without the account holder
	 * @param list, arrayList being iterated through
	 * @param printHolder, true/false to print holder
	 */
	private static void printAccts(ArrayList<Account> list, boolean printHolder){
		if (printHolder)
			for (Account a : list){
				System.out.println("Customer: " + a.getHolder() + ", " + a);
			} 
		else
			printAccts(list);
	}
}