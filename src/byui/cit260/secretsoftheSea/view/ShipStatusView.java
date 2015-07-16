/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import java.util.Scanner;
import byui.cit260.secretsoftheSea.model.InventoryList;
import secretsofthesea.SecretsoftheSea;

/**
 *
 * @author kayla
 */
public class ShipStatusView extends View {

    public ShipStatusView(){
        super("\n----------------------------------"
            + "\n|Ship Status                       |"
            + "\n----------------------------------"
            + "\nT - Storage"
            + "\nM - Morale"
            + "\nP - Speed"
            + "\nD - Defense"
            + "\nQ - Quit"
            + "\n----------------------------------");
    }

        @Override

    public void doAction(Object obj) {

        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);

                switch (choice) {
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
            case 'Q': // exit the program
                return;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
                return;
    }

    private void storage() {
        int i = 0;
        if (i < 1) {
            this.console.println("You do not have anything stored in your ship.");
        } else if (i >= 9) {
            this.console.println("You have" + i + " items stored in your ship");
        } else if (i == 10) {
            this.console.println("You have reach the maximum amount of storage allowed on your ship.");
        }
    }

    private void morale() {
        int m = 0;
        if (m < 1) {
            this.console.println("Your crew has very low morale. Make sure you have enough food and water to sustain your ship.");
        } else if (1 == m || m <= 5) {
            this.console.println("Your crew\'s morale is getting low. Make sure you are taking care of them!");
        } else if (m ==5 || m <= 9 ) {
            this.console.println("Your crew\'s morall is doing well.");
        } else if (m == 10) {
        this.console.println("The morale on your ship is fantastic!");
    }
    }

    private void speed() {
        int p = 0;
        if (p < 1) {
            this.console.println("Your ship is very slow. You might want to find some new sails.");
        } else if (p == 1 || p <= 9) {
            this.console.println ("Your ship has an average speed. You can get a faster speed if you update your ship.");
        } else if (p == 10) {
            this.console.println("Your ship is super-duper fast!");
        }
    }

    private void defense() {
        int d = 0;
        if (d <= 5) {
            this.console.println("Your ship is in desperate need of repairs.");
        } else if (d == 5 || d <=9) {
            this.console.println("Your ship is damaged. You might want to repair it.");
        }  else if (d == 10) {
            this.console.println("Your ship looks great!");
        }
    }
}

