package prog4;

/**
 *  Program #4
 *  CardCollection is used to test the extensions
 *  of the TradingCard class which are SportsCard and CharacterCard
 *  CS108-3
 *  Date 3/6/2017
 *  @author Charles Graven
 */
public class CardCollection {
		
	public static void main(String[] args){
		System.out.println("Program 4, Charles Graven, cssc0505");
		
		//Different variations of trading cards
		TradingCard babeRuth = new SportsCard("Baseball","Babe Ruth","null","yankees","FB",false);
		TradingCard Salamance = new CharacterCard("Pokemon","Salamance","null",200,"Dragon Breathe");
		TradingCard card = new TradingCard("Polo", "George","null");
		
		//Sportscards and character cards
		SportsCard soccer = new SportsCard("Soccer","David Beckham","image","LA Galaxy","Striker",false);
		SportsCard baseball = new SportsCard("Baseball","Barry Binds","null","Giants","OF",false);
		CharacterCard pikachu = new CharacterCard("Pokemon","Pikachu","null",200,"Thunder");
		CharacterCard voltorb = new CharacterCard("Pokemon","Voltorb","null",400,"Electric");
		
		//Testing all the different trading cards
		printCard(card);
		printCard(Salamance);
		printCard(babeRuth);
		
		//Testing the SportsCards and CharacterCards
		soccer.print();
		baseball.print();
		pikachu.printAll();
		voltorb.print();
		pikachu.print();
		voltorb.printAll();
		
		//Does the update method work?
		soccer.updateName("Paul");
		baseball.updateName("Jr.");
		soccer.print();
		baseball.print();
		
		//Checking the defaults
		CharacterCard charizard = new CharacterCard();
		SportsCard alfanzo = new SportsCard();
		
		charizard.print();
		alfanzo.print();
	}
	
	/**
	 * Prints the Card passed into the method
	 * @param t, trading card being passed in
	 */
	public static void printCard(TradingCard t){
		System.out.println("Printing...");
		t.print();
		System.out.println();
	}
}
