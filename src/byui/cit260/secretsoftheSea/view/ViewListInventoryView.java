/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import byui.cit260.secretsoftheSea.control.GameControl;
import byui.cit260.secretsoftheSea.control.InventoryControl;
import byui.cit260.secretsoftheSea.control.RandomControl;
import java.util.Scanner;
import byui.cit260.secretsoftheSea.exceptions.InventoryControlException;
import byui.cit260.secretsoftheSea.model.InventoryList;
import byui.cit260.secretsoftheSea.model.Item;
import byui.cit260.secretsoftheSea.view.ErrorView;
import byui.cit260.secretsoftheSea.view.View;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import secretsofthesea.SecretsoftheSea;

/**
 *
 * @author Nisha
 */
public class ViewListInventoryView extends View {

    protected final BufferedReader keyboard = SecretsoftheSea.getInFile();

    public ViewListInventoryView() {
        super("\n----------------------------------"
                + "\n|Inventory Items  - Supplies      |"
                + "\n----------------------------------"
                + "\nF - Food - each unit is 100 lbs"
                + "\nW - Water - each unit is 50 lbs"
                + "\nG - Fuel - each unit is 40 lbs"
                + "\nM - Munitions - each unit is 20 lbs"
                + "\nT - Total inventory weight"
                + "\nQ - Quit "
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = String.valueOf(obj);
        value = value.toUpperCase();//conver to all upper case
        char choice = value.charAt(0);
        double w;
        try {
            switch (choice) {
                case 'F':
                    InventoryList food = GameControl.getGame().getInventory()[Item.Food.ordinal()];
                    this.console.println("\n*** Please enter how many units from 0-99 you would like.: ***");
                    w = getInput2("food", 100);
                    food.setWeight(w);
                    break;
                case 'W':
                    InventoryList water = GameControl.getGame().getInventory()[Item.Water.ordinal()];
                    this.console.println("\n*** Please enter how many units from 0-99 you would like.: ***");
                    w = getInput2("water", 50);
                    water.setWeight(w);
                    break;
                case 'G':
                    InventoryList fuel = GameControl.getGame().getInventory()[Item.Fuel.ordinal()];
                    this.console.println("\n*** Please enter how many units from 0-99 you would like.: ***");
                    w = getInput2("fuel", 40);
                    fuel.setWeight(w);
                    break;
                case 'M': // create and start a new game
                    InventoryList munition = GameControl.getGame().getInventory()[Item.Munition.ordinal()];
                    this.console.println("\n*** Please enter how many units from 0-99 you would like.: ***");
                    w = getInput2("munition", 20);
                    munition.setWeight(w);
                    break;
                case 'T': // display total inventory weight
                    InventoryControl tw = new InventoryControl();
                    double[] totalWeight = new double[4];
                    totalWeight[0] = 400;
                    totalWeight[1] = 250;
                    totalWeight[2] = 160;
                    totalWeight[3] = 120;
                    tw.calTotalWeightOfItem(totalWeight);
                case 'Q': // quit program
                    return true;
                default:
                    ErrorView.display(this.getClass().getName(),
                            "\n*** Invalid selection *** Try again");
                    break;
            }
        } catch (InventoryControlException me) {
            this.console.println(me.getMessage());
        } catch (IOException ex) {
            this.console.println(ex.getMessage());
        }
        return false;
    }

    private double getInput2(String name, double weight)
            throws InventoryControlException, IOException {
        try {

            double amount = Double.parseDouble(this.keyboard.readLine());
            InventoryControl ins = new InventoryControl();
            double w = ins.calWeightOfItems(name, weight, amount);
            return w;
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),
                    "\nYou must enter a valid number."
                    + " Try again or enter Q to quit." + nf.getMessage());
        }
        return -1;
    }
}
