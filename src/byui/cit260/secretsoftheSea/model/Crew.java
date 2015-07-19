/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Lorien
 */
public enum Crew implements Serializable{

    Skivvie_Jones("Even though he's been down to his skivvies a few times, he always find a way out.","Pirate"),
    One_eyed_Oscar("Don't let his one eye fool you; he's watching everything.","Pirate"),
    Timmy_Longthumbs("An unscruptulous character, but great at nabbing things in a pinch.","Captain"),
    Jack_Shortbeard("What he lacks in height he makes up with ambition.","Pirate"),
    Mulligan_Morgan("She's had a few close calls, but always ends up on top.","Pirate"),
    Freebird_Freida("She has a wild spirit, but is loyal.","Pirate");
    
    
    // class instance variables
    private final String description;
    private final String type;
    private final Point coordinates;

    Crew(String description, String type) {
        this.description = description;
        this.type = type;
        this.coordinates = new Point(1,1);
}

        
    public Point getCoordinates(){
        return coordinates;
    }
    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Crew{ description= " + description + ", type=" + type + '}';
    }
}