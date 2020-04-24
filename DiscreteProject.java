
package discreteproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * This claas is the exported class to have an .java program
 * 
 */
public class DiscreteProject extends Application {
    @Override
    public void start(Stage primaryStage) {



    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    }


    

