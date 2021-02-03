
    import javafx.scene.control.Label;
    import javafx.scene.control.TextArea;

    import javax.xml.soap.Text;

    import static sample.Interprete.TipsToken.*;

    public class Compilador {
        private VBox pane;
        private TextArea consola;
        public Compilador(TextArea tx, VBox pane) {
            this.consola = tx;
            this.pane=pane;
        }
        public boolean compilar(String renglon){
            boolean errores= false;
            if(renglon.contains("print")) {
                int i1 = renglon.indexOf('(') + 1;
                int i2 = renglon.length() - 1;
                String texto = renglon.substring(i1, i2);

                if(!validar(arreglo[1].trim())){
                    String tipoToken= ;
                if((arreglo[3].equals("sarten")) {
                    tipoToken = SARTEN;
                }else{
                    tipoToken= CEBOLLA;
            }
                Token token= new Token(tipoToken,100,arreglo[1].trim(),);
                arrayToken.add(token);
            }else{

        this.consola.appendText("\n la variable con el nombre"+arreglo[1]+"ya esta declarada");
        }
}else if(renglon.contains("cocinar")){
        int i1=renglon.indexOf('(')+1;
        int i2=renglon.length()-1;
        String texto=renglon.substring(i1,i2).trim();
        if(validar(texto)){
            Token t1=buscarToken(texto);
        System.out.println(t1.getNombre());
        System.out.println(t1.getTipo());
        System.out.println(t1.getValor());
            Label label = new label ("Cocinando las cebollas ");
            pane.getChildren().add(label);
        }else{

        this.consola.appendText("\n el ingrediente con el nomre "+texto+"no esta declarado")
        }
        this.consola.appendText("\n"+texto);
        }
        retur errores;
        }
        public boolean validar(String nombre) {
            boolean existe = false;
            for (int x = 0; x < arrayToken.size(); x++) {
                if (arrayYoken.get(x).getNombre().equals(nombre)) {
                    existe = true;
                }
            }
        }
    }