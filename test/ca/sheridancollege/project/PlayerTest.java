/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 *
 * @author Mu Zhang
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
  
    
    @Before
    public void setUp() {
         System.out.println("This will run before every test case!!");
    }
    
    @After
    public void tearDown() {
        System.out.println("This will run after every test case!!");
    }

 /**
     * Test of checkLength method, of class Player. This test gives a good input
     * of , which should easily be long enough to be a good length.
     */
    @Test
    public void testCheckIdGood() {
        System.out.println("checkId");
            String name = "Zhang";
        boolean expResult = true;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);
    }

    /**
     * A test that gives the checkId() a bad password and expects a bad result
     */
    @Test
    public void testCheckIdBad() {
        System.out.println("checkId");
        String name = "Mu";
        boolean expResult = false;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);

    }

    /**
     * A test that checks that when we give a user id of exactly length 3, we
     * see a pass.
     *
     * @Test
     */
    @Test
    public void testCheckIdBoundary() {
        System.out.println("checkId");
        String name = "Uno";
        boolean expResult = true;
        boolean result = Player.checkId(name);
        assertEquals(expResult, result);

    }



}
