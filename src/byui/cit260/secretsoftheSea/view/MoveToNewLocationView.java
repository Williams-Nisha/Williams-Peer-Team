/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import java.util.Scanner;

/**
 *
 * @author Lorien
 */
public class MoveToNewLocationView extends View{
    
    public MoveToNewLocationView() {
        super("\n----------------------------------"
            + "\n|Move Menu                       |"
            + "\n----------------------------------"
            + "\nU - Move Up"
            + "\nD - Move Down"
            + "\nL - Move Left"
            + "\nR - Move Right"
            + "\nE - Explore Location"
            + "\nQ - Quit the Move Menu"
            + "\n----------------------------------");
    }    
    @Override
    public boolean doAction(Object obj) {
        
        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'U': // move up
                this.moveUp();
                break;
            case 'D': // move down
                this.moveDown();
                break;
            case 'L': // move left
                this.moveLeft();
                break;
            case 'R': // move right
                this.console.println(this.moveRight());
                break;
            case 'E': //dock ship and explore site
                this.explore();
            case 'Q': // exit the program
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
            return false;
    }

    private void moveUp() {
         this.console.println("You chose to move up to a new location.");
    }

    private void moveDown() {
        this.console.println("Your ship is carried downwind to a new location.");
    }

    private void moveLeft() {
        this.console.println("The crew turns the ship left to head to a new island.");
    }

    private String moveRight() {
        return "The rough waters take you to the location to the right of you current position.";
    }

    private void explore() {
        this.console.println("The crew docks the ship at the new location and everyone goes out to explore.");
    }

    
}
