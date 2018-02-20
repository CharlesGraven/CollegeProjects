package prog4;

/**
 *  Program #4
 *  Character card extends the Trading Card class
 *  and adds the number of HP points and the attribute
 *  the character has in order to build a game trading card
 *  CS108-3
 *  Date 3/6/2017
 *  @author Charles Graven
 */
public class CharacterCard extends TradingCard{
	//Class fields
	private int number;
	private String attribute;
	
	/**
	 * Constructor. Create a blank card where game defaults to "Pokemon"
	 */
	public CharacterCard() {
		super("pokemon","","");
	}

	/**
	 * Constructor. Create a card with given data.
	 * 
	 * @see TradingCard Calls super(game, name, imageFile)
	 * @param String game game of which this card is a member
	 * @param String name character name
	 * @param String imageFile file name containing image of character
	 * @param int number series number
	 * @param String attribute description of character attributes
	 */
	public CharacterCard(String game, String name, String imageFile, int number, String attribute) {
		super(game,name,imageFile);
		this.number = number;
		this.attribute = attribute;
	}

	/**
	 * Update the name of the card
	 * @param String name, name of card
	 */
	public void updateName(String name) {
		this.name = name;
	}

	/**
	 * Overrides TradingCard.print() to output game: name
	 */
	@Override
	public void print() {
		System.out.println(this.getGame() +
				":" + this.name+"\n");
	}

	/**
	 * Dislplays the following output
	 * Game: character_name 
	 * HP character_number 
	 * Powers: character_attribute
	 */
	public void printAll() {
		System.out.println(this.getGame() +
				":" + this.name + "\nHP " + 
				this.number + "\nPowers: " + 
				this.attribute+"\n");
	}
}
