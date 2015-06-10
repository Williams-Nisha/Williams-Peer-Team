/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260secretsoftheSea.view;

/**
 *
 * @author kayla
 */
public class ExploreLocationView {
    public void ExploreLocation() {
        //display a success banner for the location
        this.displayBanner();
        //display the information about the site
        this.displayLocationInformation();
        //mark the location as visited
        this.markVisited();
    
    }

    private void displayBanner() {
        System.out.println("Welcome! You have made it to the location:");
        boolean locationName = false;
        System.out.print(locationName);
    }

    private void displayLocationInformation() {
        int locationName = 1;
        boolean valid = false;
        
        while (!valid) {
        
        if (locationName == 1 || locationName == 4) {
            System.out.println("At this location you will be able to get supplies for your ship.");
        } else if (locationName ==2 || locationName == 3) {
            System.out.println("At this location you can find treasure or get supplies.");
        } else if (locationName >= 5) {
            System.out.println ("At this location you can find treasure.");
        }
        break;
    };
        
    
    }

    private void markVisited() {
        System.out.println("This location has been marked as visited. Come again soon!");
    }
    
    
    }
