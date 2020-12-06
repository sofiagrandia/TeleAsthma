/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sofia
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private Label userLogin;
   
    
    
    
    //cuando llamas a este metodo, se abre la ventana de Registro
    @FXML
    public void changeToRegisterwhenButtonPushed(ActionEvent event) throws IOException{
        Parent registerParent=FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
        Scene registerScene = new Scene(registerParent);
        
        //get the stage information
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(registerScene);
        window.show(); 
        
    }
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }  
    
}
