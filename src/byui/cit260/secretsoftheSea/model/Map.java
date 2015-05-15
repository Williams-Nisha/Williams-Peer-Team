/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.model;

import java.io.Serializable;
/**
 *
 * @author Lorien
 */
public class Map implements Serializable{
    
    // class instance variables
    private int waterNumber;
    private int landNumber;
    
    
    public Map() {
    }

    public int getWaterNumber() {
        return waterNumber;
    }
    
    public void setWaterNumber(int waterNumber) {
        this.waterNumber = waterNumber;
    }

    public int getLandNumber() {
        return landNumber;
    }

    public void setLandNumber(int landNumber) {
        this.landNumber = landNumber;
    }

    @Override
    public String toString() {
        return "Map{" + "waterNumber=" + waterNumber + ", landNumber=" + landNumber + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.waterNumber;
        hash = 79 * hash + this.landNumber;
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
        final Map other = (Map) obj;
        if (this.waterNumber != other.waterNumber) {
            return false;
        }
        if (this.landNumber != other.landNumber) {
            return false;
        }
        return true;
    }

    
    
    
}
