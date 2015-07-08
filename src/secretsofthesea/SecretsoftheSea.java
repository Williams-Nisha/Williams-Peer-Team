/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea;

import byui.cit260.secretsoftheSea.model.Player;
import byui.cit260.secretsoftheSea.model.Crew;
import byui.cit260.secretsoftheSea.model.Game;
import byui.cit260.secretsoftheSea.model.Ship;
import byui.cit260.secretsoftheSea.model.Map;
import byui.cit260.secretsoftheSea.model.AirScene;
import byui.cit260.secretsoftheSea.model.DockedScene;
import byui.cit260.secretsoftheSea.model.Location;
import byui.cit260.secretsoftheSea.model.InventoryList;
import byui.cit260.secretsoftheSea.model.Item;
import byui.cit260.secretsoftheSea.model.WaterScene;
import byui.cit260.secretsoftheSea.view.ErrorView;
import byui.cit260.secretsoftheSea.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Lorien
 */
public class SecretsoftheSea {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SecretsoftheSea.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SecretsoftheSea.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SecretsoftheSea.inFile = inFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // open character stream files for end user input and output
            SecretsoftheSea.inFile
                    = new BufferedReader(new InputStreamReader(System.in));

            SecretsoftheSea.outFile = new PrintWriter(System.out, true);
               
            // open log file
            String filePath = "log.txt";
            SecretsoftheSea.logFile = new PrintWriter(filePath);
            
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
            return;

        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
                                
            e.printStackTrace();;
        }
        
          finally {
            
            try {
                if (SecretsoftheSea.inFile != null)
                    SecretsoftheSea.inFile.close();
                
                if (SecretsoftheSea.outFile != null)
                    SecretsoftheSea.outFile.close();
                
                if (SecretsoftheSea.logFile != null)
                    SecretsoftheSea.logFile.close();
                    
        }   catch (IOException ex) {
                ErrorView.display("SecretsoftheSea",
                        "Error closing files");
                return;
        }
    }
    }
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SecretsoftheSea.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SecretsoftheSea.player = player;
    }
}
