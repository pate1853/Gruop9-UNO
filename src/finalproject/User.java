/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;

/**
 *
 * @author aryan
 */
public class User {

    private String user;
    private String name;
    
    public Card cards;
       
    public User(){
        
    }
    
    public User(String user){
      
        this.user = user;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
