/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Jugador.Fichas;
import Usuario.TipoJuego;

/**
 *
 * @author jomel
 */
public class Config extends javax.swing.JPanel {

    /**
     * Creates new form Jugar
     */
    public Config() {
        initComponents();
        txtUser.setText(Inicio.usuario.getNombre());
        TipeGame.setSelectedIndex(Inicio.usuario.getTipo().getIndex());
        switch(Inicio.usuario.getColor()){
            case RED:
                ColorToken.setSelectedIndex(0);
                break;
            case BLUE:
                ColorToken.setSelectedIndex(1);
                break;
            case YELLOW:
                ColorToken.setSelectedIndex(2);
                break;
            case GREEN:
                ColorToken.setSelectedIndex(3);
        }
        setDemonsToken();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        TipeGame = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ColorToken = new javax.swing.JComboBox<>();
        Muestra_Ficha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONFIGURACIONES");

        txtUser.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser.setText("Nombre de Usuario");
        txtUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jSeparator1.setForeground(new java.awt.Color(51, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuario:");

        TipeGame.setBackground(new java.awt.Color(204, 204, 204));
        TipeGame.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TipeGame.setForeground(new java.awt.Color(0, 0, 0));
        TipeGame.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INDIVIDUAL", "GRUPAL" }));
        TipeGame.setOpaque(true);
        TipeGame.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipeGameItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de Juego:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Color de Ficha:");

        ColorToken.setBackground(new java.awt.Color(204, 204, 204));
        ColorToken.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ColorToken.setForeground(new java.awt.Color(0, 0, 0));
        ColorToken.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROJO", "AZUL", "AMARILLO", "VERDE" }));
        ColorToken.setOpaque(true);
        ColorToken.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ColorTokenItemStateChanged(evt);
            }
        });

        Muestra_Ficha.setText("xd");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Muestra de Ficha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ColorToken, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipeGame, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Muestra_Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(txtUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TipeGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ColorToken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Muestra_Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TipeGameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipeGameItemStateChanged
        // TODO add your handling code here:
        if(TipeGame.getSelectedItem().toString().equals("INDIVIDUAL")){
            Inicio.usuario.setTipo(TipoJuego.INDIVIDUAL);
        }else{
            Inicio.usuario.setTipo(TipoJuego.GRUPAL);
        }
    }//GEN-LAST:event_TipeGameItemStateChanged

    private void ColorTokenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ColorTokenItemStateChanged
        // TODO add your handling code here:
        switch(ColorToken.getSelectedIndex()){
            case 0:
                Inicio.usuario.setFicha(Fichas.RED);
                break;
            case 1:
                Inicio.usuario.setFicha(Fichas.BLUE);
                break;
            case 2:
                Inicio.usuario.setFicha(Fichas.YELLOW);
                break;
            case 3:
                Inicio.usuario.setFicha(Fichas.GREEN);
                break;
        }
        setDemonsToken();
    }//GEN-LAST:event_ColorTokenItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ColorToken;
    private javax.swing.JLabel Muestra_Ficha;
    private javax.swing.JComboBox<String> TipeGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
    void setDemonsToken(){
        Muestra_Ficha.setText("");
        Muestra_Ficha.setIcon(Inicio.usuario.getColor().getMuestra());
        
    }
}
