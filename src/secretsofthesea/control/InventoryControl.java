/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea.control;

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

    public double calWeightOfItems(String name, double weight, double amount) {

        if (amount < 0) {
            return -1;
        }
        if (amount > 99) {
            return -1;
        }
        if (weight < 0) {
            return -1;
        }

        double totalWeight = (weight * amount);
        System.out.println("You have added" + amount + "units of " + name + "for a total weight of " + totalWeight);
        return totalWeight;

    }
//fuel, water, food, munition

    public double calTotalWeightOfItem(double[] totalWeight) {
        for (int i = 0; i < totalWeight.length; i++) {
        if (totalWeight[i] < 0) {
            return -1;
        }
        if (totalWeight[i] > 10000) {
            return -1;
        }

        if (totalWeight[i] < 200) {
            return -1;
        }
        }
        int i=0;
        int sum = 0;
        for (i = 0; i < totalWeight.length; i++) {
            sum += totalWeight[i];

        }
        System.out.println("The total weight for your supplies are " + sum);
        return sum;
    }
}
