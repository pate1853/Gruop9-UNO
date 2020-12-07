/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
                 UnoCard.Value[] values = new UnoCard.Value[]{UnoCard.Value.DrawTwo,UnoCard.Value.Skip,UnoCard.Value.Reverse };
                 for(UnoCard.Value value : values){
                     cards[cardsInDeck++] = new UnoCard(color, value);
                     cards[cardsInDeck++] = new UnoCard(color, value);
                     }
                 }
                 
         }
    //used to check whether there is no card in the deck
    public boolean isEmpty(){
       return cardsInDeck == 0;
    }
    
    public void shuffle(){
        //n is for how many cards in the deck
        int n = cards.length;
        Random rand = new Random();
        for(int i = 0; i < cards.length; i++){
            //get a random index of array past the current index
            int randomValue = i + rand.nextInt(n - i);
            UnoCard randomCard = cards[randomValue];
            cards[randomValue] = cards[i];
            cards[i] = randomCard;
       }
    
    
}
public UnoCard drawCard() throws IllegalArgumentException{
    if(isEmpty()){
        throw new IllegalArgumentException("there is no card in the deck");
    }
    return cards[--cardsInDeck];
} 

//if someone play the drawTwo card, 
public UnoCard[] drawCard(int n){
    if(n > cardsInDeck){
        throw new IllegalArgumentException("can not draw " + n + " there are only "+ cardsInDeck + "cards." );
    }
    UnoCard[] playerGet = new UnoCard[n];
    for(int i=0; i < n; i++){
        playerGet[i] = cards[--cardsInDeck];
    }
            return playerGet;
}
        
}    
