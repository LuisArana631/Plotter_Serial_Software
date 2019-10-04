

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Boton extends JButton implements ActionListener {
    
    private int x,y;
    
    public Boton(int x, int y){
      this.x = x;
      this.y = y;
      this.setBackground(Color.WHITE);
      this.addActionListener(this);
      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(Init_Window.color.equals("black")){
            this.setBackground(Color.BLACK);
        } else if (Init_Window.color.equals("white")){
            this.setBackground(Color.WHITE);
        } else if (Init_Window.color.equals("green")){
            this.setBackground(Color.GREEN);
        }
    }
    
}
