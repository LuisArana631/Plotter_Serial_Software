

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Boton extends JButton implements ActionListener {
    
    private int xpos,ypos;
    private String color;
    
    public Boton(int xpos, int ypos){
      this.xpos = xpos;
      this.ypos = ypos;
      this.setBackground(Color.WHITE);
      this.addActionListener(this);
      this.color = "white";
                  
    }
    
    public String getColor(){
        return this.color;
    }
    
    public int getXPos(){
        return this.xpos;
    }
    
    public int getYPos(){
        return this.ypos;
    }
    
    public void SetColor(String color){
        this.color = color;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(Init_Window.color.equals("black")){
            this.setBackground(Color.BLACK);
            this.color = "black";
        } else if (Init_Window.color.equals("white")){
            this.setBackground(Color.WHITE);
            this.color = "white";
        } 
    }
    
}
