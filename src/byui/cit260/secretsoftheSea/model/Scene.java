/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.model;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Lorien
 */
public class Scene implements Serializable {
    
    private String description;
    private double travelTime;
    private boolean blocked;
    private String mapSymbol;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public boolean isBlocked() {
        return blocked;
    }

    // cladd instance variables
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public void setIcon(ImageIcon startingSceneImage) {
        System.out.println();
    }
    
    
    
}
