
public class Token {
    
    
    private String tk, lexema, tipo;
    
    public Token(String tk, String lexema, String tipo){
        this.tk = tk;
        this.lexema = lexema;
        this.tipo = tipo;
    }
    
    public String getTk(){
        return this.tk;
    }
    
    public String getLexema(){
        return this.lexema;
    }

    public String getTipo(){
        return this.tipo;
    }
}
