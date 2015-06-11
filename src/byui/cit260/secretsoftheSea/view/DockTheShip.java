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
public class DockTheShip {
    
    private final String MENU = "\n"
            + "\n----------------------------------"
            + "\n|Move Menu                       |"
            + "\n----------------------------------"
            + "\nU - Move Up"
            + "\nD - Move Down"
            + "\nL - Move Left"
            + "\nR - Move Right"
            + "\nK - Dock"
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
         
         while(!valid) { // while a valid name has not been retrieved 
             
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

    private void doAction(char choice) {
        
        if (choice == 'U') {
                this.moveUp();
        }
        else if (choice == 'D') {
                this.moveDown();
        }
        else if (choice == 'L') {
                this.moveLeft();
        }
        else if (choice == 'R') {
                System.out.println(this.moveRight());
        }
        else if (choice == 'K') {
                this.dockShip();
        }
        else if (choice == 'E') {
                return;
        }
        else    {
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
    }

    private void moveUp() {
        System.out.println("*** moveUp function called ***");
    }

    private void moveDown() {
        System.out.println("*** moveDown function called ***");
    }

    private void moveLeft() {
        System.out.println("*** moveLeft function called ***");
    }

    private String moveRight() {
         return ("*** moveRight function called ***");
    }

    private void dockShip() {
        System.out.println("*** dockShip function called ***");
    }
}
