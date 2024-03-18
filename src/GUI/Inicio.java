/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author harle
 */
public class Inicio extends javax.swing.JFrame {
    
    Timer timer;
    int XMouse;
    int YMouse;
    public static Usuario.GestorUsuarios ManagerAcc;
    public static Usuario.Usuario usuario;
    
    public Inicio() {
        initComponents();
        //Inicializar el timer
        Time();
        timer = new Timer(1000, (ActionEvent e ) ->{
            Time();
        });
        timer.start();
        AgregarPanel(new LogIn(this));//Agregar el panel
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UpperTaskBar = new javax.swing.JPanel();
        BcExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sequence");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setBackground(new java.awt.Color(102, 102, 102));
        Logo.setForeground(new java.awt.Color(102, 102, 102));
        Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Peque.png"))); // NOI18N
        Logo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        Logo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -30, 474, -1));

        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 0, 180, 420));

        UpperTaskBar.setBackground(new java.awt.Color(204, 204, 204));
        UpperTaskBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                UpperTaskBarMouseDragged(evt);
            }
        });
        UpperTaskBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UpperTaskBarMousePressed(evt);
            }
        });

        BcExit.setBackground(new java.awt.Color(204, 204, 204));
        BcExit.setForeground(new java.awt.Color(204, 204, 204));

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BcExitLayout = new javax.swing.GroupLayout(BcExit);
        BcExit.setLayout(BcExitLayout);
        BcExitLayout.setHorizontalGroup(
            BcExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BcExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BcExitLayout.setVerticalGroup(
            BcExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BcExitLayout.createSequentialGroup()
                .addComponent(btnExit)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Time.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Time.setForeground(new java.awt.Color(0, 0, 0));
        Time.setText("00:00:00");
        Time.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout UpperTaskBarLayout = new javax.swing.GroupLayout(UpperTaskBar);
        UpperTaskBar.setLayout(UpperTaskBarLayout);
        UpperTaskBarLayout.setHorizontalGroup(
            UpperTaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperTaskBarLayout.createSequentialGroup()
                .addComponent(BcExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addComponent(Time)
                .addGap(190, 190, 190))
        );
        UpperTaskBarLayout.setVerticalGroup(
            UpperTaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BcExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(UpperTaskBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Time, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(UpperTaskBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 615, 40));

        Container.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        try {
            Inicio.writeData();
        } catch (Exception ex){
            System.out.println("ERROR: No se pudo guardar el archivo.");
        }
        System.exit(0);
    }//GEN-LAST:event_btnExitMousePressed

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setForeground(new java.awt.Color(30,30,30));
        BcExit.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        btnExit.setForeground(Color.WHITE);
        BcExit.setBackground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered

    private void UpperTaskBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpperTaskBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-XMouse, y-YMouse);
    }//GEN-LAST:event_UpperTaskBarMouseDragged

    private void UpperTaskBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpperTaskBarMousePressed
        // TODO add your handling code here:
        XMouse = evt.getX();
        YMouse = evt.getY();
                
    }//GEN-LAST:event_UpperTaskBarMousePressed

    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BcExit;
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Logo;
    private javax.swing.JLabel Time;
    private javax.swing.JPanel UpperTaskBar;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    public void AgregarPanel(javax.swing.JPanel Panel){
        //AGREGA EL PANEL
        Panel.setSize(470, 380);
        Panel.setLocation(0, 0);
        Container.removeAll();
        Container.add(Panel);
        Container.revalidate();
        Container.repaint();
    }
    
    public void LoggedIn(Usuario.Usuario usuario){
        this.usuario = usuario;
    }
    
    private void Time(){
        //Timer que muestra la hora
        Calendar ahora = Calendar.getInstance();
        int hora = ahora.get(Calendar.HOUR_OF_DAY);
        int minuto = ahora.get(Calendar.MINUTE);
        int segundo = ahora.get(Calendar.SECOND);
        
        String txt = "";
        if(hora < 10){
            txt += "0";
        }
        txt += hora + ":";
        
        if(minuto <10){
            txt += "0"; 
        }
        txt += minuto + ":";
        
        if(segundo < 10){
             txt += "0"; 
        }
        txt += segundo;
        Time.setText(txt);
        
    }
    
    //Buscando los usuarios ya registrados con sus configs
    private static void readData() throws IOException, ClassNotFoundException{
        FileInputStream archivo = new FileInputStream("src/Archivo.seq");
           ObjectInputStream objeto = new ObjectInputStream(archivo);
           Inicio.ManagerAcc = (Usuario.GestorUsuarios)objeto.readObject();
    }
    
    //Vamos a registrar el user
    public static void writeData() throws IOException, ClassNotFoundException{
        FileOutputStream archivo = new FileOutputStream("src/Archivo.seq");
                        ObjectOutputStream objeto = new ObjectOutputStream(archivo);
                        objeto.writeObject(Inicio.ManagerAcc);
                        objeto.close();
        System.out.println("Archivo guardado.");
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try{
            readData(); 
            System.out.println("Archivo encontrado.");
        }catch(Exception e){
            System.out.println("ERROR: No se encontro un archivo calificado para la clase.");
            Inicio.ManagerAcc = new Usuario.GestorUsuarios();
        }
        //INICIALIZA TODO
        Inicio inicio = new Inicio();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }
}
