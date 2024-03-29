/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Juego;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jomel
 */
public class NoTurno extends javax.swing.JPanel {

    Jugador.Jugador jugador;
    /**
     * Creates new form NoTurno
     */
    public NoTurno(Jugador.Jugador jugador) {
        initComponents();
        this.jugador = jugador;
        User.setText(jugador.getUsuario().getNombre());
        Ficha.setText("");
        Ficha.setIcon(jugador.getFicha());
        Gane.setText("Puntos de Gane: " + 0);
        JLabel[] incognitas = new JLabel[jugador.getManojo().length];
        for(int i =0; i < incognitas.length; i++){
            incognitas[i] = new JLabel(new ImageIcon(getClass().getResource("/Imagenes/Incognita_MIN.png")));
            incognitas[i].setBounds(35*i + 5, 80, 30, 40);
            add(incognitas[i]);
        }
    }

    public void setPoints(int[] points){
        switch(Jugador.Fichas.getEnum(jugador.getFicha())){
           case RED:
               Gane.setText("Puntos de Gane: " + Integer.toString(points[0]));
               break;
           case BLUE:
               Gane.setText("Puntos de Gane: " + Integer.toString(points[1]));
               break;
           case YELLOW:
               Gane.setText("Puntos de Gane: " + Integer.toString(points[2]));
               break;
           case GREEN:
               Gane.setText("Puntos de Gane: " + Integer.toString(points[3]));
               break;
       }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        User = new javax.swing.JLabel();
        Ficha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Gane = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        User.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setText("Usuario");

        Ficha.setText("Ficha");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        Gane.setForeground(new java.awt.Color(255, 255, 255));
        Gane.setText("Puntos de Gane: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Gane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Gane))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(User))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ficha;
    private javax.swing.JLabel Gane;
    private javax.swing.JLabel User;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
