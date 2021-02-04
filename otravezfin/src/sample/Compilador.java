package sample;

import javafx.scene.control.TextArea;

public class Compilador {
    private TextArea console;
    private VBox pane;
    public Compilador(TextArea tx, VBox pane){
        this.console= tx;
        this.pane= pane;
    }
    public boolean compilar(String renglon){
        boolean error = false;
        if (renglon.contains("print")) {
            int i1 = renglon.indexOf('(') + 1;
            int i2 = renglon.length() - 1;
            String texto = renglon.substring(i1, i2);
            this.console.appendText("\n" + texto);
        }else if (renglon.contains("declarar")){
            String[] arreglo= renglon.split("");
            if (!validar*arreglo[1].trim())){
    String tipoToken= "";
    if *arreglo[3],equals("sarten")){
    
                }
            }
        }
    }
}
