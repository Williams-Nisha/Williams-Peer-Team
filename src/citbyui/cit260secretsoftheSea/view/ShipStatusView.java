/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260secretsoftheSea.view;

import java.util.Scanner;
import byui.cit260.secretsoftheSea.model.InventoryList;
import secretsofthesea.SecretsoftheSea;

/**
 *
 * @author kayla
 */
public class ShipStatusView {

    private final String ShipStatus = "\n"
            + "\n----------------------------------"
            + "\n|Ship Status                       |"
            + "\n----------------------------------"
            + "\nT - Storage"
            + "\nM - Morale"
            + "\nP - Speed"
            + "\nD - Defense"
            + "\nE - Exit"
            + "\n----------------------------------";

    public void ShipStatus() {
        char selection = ' ';
        do {
            System.out.println(ShipStatus); // display the main menu

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
            System.out.println("Please enter your selection below:");

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

    private void doAction(char selection) {
                switch (selection) {
            case 'T': // create and start a new game
                this.storage ();
                break;
            case 'M': // get and start an existing game
                this.morale ();
                break;
            case 'P': // display the help menu
                this.speed ();
                break;
            case 'D': // save the current game
                this.defense ();
                break;
            case 'E': // exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void storage() {
        int i = 0;
        if (i < 1) {
            System.out.println("You do not have anything stored in your ship.");
        } else if (i >= 9) {
            System.out.println("You have" + i + " items stored in your ship");
        } else if (i == 10) {
            System.out.println("You have reach the maximum amount of storage allowed on your ship.");
        }
    }

    private void morale() {
        int m = 0;
        if (m < 1) {
            System.out.println("Your crew has very low morale. Make sure you have enough food and water to sustain your ship.");
        } else if (1 == m || m <= 5) {
            System.out.println("Your crew\'s morale is getting low. Make sure you are taking care of them!");
        } else if (m ==5 || m <= 9 ) {
            System.out.println("Your crew\'s morall is doing well.");
        } else if (m == 10) {
        System.out.println("The morale on your ship is fantastic!");
    }
    }

    private void speed() {
        int p = 0;
        if (p < 1) {
            System.out.println("Your ship is very slow. You might want to find some new sails.");
        } else if (p == 1 || p <= 9) {
            System.out.println ("Your ship has an average speed. You can get a faster speed if you update your ship.");
        } else if (p == 10) {
            System.out.println("Your ship is super-duper fast!");
        }
    }

    private void defense() {
        int d = 0;
        if (d <= 5) {
            System.out.println("Your ship is in desperate need of repairs.");
        } else if (d == 5 || d <=9) {
            System.out.println("Your ship is damaged. You might want to repair it.");
        }  else if (d == 10) {
            System.out.println("Your ship looks great!");
        }
    }
}

