/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Jugador;

import javax.swing.ImageIcon;

/**
 *
 * @author jomel
 */
public enum Fichas {
    RED("/Imagenes/token_Rojo.png"),BLUE("/Imagenes/token_Azul.png"),YELLOW("/Imagenes/token_Amarillo.png"),
    GREEN("/Imagenes/token_Verde.png"),NOT("/Imagenes/Bloqueado.png");
    
    ImageIcon ficha, muestra;
    
    Fichas(String url){
        ImageIcon imagen = new ImageIcon(getClass().getResource(url));
        ficha = new ImageIcon(imagen.getImage().getScaledInstance(70,
                            70,java.awt.Image.SCALE_SMOOTH));
        muestra = new ImageIcon(imagen.getImage().getScaledInstance(150,
                            150,java.awt.Image.SCALE_SMOOTH));
    }
    
    public ImageIcon getFicha(){
        return ficha;
    }
    
    public ImageIcon getMuestra(){
        return muestra;
    }
    
    public static Fichas getEnum(ImageIcon img){
        for(Fichas ficha: Fichas.values()){
            if(img.equals(ficha.getFicha())){
                return ficha;
            }
        }
        return null;
    }
}
