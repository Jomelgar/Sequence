
package Jugador;

import Usuario.Usuario;
import javax.swing.ImageIcon;

/**
 *
 * @author jomel
 */
public class Jugador {
    Fichas ficha;
    int ganes;
    Cartas[] manojo;
    Usuario usuario;

    public Jugador(int size, Usuario usuario) {
        this.ficha = usuario.getColor();
        this.manojo = new Cartas[size];
        this.usuario = usuario;
        ganes =0;
    }
    //Functions
    public void setManojo(Cartas carta, int pos) {
        this.manojo[pos] = carta;
    }
    
    public void repartirCartas(Cartas[] manojo){
        this.manojo = manojo;
    }
    
    //Getters
    public ImageIcon getFicha(){
        return ficha.getFicha();
    }

    public int getGanes() {
        return ganes;
    }

    public Cartas[] getManojo() {
        return manojo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ImageIcon getMini(int position){
        return manojo[position].getMini();
    }
    
    public ImageIcon getUsed(int position){
        return manojo[position].getUltimaCarta();
    }
}
