/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

import byui.cit260.secretsoftheSea.model.Game;
import byui.cit260.secretsoftheSea.model.InventoryList;
import byui.cit260.secretsoftheSea.model.Item;
import byui.cit260.secretsoftheSea.model.Map;
import byui.cit260.secretsoftheSea.model.Player;
import byui.cit260.secretsoftheSea.model.Ship;
import byui.cit260.secretsoftheSea.model.Scene;
import java.io.PrintWriter;
import secretsofthesea.SecretsoftheSea;

/**
 *
 * @author Lorien
 */
public class GameControl {
    private static Game game;

    protected final PrintWriter console = SecretsoftheSea.getOutFile();

    public static void createNewGame(Player player) {

        game = new Game(); // create new game
        SecretsoftheSea.setCurrentGame(game); // save in SecretsoftheSea

        game.setPlayer(player); // save player in game

        //create the inventory list and save in the game
        InventoryList[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Ship ship = new Ship(); // create new ship
        game.setShip(ship); // save ship in game

        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game

        // move crew to starting postition in the map
        MapControl.moveCrewToStartingLocation(map);
        
    }    
        public static Game getGame() {
            return game;
        }
        
        public static void setGame(Game game){
            game = game;
        }

    public static InventoryList[] createInventoryList() {

        // created array(list) of inventory items
        InventoryList[] inventory
                = new InventoryList[4];

        InventoryList water = new InventoryList();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.Water.ordinal()] = water;

        InventoryList food = new InventoryList();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        inventory[Item.Food.ordinal()] = food;

        InventoryList munition = new InventoryList();
        munition.setDescription("Munition");
        munition.setQuantityInStock(0);
        munition.setRequiredAmount(0);
        inventory[Item.Munition.ordinal()] = munition;

        InventoryList fuel = new InventoryList();
        fuel.setDescription("Fuel");
        fuel.setQuantityInStock(0);
        fuel.setRequiredAmount(0);
        inventory[Item.Fuel.ordinal()] = fuel;

        return inventory;
    }

    //public enum Item {
    //    water,
    //    food,
    //    munition,
    //    fuel;
    //}
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println();
    }

}
