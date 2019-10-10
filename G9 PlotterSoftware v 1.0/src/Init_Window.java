
import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author OSCAR
 */
public class Init_Window extends javax.swing.JFrame {

    
    public static String color;
    private int fil = 16;
    private int col = 8;
    private Boton[][] tablero;
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .draw", "draw");
    private Boolean permitir;
    private String patch="";
    public static ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
    public static ArrayList<Coordenada> printlist = new ArrayList<Coordenada>();
    private String  openfile = "";
    
    
    public Init_Window() {
        
        color = "black";
        initComponents();
        this.setLocationRelativeTo(null);
        setMatrix();
    }

    private void setMatrix(){
        
        tablero = new Boton[fil][col];
        
        int x=0;
        int y=0;
        for(int i = 0;i<fil;i++){
            for(int j = 0; j<col ; j++){
                tablero[i][j]= new Boton(x,y);
                tablero[i][j].setBounds(x, y, 75, 50);
                tablero[i][j].setFocusable(false);
                PanelMatriz.add(tablero[i][j]);
                x+=75;
            }
            y+=50;
            x=0;
        }
    }
    
    
    public void AgregarCoordenada(int x, int y){
        coordenadas.add(new Coordenada(x,y));
    }
    
    public void AgregarXYtoPrint(int x, int y){
        printlist.add(new Coordenada(x,y));
    }
    
    
    private void SetLoad(){
       
       for(int i = 0;i<fil;i++){
            for(int j = 0; j<col ; j++){
                tablero[i][j].setBackground(Color.WHITE);
            }
        }
       
       for(Coordenada c : coordenadas){
           tablero[c.GetY()][c.GetX()].setBackground(Color.BLACK);
            tablero[c.GetY()][c.GetX()].SetColor("black");
       } 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelMatriz = new javax.swing.JPanel();
        lfiguras = new javax.swing.JLabel();
        bnegro = new javax.swing.JButton();
        bblanco1 = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        lcolores = new javax.swing.JLabel();
        bcirculo = new javax.swing.JButton();
        btriangulo = new javax.swing.JButton();
        bcuadrado = new javax.swing.JButton();
        bestrella = new javax.swing.JButton();
        blinea = new javax.swing.JButton();
        lfiguras1 = new javax.swing.JLabel();
        bprint = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("G9 PlotterSoftware v1.0");
        setLocationByPlatform(true);
        setName("ventana"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout PanelMatrizLayout = new javax.swing.GroupLayout(PanelMatriz);
        PanelMatriz.setLayout(PanelMatrizLayout);
        PanelMatrizLayout.setHorizontalGroup(
            PanelMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        PanelMatrizLayout.setVerticalGroup(
            PanelMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        lfiguras.setFont(new java.awt.Font("SquareFont", 0, 24)); // NOI18N
        lfiguras.setForeground(new java.awt.Color(255, 204, 0));
        lfiguras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lfiguras.setText("figures");

        bnegro.setBackground(new java.awt.Color(0, 0, 0));
        bnegro.setFont(new java.awt.Font("SquareFont", 1, 14)); // NOI18N
        bnegro.setForeground(new java.awt.Color(255, 255, 255));
        bnegro.setText("BLACK");
        bnegro.setFocusable(false);
        bnegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnegroActionPerformed(evt);
            }
        });

        bblanco1.setBackground(new java.awt.Color(255, 255, 255));
        bblanco1.setFont(new java.awt.Font("SquareFont", 1, 14)); // NOI18N
        bblanco1.setText("WHITE");
        bblanco1.setFocusable(false);
        bblanco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bblanco1ActionPerformed(evt);
            }
        });

        bclear.setBackground(new java.awt.Color(255, 255, 255));
        bclear.setFont(new java.awt.Font("SquareFont", 1, 14)); // NOI18N
        bclear.setText("CLEAR");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });

        lcolores.setFont(new java.awt.Font("SquareFont", 0, 24)); // NOI18N
        lcolores.setForeground(new java.awt.Color(255, 204, 0));
        lcolores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcolores.setText("COLORS");

        bcirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle.png"))); // NOI18N
        bcirculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        bcirculo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/circle2.png"))); // NOI18N
        bcirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcirculoActionPerformed(evt);
            }
        });

        btriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triangle.png"))); // NOI18N
        btriangulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        btriangulo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/triangle2.png"))); // NOI18N
        btriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrianguloActionPerformed(evt);
            }
        });

        bcuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square.png"))); // NOI18N
        bcuadrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        bcuadrado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/square2.png"))); // NOI18N
        bcuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcuadradoActionPerformed(evt);
            }
        });

        bestrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star.png"))); // NOI18N
        bestrella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        bestrella.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/star2.png"))); // NOI18N
        bestrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestrellaActionPerformed(evt);
            }
        });

        blinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/line.png"))); // NOI18N
        blinea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        blinea.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/line2.png"))); // NOI18N
        blinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blineaActionPerformed(evt);
            }
        });

        lfiguras1.setFont(new java.awt.Font("SquareFont", 0, 24)); // NOI18N
        lfiguras1.setForeground(new java.awt.Color(255, 204, 0));
        lfiguras1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lfiguras1.setText("options");

        bprint.setFont(new java.awt.Font("SquareFont", 1, 14)); // NOI18N
        bprint.setText("PRINT");
        bprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(lcolores, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(lfiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(blinea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(lfiguras1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(bblanco1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(bnegro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bcirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bcuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(59, 59, 59)
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bestrella, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(bprint, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))))
                .addComponent(PanelMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lcolores, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnegro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bblanco1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lfiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bcirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bcuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bestrella, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(blinea, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(lfiguras1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bprint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(PanelMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        BarraMenu.setFont(new java.awt.Font("SquareFont", 0, 18)); // NOI18N

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Save As...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Close");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        BarraMenu.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem6.setText("Show Documentation");
        jMenu2.add(jMenuItem6);

        jMenuItem5.setText("About G9 PlotterSoftware v1.0");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        BarraMenu.add(jMenu2);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JOptionPane.showMessageDialog(this, "Collaborators:\n Luis Fernando Arana Arias - 201700988\n Oscar Alfredo Llamas Lemus - 201602625\n "
                + "Jose Alejandro Santizo Cotto - 201709309\n Oscar Armin Crisostomo Ruiz - 201709140\n Christopher Alexander Cobar Asturias - 201709272"                
                , "About G9 PlotterSoftware v1.0", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void bblanco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bblanco1ActionPerformed
      color = "white";
    }//GEN-LAST:event_bblanco1ActionPerformed

    private void bnegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnegroActionPerformed
      color = "black";
    }//GEN-LAST:event_bnegroActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
       for(int i = 0;i<fil;i++){
            for(int j = 0; j<col ; j++){
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].SetColor("white");
            }
        }
    }//GEN-LAST:event_bclearActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     String pcusuario = System.getProperty("user.home");
     JFileChooser buscador = new JFileChooser(pcusuario +"/Desktop");
     buscador.setAcceptAllFileFilterUsed(false);
     buscador.setFileFilter(filtro);
     int abrir = buscador.showOpenDialog(this);
     if(abrir == buscador.APPROVE_OPTION){
       patch = buscador.getSelectedFile().getAbsolutePath();
       openfile = buscador.getSelectedFile().getAbsolutePath();
       permitir = true;
       coordenadas.clear();
       Lexico lex = new Lexico(patch, this);
       lex.Analizador(this);
      if(!coordenadas.isEmpty()){
           SetLoad();
       }
     }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(openfile != ""){
              try {
                File file = new File(openfile);
                FileWriter fr = new FileWriter(file, false);
                BufferedWriter br = new BufferedWriter(fr);
                PrintWriter writer = new PrintWriter(br);
                writer.println("{");
                writer.println("\"Coordenadas\": [");
                Init_Window.coordenadas.clear();
                 for(int i = 0;i<fil;i++){
                for(int j = 0; j<col ; j++){
                        if(tablero[i][j].getColor().equals("black")){
                          AgregarCoordenada(j,i);
                        }
                    }
                }                            
                for(Coordenada c : coordenadas){
                if(coordenadas.indexOf(c) == (coordenadas.size()-1)){
                 String line = String.format("{ \"X\": %s , \"Y\": %s }",c.GetX(),c.GetY());
                writer.println(line);  
                } else {
                 String line = String.format("{ \"X\": %s , \"Y\": %s },",c.GetX(),c.GetY());
                writer.println(line);  
                    }                                      
                }
                writer.println("]");
                writer.println("}");
                writer.close();
            } catch (IOException ex) {
                
            }
        } else {
              String pcusuario = System.getProperty("user.home");
     JFileChooser buscador = new JFileChooser(pcusuario +"/Desktop");
     buscador.setAcceptAllFileFilterUsed(false);
     buscador.setFileFilter(filtro);
     int save = buscador.showSaveDialog(this);
     
     if(save == buscador.APPROVE_OPTION){
         String dir = buscador.getSelectedFile().getAbsolutePath();
         if(!dir.endsWith(".draw") && !dir.endsWith(".txt")){
             dir+=".draw";
         }
         
         
            try {
                File file = new File(dir);
                FileWriter fr = new FileWriter(file, false);
                BufferedWriter br = new BufferedWriter(fr);
                PrintWriter writer = new PrintWriter(br);
                writer.println("{");
                writer.println("\"Coordenadas\": [");
                Init_Window.coordenadas.clear();
                 for(int i = 0;i<fil;i++){
                for(int j = 0; j<col ; j++){
                        if(tablero[i][j].getColor().equals("black")){
                          AgregarCoordenada(j,i);
                        }
                    }
                }                            
                for(Coordenada c : coordenadas){
                if(coordenadas.indexOf(c) == (coordenadas.size()-1)){
                 String line = String.format("{ \"X\": %s , \"Y\": %s }",c.GetX(),c.GetY());
                writer.println(line);  
                } else {
                 String line = String.format("{ \"X\": %s , \"Y\": %s },",c.GetX(),c.GetY());
                writer.println(line);  
                    }                                      
                }
                writer.println("]");
                writer.println("}");
                writer.close();
            } catch (IOException ex) {
                
            }
        
       
     }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String pcusuario = System.getProperty("user.home");
     JFileChooser buscador = new JFileChooser(pcusuario +"/Desktop");
     buscador.setAcceptAllFileFilterUsed(false);
     buscador.setFileFilter(filtro);
     int save = buscador.showSaveDialog(this);
     
     if(save == buscador.APPROVE_OPTION){
         String dir = buscador.getSelectedFile().getAbsolutePath();
         if(!dir.endsWith(".draw") && !dir.endsWith(".txt")){
             dir+=".draw";
         }
         
         
            try {
                File file = new File(dir);
                FileWriter fr = new FileWriter(file, false);
                BufferedWriter br = new BufferedWriter(fr);
                PrintWriter writer = new PrintWriter(br);
                writer.println("{");
                writer.println("\"Coordenadas\": [");
                Init_Window.coordenadas.clear();
                 for(int i = 0;i<fil;i++){
                for(int j = 0; j<col ; j++){
                        if(tablero[i][j].getColor().equals("black")){
                          AgregarCoordenada(j,i);
                        }
                    }
                }                            
                for(Coordenada c : coordenadas){
                if(coordenadas.indexOf(c) == (coordenadas.size()-1)){
                 String line = String.format("{ \"X\": %s , \"Y\": %s }",c.GetX(),c.GetY());
                writer.println(line);  
                } else {
                 String line = String.format("{ \"X\": %s , \"Y\": %s },",c.GetX(),c.GetY());
                writer.println(line);  
                    }                                      
                }
                writer.println("]");
                writer.println("}");
                writer.close();
            } catch (IOException ex) {
                
            }
        
       
     }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void bcirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcirculoActionPerformed
          for(int i = 0;i<fil;i++){
            for(int j = 0; j<col ; j++){
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].SetColor("white");
            }
        }
        tablero[3][3].setBackground(Color.BLACK);
        tablero[3][3].SetColor("black");
        tablero[3][4].setBackground(Color.BLACK);
        tablero[3][4].SetColor("black");
        tablero[4][1].setBackground(Color.BLACK);
        tablero[4][1].SetColor("black");
        tablero[4][2].setBackground(Color.BLACK);
        tablero[4][2].SetColor("black");
        tablero[4][5].setBackground(Color.BLACK);
        tablero[4][5].SetColor("black");
        tablero[4][6].setBackground(Color.BLACK);
        tablero[4][6].SetColor("black");
        tablero[5][1].setBackground(Color.BLACK);
        tablero[5][1].SetColor("black");
        tablero[5][6].setBackground(Color.BLACK);
        tablero[5][6].SetColor("black");
        tablero[6][0].setBackground(Color.BLACK);
        tablero[6][0].SetColor("black");
        tablero[6][7].setBackground(Color.BLACK);
        tablero[6][7].SetColor("black");
        tablero[7][0].setBackground(Color.BLACK);
        tablero[7][0].SetColor("black");
        tablero[7][7].setBackground(Color.BLACK);
        tablero[7][7].SetColor("black");
        tablero[8][0].setBackground(Color.BLACK);
        tablero[8][0].SetColor("black");
        tablero[8][7].setBackground(Color.BLACK);
        tablero[8][7].SetColor("black");
        tablero[9][0].setBackground(Color.BLACK);
        tablero[9][0].SetColor("black");
        tablero[9][7].setBackground(Color.BLACK);
        tablero[9][7].SetColor("black");
        tablero[10][1].setBackground(Color.BLACK);
        tablero[10][1].SetColor("black");
        tablero[10][6].setBackground(Color.BLACK);
        tablero[10][6].SetColor("black");
        tablero[11][1].setBackground(Color.BLACK);
        tablero[11][1].SetColor("black");
        tablero[11][2].setBackground(Color.BLACK);
        tablero[11][2].SetColor("black");
        tablero[11][5].setBackground(Color.BLACK);
        tablero[11][5].SetColor("black");
        tablero[11][6].setBackground(Color.BLACK);
        tablero[11][6].SetColor("black");
        tablero[12][3].setBackground(Color.BLACK);
        tablero[12][3].SetColor("black");
        tablero[12][4].setBackground(Color.BLACK);
        tablero[12][4].SetColor("black");
    }//GEN-LAST:event_bcirculoActionPerformed

    private void btrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrianguloActionPerformed
        for(int i = 0;i<fil;i++){
            for(int j = 0; j<col ; j++){
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].SetColor("white");
            }
        }
        
        tablero[5][3].setBackground(Color.BLACK);
        tablero[5][3].SetColor("black");
        tablero[5][4].setBackground(Color.BLACK);
        tablero[5][4].SetColor("black");
        tablero[6][2].setBackground(Color.BLACK);
        tablero[6][2].SetColor("black");
        tablero[6][5].setBackground(Color.BLACK);
        tablero[6][5].SetColor("black");
        tablero[7][1].setBackground(Color.BLACK);
        tablero[7][1].SetColor("black");
        tablero[7][6].setBackground(Color.BLACK);
        tablero[7][6].SetColor("black");
        tablero[8][0].setBackground(Color.BLACK);
        tablero[8][0].SetColor("black");
        tablero[8][7].setBackground(Color.BLACK);
        tablero[8][7].SetColor("black");
        tablero[9][0].setBackground(Color.BLACK);
        tablero[9][0].SetColor("black");
        tablero[9][1].setBackground(Color.BLACK);
        tablero[9][1].SetColor("black");
        tablero[9][2].setBackground(Color.BLACK);
        tablero[9][2].SetColor("black");
        tablero[9][3].setBackground(Color.BLACK);
        tablero[9][3].SetColor("black");
        tablero[9][4].setBackground(Color.BLACK);
        tablero[9][4].SetColor("black");
        tablero[9][5].setBackground(Color.BLACK);
        tablero[9][5].SetColor("black");
        tablero[9][6].setBackground(Color.BLACK);
        tablero[9][6].SetColor("black");
        tablero[9][7].setBackground(Color.BLACK);
        tablero[9][7].SetColor("black");
        
    }//GEN-LAST:event_btrianguloActionPerformed

    private void bcuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcuadradoActionPerformed
     for(int i = 0;i<fil;i++){
            for(int j = 0; j<col ; j++){
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].SetColor("white");
            }
        }
     
     tablero[4][1].setBackground(Color.BLACK);
     tablero[4][1].SetColor("black");
     tablero[4][2].setBackground(Color.BLACK);
     tablero[4][2].SetColor("black");
     tablero[4][3].setBackground(Color.BLACK);
     tablero[4][3].SetColor("black");
     tablero[4][4].setBackground(Color.BLACK);
     tablero[4][4].SetColor("black");
     tablero[4][5].setBackground(Color.BLACK);
     tablero[4][5].SetColor("black");
     tablero[4][6].setBackground(Color.BLACK);
     tablero[4][6].SetColor("black");
     tablero[5][1].setBackground(Color.BLACK);
     tablero[5][1].SetColor("black");
     tablero[5][6].setBackground(Color.BLACK);
     tablero[5][6].SetColor("black");
     tablero[6][1].setBackground(Color.BLACK);
     tablero[6][1].SetColor("black");
     tablero[6][6].setBackground(Color.BLACK);
     tablero[6][6].SetColor("black");
     tablero[7][1].setBackground(Color.BLACK);
     tablero[7][1].SetColor("black");
     tablero[7][6].setBackground(Color.BLACK);
     tablero[7][6].SetColor("black");
     tablero[8][1].setBackground(Color.BLACK);
     tablero[8][1].SetColor("black");
     tablero[8][6].setBackground(Color.BLACK);
     tablero[8][6].SetColor("black");
     tablero[9][1].setBackground(Color.BLACK);
     tablero[9][1].SetColor("black");
     tablero[9][6].setBackground(Color.BLACK);
     tablero[9][6].SetColor("black");
     tablero[10][1].setBackground(Color.BLACK);
     tablero[10][1].SetColor("black");
     tablero[10][6].setBackground(Color.BLACK);
     tablero[10][6].SetColor("black");
     tablero[11][1].setBackground(Color.BLACK);
     tablero[11][1].SetColor("black");
     tablero[11][2].setBackground(Color.BLACK);
     tablero[11][2].SetColor("black");
     tablero[11][3].setBackground(Color.BLACK);
     tablero[11][3].SetColor("black");
     tablero[11][4].setBackground(Color.BLACK);
     tablero[11][4].SetColor("black");
     tablero[11][5].setBackground(Color.BLACK);
     tablero[11][5].SetColor("black");
     tablero[11][6].setBackground(Color.BLACK);
     tablero[11][6].SetColor("black");
    }//GEN-LAST:event_bcuadradoActionPerformed

    private void bestrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestrellaActionPerformed
    for(int i = 0;i<fil;i++){
        for(int j = 0; j<col ; j++){
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].SetColor("white");
        }
    }
    
    tablero[2][3].setBackground(Color.BLACK);
    tablero[2][3].SetColor("black");
    tablero[2][4].setBackground(Color.BLACK);
    tablero[2][4].SetColor("black");
    tablero[3][3].setBackground(Color.BLACK);
    tablero[3][3].SetColor("black");
    tablero[3][4].setBackground(Color.BLACK);
    tablero[3][4].SetColor("black");
    tablero[4][2].setBackground(Color.BLACK);
    tablero[4][2].SetColor("black");
    tablero[4][5].setBackground(Color.BLACK);
    tablero[4][5].SetColor("black");
    tablero[5][0].setBackground(Color.BLACK);
    tablero[5][0].SetColor("black");
    tablero[5][1].setBackground(Color.BLACK);
    tablero[5][1].SetColor("black");
    tablero[5][2].setBackground(Color.BLACK);
    tablero[5][2].SetColor("black");
    tablero[5][5].setBackground(Color.BLACK);
    tablero[5][5].SetColor("black");
    tablero[5][6].setBackground(Color.BLACK);
    tablero[5][6].SetColor("black");
    tablero[5][7].setBackground(Color.BLACK);
    tablero[5][7].SetColor("black");
    tablero[6][0].setBackground(Color.BLACK);
    tablero[6][0].SetColor("black");
    tablero[6][7].setBackground(Color.BLACK);
    tablero[6][7].SetColor("black");
    tablero[7][1].setBackground(Color.BLACK);
    tablero[7][1].SetColor("black");
    tablero[7][6].setBackground(Color.BLACK);
    tablero[7][6].SetColor("black");
    tablero[8][2].setBackground(Color.BLACK);
    tablero[8][2].SetColor("black");
    tablero[8][5].setBackground(Color.BLACK);
    tablero[8][5].SetColor("black");
    tablero[9][2].setBackground(Color.BLACK);
    tablero[9][2].SetColor("black");
    tablero[9][5].setBackground(Color.BLACK);
    tablero[9][5].SetColor("black");
    tablero[10][1].setBackground(Color.BLACK);
    tablero[10][1].SetColor("black");
    tablero[10][3].setBackground(Color.BLACK);
    tablero[10][3].SetColor("black");
    tablero[10][4].setBackground(Color.BLACK);
    tablero[10][4].SetColor("black");
    tablero[10][6].setBackground(Color.BLACK);
    tablero[10][6].SetColor("black");
    tablero[11][0].setBackground(Color.BLACK);
    tablero[11][0].SetColor("black");
    tablero[11][2].setBackground(Color.BLACK);
    tablero[11][2].SetColor("black");
    tablero[11][5].setBackground(Color.BLACK);
    tablero[11][5].SetColor("black");
    tablero[11][7].setBackground(Color.BLACK);
    tablero[11][7].SetColor("black");
    tablero[12][0].setBackground(Color.BLACK);
    tablero[12][0].SetColor("black");
    tablero[12][1].setBackground(Color.BLACK);
    tablero[12][1].SetColor("black");
    tablero[12][6].setBackground(Color.BLACK);
    tablero[12][6].SetColor("black");
    tablero[12][7].setBackground(Color.BLACK);
    tablero[12][7].SetColor("black");
    }//GEN-LAST:event_bestrellaActionPerformed

    private void blineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blineaActionPerformed
     for(int i = 0;i<fil;i++){
        for(int j = 0; j<col ; j++){
                tablero[i][j].setBackground(Color.WHITE);
                tablero[i][j].SetColor("white");
        }
    }          
    tablero[7][0].setBackground(Color.BLACK);
    tablero[7][0].SetColor("black");
    tablero[7][1].setBackground(Color.BLACK);
    tablero[7][1].SetColor("black");
    tablero[7][2].setBackground(Color.BLACK);
    tablero[7][2].SetColor("black");
    tablero[7][3].setBackground(Color.BLACK);
    tablero[7][3].SetColor("black");
    tablero[7][4].setBackground(Color.BLACK);
    tablero[7][4].SetColor("black");
    tablero[7][5].setBackground(Color.BLACK);
    tablero[7][5].SetColor("black");
    tablero[7][6].setBackground(Color.BLACK);
    tablero[7][6].SetColor("black");
    tablero[7][7].setBackground(Color.BLACK);
    tablero[7][7].SetColor("black");
    }//GEN-LAST:event_blineaActionPerformed

    private void bprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprintActionPerformed
    printlist.clear();
    for(int i = 0;i<fil;i++){
            for(int j = 0; j<col ; j++){
                if(tablero[i][j].getColor().equals("black")){
                    AgregarXYtoPrint(tablero[i][j].getX(),tablero[i][j].getY());
                }
            }
        }
    
    if(MultiploDe3(printlist.size())){
        Carga print = new Carga(this);
        print.start();  
       } else {
        while(!MultiploDe3(printlist.size())){
            printlist.add(printlist.get(printlist.size()));
        }
        Carga print = new Carga(this);
        print.start(); 
    }
    
        
    }//GEN-LAST:event_bprintActionPerformed

    public boolean MultiploDe3(int x){
        if(x % 3 == 0){
            return true;
        } else {
            return false;
        }
    }
  
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Init_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Init_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Init_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Init_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Init_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JPanel PanelMatriz;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton bblanco1;
    private javax.swing.JButton bcirculo;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bcuadrado;
    private javax.swing.JButton bestrella;
    private javax.swing.JButton blinea;
    private javax.swing.JButton bnegro;
    private javax.swing.JButton bprint;
    private javax.swing.JButton btriangulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel lcolores;
    private javax.swing.JLabel lfiguras;
    private javax.swing.JLabel lfiguras1;
    // End of variables declaration//GEN-END:variables
}
