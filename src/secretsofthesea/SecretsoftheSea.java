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

/**
 *
 * @author Lorien
 */
public class SecretsoftheSea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Crew crewOne = new Crew();
        
        crewOne.setName("Marker");
        crewOne.setDescription("Strong");
        crewOne.setType("Who knows");
        String crewInfo = crewOne.toString();
        System.out.println(crewInfo);
        
        Game gameOne = new Game();
        
        gameOne.setTotalTime(14.36);
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Ship shipOne = new Ship();
        
        shipOne.setDescription("Twenty Foot");
        shipOne.setType("Galley");
        String shipInfo = shipOne.toString();
        System.out.println(shipInfo);
        
        Map mapOne = new Map();
        
        mapOne.setWaterNumber(9);
        mapOne.setLandNumber(5);
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        AirScene airsceneOne = new AirScene();
        
        airsceneOne.setDescription("In Air");
        airsceneOne.setSymbol("Blue Circle");
        String airsceneInfo = airsceneOne.toString();
        System.out.println(airsceneInfo);
        
        Location locationOne = new Location();
        
        locationOne.setVisited(true);
        locationOne.setAmountRemaining(7.00);
        locationOne.setWater(true);
        locationOne.setLand(true);        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);

        WaterScene waterSceneOne = new WaterScene();
        
        waterSceneOne.setDescription("San Francisco");
        waterSceneOne.setSymbol(true);   
        String waterSceneInfo = waterSceneOne.toString();
        System.out.println(waterSceneInfo);
        
        DockedScene dockedSceneOne = new DockedScene();
        
        dockedSceneOne.setDescription("San Francisco");
        dockedSceneOne.setNumberOfItems(45); 
        dockedSceneOne.setSymbol(true);   
        String dockedSceneInfo = dockedSceneOne.toString();
        System.out.println(dockedSceneInfo);
        
        InventoryList inventoryListOne = new InventoryList();
        
        inventoryListOne.setInventoryType("China");
        inventoryListOne.setQuantityInStock(100); 
        inventoryListOne.setRequiredAmount(75.5);   
        String inventoryListInfo = inventoryListOne.toString();
        System.out.println(inventoryListInfo);

        Item itemOne = new Item();
        
        itemOne.setDescription("15 gold pieces");
        itemOne.setColor("blue"); 
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
    }
    
}
