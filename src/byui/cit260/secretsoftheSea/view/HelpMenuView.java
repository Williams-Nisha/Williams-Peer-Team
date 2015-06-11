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
public class HelpMenuView {
    private final String MENU = "\n"
            + "\n----------------------------------"
            + "\n|Help Menu                       |"
            + "\n----------------------------------"
            + "\nG - What is the goal of the game?" 
            + "\nM - How to move" 
            + "\nE - Estimating the amount of resources" 
            + "\nH - Harvesting resources" 
            + "\nD - Delivering resources to warehouse" 
            + "\nQ - Quit"
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
        
        switch (choice) {
            case 'G': // create and start a new game
                System.out.println("\n*** G ***");
                break;
            case 'M': // get and start an existing game
                System.out.println("\n*** M ***");
                break;
            case 'E': // display the help menu
                System.out.println("\n*** E ***");
                break;
            case 'H': // save the current game
                System.out.println("\n*** H ***");
                break;
            case 'D': // exit the program
                System.out.println("\n*** D ***");
                return;
            case 'Q': // quit program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
    }

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}