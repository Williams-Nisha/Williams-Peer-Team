/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.model;

import java.io.Serializable;

/**
 *
 * @author Nisha
 */
public class Location implements Serializable{

    //class instance variables
    private boolean visited;
    private double amountRemaining;
    private boolean water;
    private boolean land;

    public Location() {
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isLand() {
        return land;
    }

    public void setLand(boolean land) {
        this.land = land;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", amountRemaining=" + amountRemaining + ", water=" + water + ", land=" + land + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.visited ? 1 : 0);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
        hash = 59 * hash + (this.water ? 1 : 0);
        hash = 59 * hash + (this.land ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        if (this.water != other.water) {
            return false;
        }
        if (this.land != other.land) {
            return false;
        }
        return true;
    }
 
    
}
