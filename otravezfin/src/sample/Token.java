package sample.Interprete;

public class Token {
    public String getNombre;
    private String tipo;
    private String valor;
    private String nombre;
    // declarar x como INTEGER = 10;
    // declara x como coor 10,10

    public Token(String tipo, String valor, String nombre) {
        this.tipo = tipo;
        this.valor = valor;
        this.nombre = nombre;
    }

    public Token(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}