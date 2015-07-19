/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.view;

import java.io.PrintWriter;
import secretsofthesea.SecretsoftheSea;

/**
 *
 * @author kayla
 */
public class ExploreLocationView {
    
    protected final PrintWriter console = SecretsoftheSea.getOutFile();
    
    public void ExploreLocation() {
        //display a success banner for the location
        this.displayBanner();
        //display the information about the site
        this.displayLocationInformation();
        //mark the location as visited
        this.markVisited();
    
    }

    private void displayBanner() {
        this.console.println("Welcome! You have made it to the location:");
        boolean locationName = false;
        this.console.print(locationName);
    }

    private void displayLocationInformation() {
        int locationName = 1;
        boolean valid = false;
        
        while (!valid) {
        
        if (locationName == 1 || locationName == 4) {
            this.console.println("At this location you will be able to get supplies for your ship.");
        } else if (locationName ==2 || locationName == 3) {
            this.console.println("At this location you can find treasure or get supplies.");
        } else if (locationName >= 5) {
            this.console.println ("At this location you can find treasure.");
        }
        break;
    };
        
    
    }

    private void markVisited() {
        this.console.println("This location has been marked as visited. Come again soon!");
    }

}