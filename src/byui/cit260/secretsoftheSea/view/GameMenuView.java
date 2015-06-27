/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.model.Location;
import byui.cit260.secretsoftheSea.model.Map;
import secretsofthesea.SecretsoftheSea;

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
                + "\nW-  Work on ship"
                + "\nL - Launch the ship"
                + "\nD - Dock the ship"
                + "\nH - Help menu"
                + "\nQ - Quit"
                + "\n----------------------------------");
    }

    @Override

    public boolean doAction(Object obj) {

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
                return true;
            case 'X'://display exchange resources menu
                this.exchangeResources();
                break;
            case 'V'://view map
                this.displayMap();
                break;
            case 'C'://view crew
                this.viewCrew();
                break;
            //case 'W'://display work on shi[
            //    this.workOnShip();
            //    return true;
            case 'L'://display launch ship menu
                this.launchShip();
                return true;
            case 'D'://display dock ship menu
                this.dockShip();
                return true;
            case 'H'://
                this.displayHelpMenu();
                return true;
            case 'Q': // exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void move() {
        MoveToNewLocationView move = new MoveToNewLocationView();
        move.display();
    }

    private void explore() {
        ExploreLocationView explore = new ExploreLocationView();
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

//    private void workOnShip() {
//        WorkOnShipView workOnShip = new WorkOnShipView();
//        workOnShip.display();

    private void displayMap() {
        Map gameMap = SecretsoftheSea.getCurrentGame().getGameMap();//get Game map by retrieving current game
        Location[][] locations = gameMap.getLocations();//get locations inside map
        System.out.println("Map\n");
        System.out.println("  | 0 | 1 | 2 | 3 | 4 |");
            for (int r = 0; r < 5; r++) {
                System.out.print(Integer.toString(r) + " |");
                for (int c = 0; c < 5; c++) {
                    if (locations[r][c].isVisited() == false) {
                       System.out.print("?? |");
                    } 
                    else {
                       System.out.print(locations[r][c].getScene().getMapSymbol() + "|");
                    }
                }
                System.out.println("");
            }
    }

    private void viewCrew() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

