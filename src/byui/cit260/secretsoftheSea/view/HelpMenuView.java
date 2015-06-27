/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import java.util.Scanner;

/**
 *
 * @author
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n----------------------------------"
                + "\n|Help Menu                       |"
                + "\n----------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nE - Explore the location"
                + "\nI - View Inventory"
                + "\nS - View ship's status"
                + "\nX - Exchange resources"
                + "\nW - Work on Ship"
                + "\nL - Launch the ship"
                + "\nW - Dock the ship"
                + "\nQ - Quit"
                + "\n----------------------------------");
    }

    @Override

    public boolean doAction(Object obj) {

        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);

        switch (choice) {
            case 'G': // goal of the game
                System.out.println("\n*** G ***");
                break;
            case 'M': // how to move
                System.out.println("\n*** M ***");
                break;
            case 'E': // explore location
                System.out.println("\n*** E ***");
                break;
            case 'I': //view inventory
                System.out.println("\n*** I ***");
                break;
            case 'S': // ship's status
                System.out.println("\n*** S ***");
                break;
            case 'X': // exchange resources
                System.out.println("\n*** X ***");
                break;
            case 'W': // work on ship
                System.out.println("\n*** W ***");
                break;
            case 'L': // launch ship
                System.out.println("\n*** L ***");
                break;
            case 'd': // dock ship
                System.out.println("\n*** D ***");
                break;
            case 'Q': // quit program
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

}
