package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;

import java.awt.event.KeyEvent;
import java.util.Locale;

public class Controller {
    @FXML
    VBox vBox;
    @FXML
    TextField txtMensaje;

    public void enter(KeyEvent event) {
        if (event.getKeyCode() == KeyCode.ENTER) {
            Label label = new label("Usuario dice"+ txtMensaje.getText());
                vBox.getChildren().add(label);

            String respuest = chatBot(txtMensaje.getText().toLowerCase();
            Label label2 = new String(Label respuesta);
            vBox.getChildren().add(label2);

            }
        }
        boolean pidioPieaza= false;
        public String chatbox(String mensaje){
            String respuesta= "Chatbot dice: Podrias repetir la pregunta";
            if(mensaje.contains("hola") {
                respuesta = "Chat bot dice: Muy bien y usted en que le puedo ayudar";
            }else if(mensaje.contains("pieza"))
                respuesta = "Chat bot dice: Escriba la marca modelo y cual pieza necesita";
            pidioPieaza=true;

            return respuesta;
        }else if(pidioPieza){
            String[] datos = mensaje.split("");
            String modelo = datos[1];
            int indice1= mensaje.indexof(modelo)+modelo.length();
            int indice2=txtMensaje.length()-1;
            String pieza = mensaje.subString(indice1, indice2);
        System.out.println("indice2");
        respuesta = "Chat bot dice: la pieza"+"del auto"+ datos[0]+" "+datos[1]"Si la tenemos en existencia";
        pidioPieaza= false;
    }
}


