/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import java.util.Scanner;

/**
 *
 * @author Lorien
 */
public class DockTheShipView extends View {

    public DockTheShipView() {
        super("\n----------------------------------"
                + "\n|Move Menu                       |"
                + "\n----------------------------------"
                + "\nU - Move Up"
                + "\nD - Move Down"
                + "\nL - Move Left"
                + "\nR - Move Right"
                + "\nK - Dock"
                + "\nE - Exit"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);

        if (choice == 'U') {
            this.moveUp();
        } else if (choice == 'D') {
            this.moveDown();
        } else if (choice == 'L') {
            this.moveLeft();
        } else if (choice == 'R') {
            System.out.println(this.moveRight());
        } else if (choice == 'K') {
            this.dockShip();
        } else if (choice == 'E') {
            return true;
        } else {
            System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }

    private void moveUp() {
        System.out.println("*** moveUp function called ***");
    }

    private void moveDown() {
        System.out.println("*** moveDown function called ***");
    }

    private void moveLeft() {
        System.out.println("*** moveLeft function called ***");
    }

    private String moveRight() {
        return ("*** moveRight function called ***");
    }

    private void dockShip() {
        System.out.println("*** dockShip function called ***");
    }
}
