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
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Enter number of players: ");
        //int numberOfUsers = sc.nextInt();
        
        ArrayList<User> users = new ArrayList<User>();
        
        for(int i = 0; i<4; i++){
            System.out.println("Enter name of player "+ (i+1) + " :");
            String userName = sc.next();
            User user = new User();
            user.setName(userName);
            users.add(i, user);
        }
        
        
        
       
       for(int i =0; i <4; i++){
           
           if(i==0){
               for(int x = 0 ; x < 14; x++){
                   Card.cards.add(new Card(Color.Blue, x));
               }
           }
           
           else if(i == 1) {
               for(int x = 0 ; x < 14; x++){
                   Card.cards.add(new Card(Color.Green, x));
               }
               //i++;
           }
           
           else if(i == 2) {
               for(int x = 0 ; x < 14; x++){
                   Card.cards.add(new Card(Color.Red, x));
               }
               //i++;
            }
           
           else if(i ==3) {
               for(int x = 0 ; x < 14; x++){
                   Card.cards.add(new Card(Color.Yellow, x));
               }
               //i++;
          }
       }
       
       System.out.print(Card.cards.size());
       
       
        
    }
    
}
