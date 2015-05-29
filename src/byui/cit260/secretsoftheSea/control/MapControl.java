/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

/**
 *
 * @author Lorien
 */
public class MapControl {

    public boolean intTrade(String[] name, double[] weight) {

        if (weight[0] < 0) {
            System.out.println("Sorry, you do not have enough" + name[0] + " to trade");
            return false;
        }
        if (weight[1] < 25) {
            System.out.println("Sorry, you do not have enough" + name[1] + " to trade");
            return false;
        }
        if (weight[2] < 10) {
            System.out.println("Sorry, you do not have enough" + name[2] + " to trade");
            return false;
        }
        if (weight[3] < 30) {
            System.out.println("Sorry, you do not have enough" + name[3] + " to trade");
            return false;
        }
        System.out.println("What would you like to trade?");
        return true;
    }
}
