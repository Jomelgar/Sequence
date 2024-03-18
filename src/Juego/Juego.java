/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juego;
import Jugador.Jugador;
import Jugador.Cartas;
import java.awt.AWTEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Juego extends javax.swing.JFrame {
    //INSTANCIAS DE CLASES
    public Jugador JugadorActual;
    public Jugador[] Jugadores;
    int size = 0;//El que decrece toda la baraja
    int pos = 1;//Ayuda a saber cual es el jugador actual
    boolean bloquear = false;//
    EnTurno[] players;//Representa quien esta en turno actual
     NoTurno[] subplayers;
    Cartas[] Deck;// EL MAZO
    //INNSTANCIAS
    public Board tablero; 
    public Manojo manojo;
    
    public Juego(Jugador[] Jugadores, Cartas[] baraja) {
        initComponents();
        //INICIALIZACION DE VARIABLES E INSTANCIAS
        this.setExtendedState(MAXIMIZED_BOTH);
        this.Jugadores = Jugadores;
        this.Deck = baraja;
        JugadorActual = this.Jugadores[0];
        players = new EnTurno[Jugadores.length];
        subplayers = new NoTurno[Jugadores.length];
        tablero = new Board(this);
        tablero.setSize(700, 700);
        tablero.setLocation(0, 0);
        Board.add(tablero);
        Board.revalidate();
        Board.repaint();
        manojo = new Manojo(Jugadores.length, this);
        manojo.setSize(700, 700);
        manojo.setLocation(0, 0);
        Mano.add(manojo);
        Mano.revalidate();
        Mano.repaint();
        
        repartirCartas();
        manojo.setManojo();
        initializePlayers();
        posicionarJugadores();
        startCronometer();
        this.Deck_Countdown.setText(Integer.toString(104-size));//Texto sobre la carta
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PlayerSlide = new javax.swing.JPanel();
        Deck_Countdown = new javax.swing.JLabel();
        Cards = new javax.swing.JLabel();
        Board = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Mano = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        LastCard = new javax.swing.JLabel();
        Power = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(860, 1536));
        setResizable(false);

        Background.setBackground(new java.awt.Color(51, 0, 0));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Playbill", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("(Tomar una carta)");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 160, 30));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setHorizontalScrollBar(null);

        PlayerSlide.setBackground(new java.awt.Color(51, 51, 51));
        PlayerSlide.setAutoscrolls(true);

        javax.swing.GroupLayout PlayerSlideLayout = new javax.swing.GroupLayout(PlayerSlide);
        PlayerSlide.setLayout(PlayerSlideLayout);
        PlayerSlideLayout.setHorizontalGroup(
            PlayerSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );
        PlayerSlideLayout.setVerticalGroup(
            PlayerSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1126, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(PlayerSlide);

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 478));

        Deck_Countdown.setFont(new java.awt.Font("Poor Richard", 1, 96)); // NOI18N
        Deck_Countdown.setForeground(new java.awt.Color(0, 0, 0));
        Deck_Countdown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Deck_Countdown.setText("104");
        Background.add(Deck_Countdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 190, 94));

        Cards.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cards.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Incognita_peque.png"))); // NOI18N
        Cards.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cards.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CardsMousePressed(evt);
            }
        });
        Background.add(Cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 190, 270));

        Board.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout BoardLayout = new javax.swing.GroupLayout(Board);
        Board.setLayout(BoardLayout);
        BoardLayout.setHorizontalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        BoardLayout.setVerticalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        Background.add(Board, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 700, 700));

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ultima Carta:");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Peque.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 153, 30));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 688, 10));

        Mano.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout ManoLayout = new javax.swing.GroupLayout(Mano);
        Mano.setLayout(ManoLayout);
        ManoLayout.setHorizontalGroup(
            ManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        ManoLayout.setVerticalGroup(
            ManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        Background.add(Mano, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 520, 300));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manojo:");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        Contenedor.setBackground(new java.awt.Color(102, 0, 0));
        Contenedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LastCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LastCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Incognita_peque.png"))); // NOI18N
        LastCard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LastCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LastCardMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LastCard, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LastCard, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Background.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 440, 240, 320));

        Power.setBackground(new java.awt.Color(255, 255, 0));
        Power.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        Power.setForeground(new java.awt.Color(255, 255, 255));
        Power.setText("Activar Poder");
        Power.setBorder(null);
        Power.setBorderPainted(false);
        Power.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Power.setEnabled(false);
        Power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerActionPerformed(evt);
            }
        });
        Background.add(Power, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 550, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CardsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CardsMousePressed
        // TODO add your handling code here:
        cambioTurno(false,false);
        this.Deck_Countdown.setText(Integer.toString(104-size));
    }//GEN-LAST:event_CardsMousePressed

    private void LastCardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastCardMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastCardMousePressed

    private void PowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerActionPerformed
        // TODO add your handling code here:
        switch(manojo.power){
            case 1:
                //Robar
                new Messages.Robo(NamePlayers(), this);
                break;
            case 2:
                //Mover
                JOptionPane.showMessageDialog(null, "Mover fichas: Seleccione una ficha "
                        + "\ny muevala hasta donde quiera.");
                tablero.movimientoActivado = true;
                tablero.BlueBoard(JugadorActual.getFicha());
                break;
            case 3:
                //Intercambiar fichas
                new Messages.Intercambiar(NamePlayers(), this);
                break;
        }
    }//GEN-LAST:event_PowerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Board;
    private javax.swing.JLabel Cards;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Deck_Countdown;
    private javax.swing.JLabel LastCard;
    private javax.swing.JPanel Mano;
    private javax.swing.JPanel PlayerSlide;
    private javax.swing.JButton Power;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    
    
     void startCronometer(){
        players[0].startCronometer();
    }
    
    void initializePlayers(){
        for(int c = 0; c<players.length; c++){
            players[c]= new EnTurno(this, Jugadores[c]);
            Border border = new javax.swing.border.LineBorder(new java.awt.Color(150,150,50), 4);
            players[c].setBorder(border);
            subplayers[c] = new NoTurno(Jugadores[c]);
        }
    }
    
    void posicionarJugadores(){
        PlayerSlide.removeAll();
        players[0].setSize(250, 190);
        players[0].setLocation(0, 0);
        PlayerSlide.add(players[0]);
        for(int c = 1; c<subplayers.length;c++){
            subplayers[c].setSize(250, 120);
            subplayers[c].setLocation(0, 120*c + 80);
            PlayerSlide.add(subplayers[c]);
        }
        PlayerSlide.revalidate();
        PlayerSlide.repaint();
    }
    
    public void intercambiarJugadores() {
        for (int i = 0; i <players.length -1; i++) {
            EnTurno guardarPlayer = players[i];
            players[i] = players[i + 1];
            players[i + 1] = guardarPlayer;

            NoTurno guardarSubplayer = subplayers[i];
            subplayers[i] = subplayers[i + 1];
            subplayers[i + 1] = guardarSubplayer;
        }
    }
    // Verificar cuando llegue a 104.
    public void cambioTurno(boolean Carta, boolean lastCard) {
        if(lastCard){
                lastCard(JugadorActual.getUsed(manojo.pos));
        }
        boolean wins = tablero.SomeoneWins();
        boolean due = tablero.fullTokens();
        if( due || wins){
            if(due && !wins){
                JOptionPane.showMessageDialog(null, "Empate.");
                for (int i = 0; i < Jugadores.length; i++) {
                    Jugadores[i].getUsuario().addPlay(0);
                }
            }
            GUI.Menu inicio = new GUI.Menu();
            inicio.setLocationRelativeTo(null);
            inicio.setVisible(true);
            players[0].stopCronometer();
            this.dispose();
            return;
        }else{
            if(!Carta){
                DrawCard(JugadorActual, manojo.getSelectCard());
            }
            JugadorActual = Jugadores[pos];
            pos++;
            if (pos == Jugadores.length) {
                pos = 0;
            }
            
            this.Deck_Countdown.setText(Integer.toString(104-size));
            intercambiarJugadores();
            posicionarJugadores();
            players[0].setCards();
            manojo.setManojo();
            startCronometer();
            this.Power.setEnabled(false);
            this.revalidate();
            this.repaint();
        }
    }

    
    public void repartirCartas(){
        for(int i = 0; i< Jugadores.length; i++){
            Cartas[] trozo = new Cartas[manojo.Manojo.length];
            for(int c= 0; c< trozo.length; c++){
                trozo[c] = Deck[manojo.Manojo.length*i +c];
                Deck[manojo.Manojo.length*i +c] = null;
                size++;
            }
            Jugadores[i].repartirCartas(trozo);
        }
    }
    
    public void refreshDeck(){
        size = Jugadores.length* manojo.Manojo.length;
        Cartas[] cartasenMano = new Cartas[JugadorActual.getManojo().length * Jugadores.length];
        for(int i =0; i < Jugadores.length; i++){
            for(int c = 0; c<Jugadores[i].getManojo().length;c++){
                cartasenMano[(JugadorActual.getManojo().length*i) + c] = Jugadores[i].getManojo()[c];
            }
        }
        Deck = Cartas.refresh(cartasenMano,size);
    }
    
    public void DrawCard(Jugador jugador, int lugar){
        if(size > 103 || Deck[size] == null){
                System.out.println("se hallo null");
                refreshDeck();
            }
                jugador.setManojo(Deck[size],lugar);
            size++;
    }
    
    public void lastCard(ImageIcon Used){
        LastCard.setIcon(Used);
    }
    
    public void abilityPower(boolean activator){
        Power.setEnabled(activator);
    }
    
    private String[] NamePlayers(){
        String[] names = new String[Jugadores.length-1];
        boolean suma = false;
        for(int i = 0; i < names.length; i++){
            if(suma == true || Jugadores[i] == JugadorActual){
                names[i] = Jugadores[i+1].getUsuario().getNombre();
                suma = true;
            }else{
                names[i] = Jugadores[i].getUsuario().getNombre();
            }
        }
        return names;
    }
}
