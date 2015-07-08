/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.MapControl;
import byui.cit260.secretsoftheSea.exceptions.MapControlException;
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        
        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);
        
        try {
            switch (choice) {
                case 'T': // trade items
                    this.console.println("\n*** What item would you like to trade? Enter F for food, W for water, M for munition and G for fuel.***");
                    char response = input.nextLine().toUpperCase().charAt(0);
                    this.console.println("\n*** How many pounds would you like to trade?***");
                    double lbs = Double.parseDouble(input.next());
                    trade(response, lbs);
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
                    this.console.println("\n*** Invalid selection *** Try again");
                    break;
            }
        } catch (MapControlException me) {
            this.console.println(me.getMessage());
        } catch (NumberFormatException nf){
            this.console.println("\nYou must enter a valid number."+"Try again or enter Q to quit.");
        }
        
        return false;
    }

    private void trade(char choice, double weight)
            throws MapControlException {


        switch (choice) {
            case 'F':
                 {
                    if (trade("food", weight)){
                    this.console.println("What would you like to trade for? Enter F for food, W for water, M for munition and G for fuel.");
                    }
                };
                break;
            case 'W':
                    if (trade("water", weight)){
                    this.console.println("What would you like to trade for? Enter F for food, W for water, M for munition and G for fuel.");
                    }
                break;
            case 'M':
                    if (trade("food", weight)){
                    this.console.println("What would you like to trade for? Enter F for food, W for water, M for munition and G for fuel.");
                    };
                break;
            case 'G':
                    if (trade("food", weight)){
                    this.console.println("What would you like to trade for? Enter F for food, W for water, M for munition and G for fuel.");
                    };
        };
    }

    private boolean trade(String name, double weight)
            throws MapControlException {
        MapControl ins = new MapControl();
        boolean w = ins.intTrade(name, weight);
        return w;
    }

    private void buy() {
        this.console.println("\n***This is where you buy***");
    }

    private void sell() {
        this.console.println("\n***This is where you sell***");
    }

}
