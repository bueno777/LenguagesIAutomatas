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

    @FXML
    protected void initialize() {
        //ISC 5B
        //frase perro_casa


        listaejer.getItems().addAll("Ejercicio 1", "Ejercicio 2", "Validad grupo");
    }
}

    public void procesar(ActionEvent event) {
        int selecion = listaejer.getSelectionModel().getSelectedIndex();
        String texto = txtTexto.getText();
        String expression= "";
        switch (selecion) {
            case 0: {
                expression = "^[^_][^p]([a-zA-Z0-9]{3,})[q|w]$";

                break;
            }
            case 1: {
                expression = "\\+([a-zA-Z]+)";

                break;
            }
            case 2: {
                expression = "^(ISC)-([-9])[A|B]$";
                break;
            }
            case 3: {
                expression= "([A-Za-z]{1,})[_]([A-Za-z]{1,})";

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

