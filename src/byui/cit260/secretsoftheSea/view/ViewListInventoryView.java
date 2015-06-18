/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.InventoryControl;
import java.util.Scanner;

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
            + "\nQ - Quit "
            + "\n----------------------------------");
    }
     @Override
    public boolean doAction(Object obj) {
        
        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);
        

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

            case 'Q': // quit program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
            return false;
    }

    private void getInput2(String name, double weight) {
        Scanner keyboard = new Scanner(System.in);
        double amount = keyboard.nextDouble();
        InventoryControl ins = new InventoryControl();
        double w = ins.calWeightOfItems(name, weight, amount);
    }
}
