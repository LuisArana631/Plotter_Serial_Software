
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Lexico {
    
    private String patch, lexemaact, lexemaant;
    private ArrayList<Token> tokens = new ArrayList<Token>();
    private int estado;
    private boolean repetir = false;
    public static boolean error = false;
    private JFrame frame;
    
    public Lexico(String patch, JFrame frame){
        this.patch = patch;
        this.lexemaact = "";
        this.lexemaant = "";
        this.estado = 0;
        this.frame = frame;
    }
    
    public void AgregarToken(String tk, String lexema, String tipo){
        tokens.add(new Token(tk, lexema, tipo));
    }
    
    
    public void Analizador(JFrame frame){
        try {
            
            FileInputStream file =  new FileInputStream(patch);
            DataInputStream entrada = new DataInputStream(file);
            BufferedReader bf = new BufferedReader(new InputStreamReader(entrada));    
            String linea="";
            patch = "";
            tokens.clear();
            error = false;
            
            while((linea = bf.readLine()) != null){                
                char[] array = linea.toCharArray();
                for (char c : array) {
                    
                    String ch = String.valueOf(c);
                
                    do {
                        repetir = false;
                       
                        switch(estado){
                            case 0: //posibles transiciones para el Estado 0 (ACEPTACION DE SIMBOLOS O INICIO A OTROS ESTADOS)
                                    if(ch.equals("{")){
                                    lexemaant = "{";
                                    AgregarToken("TK_LA", lexemaant,"LLAVE ABIERTA");    
                                    }
                                    else if(ch.equals("}")){
                                    lexemaant = "}";
                                    AgregarToken("TK_LC", lexemaant,"LLAVE CERRADA");    
                                    }
                                    else if(ch.equals("\"")){
                                    lexemaant = "\"";
                                    AgregarToken("TK_COMILLAS", lexemaant,"COMILLAS");    
                                    }
                                    else if(ch.equals(":")){
                                    lexemaant = ":";
                                    AgregarToken("TK_DP", lexemaant,"DOS PUNTOS");
                                    }
                                    else if(ch.equals("[")){
                                    lexemaant = "[";
                                    AgregarToken("TK_CA", lexemaant,"CORCHETE ABIERTO");    
                                    }
                                    else if(ch.equals("]")){
                                    lexemaant = "]";
                                    AgregarToken("TK_CC", lexemaant,"CORCHETE CERRADO");    
                                    }
                                    else if(ch.equals(",")){
                                    lexemaant = ",";
                                    AgregarToken("TK_COMA", lexemaant,"SIMBOLO COMA");    
                                    }
                                    else if(Character.isLetter(c)){
                                    lexemaact = "";
                                    estado = 1;
                                    lexemaact+=ch;
                                    }
                                    else if(Character.isDigit(c)){
                                    lexemaact = "";
                                    estado = 2;
                                    lexemaact+=ch;
                                    }
                                    else if(c == ' ' || c == '\t' || c == '\n' || c == '\r' || Character.isWhitespace(c)){
                                    continue;    
                                    }
                                    else {
                                    error = true;
                                    }
                            break;  
                                
                            case 1: //posibles transiciones para el Estado 1 (PALABRAS RESERVADAS)
                                
                                    if(Character.isLetter(c)){
                                        estado = 1;
                                        lexemaact+=c;
                                    } else {                                       
                                        switch(lexemaact.toLowerCase()){
                                            case "coordenadas": 
                                            lexemaant = lexemaact;
                                            AgregarToken("TK_CS",lexemaant,"PALABRA RESERVADA");
                                            lexemaant = "";
                                            break;
                                            case "x":
                                            lexemaant = lexemaact;
                                            AgregarToken("TK_X",lexemaant,"PALABRA RESERVADA");
                                            lexemaant = "";
                                            break;
                                            case "y": 
                                            lexemaant = lexemaact;
                                            AgregarToken("TK_Y",lexemaant,"PALABRA RESERVADA");
                                            lexemaant = "";
                                            break;
                                            default: 
                                            error = true;
                                            break;                                            
                                        }                                                                              
                                        estado = 0;                                    
                                        repetir = true;                                   
                                        lexemaact = "";
                                    }                                
                            break;
                                
                            case 2: //posibles transiciones para el Estado 2 (NUMEROS)
                                
                                 if(Character.isDigit(c)){
                                        estado = 2;
                                        lexemaact+=c;
                                    } else {
                                        lexemaant = lexemaact;
                                        AgregarToken("TK_NUMERO",lexemaant,"NÚMERO");
                                        lexemaant = "";
                                        estado = 0;                                    
                                        repetir = true;                                   
                                        lexemaact = "";
                                    }                                
                            break;
                                
                        }
                        
                        
                    } while(repetir);
                                       
                }   
            }
            
            Sintactico sin = new Sintactico(tokens, frame);
            sin.Analizar();
            
            if(!error){
             JOptionPane.showMessageDialog(frame, "¡Dibujo cargado exitosamente!");    
            } else {
                if(!Init_Window.coordenadas.isEmpty()){
                  Init_Window.coordenadas.clear();  
                }
             
             JOptionPane.showMessageDialog(frame, "¡Error en archivo de entrada!"); 
            }
            
             
            }
            
            catch (Exception e) {
            }
    }
    
    
}
