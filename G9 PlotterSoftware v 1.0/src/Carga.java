

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Carga extends Thread {
   
    private final JFrame frame;
    private int round;
    private int count;
    private int total;
    private final pPort port;
    
    
    public Carga(JFrame frame){
        this.round = 0;
        this.count = 0;
        this.frame = frame;
        this.total = Init_Window.printlist.size()/3;
        port = new pPort();
        port.setAllDataBits((short)1);
    }
    
    /**
     *
     */
    @Override
    public void run(){
       
    
                   try {                    
                    port.setAllDataBits((short)0);
                    Carga.sleep(500);

                    for(Coordenada c : Init_Window.printlist){

                    switch(c.GetY()){
                        case 0: //0000
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                               Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                                                         
                        break; 
                        case 1: //0001
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                               Carga.sleep(500);
                                port.setPin((short)3, (short)0);                               
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                            
                        break; 
                        case 2: //0010
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                               
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                                                                                  
                        break; 
                        case 3: //0011
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                               
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                               
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                                                              
                        break; 
                        case 4: //0100
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                               
                        break; 
                        case 5: //0101
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 6: //0110
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 7: //0111
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 8: //1000
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 9: //1001
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 10: //1010
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                              
                        break; 
                        case 11: //1011
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 12: //1100
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 13: //1101
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 14: //1110
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 15: //1111
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);  
                        break; 
                    }                    
                     switch(c.GetX()){
                        case 0: //0000
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                                                        
                        break; 
                        case 1: //0001
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                                                           
                        break; 
                        case 2: //0010
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                                                                                                                
                        break; 
                        case 3: //0011
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                               
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                                                                                            
                        break; 
                        case 4: //0100
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);                              
                        break; 
                        case 5: //0101
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 6: //0110
                                port.setPin((short)2, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break; 
                        case 7: //0111
                                port.setPin((short)2, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)1);
                                Carga.sleep(500);
                                port.setPin((short)3, (short)0);
                        break;   
                    }
                    
                     round++;
                     JOptionPane.showMessageDialog(frame, "X: "+c.GetX()+", Y: "+c.GetY());
                     
                      if(round==3){
                          count++;
                          if(count<total){                             
                            JOptionPane.showMessageDialog(frame, "¡Carga "+count+"/"+total+" terminada, presiona \"Aceptar\" para continuar");
                            round=0;
                          } else {
                              JOptionPane.showMessageDialog(frame, "¡Carga terminada!");
                              round=0;
                              count=0;
                              total=0;
                          }                                              
                   }                    
            } 
                             
            } catch (Exception e) {
            }             
            }
           
                    
        
  
        
}