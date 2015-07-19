/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.GameControl;
import byui.cit260.secretsoftheSea.exceptions.MapControlException;
import java.util.Scanner;
import secretsofthesea.SecretsoftheSea;

/**
 *
 * @author Lorien
 */
public class MainMenuView extends View {
    
    public MainMenuView(){   
        super("\n----------------------------------"
            + "\n|Main Menu                       |"
            + "\nG - Start Game"
            + "\nN - New Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n----------------------------------");
    }
    
 
    @Override
    public void doAction(Object obj) {
        
        String value = String.valueOf(obj);
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0);
        
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
            case 'Q': // exit the program
                return;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void startNewGame()  { 
         // create new game
        GameControl.createNewGame(SecretsoftheSea.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        this.console.println("You cannot start an existing game at this time.");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        this.console.println("You cannot save an existing game at this time.");
    }
    }
    

