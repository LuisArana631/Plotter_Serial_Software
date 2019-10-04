
import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
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
    Boton[][] tablero;
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .draw", "draw");
    Boolean permitir;
    String patch="";
    public static ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
    
    
    
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
    
    private void SetLoad(){
       
       for(int i = 0;i<fil;i++){
            for(int j = 0; j<col ; j++){
                tablero[i][j].setBackground(Color.WHITE);
            }
        }
       
       for(Coordenada c : coordenadas){
           tablero[c.GetY()][c.GetX()].setBackground(Color.BLACK);
       } 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelMatriz = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bnegro = new javax.swing.JButton();
        bblanco1 = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("SquareFont", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Colores");

        bnegro.setBackground(new java.awt.Color(0, 0, 0));
        bnegro.setFont(new java.awt.Font("SquareFont", 1, 14)); // NOI18N
        bnegro.setForeground(new java.awt.Color(255, 255, 255));
        bnegro.setText("NEGRO");
        bnegro.setFocusable(false);
        bnegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnegroActionPerformed(evt);
            }
        });

        bblanco1.setBackground(new java.awt.Color(255, 255, 255));
        bblanco1.setFont(new java.awt.Font("SquareFont", 1, 14)); // NOI18N
        bblanco1.setText("BLANCO");
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

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addComponent(bblanco1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(bnegro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(PanelMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnegro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bblanco1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );

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
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Save As...");
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
       permitir = true;
       Lexico lex = new Lexico(patch, this);
       lex.Analizador(this);
      if(!coordenadas.isEmpty()){
           SetLoad();
       }
     }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  
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
    private javax.swing.JButton bclear;
    private javax.swing.JButton bnegro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
