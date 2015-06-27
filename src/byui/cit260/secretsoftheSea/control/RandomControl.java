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

    public int calCoins(int [] coins){ 
        
        int sum = 0;
        for (int cs: coins) {
            sum += cs;

        }
        System.out.println("The total coins equals" + sum);
        return sum;
    
    }
    
    public RandomControl() {
    }
    
}

