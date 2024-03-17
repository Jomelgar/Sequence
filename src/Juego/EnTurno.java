/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Juego;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.Border;
/**
 *
 * @author jomel
 */
public class EnTurno extends javax.swing.JPanel{

    public Timer timer;
    Jugador.Jugador jugador;
    Juego juego;
    int mins;
    int sec;
    
    public EnTurno(Juego juego, Jugador.Jugador jugador) {
        initComponents();
        this.jugador = jugador;
        setCards();
        User.setText(jugador.getUsuario().getNombre());
        Ganes.setText("Puntos de Gane: " + 0);
        Ficha.setText("");
        Ficha.setIcon(jugador.getFicha());
        this.juego = juego;
        mins = 2;
        sec = 00;
        timer = new Timer(1000, (ActionEvent e) ->{
            Cronometer();
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        User = new javax.swing.JLabel();
        Timer = new javax.swing.JLabel();
        Ficha = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Ganes = new javax.swing.JLabel();
        miniManojo = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setText("Usuario");
        add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 170, -1));

        Timer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Timer.setForeground(new java.awt.Color(255, 255, 255));
        Timer.setText("2:00");
        add(Timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 6, -1, -1));

        Ficha.setText("Icono Ficha");
        add(Ficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, 90));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 10));

        Ganes.setForeground(new java.awt.Color(255, 255, 255));
        Ganes.setText("Puntos de Gane: 0");
        add(Ganes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        miniManojo.setBackground(new java.awt.Color(51, 51, 51));
        add(miniManojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, 70));
    }// </editor-fold>//GEN-END:initComponents
    
        
   private void Cronometer(){
       
       int time = sec + (mins*60);
       time--;
       mins = time/60;
       sec = time%60;
       
       String txt = "";
       if(sec < 10){
           txt = mins + ":0" + sec;
       }else{
           txt = mins + ":" + sec;
       }
       
       this.Timer.setText(txt);
       
       if(time == 0 && timer.isRunning()){
           juego.cambioTurno(true,false);
           timer.stop();
       }
   }
   
   public void startCronometer(){
       mins =2;
       sec = 0;
       Timer.setText("2:00");
       timer.start();
   }
   
   public void stopCronometer(){
       timer.stop();
   }
   
   public void setCards(){
       //180
       miniManojo.removeAll();
       JLabel[] cartas = new JLabel[jugador.getManojo().length];
       for(int i = 0; i < cartas.length; i++){
           cartas[i] = new JLabel(jugador.getMini(i));
           cartas[i].setBounds(30*i+1+i,15,30,30);
           miniManojo.add(cartas[i]);
       }
       
       miniManojo.revalidate();
       miniManojo.repaint();
   }
   
   public void setPoints(int[] points){
       switch(Jugador.Fichas.getEnum(jugador.getFicha())){
           case RED:
               Ganes.setText("Puntos de Gane: " + Integer.toString(points[0]));
               break;
           case BLUE:
               Ganes.setText("Puntos de Gane: " + Integer.toString(points[1]));
               break;
           case YELLOW:
               Ganes.setText("Puntos de Gane: " + Integer.toString(points[2]));
               break;
           case GREEN:
               Ganes.setText("Puntos de Gane: " + Integer.toString(points[3]));
               break;
       }
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ficha;
    private javax.swing.JLabel Ganes;
    private javax.swing.JLabel Timer;
    private javax.swing.JLabel User;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel miniManojo;
    // End of variables declaration//GEN-END:variables
}
