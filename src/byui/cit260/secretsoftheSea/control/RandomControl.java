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
public class RandomControl {

    public int calCoins(int gold, int silver, int copper){

	if (gold < 0) {
		return -1;
        }    
        if (silver < 0) {
		return -1;
        }    
        if (copper < 0) {
		return -1;
        }    

	int total = gold + silver + copper;

	return total;
    
    }
    
    public RandomControl() {
    }
    
}

