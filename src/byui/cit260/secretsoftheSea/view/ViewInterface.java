package byui.cit260.secretsoftheSea.view;


import java.util.Scanner;
import byui.cit260.secretsoftheSea.exceptions.MapControlException;

/**
 *
 * @author Nisha
 */
    public interface ViewInterface {

        public void display();

        public String getInput();

        public void doAction(Object obj);
        
    }

