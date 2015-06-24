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
    private Location[] [] locations;
    
    
    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                //assign the Location object to the current position in the array
                locations[row][column] = location;
            
            }
        }
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
