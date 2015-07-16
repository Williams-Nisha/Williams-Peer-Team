
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.model;

import byui.cit260.secretsoftheSea.control.GameControl;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Lorien
 */
public class Player implements Serializable {

    // class instance variables
    private String name;
    private double bestTime;
    private int row;
    private int column;
    private Location[][] locations;

    public Player() {
    }

    public Player(String name, int row, int column) {
        this.name = name;
        this.row = row;
        this.column = column;
//        locations = new GameControl().getGame().getMap().getLocations();//get locations inside map
//        locations[row][column].setVisited(true);
//        locations[row][column].getScene().setMapSymbol("ST ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        return true;
    }

}
