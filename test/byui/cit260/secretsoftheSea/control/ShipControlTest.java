/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

import byui.cit260.secretsoftheSea.exceptions.ShipControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lorien
 */
public class ShipControlTest {
    
    public ShipControlTest() {
    }
    

    /**
     * Test of calStorage method, of class ShipControl.
     */
    @Test
    public void testCalStorage() throws ShipControlException {
         
        this.console.println("calStorage");
        
          /**********************
         * * Test case #1
         * *******************/
        
         this.console.println("\tTest case #1");
        
        // input values for test case 1
        double height = 8.0;
        double width = 15.0;
        double length = 30.0;
        
        ShipControl instance = new ShipControl();
        
        double expResult = 3600.0; // expected output returned value
        
        // call function to run test
        double result = instance.calStorage(height, width, length);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
    
    /**********************
         * * Test case #2
         * *******************/
         
        this.console.println("\tTest case #2");
        
        // input values for test case 2
        height = 5.0;
        width = 10.0;
        length = 55.0;
        
        expResult = -1.0; // expected output returned value
        
        // call function to run test
        result = instance.calStorage(height, width, length);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /**********************
         * * Test case #3
         * *******************/
         
        this.console.println("\tTest case #3");
        
        // input values for test case 3
        height = 3.0;
        width = 30.0;
        length = 35.0;
        
        expResult = -1.0; // expected output returned value
        
        // call function to run test
        result = instance.calStorage(height, width, length);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         /**********************
         * * Test case #4
         * *******************/
         
        this.console.println("\tTest case #4");
        
        // input values for test case 4
        height = 4.0;
        width = 5.0;
        length = -12.0;
        
        expResult = -1.0; // expected output returned value
        
        // call function to run test
        result = instance.calStorage(height, width, length);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         /**********************
         * * Test case #5
         * *******************/
         
        this.console.println("\tTest case #5");
        
        // input values for test case 5
        height = 7.0;
        width = 8.0;
        length = 45.0;
        
        expResult = 2520.0; // expected output returned value
        
        // call function to run test
        result = instance.calStorage(height, width, length);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         /**********************
         * * Test case #6
         * *******************/
         
        this.console.println("\tTest case #6");
        
        // input values for test case 6
        height = 2.0;
        width = 20.0;
        length = 20.0;
        
        
        expResult = 800.0; // expected output returned value
        
        // call function to run test
        result = instance.calStorage(height, width, length);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         /**********************
         * * Test case #7
         * *******************/
         
       this.console.println("\tTest case #7");
        
        // input values for test case 7
        height = 10.0;
        width = 20.0;
        length = 45.0;
        
        expResult = 9000.0; // expected output returned value
        
        // call function to run test
        result = instance.calStorage(height, width, length);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    
}
}