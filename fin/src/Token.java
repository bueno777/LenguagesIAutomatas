public class Token {
    public class Token{
        private String tipo;
        private String valor;
        private String nombre;

        public Token(String tipo, String valor, String nombre){
            this.tipo = tipo;
            this.valor = valor;
            this.nombre = nombre;
        }
        public Token(String tipo, String nombre);
    }
    public String getTipo(){
        return tipo;
    }
}
