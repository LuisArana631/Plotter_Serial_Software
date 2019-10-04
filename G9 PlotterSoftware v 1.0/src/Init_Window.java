
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author OSCAR
 */
public class Init_Window extends javax.swing.JFrame {

    
    public static String color;
    private int fil = 16;
    private int col = 8;
    Boton[][] tablero;
    
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
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelMatriz = new javax.swing.JPanel();
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

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(PanelMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PanelMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.setToolTipText("");
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
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
