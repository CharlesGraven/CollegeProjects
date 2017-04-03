package prog4;

/**
 *  Program #4
 *  SportsCard extends the TradingCard class and
 *  adds the fields team, position, and isRookie
 *  in order to build a proper sport trading card
 *  CS108-3
 *  Date 3/6/2017
 *  @author Charles Graven
 */
class SportsCard extends TradingCard{
	//Class fields
	protected String team;
	private String position;
	private boolean isRookie;
	
	/**
	 * Constructor. Create a card where game defaults to "Baseball"
	 * @see TradingCard
	 */
	public SportsCard() {
		super("Baseball","","");
	}

	/**
	 * Constructor. Create a card with given data.
	 * 
	 * @see TradingCard Calls super(game, name, imageFile)
	 * @param String game game of which this card is a member
	 * @param String name player name
	 * @param String team sports team to which player belongs
	 * @param String position field position (e.g. catcher, pitcher, outfielder)
	 * @param boolean isRookie true if card is the player's rookie season card
	 */
	public SportsCard(String game, String name, String imageFile, 
			String team, String position, boolean isRookie) {
		super(game, name, imageFile);
		this.team = team;
		this.position = position;
		this.isRookie = isRookie;
	}
	
	/**
	 * Update the players name
	 * @param String name players name
	 */
	protected void updateName(String name) {
		this.name = name;
	}

	/**
	 * Overrides TradingCard.print() to output the following string
	 * Game: players_name as a players_position for the players_team
	 * Ex: Baseball: Babe Ruth as a outfielder for the Yankees
	 */
	@Override
	public void print() {
		System.out.println(this.getGame() +
				":" + this.name + " as a " + 
				this.position + " for the " + 
				this.team+"\n");
	}
}