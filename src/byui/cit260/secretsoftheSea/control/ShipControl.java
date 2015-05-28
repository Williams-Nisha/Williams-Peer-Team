/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

/**
 *
 * @author Lorien
 */
public class ShipControl {
    
    public double calStorage(double height, double width, double length){

	if (length < 5 || length > 45) {
		return -1;
        }
        
	if (width < 5 || width > 20) {
		return -1;
        }

	if (height < 2 || height > 10) {
		return -1;
        }

	double area = length * width * height;

	return area;

        
}

    public ShipControl() {
    }
    
    
}
