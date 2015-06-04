/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.GameControl;
import java.util.Scanner;
import secretsofthesea.SecretsoftheSea;

/**
 *
 * @author Lorien
 */
public class MainMenuView {
       
    private final String MENU = "\n"
            + "\n----------------------------------"
            + "\n|Main Menu                       |"
            + "\n----------------------------------"
            + "\nG - Start Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
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
        
        switch (choice) {
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
    }

    private void startNewGame() {
         // create new game
        GameControl.createNewGame(SecretsoftheSea.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    }
    

