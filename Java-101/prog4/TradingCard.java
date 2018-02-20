package prog4;

/**
 *  Program #4
 *  TradingCard is the foundation class for 
 *  any type of trading card
 *  CS108-3
 *  Date 3/6/2017
 *  @author  Charles Graven
 */

public class TradingCard {
	private String game;
	protected String name;
	protected String imageFile;

	/**
	 * Default constructor that sets every
	 * field to an empty string
	 */
	public TradingCard() {
		this.game = "";
		this.name = "";
		this.imageFile = "";
	}

	/**
	 * Constructor that only adds game
	 * @param game, game of the card
	 */
	public TradingCard(String game) {
		this.game = game;
		this.name = "";
		this.imageFile = "";
	}

	/**
	 * Constructor that adds every field in the class
	 * @param game, game of the card
	 * @param name, name of the card
	 * @param imageFile, image file to read from
	 */
	public TradingCard(String game, String name, String imageFile) {
		this.game = game;
		this.name = name;
		this.imageFile = imageFile;
	}

	/**
	 * Setter for game
	 * @param game, game to set
	 */
	public void setGame(String game) {
		this.game = game;
	}

	/**
	 * Getter for game
	 * @return game, game of the card
	 */
	public String getGame() {
		return this.game;
	}

	/**
	 * Prints the game of the card
	 */
	public void print() {
		System.out.println(game);
		System.out.println();
	}
}
