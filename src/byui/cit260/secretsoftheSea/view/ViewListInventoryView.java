/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.InventoryControl;
import byui.cit260.secretsoftheSea.control.RandomControl;
import java.util.Scanner;
import byui.cit260.secretsoftheSea.exceptions.InventoryControlException;

/**
 *
 * @author Nisha
 */
public class ViewListInventoryView extends View {

    public ViewListInventoryView() {
        super("\n----------------------------------"
                + "\n|Inventory Items  - Supplies      |"
                + "\n----------------------------------"
                + "\nF - Food - each unit is 100 lbs"
                + "\nW - Water - each unit is 50 lbs"
                + "\nG - Fuel - each unit is 40 lbs"
                + "\nM - Munitions - each unit is 20 lbs"
                + "\nT - Total inventory weight"
                + "\nQ - Quit "
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);
        Scanner keyboard = new Scanner(System.in);
        try {
            switch (choice) {
                case 'F':
                    System.out.println("\n*** Please enter how many units from 0-99 you would like.: ***");
                    getInput2("food", 100);
                    break;
                case 'W':
                    System.out.println("\n*** Please enter how many units from 0-99 you would like.: ***");
                    getInput2("water", 50);
                    break;
                case 'G':
                    System.out.println("\n*** Please enter how many units from 0-99 you would like.: ***");
                    getInput2("fuel", 40);
                    break;
                case 'M': // create and start a new game
                    System.out.println("\n*** Please enter how many units from 0-99 you would like.: ***");
                    getInput2("munitions", 20);
                    break;
                case 'T': // display total inventory weight
                    InventoryControl tw = new InventoryControl();
                    double[] totalWeight = new double[4];
                    totalWeight[0] = 400;
                    totalWeight[1] = 250;
                    totalWeight[2] = 160;
                    totalWeight[3] = 120;
                    tw.calTotalWeightOfItem(totalWeight);

                case 'Q': // quit program
                    return true;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
            }
        } catch (InventoryControlException me) {
            System.out.println(me.getMessage());
        }
        return false;
    }

    private void getInput2(String name, double weight)
            throws InventoryControlException {
        try {
            Scanner keyboard = new Scanner(System.in);
            double amount = Double.parseDouble(keyboard.next());
            InventoryControl ins = new InventoryControl();
            double w = ins.calWeightOfItems(name, weight, amount);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number." + " Try again or enter Q to quit.");
        }
    }
}
