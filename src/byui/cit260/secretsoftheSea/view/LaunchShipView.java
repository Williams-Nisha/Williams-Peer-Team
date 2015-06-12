/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.ShipControl;
import java.util.Scanner;

/**
 *
 * @author Nisha
 */
public class LaunchShipView {

    private final String MENU = "\n"
            + "\n----------------------------------"
            + "\n|Launch Ship                      |"
            + "\n----------------------------------"
            + "\nU - Move Up"
            + "\nD - Move Down"
            + "\nL - Move Left"
            + "\nR - Move Right"
            + "\nM - Launch"
            + "\nE - Exit"
            + "\n----------------------------------";

    public void displayMenu() {

        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu

            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string

            this.doAction(selection); // do action based on selection

        } while (selection != 'E'); // a selection is not "Exit"
    }

    private String getInput() {

        boolean valid = false; // indicates if the name has been retrieved 
        String choice = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { // while a valid name has not been retrieved 

            // prompt for the player's name
            System.out.println("To launch ship, enter L. To position ship, enter movement.");

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

        if (choice == 'U') {
            System.out.println("Move Up");
        } else if (choice == 'D') {
            System.out.println("Move Down");
        } else if (choice == 'L') {
            System.out.println("Move Left");
        } else if (choice == 'R') {
            System.out.println("Move Right");
        } else if (choice == 'L') {
            checkLaunch();
        } else {
            System.out.println("***Please enter a valid selection");
        }
    }
            private void checkLaunch() {
        ShipControl ins = new ShipControl();
    }
    }
