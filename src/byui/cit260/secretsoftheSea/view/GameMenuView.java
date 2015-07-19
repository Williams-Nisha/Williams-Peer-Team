/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.GameControl;
import byui.cit260.secretsoftheSea.control.RandomControl;
import byui.cit260.secretsoftheSea.model.Location;
import byui.cit260.secretsoftheSea.model.Map;
import secretsofthesea.SecretsoftheSea;
import byui.cit260.secretsoftheSea.exceptions.RandomControlException;
import byui.cit260.secretsoftheSea.model.Crew;
import byui.cit260.secretsoftheSea.model.Game;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorien
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n----------------------------------"
                + "\n|Game Menu                       |"
                + "\n----------------------------------"
                + "\nM - Move to new location          "
                + "\nE - Explore a location            "
                + "\nI - View list of inventory items"
                + "\nS - View ship status"
                + "\nV - View Map"
                + "\nC - View Crew"
                + "\nX - Exchange resources"
                + "\nT - Print Coins"
                + "\nW-  Work on ship"
                + "\nL - Launch the ship"
                + "\nD - Dock the ship"
                + "\nH - Help menu"
                + "\nQ - Quit"
                + "\n----------------------------------");
    }

    @Override

    public void doAction(Object obj) {

        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);

        switch (choice) {
            case 'M': // get move to a new location menu
                this.move();
                break;
            case 'E': // get explore location options
                this.explore();
                break;
            case 'I': // display inventory menu
                this.inventoryItems();
                break;
            case 'S'://view ship status
                this.shipStatus();
                return;
            case 'X'://display exchange resources menu
                this.exchangeResources();
                break;
            case 'T':
        {
            try {
                printCoins();
            } catch (IOException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 'V'://view map
                this.displayMap();
                break;
            case 'C'://view crew
                this.displayCrew();
                break;
            //case 'W'://display work on ship
            //    this.workOnShip();
            //    return true;
            case 'L'://display launch ship menu
                this.launchShip();
                return;
            case 'D'://display dock ship menu
                this.dockShip();
                return;
            case 'H'://
                this.displayHelpMenu();
                return;
            case 'Q': // exit the program
                return;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return;
    }

    private void move() {
        MoveToNewLocationView move = new MoveToNewLocationView();
        move.display();
    }

    private void explore() {
        ExploreLocationView explore = new ExploreLocationView();
        explore.displayBanner();
    }

    private void inventoryItems() {
        ViewListInventoryView inventoryItems = new ViewListInventoryView();
        inventoryItems.display();
    }

    private void shipStatus() {
        ShipStatusView shipStatus = new ShipStatusView();
        shipStatus.display();
    }

    private void exchangeResources() {
        ExchangeResourcesView exchangeResources = new ExchangeResourcesView();
        exchangeResources.display();
    }

    private void launchShip() {
        LaunchShipView launchShip = new LaunchShipView();
        launchShip.display();
    }

    private void dockShip() {
        DockTheShipView dockShip = new DockTheShipView();
        dockShip.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayMap() {
        Location[][] locations = GameControl.getGame().getMap().getLocations();//get locations inside map
        this.console.println("Map\n");
        this.console.println("  | 0 | 1 | 2 | 3 | 4 |");
        for (int r = 0; r < 5; r++) {
            this.console.print(Integer.toString(r) + " |");
            for (int c = 0; c < 5; c++) {
                if (locations[r][c].isVisited() == false) {
                    this.console.print("?? |");
                } else {
                    this.console.print(locations[r][c].getScene().getMapSymbol() + "|");
                }
            }
            this.console.println("");
        }
    }

    private void displayCrew() {
        this.console.println("\n Your crew awaits for a high seas adventure! Meet your crew.\n\nSkivvie_Jones(\"Even though he's been down to his skivvies a few times, he always find a way out.\",\"Pirate\"),\n" +
                            " \nOne_eyed_Oscar(\"Don't let his one eye fool you; he's watching everything.\",\"Pirate\"),\n" +
                            " \nTimmy_Longthumbs(\"An unscruptulous character, but great at nabbing things in a pinch.\",\"Captain\"),\n" +
                            " \nJack_Shortbeard(\"What he lacks in height he makes up with ambition.\",\"Pirate\"),\n" +
                            " \nMulligan_Morgan(\"She's had a few close calls, but always ends up on top.\",\"Pirate\"),\n" +
                            " \nFreebird_Freida(\"She has a wild spirit, but is loyal.\",\"Pirate\");\n" +
                            "    ");
    }

    private void printCoins() throws FileNotFoundException, IOException {
        try {
        console.println("Please select a path to print coin information");
            String path = keyboard.readLine();
            path = path.trim();
            PrintWriter out = new PrintWriter(new File(path));
            String [] coins = new String[3];
            coins[0]="gold";
            coins[1]="copper";
            coins[2]="silver";
            out.printf(path,"hello");
        } finally {
        
        }   
        }
}

