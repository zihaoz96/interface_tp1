/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp_1;

import java.io.IOException;
import java.lang.System.Logger;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Zihao ZHENG
 */
public class FXMLMainFrameController implements Initializable {
    
    @FXML
    TextArea affichage;
    
    @FXML
    AnchorPane anchorPane;
    
    @FXML
    BorderPane borderPane;
    
    @FXML
    Button question;
    
    @FXML
    TextField search;
    
    @FXML
    HBox hBox;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        borderPane.prefWidthProperty().bind(anchorPane.widthProperty());
        borderPane.prefHeightProperty().bind(anchorPane.heightProperty());
    
        borderPane.setLeft(hBox);
    }    
    
    private void loadAddressBook(String ui){
        Parent root = null;
        
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
        } catch (Exception e) {
            System.out.println("Err:" + e);
        }
        
        borderPane.setLeft(root);
    }
    
    
    @FXML
    private void RemoveContact() throws IOException {
        affichage.setText("Remove Contact");
    }
    
    @FXML
    private void EditContact() throws IOException {
        affichage.setText("Edit Contact");
    }
    
    @FXML
    private void NewContact() throws IOException {
        affichage.setText("New Contact");
        
        
    }
    
}
