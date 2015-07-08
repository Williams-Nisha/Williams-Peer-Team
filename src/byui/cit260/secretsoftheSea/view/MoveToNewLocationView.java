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
            + "\nE - Exit"
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
            case 'E': // exit the program
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
            return false;
    }

    private void moveUp() {
         this.console.println("*** moveUp function called ***");
    }

    private void moveDown() {
        this.console.println("*** moveDown function called ***");
    }

    private void moveLeft() {
        this.console.println("*** moveLeft function called ***");
    }

    private String moveRight() {
        return "*** moveRight function called ***";
    }

    
}
