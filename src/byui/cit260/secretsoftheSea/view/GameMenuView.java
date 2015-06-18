/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

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

        String value = (String) obj;
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
            //    case 'X'://display exchange resources menu
            //        this.exchangeResources();
            //        return true;
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

    //private void exchangeResources() {
    //    ExchangeResources exchangeResources = new ExchangeResourcesView();
    //    exchangeResources.display();//This will not work until ExchangeResourcesView is created
    //}
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
    }

