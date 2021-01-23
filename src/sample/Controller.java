package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    TextField txtfrase;
    @FXML
    Label lblResultado;
    @FXML
    ComboBox comboBox;
    @FXML protected void initialize(){
        comboBox.getItems().addAll("Char At","Compare To");
    }

    public void evento(ActionEvent event){
        String texto = txtfrase.getText();
        switch (comboBox.getSelectionModel().getSelectedIndex()){
            case 0: {
                char res = texto.charAt(2);
                lblResultado.setText(res + "");
                break;
            }
            case 1: {
                break;
            }
        }

    }
}
