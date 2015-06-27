/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;


import java.util.Scanner;

/**
 *
 * @author Nisha
 */
    public abstract class View implements ViewInterface {

        private String promptMessage;

        public View(String promptMessage) {
            this.promptMessage = promptMessage;
        }

        @Override//our code is slightly different from example
        public void display() {

            char selection = ' ';
            do {
                System.out.println(this.promptMessage); // display the main menu

                String input = this.getInput(); // get the user's selection
                selection = input.charAt(0); // get first character of string

                this.doAction(selection); // do action based on selection

            } while (selection != 'Q'); // a selection is not "Quit"
        }

        @Override //our code is slightly different from example
        public String getInput() {
            Scanner keyboard = new Scanner(System.in); // keyboard input stream
            boolean valid = false; // indicates if the name has been retrieved 
            String choice = null;

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

        public String getPromptMessage() {
            return promptMessage;
        }

        public void setPromptMessage(String promptMessage) {
            this.promptMessage = promptMessage;
        }
    }