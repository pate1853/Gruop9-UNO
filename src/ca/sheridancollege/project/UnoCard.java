/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Mu Zhang
 */
public class UnoCard extends Card{
     private Color color;
    private Value value;
    
    public UnoCard(Color color, Value value){
        this.color = color;
        this.value = value;
    }
    
    enum Color{
        Red, Blue, Green, Yellow, Wild;
        
        private static final Color[] colors = Color.values();
        public static Color getColor(int i){
            return Color.colors[i];
        }
    }
    enum Value{
        Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse, Wild, Wild_Four;
        
        private static final Value[] values = Value.values();
        public static Value getValue(int i){
            return Value.values[i];
        }
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public Value getValue(){
        return this.value;
    }
    
       @Override
    public String toString(){
        return "color of card is: " + this.color +" value of card is: " + this.value;
    };

}
