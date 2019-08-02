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
public class OpcoesController implements Initializable {
    
    @FXML
    private Button funOpcoes;
    @FXML
    private Button saibaMaisOp;
    @FXML
    private Button clienOpces;
    @FXML
    private Button inicOpcoes;
    
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
     private void menuSenha(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("senha.fxml"));
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
     
    @FXML
    private void janelaSaibaMais(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("saibaMais.fxml"));
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
