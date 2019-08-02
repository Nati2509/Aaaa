/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacrastemalhariafx;

import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author natal
 */
public class OpClienteController implements Initializable {
    
    @FXML
    private Button encomendClient;
    @FXML
    private Button cataClient;
    @FXML
    private Button CadasClient;
    @FXML
    private Button iniClient;
    @FXML
    private Button voltClient;
    
    private void OpcoesCliente(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OpCliente.fxml"));
        Parent root = loader.load();
        Stage stagePraFechar = (Stage)((Node)((EventObject) event).getSource()).getScene().getWindow();
        stagePraFechar.hide();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
     private void botaoInicial(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        Stage stagePraFechar = (Stage)((Node)((EventObject) event).getSource()).getScene().getWindow();
        stagePraFechar.hide();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
     
    @FXML
    
    private void menuOpcoes(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Opcoes.fxml"));
        Parent root = loader.load();
        Stage stagePraFechar = (Stage)((Node)((EventObject) event).getSource()).getScene().getWindow();
        stagePraFechar.hide();

        //System.out.println("vc clicaste me!");
       // labelInicio.setText("ola mundo!");
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
    
}
