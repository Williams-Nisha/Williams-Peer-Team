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
 * @author Nisha
 */
public enum Item implements Serializable {

    //class instance variables

    Water("description", "color"),
    Food("description", "color"),
    Munition("description", "color"),
    Fuel("description", "color");
    private final String description;
    private final String color;

    Item(String description, String color) {
        this.description = description;
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Item{" + "description=" + description + ", color=" + color + '}';
    }

}
