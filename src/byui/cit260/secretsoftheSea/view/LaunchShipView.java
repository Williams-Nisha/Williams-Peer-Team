/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.ShipControl;
import java.util.Scanner;

/**
 *
 * @author Nisha
 */
public class LaunchShipView extends View {

    public LaunchShipView() {
        super("\n----------------------------------"
                + "\n|Launch Ship                      |"
                + "\n----------------------------------"
                + "\nU - Move Up"
                + "\nD - Move Down"
                + "\nL - Move Left"
                + "\nR - Move Right"
                + "\nM - Launch"
                + "\nE - Exit"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);

        if (choice == 'U') {
            this.console.println("Move Up");
        } else if (choice == 'D') {
            this.console.println("Move Down");
        } else if (choice == 'L') {
            this.console.println("Move Left");
        } else if (choice == 'R') {
            this.console.println("Move Right");
        } else if (choice == 'L') {
            checkLaunch();
        } else if (choice == 'E') {
            return true;
        } else {
            this.console.println("***Please enter a valid selection");
        }
        return false;
    }

    private void checkLaunch() {
        ShipControl ins = new ShipControl();
    }
}
