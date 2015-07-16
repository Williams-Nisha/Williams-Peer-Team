/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.view.View;
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

    public void doAction(Object obj) {

        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);

        switch (choice) {
            case 'G': // goal of the game
                this.console.println("\n************What is the goal of the game?**************\n"
                                    +"\n You are embarking on a journey to find hidden treasure\n"
                                    +"\n and collect statues. There are 8 statues that you must \n"
                                    +"\n collect, and once you have collected the statues, they  \n"
                                    +"\n will connect and reveal a secret code which will show you\n"
                                    +"\n treasure beyond your wildest dreams. But first you must  \n"
                                    +"\n stock up on supplies, pick a ship and crew and start your \n"
                                    +"\n voyage. Good luck!");
                break;
            case 'M': // how to move
                this.console.println("\n************How to Move************"
                                    +"\n Press M on the Game Menu to go to the\n"
                                    +"\n Move Menu. In the Move Menu, Press U to \n"
                                    +"\n move up. Press D to move down. Press L to\n"
                                    + "\n go left and R to go right.");
                
                break;
            case 'E': // explore location
                this.console.println("\n*********Explore Location********"
                                   + "\n To explore a location, press E on the Game Menu.\n"
                                   + "\n From there it will let you know if there are \n"
                                   + "\n treasures available at that location or if you\n"
                                   + "\n are able to trade.");
                break;
            case 'I': //view inventory
                this.console.println("\n**********View Inventory********\n"
                                   + "\n It is time to get supplies for your\n"
                                   + "\n journey. The are four items you must\n"
                                   + "\n take with you to survive. From the Game\n"
                                   + "\n Menu, press I to get to the Inventory.\n"
                                   + "\n Enter each item separately and choose how\n"
                                   + "\n many units you would like. Once you have\n"
                                   + "\n sufficien food, water, munitions and fuel\n"
                                   + "\nfor your trip, return to the main menu.");
                break;
            case 'S': // ship's status
                this.console.println("\n*******Ship's Status ***************\n"
                                   + "\n Get the status of your ship by pressing\n"
                                   + "\n S on the Game Menu. Press T  to see \n"
                                   + "\n the storage available on the ship, M\n"
                                   + "\n to look at the crew's morale, P to look\n"
                                   + "\n at the ship's speed and D to review your\n"
                                   + "\n defense. Once you have reviewed everything\n"
                                   + "\n press E to exit back to the Game Menu.");
                break;
            case 'X': // exchange resources
                this.console.println("\n********Exchange Resources *********\n"
                                   + "\nTo exchange resources, press X on the Game\n"
                                   + "\nMenu. Once in the exchange resources menu \n"
                                   + "\nyou will be able to trade, sell, or buy coins.\n"
                                   + "\n Press T to trade, B to buy coins, or S to sell.\n"
                                   + "\n Once you are done, press E to exit bacck to the\n"
                                   + "\n Game Menu.");
                break;
            case 'W': // work on ship
                this.console.println("\n**********Work On the Ship***********\n"
                                   + "\nWhen the ship is in need of repairs, you\n"
                                   + "\ncan work on the ship to repair it. Without\n"
                                   + "\nyour ship, you cannot continue on the journey\n"
                                   + "\nto work on your ship, press W on the Game Menu.\n"
                                   + "\nYou will be able to see how bad the damages are\n"
                                   + "\nand how long it will take to fix it.\n");
                break;
            case 'L': // launch ship
                this.console.println("\n************Launch the Ship*************\n"
                                   + "\nTo start your journey, you need to launch\n"
                                   + "\nyour ship. To launch your ship, press L on\n"
                                   + "\nthe Game Menu. Press U to move up, D to move\n"
                                   + "\ndown, L to move left, R to move right, and M\n"
                                   + "\nto launch the ship.");
                break;
            case 'd': // dock ship
                this.console.println("\n*******Dock the Ship*************\n"
                                   + "\nTo visit place on land, you need \n"
                                   + "\ndock your ship. Press D on the Game\n"
                                   + "\nMenu to see your options. Press U to\n"
                                   + " move up, D to move down, L to move left,\n"
                                    + " R to move right, and D to dock the ship.");
                break;
            case 'Q': // quit program
                return;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return;
    }

}
