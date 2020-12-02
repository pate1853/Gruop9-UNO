/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The Deck class consists of 108 Uno cards. There are 4 suits: red, green, blue, yellow
 * each consisting of one 0 card, two 1s, 2s...8s, 9s cards; two Draw Two cards; two Skip cards; and two Reverse cards.
 * in addition, there are four Wild cards and four Wild Draw Four cards.
 */
public class GroupOfCards {

        private UnoCard[] cards;
        //tracking how many cards in the deck
        private int cardsInDeck;

    public GroupOfCards() {
        cards = new UnoCard[108];
    }
    //build a deck of 108 cards and assigning specific color and value to each of them
    public void buildCards(){
        //put 4 colors into this array
         UnoCard.Color[] colors = UnoCard.Color.values();
         cardsInDeck = 0;
         //this forloop used to assign value 0-9 to each color(red, green, blue and yellow 
         for(int i=0; i<colors.length-1; i++){
                 UnoCard.Color color = colors[i];
                 //making 0 cards for each color, bcz 0 is a single card
                 cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(0));
                 //assign 1-9 to every color
                 for(int j=1;j<10;j++){
                     //double them
                     cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
                     cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
                 }
                 
                 
                 }
}
    
        
    
    
    
    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

}//end class
