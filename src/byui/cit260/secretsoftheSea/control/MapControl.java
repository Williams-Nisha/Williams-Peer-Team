/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

import byui.cit260.secretsoftheSea.model.Map;

/**
 *
 * @author Lorien
 */
public class MapControl {
    
    public static Map createMap() {
       // create the map
        Map map = new Map(20, 20);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locaitons in the map
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    private static Scene[] createScenes() throws MapControlException {
        BufferedImage image = null;
        
        Game game = secretsoftheSea.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\n Welcome to the wild and precarious sea.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        ImageIcon startingSceneImage = MapControl.getImage(startingScene,
                "/citbyui/cit260/secretsofthesea/images/startingpoint.jpg");
        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\nCongratulations! Well done.");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        ImageIcon finishSceneImage = MapControl.getImage(finishScene,
                "/citbyui/cit260/secretsofthesea/images/finish.jpg");
            finishScene.setIcon(finishSceneImage);
        scenes[SceneType.finish.ordinal()] = finishScene;   
    }

    public enum SceneType {
        start, 
        water, 
        docked, 
        air, 
        finish;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        // start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.docked.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.air.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.finish.ordinal()]);
    }
    
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
