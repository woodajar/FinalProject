/**
 * SYST 17796 Project Winter 2019 Base code.
 * Modifier: Jared Woodard
 * Date: 2019-06-10
 */
package finalproject;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card 
{
    //default modifier for child classes
    
    private Colour colour;
    private Suit suit;
    private Value value;
    
    public enum Colour {RED, BLACK};
    public enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS};
    public enum Value {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
    JACK, QUEEN, KING};
        
        public Card (Colour c, Suit s, Value v)
        {
            colour = c;
            suit = s;
            value = v;
        }
        
        public Colour getColour() {
	return colour;
	}

	/**
	 * 
         * @param colour
	 */
	public void setColour(Colour colour) {
		this.colour = colour;
	}
        
        public Suit getSuit() {
	return suit;
	}

	/**
	 * 
         * @param suit
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
        
        public Value getValue() {
	return value;
	}

	/**
	 * 
         * @param suit
	 */
	public void setValue(Value value) {
		this.value = value;
	}
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public abstract String toString();
    
}