/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lorien
 */
public class RandomControlTest {
    
    public RandomControlTest() {
    }

    /**
     * Test of calCoins method, of class RandomControl.
     */
    @Test
    public void testCalCoins() {
        System.out.println("calCoins");
        
        // Test Case #1
        
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int gold = 5;
        int silver = 6;
        int copper = 2;
        RandomControl instance = new RandomControl();
        int expResult =13;
        int result = instance.calCoins(gold, silver, copper);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        gold = -5;
        silver = 4;
        copper = 8;
        expResult =-1;
        result = instance.calCoins(gold, silver, copper);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #3");
        
        // input values for test case 2
        gold = 4;
        silver = -6;
        copper = 7;
        expResult =-1;
        result = instance.calCoins(gold, silver, copper);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        gold = 1;
        silver = 4;
        copper = -23;
        expResult =-1;
        result = instance.calCoins(gold, silver, copper);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        gold = 0;
        silver = 0;
        copper = 0;
        expResult =0;
        result = instance.calCoins(gold, silver, copper);
        assertEquals(expResult, result);
    }
    
}
