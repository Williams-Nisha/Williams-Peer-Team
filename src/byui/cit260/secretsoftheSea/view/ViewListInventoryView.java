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
public class ViewListInventoryView {

    public ViewListInventoryView() {
    }

    private final String MENU = "\n"
            + "\n----------------------------------"
            + "\n|Inventory Items  - Supplies      |"
            + "\n----------------------------------"
            + "\nF - Food - each unit is 100 lbs"
            + "\nW - Water - each unit is 50 lbs"
            + "\nG - Fuel - each unit is 40 lbs"
            + "\nM - Munitions - each unit is 20 lbs"
            + "\nQ - Quit "
            + "\n----------------------------------";

    public void displayMenu() {

        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu

            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string

            this.doAction(selection); // do action based on selection

        } while (selection != 'Q'); // a selection is not "Quit"
    }

    private String getInput() {

        boolean valid = false; // indicates if the supply has been retrieved 
        String choice = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { // while a valid input has not been retrieved 

            // prompt for the supply Letter
            System.out.println("You will need the following supplies. Please select each supply and how many units you would like. Please enter the letter for the supply you are choosing.");

            // get the name from the keyboard and trim off the blanks
            choice = keyboard.next();
            choice = choice.trim();

            // if the name is invalid (less than two character in length))
            if (choice.length() > 1) {
                System.out.println("Invalid selection - please try again");
                continue; // and repeat again

            }
            break; // out of the (exit) the repetition 
        }

        return choice; // return the name
    }

    private void doAction(char choice) {

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
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

    }

    private void getInput2(String name, double weight) {
        Scanner keyboard = new Scanner(System.in);
        double amount = keyboard.nextDouble();
        InventoryControl ins = new InventoryControl();
        double w = ins.calWeightOfItems(name, weight, amount);
    }
}
