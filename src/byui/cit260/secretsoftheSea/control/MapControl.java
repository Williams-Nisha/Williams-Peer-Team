/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

import byui.cit260.secretsoftheSea.model.Game;
import byui.cit260.secretsoftheSea.model.Location;
import byui.cit260.secretsoftheSea.model.Map;
import java.awt.image.BufferedImage;
import byui.cit260.secretsoftheSea.model.Scene;
import javax.swing.ImageIcon;
import secretsofthesea.SecretsoftheSea;
import byui.cit260.secretsoftheSea.exceptions.MapControlException;
import byui.cit260.secretsoftheSea.model.Crew;
import java.awt.Point;
import java.io.PrintWriter;

/**
 *
 * @author Lorien
 */
public class MapControl {
    
    protected final PrintWriter console = SecretsoftheSea.getOutFile();

    public static Map createMap() {
        // create the map
        Map map = new Map(20, 20);

        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();

        // assign the different scenes to locaitons in the map
        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    private static Scene[] createScenes() {
        //BufferedImage image = null;

        Game game = SecretsoftheSea.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\n Welcome to the wild and precarious sea.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        // ImageIcon startingSceneImage = MapControl.getImage(startingScene,
        //        "/citbyui/cit260/secretsofthesea/images/startingpoint.jpg");
        // startingScene.setIcon(startingSceneImage);
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\nCongratulations! Well done.");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        // ImageIcon finishSceneImage = MapControl.getImage(finishScene,
        //        "/citbyui/cit260/secretsofthesea/images/finish.jpg");
        //    finishScene.setIcon(finishSceneImage);
        scenes[SceneType.finish.ordinal()] = finishScene;
        return scenes;
    }

    static void moveCrewToStartingLocation(Map map) {
        ;
    }
    
    public static int moveCrewToLocation(Crew crew, Point coordinates){
        return 1;
    }
    private static ImageIcon getImage(Scene startingScene, String citbyuicit260secretsoftheseaimagesstarting) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public boolean intTrade(String name, double weight)
            throws MapControlException {
        if (weight < 0) {
            throw new MapControlException("Please enter a valid weight.");
        }
        if (weight < 30) {
            throw new MapControlException("Sorry, you do not have enough" + name + " to trade");
        }

        return true;
    }
}
