/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.ProgramControl;
import byui.cit260.secretsoftheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author Lorien
 */
public class StartProgramView {
    
        public StartProgramView() {
        }
        public void startProgram() {
            
            //Display the banner screen
            this.displayBanner();
        
            //Get the players name
            String playersName = this.getPlayersName();
            
            //Create and save a new player object
            Player player = ProgramControl.createPlayer(playersName);
            
            //DISPLAY a customized welcome message
            this.displayWelcomeMessage(player);
            
            //DISPLAY the main menu
               MainMenuView mainMenu = new MainMenuView();
               mainMenu.displayMenu();

}

    private void displayBanner() {
        System.out.println("\n\n**********************************");
        
        System.out.println("*                                     *"
                + "\n* Welcome to Secrets of the Sea!             *"
                + "\n* In this game, you will be taking on the    *"
                + "\n* role as captain of a ship. You will        *"
                + "\n* navigate 7 ports and 22 excavation sites   *"
                + "\n* as you seek to acquire 8 highly valuable   *"
                + "\n* statues. On each token there is a piece    *"
                + "\n* of an ancient inscription, and when all 8  *"
                + "\n* are put together a secret code is unlocked.*");
        
        System.out.println("*"
                + "\n* As time has gone on, the statues have      *"
                + "\n* changed from history to possible myths.    *"
                + "\n* Some believe in their ability to unlock    *"
                + "\n* hidden treasure, while others think it is  *"
                + "\n* nothing by a made up story. Groups will    *"
                + "\n* form and leaders will be needed to guide   *"
                + "\n* ships on a race to the finish. Upon gaining*" 
                + "\n* equipment and other necessities, voyages   *"
                + "\n* will be chosen to not only find these      *"
                + "\n* hidden statues, but to survive the now     *"
                + "\n* tumultuous atmosphere of the world.        *"
                + "\n* After picking a crew and packing a ship,   *"
                + "\n* you will as captain, lead your team on an  *"
                + "\n* adventure of a lifetime. Those who preserve*"
                + "\n* and work together are likely to unlock the *"
                + "\n* mysteries awaiting on both sea and land.   *");
        
        System.out.println("*                                     *"
                + "\n* Good luck and have fun in this adventure!  *"
                + "\n*                                            *");
        
        System.out.println("***************************************");
              
    }

    private String getPlayersName() {
         boolean valid = false; // indicates if the name has been retrieved 
         String playersName = null;
         Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
         while(!valid) { // while a valid name has not been retrieved 
             
             // prompt for the player's name
             System.out.println("Enter the player's name below:");
             
             // get the name from the keyboard and trim off the blanks
             playersName = keyboard.nextLine();
             playersName = playersName.trim();
             
             // if the name is invalid (less than two character in length))
             if (playersName.length() < 2) {
                 System.out.println("Invalid name - the name must not be blank");
                 continue; // and repeat again
                 
             }
             break; // out of the (exit) the repetition 
         }
         
         return playersName; // return the name
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=====================================");
        System.out.println("\tWelcome to the game, " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("=========================================");
    }
    }