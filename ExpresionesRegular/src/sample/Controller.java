package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;
import java.util.regex.Pattern;

public class Controller {
    @FXML
    Text txtTexto;
    @FXML
    Label lblResultado;
    @FXML
    ListView listaejer;

    @FXML protected void initialize(){
        listaejer.getItems().addAll("Ejercicio 1","Ejercicio 2");
    }


    public void procesar(ActionEvent event) {
        int selecion = listaejer.getSelectionModel().getSelectedIndex();
        switch (selecion) {
            case 0:
                String texto = txtTexto.getText();
                Pattern paron = Pattern.compile("[a-z]{4}");
                Matcher matcher = paron.matcher(texto);
                if(matcher.matches()){
                    lblResultado.setText("Si cumple");
                }else{
                    lblResultado.setText("No Cumple");
                }
                break;
            case 1:
            break;

        }

    }
}
