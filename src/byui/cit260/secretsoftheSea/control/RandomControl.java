/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.control;

import byui.cit260.secretsoftheSea.exceptions.RandomControlException;
import java.io.PrintWriter;
import secretsofthesea.SecretsoftheSea;
/**
 *
 * @author Lorien
 */
public class RandomControl {
    
    protected final PrintWriter console = SecretsoftheSea.getOutFile();

    public int calCoins(int[] coins) throws RandomControlException {

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] < 0) {
                throw new RandomControlException("Coins cannot be negative.");
            }
            if (coins[i] > 75) {
                throw new RandomControlException("Coins cannot be greater than 75.");
            }
        }
            int sum = 0;
            for (int cs : coins) {
                sum += cs;
            }
        
            this.console.println("The total coins equals " + sum);
            return sum;
        } 
    }
