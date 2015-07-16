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
                + "\nQ - Quit"
                + "\n----------------------------------");
    }

    @Override
    public void doAction(Object obj) {

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
            this.console.println(this.moveRight());
        } else if (choice == 'K') {
            this.dockShip();
        } else if (choice == 'Q') {
            return;
        } else {
            this.console.println("\n*** Invalid selection *** Try again");
        }
        return;
    }

    private void moveUp() {
        this.console.println("*** moveUp function called ***");
    }

    private void moveDown() {
        this.console.println("*** moveDown function called ***");
    }

    private void moveLeft() {
        this.console.println("*** moveLeft function called ***");
    }

    private String moveRight() {
        return ("*** moveRight function called ***");
    }

    private void dockShip() {
        this.console.println("*** dockShip function called ***");
    }
}
