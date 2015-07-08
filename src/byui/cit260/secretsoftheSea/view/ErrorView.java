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
 * @author Lorien
 */
public class ErrorView {

    private static final PrintWriter errorFile = SecretsoftheSea.getOutFile();
    private static final PrintWriter logFile = SecretsoftheSea.getLogFile();

    public static void display(String className, String errorMessage) {

        errorFile.println(
                "--------------------------------------------"
                + "\n - ERROR - " + errorMessage
                + "\n----------------------------------------");

        // log error
        logFile.println(className + " - " + errorMessage);

    }

    static void display(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
