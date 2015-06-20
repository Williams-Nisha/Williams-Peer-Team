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
public class ExchangeResourcesView extends View {
    
    public ExchangeResourcesView() {
        
           super("\n----------------------------------"
                + "\n|Exchange Resources Menu                       |"
                + "\n----------------------------------"
                + "\nT - Trade"
                + "\nB - Buy coins"
                + "\nS - Sell"
                + "\nQ - Quit"
                + "\n----------------------------------");
    }

    @Override

    public boolean doAction(Object obj) {

        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);

        switch (choice) {
            case 'T': // trade items
                this.trade();
                break;
            case 'B': // get explore location options
                this.buy();
                break;
            case 'S': // display inventory menu
                this.sell();
                break;
            case 'Q': // exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void trade() {
        System.out.println("\n***This is where you trade***");
    }

    private void buy() {
        System.out.println("\n***This is where you buy***");
    }

    private void sell() {
        System.out.println("\n***This is where you sell***");
    }

}
