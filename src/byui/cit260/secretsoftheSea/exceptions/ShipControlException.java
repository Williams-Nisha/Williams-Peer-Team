/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsoftheSea.exceptions;

/**
 *
 * @author kayla
 */
public class ShipControlException extends Exception {

    public ShipControlException() {
    }

    public ShipControlException(String message) {
        super(message);
    }

    public ShipControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShipControlException(Throwable cause) {
        super(cause);
    }

    public ShipControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
