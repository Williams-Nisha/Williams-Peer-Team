/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea;

import byui.cit260.secretsoftheSea.model.Player;
import byui.cit260.secretsoftheSea.model.Crew;
import byui.cit260.secretsoftheSea.model.Game;
import byui.cit260.secretsoftheSea.model.Ship;
import byui.cit260.secretsoftheSea.model.Map;
import byui.cit260.secretsoftheSea.model.AirScene;
import byui.cit260.secretsoftheSea.model.DockedScene;
import byui.cit260.secretsoftheSea.model.Location;
import byui.cit260.secretsoftheSea.model.InventoryList;
import byui.cit260.secretsoftheSea.model.Item;
import byui.cit260.secretsoftheSea.model.WaterScene;
import byui.cit260.secretsoftheSea.view.StartProgramView;

/**
 *
 * @author Lorien
 */
public class SecretsoftheSea {

       private static Game currentGame = null;
       private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.startProgram();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.startProgram();
    }
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SecretsoftheSea.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }
    public static void setPlayer(Player player) {
        SecretsoftheSea.player = player;
    }
}
