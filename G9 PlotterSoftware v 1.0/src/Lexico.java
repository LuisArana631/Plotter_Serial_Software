
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Lexico {
    
    private String patch;
    private ArrayList<Token> tokens = new ArrayList<Token>();
    
    
    public Lexico(String patch){
        this.patch = patch;
    }
    
    public void Analizador(JFrame frame){
        try {
                
            FileInputStream file =  new FileInputStream(patch);
            DataInputStream entrada = new DataInputStream(file);
            BufferedReader bf = new BufferedReader(new InputStreamReader(entrada, StandardCharsets.ISO_8859_1));    
            String linea="";
            patch = "";
            
            while((linea = bf.readLine()) != null){
                
                char[] array = linea.toCharArray();
                for (char c : array) {
                
                }
                
            }
            JOptionPane.showMessageDialog(frame, "¡Dibujo cargado exitosamente!"); 
            }
            
            catch (Exception e) {
            }
    }
    
    
}
