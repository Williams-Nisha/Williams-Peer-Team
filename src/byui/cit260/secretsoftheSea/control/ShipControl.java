/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

import byui.cit260.secretsoftheSea.exceptions.ShipControlException;

/**
 *
 * @author Lorien
 */
public class ShipControl {

    
    public double calStorage(double height, double width, double length) throws ShipControlException{

	if (length < 5 || length > 45) {
		throw new ShipControlException("Cannot have a negative length.");
        }
        
	if (width < 5 || width > 20) {
		throw new ShipControlException("Cannot have a negative width.");
        }

	if (height < 2 || height > 10) {
		throw new ShipControlException("Cannot have a negative height.");
        }

	double area = length * width * height;

	return area;


}

    public ShipControl() {
        
    }
    public boolean checkLaunch(){
        System.out.println("Check launch status.");
        return false;
    }
    
}
