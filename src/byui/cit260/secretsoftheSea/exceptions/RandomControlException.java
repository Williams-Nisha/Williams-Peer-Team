/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.exceptions;

/**
 *
 * @author Lorien
 */
public class RandomControlException extends Exception {

    public RandomControlException() {
    }

    public RandomControlException(String message) {
        super(message);
    }

    public RandomControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public RandomControlException(Throwable cause) {
        super(cause);
    }

    public RandomControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
