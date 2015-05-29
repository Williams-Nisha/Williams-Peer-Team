/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nisha
 */
public class InventoryControlTest {

    public InventoryControlTest() {
    }

    /**
     * Test of calWeightOfItems method, of class InventoryControl.
     */
    @Test
    public void testCalWeightOfItems() {
        System.out.println("calWeightOfItems");
        String name = "fuel";
        double weight = 400.0;
        double amount = 2.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 800.0;
        double result = instance.calWeightOfItems(name, weight, amount);
        assertEquals(expResult, result, 0.0001);
//test 2
        System.out.println("calWeightOfItems");
        name = "fuel";
        weight = -1;
        amount = 2.0;
        expResult = -1;
        result = instance.calWeightOfItems(name, weight, amount);
        if (result == -1) {
            System.out.println("Weight cannot be negative.");
        }
        assertEquals(expResult, result, 0.0001);
//test 3

        System.out.println("calWeightOfItems");
        name = "fuel";
        weight = 400;
        amount = -1;
        expResult = -1;
        result = instance.calWeightOfItems(name, weight, amount);
        if (result == -1) {
            System.out.println("Amount cannot be negative.");
        }
        assertEquals(expResult, result, 0.0001);
//test 4

        System.out.println("calWeightOfItems");
        name = "fuel";
        weight = 400;
        amount = 101;
        expResult = -1;
        result = instance.calWeightOfItems(name, weight, amount);
        if (result == -1) {
            System.out.println("Amount of units cannot be higher than 99.");
        }
        assertEquals(expResult, result, 0.0001);
//test 5

        System.out.println("calWeightOfItems");
        name = "fuel";
        weight = 0;
        amount = 2;
        expResult = 0;
        result = instance.calWeightOfItems(name, weight, amount);
        if (result == -1) {
            System.out.println("Amount of units cannot be higher than 99.");
        }
        assertEquals(expResult, result, 0.0001);
//test 6

        System.out.println("calWeightOfItems");
        name = "fuel";
        weight = 400;
        amount = 0;
        expResult = 0;
        result = instance.calWeightOfItems(name, weight, amount);
        if (result == -1) {
            System.out.println("Amount of units cannot be higher than 99.");
        }
        assertEquals(expResult, result, 0.0001);
//test 7

        System.out.println("calWeightOfItems");
        name = "fuel";
        weight = 400;
        amount = 99;
        expResult = 39600;
        result = instance.calWeightOfItems(name, weight, amount);
        if (result == -1) {
            System.out.println("Amount of units cannot be higher than 99.");
        }
        assertEquals(expResult, result, 0.0001);

//Test 1
        System.out.println("calTotalWeightOfItem");
        double[] totalWeight = new double[4];
        totalWeight[0] = 800;
        totalWeight[1] = 600;
        totalWeight[2] = 250;
        totalWeight[3] = 1500;
        expResult = 3150.0;
        result = instance.calTotalWeightOfItem(totalWeight);
        assertEquals(expResult, result,
                0.0001);
        //Test 2
        System.out.println("calTotalWeightOfItem");
        totalWeight[0] = 800;
        totalWeight[1] = 600;
        totalWeight[2] = 150;
        totalWeight[3] = 1500;
        expResult = -1;
        result = instance.calTotalWeightOfItem(totalWeight);
        if (result == -1) {
            System.out.println("Individual weight item is lower than allowed amount.");
        }
        assertEquals(expResult, result,
                0.0001);

    }
}
