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
public class DockedScene implements Serializable {
    //class instance variables
    private String description;
    private int numberOfItems;  
    private boolean symbol;  

    public DockedScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public boolean isSymbol() {
        return symbol;
    }

    public void setSymbol(boolean symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "DockedScene{" + "description=" + description + ", numberOfItems=" + numberOfItems + ", symbol=" + symbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + this.numberOfItems;
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
        final DockedScene other = (DockedScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.numberOfItems != other.numberOfItems) {
            return false;
        }
        if (this.symbol != other.symbol) {
            return false;
        }
        return true;
    }
    
    
}
