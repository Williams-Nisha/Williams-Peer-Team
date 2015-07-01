/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;
import byui.cit260.secretsoftheSea.exceptions.MapControlException;

/**
 *
 * @author Nisha
 */

/*
 40lbs*4 units=160
 water 60lbs*5units= 300
 food 100lb*2 units= 200
 munition 60lbs* 4 units=240

 get name from array
 get weight from array
 get units from array
 times the lbs and units for total weight of each individual item
 fuel, water, munition, 
 */
public class InventoryControl {

    public double calWeightOfItems(String name, double weight, double amount) 
    throws MapControlException {

        if (amount < 0) {
            throw new MapControlException("You must have at least 1 or more units of this item.");
        }
        if (amount > 99) {
            throw new MapControlException("You cannot have more than 99 units of this item.");
        }
        if (weight < 0) {
            throw new MapControlException("Item must weigh more than 1 pound.");
        }

        double totalWeight = (weight * amount);
        System.out.println("You have added" + amount + " units of " + name + " for a total weight of " + totalWeight);
        return totalWeight;

    }
//fuel, water, food, munition

    public double calTotalWeightOfItem(double[] totalWeight)
    throws MapControlException {
        for (int i = 0; i < totalWeight.length; i++) {
        if (totalWeight[i] < 0) {
            throw new MapControlException("Total weight cannot be negative.");
        }
        if (totalWeight[i] > 10000) {
            throw new MapControlException("Total weight cannot be over 10,000 pounds.");

        }
        }
        int i=0;
        int sum = 0;
        for (double tw: totalWeight) {
            sum += tw;

        }
        System.out.println(
                "******************************\n"
                + "This test includes the following example array..\n"
                + "double [] totalWeight = new double [4];\n"
                + "totalWeight [0] = 400;\n"
                + "totalWeight [1] = 250;\n"
                + "totalWeight [2] = 160;\n"
                + "totalWeight [3] = 120;\n"
                + "When the array is inputted into the function, "
                + "the total weight for your supplies are " + sum + " lbs\n" +
                 "******************************\n");
        return sum;
    }
}
