package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Controller {
    @FXML
    Label lblLineas;
    @FXML
    TextArea txtReceta;
    @FXML protected void initialize() {

        try {
            File f= new file(".src/sample/archivo.txt");
            BufferedReader; b= new BufferedReader(new FileReader(f));
            String texto="";
            while (texto = br.readline()!=null){
                txtReceta.appendText("/n"+texto);

            }


        } catch (Exception e) {
            txtReceta.setText(e.getMessage());
        }
    }

    public void procesar(ActionEvent event){
        String[] arregloLineas = txtReceta.getText().split("/n");
        lblLineas.setText("Lineas:"+ arregloLineas.length);
        boolean encontro = false;
        for(int = 0;arregloLineas.length;x++){
            if(arregloLineas[x].contains("queso")) {
                String[] arr2=arregloLineas[x].split(" ");
                System.out.println(arr2[0]);
            }
            if(arregloLineas[x].contains("manzanas")){
                String[] arr2 = arregloLineas[x].split(" ");
                System.out.println("Manzanas:"+ arr2[0]);
            }
            if(encontro){

                System.out.println(arregloLineas[x]);
            }
            if(arregloLineas[x].contains("***")){
                encontro = true;
            }
        }
    }

}
