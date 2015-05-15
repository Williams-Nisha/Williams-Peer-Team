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
public class WaterScene implements Serializable{
    //class instance variables
    private String description;
    private boolean symbol;  

    public WaterScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSymbol() {
        return symbol;
    }

    public void setSymbol(boolean symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "WaterScene{" + "description=" + description + ", symbol=" + symbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + (this.symbol ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WaterScene other = (WaterScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.symbol != other.symbol) {
            return false;
        }
        return true;
    }

}
