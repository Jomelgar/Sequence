/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Juego;

import Jugador.Cartas;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author jomel
 */
public class Board extends javax.swing.JPanel {

    Juego juego;
    JLabel[][] Posiciones = new JLabel[10][10];
    JLabel[][] Fichas = new JLabel[10][10];
    boolean[][] HorizontalSeq = new boolean[10][10];
    boolean[][] VerticalSeq = new boolean[10][10];
    boolean[][] RDiagonalSeq = new boolean[10][10];
    boolean[][] LDiagonalSeq = new boolean[10][10];
    
    /*
    0- Rojo
    1- Azul 
    2- Amarillo
    3- Verde
    */
    int [] ColorGane = new int[4];

    public Board(Juego juego) {
        initComponents();
        
        this.juego = juego;
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                
                Posiciones[f][c] = new JLabel();
                Posiciones[f][c].setBounds(c * 70, f * 70, 70, 70);
                Posiciones[f][c].setBorder(null);
                Fichas[f][c] = new JLabel();
                Fichas[f][c].setBounds(c * 70, f * 70, 70, 70);
                Posiciones[f][c].addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mousePressed(java.awt.event.MouseEvent e) {
                        BoardClicked(e);
                    }
                });
                add(Fichas[f][c]);
                add(Posiciones[f][c]);

            }
        }
        // Fila 1
        Posiciones[0][1].setIcon(Cartas.P2.getTablero());
        Posiciones[0][2].setIcon(Cartas.P3.getTablero());
        Posiciones[0][3].setIcon(Cartas.P4.getTablero());
        Posiciones[0][4].setIcon(Cartas.P5.getTablero());
        Posiciones[0][5].setIcon(Cartas.P6.getTablero());
        Posiciones[0][6].setIcon(Cartas.P7.getTablero());
        Posiciones[0][7].setIcon(Cartas.P8.getTablero());
        Posiciones[0][8].setIcon(Cartas.P9.getTablero());
        //Fila 2
        Posiciones[1][0].setIcon(Cartas.T6.getTablero());
        Posiciones[1][1].setIcon(Cartas.T5.getTablero());
        Posiciones[1][2].setIcon(Cartas.T4.getTablero());
        Posiciones[1][3].setIcon(Cartas.T3.getTablero());
        Posiciones[1][4].setIcon(Cartas.T2.getTablero());
        Posiciones[1][5].setIcon(Cartas.CA.getTablero());
        Posiciones[1][6].setIcon(Cartas.CR.getTablero());
        Posiciones[1][7].setIcon(Cartas.CQ.getTablero());
        Posiciones[1][8].setIcon(Cartas.C10.getTablero());
        Posiciones[1][9].setIcon(Cartas.P10.getTablero());
        //Fila 3
        Posiciones[2][0].setIcon(Cartas.T7.getTablero());
        Posiciones[2][1].setIcon(Cartas.PA.getTablero());
        Posiciones[2][2].setIcon(Cartas.D2.getTablero());
        Posiciones[2][3].setIcon(Cartas.D3.getTablero());
        Posiciones[2][4].setIcon(Cartas.D4.getTablero());
        Posiciones[2][5].setIcon(Cartas.D5.getTablero());
        Posiciones[2][6].setIcon(Cartas.D6.getTablero());
        Posiciones[2][7].setIcon(Cartas.D7.getTablero());
        Posiciones[2][8].setIcon(Cartas.C9.getTablero());
        Posiciones[2][9].setIcon(Cartas.PQ.getTablero());
        //Fila 4
        Posiciones[3][0].setIcon(Cartas.T8.getTablero());
        Posiciones[3][1].setIcon(Cartas.PR.getTablero());
        Posiciones[3][2].setIcon(Cartas.T6.getTablero());
        Posiciones[3][3].setIcon(Cartas.T5.getTablero());
        Posiciones[3][4].setIcon(Cartas.T4.getTablero());
        Posiciones[3][5].setIcon(Cartas.T3.getTablero());
        Posiciones[3][6].setIcon(Cartas.T2.getTablero());
        Posiciones[3][7].setIcon(Cartas.D8.getTablero());
        Posiciones[3][8].setIcon(Cartas.C8.getTablero());
        Posiciones[3][9].setIcon(Cartas.PR.getTablero());
        //Fila 5
        Posiciones[4][0].setIcon(Cartas.T9.getTablero());
        Posiciones[4][1].setIcon(Cartas.PQ.getTablero());
        Posiciones[4][2].setIcon(Cartas.T7.getTablero());
        Posiciones[4][3].setIcon(Cartas.C6.getTablero());
        Posiciones[4][4].setIcon(Cartas.C5.getTablero());
        Posiciones[4][5].setIcon(Cartas.C4.getTablero());
        Posiciones[4][6].setIcon(Cartas.CA.getTablero());
        Posiciones[4][7].setIcon(Cartas.D9.getTablero());
        Posiciones[4][8].setIcon(Cartas.C7.getTablero());
        Posiciones[4][9].setIcon(Cartas.PA.getTablero());
        //Fila 6
        Posiciones[5][0].setIcon(Cartas.T10.getTablero());
        Posiciones[5][1].setIcon(Cartas.P10.getTablero());
        Posiciones[5][2].setIcon(Cartas.T8.getTablero());
        Posiciones[5][3].setIcon(Cartas.C7.getTablero());
        Posiciones[5][4].setIcon(Cartas.C2.getTablero());
        Posiciones[5][5].setIcon(Cartas.C3.getTablero());
        Posiciones[5][6].setIcon(Cartas.CR.getTablero());
        Posiciones[5][7].setIcon(Cartas.D10.getTablero());
        Posiciones[5][8].setIcon(Cartas.C6.getTablero());
        Posiciones[5][9].setIcon(Cartas.D2.getTablero());
        //Fila 7
        Posiciones[6][0].setIcon(Cartas.TQ.getTablero());
        Posiciones[6][1].setIcon(Cartas.P9.getTablero());
        Posiciones[6][2].setIcon(Cartas.T9.getTablero());
        Posiciones[6][3].setIcon(Cartas.C8.getTablero());
        Posiciones[6][4].setIcon(Cartas.C9.getTablero());
        Posiciones[6][5].setIcon(Cartas.C10.getTablero());
        Posiciones[6][6].setIcon(Cartas.CQ.getTablero());
        Posiciones[6][7].setIcon(Cartas.DQ.getTablero());
        Posiciones[6][8].setIcon(Cartas.C5.getTablero());
        Posiciones[6][9].setIcon(Cartas.D3.getTablero());
        //Fila 8
        Posiciones[7][0].setIcon(Cartas.TR.getTablero());
        Posiciones[7][1].setIcon(Cartas.P8.getTablero());
        Posiciones[7][2].setIcon(Cartas.T10.getTablero());
        Posiciones[7][3].setIcon(Cartas.TQ.getTablero());
        Posiciones[7][4].setIcon(Cartas.TR.getTablero());
        Posiciones[7][5].setIcon(Cartas.TA.getTablero());
        Posiciones[7][6].setIcon(Cartas.DA.getTablero());
        Posiciones[7][7].setIcon(Cartas.DR.getTablero());
        Posiciones[7][8].setIcon(Cartas.C4.getTablero());
        Posiciones[7][9].setIcon(Cartas.D4.getTablero());
        //Fila 9
        Posiciones[8][0].setIcon(Cartas.TA.getTablero());
        Posiciones[8][1].setIcon(Cartas.P7.getTablero());
        Posiciones[8][2].setIcon(Cartas.P6.getTablero());
        Posiciones[8][3].setIcon(Cartas.P5.getTablero());
        Posiciones[8][4].setIcon(Cartas.P4.getTablero());
        Posiciones[8][5].setIcon(Cartas.P3.getTablero());
        Posiciones[8][6].setIcon(Cartas.P2.getTablero());
        Posiciones[8][7].setIcon(Cartas.C2.getTablero());
        Posiciones[8][8].setIcon(Cartas.C3.getTablero());
        Posiciones[8][9].setIcon(Cartas.D5.getTablero());
        //Fila 10
        Posiciones[9][1].setIcon(Cartas.DA.getTablero());
        Posiciones[9][2].setIcon(Cartas.DR.getTablero());
        Posiciones[9][3].setIcon(Cartas.DQ.getTablero());
        Posiciones[9][4].setIcon(Cartas.D10.getTablero());
        Posiciones[9][5].setIcon(Cartas.D9.getTablero());
        Posiciones[9][6].setIcon(Cartas.D8.getTablero());
        Posiciones[9][7].setIcon(Cartas.D7.getTablero());
        Posiciones[9][8].setIcon(Cartas.D6.getTablero());

        //Corner
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Transparente.jpg"));
        Fichas[0][0].setIcon(icon);
        Fichas[0][9].setIcon(icon);
        Fichas[9][0].setIcon(icon);
        Fichas[9][9].setIcon(icon);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void BoardClicked(java.awt.event.MouseEvent evt) {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                if (Posiciones[f][c] == evt.getSource()) {
                    CardInteraction(Posiciones[f][c], f, c);
                }
            }
        }
    }

    public void CardInteraction(JLabel card, int fila, int columna) {
        if (card.getBorder() != null) {
            if (!juego.bloquear) {
                Fichas[fila][columna].setIcon(juego.JugadorActual.getFicha());
            } else {
                if (Fichas[fila][columna].getIcon() == null) {
                    Fichas[fila][columna].setIcon(juego.JugadorActual.getFicha());
                } else {
                    Fichas[fila][columna].setIcon(null);
                }
                juego.bloquear = false;
            }
            emptyBorder();
            juego.players[0].stopCronometer();
            resetTokens();
            Sequence();
            juego.cambioTurno();
            winPoints();
        }
    }
    
    public void winPoints(){
        for(EnTurno turno : juego.players){
            turno.setPoints(ColorGane);
        }
        
        for(NoTurno turno : juego.subplayers){
            turno.setPoints(ColorGane);
        }
    }
    
    public void emptyBorder() {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                Posiciones[f][c].setBorder(null);
            }
        }
    }

    public void detectCard(int image) {
        emptyBorder();
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                if (Cartas.getImage((ImageIcon) Posiciones[f][c].getIcon()) == image && Fichas[f][c].getIcon() == null) {
                    Border border = new javax.swing.border.LineBorder(new java.awt.Color(0, 200, 0), 4);
                    Posiciones[f][c].setBorder(border);
                }
            }
        }

    }

    public void borderAll() {
        emptyBorder();
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                Border border = new javax.swing.border.LineBorder(new java.awt.Color(0, 200, 0), 4);
                Posiciones[f][c].setBorder(border);
            }

            Posiciones[0][0].setBorder(null);
            Posiciones[0][9].setBorder(null);
            Posiciones[9][0].setBorder(null);
            Posiciones[9][9].setBorder(null);
        }
    }

    public boolean fullTokens() {
        for (JLabel[] col : Fichas) {
            for (JLabel fila : col) {
                if (fila.getIcon() == null) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private void switchTokens(ImageIcon img){
        switch(Jugador.Fichas.getEnum(img)){
            case RED:
                ColorGane[0]++;
                break;
            case BLUE:
                ColorGane[1]++;
                break;
            case YELLOW:
                ColorGane[2]++;
                break;
            case GREEN:
                ColorGane[3]++;
                break;
        }
    }
    
    private void resetTokens(){
        for(int i = 0; i < ColorGane.length; i++){
            ColorGane[i] =0;
        }
        
        for(int i = 0; i < 10; i++){
            for(int c = 0; c < 10; c++){
                HorizontalSeq[i][c] = false;
                VerticalSeq[i][c] = false;
                RDiagonalSeq[i][c] = false;
                LDiagonalSeq[i][c] = false;
            }
        }
    }
    
    public boolean SomeoneWins(){
        for(int points: ColorGane){
            if(points >= 2){
                //Aqui toca tirar el registro de ganes
                return true;
            }
        }
        return false;
    }
    
    //bordes no detectados en vertical y diagonal a izq
    private void Sequence(){
        resetTokens();
        for(int row = 0; row < 10; row++){
            for(int column = 0; column < 10; column++){
                switchSequence(row, column);
            }
        }
    }
    
    private void switchSequence(int row, int column){
        if(Fichas[row][column].getIcon() != null && HorizontalSeq(row, column)){
            if(Fichas[row][column].getIcon() == Fichas[0][0].getIcon()){
                new Messages.GaneHori((ImageIcon)Fichas[row][column+1].getIcon());
                switchTokens((ImageIcon)Fichas[row][column+1].getIcon());
            }else{
                new Messages.GaneHori((ImageIcon)Fichas[row][column].getIcon());
                switchTokens((ImageIcon)Fichas[row][column].getIcon());
            }
        }else if(Fichas[row][column].getIcon() != null && VerticalSeq(row, column)){
            if(Fichas[row][column].getIcon() == Fichas[0][0].getIcon()){
                new Messages.GaneVert((ImageIcon)Fichas[row+1][column].getIcon());
                switchTokens((ImageIcon)Fichas[row+1][column].getIcon());
            }else{
                new Messages.GaneVert((ImageIcon)Fichas[row][column].getIcon());
                switchTokens((ImageIcon)Fichas[row][column].getIcon());
            }
        }else if(Fichas[row][column].getIcon() != null && DiagonaltoLeftSeq(row, column)){
            if(Fichas[row][column].getIcon() == Fichas[0][0].getIcon()){
                new Messages.GaneDiag((ImageIcon)Fichas[row+1][column+1].getIcon());
                switchTokens((ImageIcon)Fichas[row+1][column+1].getIcon());
            }else{
                new Messages.GaneDiag((ImageIcon)Fichas[row][column].getIcon());
                switchTokens((ImageIcon)Fichas[row][column].getIcon());
            }
            
        }else if(Fichas[row][column].getIcon() != null && DiagonaltoRightSeq(row,column)){
            if(Fichas[row][column].getIcon() == Fichas[0][0].getIcon()){
                new Messages.GaneDiag((ImageIcon)Fichas[row+1][column-1].getIcon());
                switchTokens((ImageIcon)Fichas[row+1][column-1].getIcon());
            }else{
                new Messages.GaneDiag((ImageIcon)Fichas[row][column].getIcon());
                switchTokens((ImageIcon)Fichas[row][column].getIcon());
            }
        }
    }
    
    private boolean VerticalSeq(int row, int column){
        try{
            JLabel ficha = Fichas[row][column];
            for(int i = row+1; i < row +5; i++){
                if(Fichas[i][column].getIcon() == null || (Fichas[i][column].getIcon() != ficha.getIcon()
                   && (ficha.getIcon() != Fichas[0][0].getIcon() && 
                        Fichas[i][column].getIcon() != Fichas[0][0].getIcon())) ||
                        VerticalSeq[i][column]){
                    //No se toma como secuencia
                    return false;
                }
                ficha = Fichas[i][column];
            }
            
            for(int i = row; i < row +5; i++){
                if(i != 0 || i != 9){
                    System.out.println("vertical");
                    VerticalSeq[i][column] = true;
                }
            }
            
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    private boolean HorizontalSeq(int row, int column){
        try{
            JLabel ficha = Fichas[row][column];
            for(int i = column+1; i < column +5; i++){
                if(Fichas[row][i].getIcon() == null ||(Fichas[row][i].getIcon() != ficha.getIcon()
                   && (ficha.getIcon() != Fichas[0][0].getIcon() && 
                        Fichas[row][i].getIcon() != Fichas[0][0].getIcon())) ||
                        HorizontalSeq[row][i]){
                    //No se toma como secuencia
                    return false;
                }
                ficha = Fichas[row][i];
            }
            
            for(int i = column; i < column +5; i++){
                if(i != 0 || i != 9){
                    HorizontalSeq[row][i] = true;
                }
            }
            
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    private boolean DiagonaltoLeftSeq(int row, int column){
        try{
            JLabel ficha = Fichas[row][column];
            for(int i = 1; i < 5; i++){
                if(Fichas[i+row][column+i].getIcon() == null ||(Fichas[row + i][i+ column].getIcon() != Fichas[row][column].getIcon()
                   && (ficha.getIcon() != Fichas[0][0].getIcon() && 
                        Fichas[i+ row][i+column].getIcon() != Fichas[0][0].getIcon())) ||
                        LDiagonalSeq[row + i][i+ column]){
                    //No se toma como secuencia
                    return false;
                }
                ficha = Fichas[row + i][i+ column];
            }
            
             for(int i = 0; i < 5; i++){
                 LDiagonalSeq[row + i][i+ column] = true;
             }
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    private boolean DiagonaltoRightSeq(int row, int column){
        try{
            JLabel ficha= Fichas[row][column];
            for(int i = 1; i < 5; i++){
                if(Fichas[i+row][column-i].getIcon() == null ||(Fichas[row + i][column-i].getIcon() != Fichas[row][column].getIcon()
                  && (ficha.getIcon() != Fichas[0][0].getIcon() && 
                        Fichas[row+i][column-i].getIcon() != Fichas[0][0].getIcon())) ||
                        RDiagonalSeq[row + i][column-i]){
                    //No se toma como secuencia
                    return false;
                }
                ficha = Fichas[row+i][column-i];
            }
            
             for(int i = 0; i < 5; i++){
                 RDiagonalSeq[row + i][column-i] = true;
             }
            return true;
        }catch(Exception e){
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
