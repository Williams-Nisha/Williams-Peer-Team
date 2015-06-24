/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Lorien
 */
public enum Crew implements Serializable{

    Skivvie Jones("Even though he's bene down to his skivvies a few times, he always find a way out."),
    One eyed Oscar("Don't let his one eye fool you; he's watching everything."),
    Timmy Longthumbs("An unscruptulous character, but great at nabbing things in a pinch."),
    Jack Shortbeard("What he lacks in height he makes up with ambition."),
    Mulligan Morgan("She's had a few close calls, but always ends up on top."),
    Freebird Freida("She has a wild spirit, but is loyal.");
    
    
    // class instance variables
    private final String description;
    private final String type;

    Crew(String description) {
        this.description = description;
        type = new Point(1,1);
}

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Crew{" + "name=" + name + ", description=" + description + ", type=" + type + '}';
    }
