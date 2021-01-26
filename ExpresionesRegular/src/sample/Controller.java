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
        listaejer.getItems().addAll("Ejercicio 1","Ejercicio 2","Validad expression");
    }


    public void procesar(ActionEvent event) {
        int selecion = listaejer.getSelectionModel().getSelectedIndex();
        String texto = txtTexto.getText();
        String expression= "";
        switch (selecion) {
            case 0: {
                expression = "^[^_][^p]([a-zA-Z0-9]{6,8})q|w$";

                break;
            }
            case 1:{
                expression="\\+([a-zA-Z]+)";

                break;

        }
            }

                Pattern paron = Pattern.compile("^[^_][^p]([a-zA-Z0-9]{6,8})q|w$");
                Matcher matcher = paron.matcher(texto);
                if(matcher.matches()){
                    lblResultado.setText("Si cumple");
                }else{
                    lblResultado.setText("No Cumple");

        }

    }

