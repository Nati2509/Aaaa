/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacrastemalhariafx;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author natal
 */
public class LacrasteMalhariaFx extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
      //  File file = new File("@../../../inicil.jpg");
 
        // --> file:C:\Users\natal\OneDrive\Área de Trabalho\Projeto\inicil.jpg
      //  String localUrl = file.toURI().toURL().toString();
 
      //  Image image = new Image(localUrl);
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
