
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
        
        
    }
    
}
