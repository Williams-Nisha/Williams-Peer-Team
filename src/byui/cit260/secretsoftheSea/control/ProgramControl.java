/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

import byui.cit260.secretsoftheSea.model.Player;
import secretsofthesea.SecretsoftheSea;

/**
 *
 * @author Lorien
 */
public class ProgramControl {
    
    public static Player createPlayer(String playersname) {
        
        if (playersname == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersname);
         
        SecretsoftheSea.setPlayer(player); // save the player name
        
        return player;
    }
    
}
    
