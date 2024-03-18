/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Jugador;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author jomel
 */
public enum Cartas {
    //Nombramiento de todas las cartas
    PA("/Cartas/Imagenes/AS.png"),DA("/Cartas/Imagenes/AD.png"),CA("/Cartas/Imagenes/AH.png"),TA("/Cartas/Imagenes/AC.png"),
    P2("/Cartas/Imagenes/2S.png"),D2("/Cartas/Imagenes/2D.png"),C2("/Cartas/Imagenes/2H.png"),T2("/Cartas/Imagenes/2C.png"),
    P3("/Cartas/Imagenes/3S.png"),D3("/Cartas/Imagenes/3D.png"),C3("/Cartas/Imagenes/3H.png"),T3("/Cartas/Imagenes/3C.png"),
    P4("/Cartas/Imagenes/4S.png"),D4("/Cartas/Imagenes/4D.png"),C4("/Cartas/Imagenes/4H.png"),T4("/Cartas/Imagenes/4C.png"),
    P5("/Cartas/Imagenes/5S.png"),D5("/Cartas/Imagenes/5D.png"),C5("/Cartas/Imagenes/5H.png"),T5("/Cartas/Imagenes/5C.png"),
    P6("/Cartas/Imagenes/6S.png"),D6("/Cartas/Imagenes/6D.png"),C6("/Cartas/Imagenes/6H.png"),T6("/Cartas/Imagenes/6C.png"),
    P7("/Cartas/Imagenes/7S.png"),D7("/Cartas/Imagenes/7D.png"),C7("/Cartas/Imagenes/7H.png"),T7("/Cartas/Imagenes/7C.png"),
    P8("/Cartas/Imagenes/8S.png"),D8("/Cartas/Imagenes/8D.png"),C8("/Cartas/Imagenes/8H.png"),T8("/Cartas/Imagenes/8C.png"),
    P9("/Cartas/Imagenes/9S.png"),D9("/Cartas/Imagenes/9D.png"),C9("/Cartas/Imagenes/9H.png"),T9("/Cartas/Imagenes/9C.png"),
    P10("/Cartas/Imagenes/10S.png"), D10("/Cartas/Imagenes/10D.png"), C10("/Cartas/Imagenes/10H.png"), T10("/Cartas/Imagenes/10C.png"),
    PR("/Cartas/Imagenes/KS.png") ,DR("/Cartas/Imagenes/KD.png"),CR("/Cartas/Imagenes/KH.png"),TR("/Cartas/Imagenes/KC.png"),
    PQ("/Cartas/Imagenes/QS.png"),DQ("/Cartas/Imagenes/QD.png"),CQ("/Cartas/Imagenes/QH.png"),TQ("/Cartas/Imagenes/QC.png"),
    PJ("/Cartas/Imagenes/JS.png"), DJ("/Cartas/Imagenes/JD.png"),CJ("/Cartas/Imagenes/JH.png"),TJ("/Cartas/Imagenes/JC.png");
    
    
    ImageIcon imagenManojo;
    ImageIcon imagenTablero;
    ImageIcon imagenMini;
    ImageIcon ultimaVista;
    
    Cartas(String url){
        
        ImageIcon imagen = new ImageIcon(getClass().getResource(url));
        imagenManojo = new ImageIcon(imagen.getImage().getScaledInstance(100,
                            100,java.awt.Image.SCALE_SMOOTH));
        imagenTablero = new ImageIcon(imagen.getImage().getScaledInstance(70,
                            70,java.awt.Image.SCALE_SMOOTH));
        imagenMini = new ImageIcon(imagen.getImage().getScaledInstance(30,
                            30,java.awt.Image.SCALE_SMOOTH));
        ultimaVista = new ImageIcon(imagen.getImage().getScaledInstance(190,
                            270,java.awt.Image.SCALE_SMOOTH));
    }
    
    public ImageIcon getMini(){
        return imagenMini;
    }
    public ImageIcon getManojo(){
        return imagenManojo;
    }
    
    public ImageIcon getTablero(){
        return imagenTablero;
    }
    
    public ImageIcon getUltimaCarta(){
        return ultimaVista;
    }
    public static int getImage(ImageIcon image){
        int pos = 0;
        for(Cartas carta: Cartas.values()){
            if(carta.getManojo() == image || carta.getTablero()== image){
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    public static Cartas[] baraja(){
        Cartas[] baraja = new Cartas[104];
        Random random = new Random();
        int num = 0;
        for(Cartas carta : Cartas.values()){
            do{
                num = random.nextInt(52);
            }while(baraja[num] != null);
            baraja[num] = carta;
        }
        
        for(Cartas carta : Cartas.values()){
            do{
                num = random.nextInt(52) + 52;
            }while(baraja[num] != null);
            baraja[num] = carta;
        }
        
        return baraja;
    }
    
    public static Cartas[] refresh(Cartas[] enMano, int tam){
        Cartas[] newDeck = new Cartas[104];
        int pos = 0;
        int exact = 0;
        Cartas[] baraja = Cartas.baraja();
        for(int i =tam;i< 104;i++){
            do{
                newDeck[i] = baraja[pos];
                pos++;
                exact = contains(enMano, newDeck[i]);
                if( exact != -1){
                    enMano[exact] = null;
                }
            }while(exact != -1);
            
        }
        return newDeck;
    }
    
    static int contains(Cartas[] arreglo,Cartas carta){
        for(int i= 0; i< arreglo.length; i++){
            if(arreglo[i] != null && arreglo[i] == carta){
                return i;
            }
        }
        return -1;
    }
}
