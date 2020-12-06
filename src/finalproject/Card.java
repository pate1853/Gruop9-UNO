/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.*;

/**
 *
 * @author aryan
 */
public class Card {
    
    Color color;
    CardType type;
    public int number;
    private int totalCards = 56;
    
    public Card(){
        
    }
    
    public Card(Color color, int number){
        this.color = color;
        this.number = number;
    }
    
    public Color getColor(){
        return color;
    }
    
    public CardType getType(){
        return type;
    }
    
    public int getNumber(){
        return number;
    }
    
    public static ArrayList<Card> cards = new ArrayList<Card>();
}
