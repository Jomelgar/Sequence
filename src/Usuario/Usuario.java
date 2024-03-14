/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;
import Jugador.Fichas;
import java.util.Calendar;
import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author jomel
 */
public class Usuario implements Serializable{
    private final Calendar Fecha;
    private final String Nombre;
    private final String Contra;
    private Jugador.Fichas ficha;
    private TipoJuego Tipo;
    private int[] cardPower;
    ArrayList<String> Historial;

    public Usuario(String Nombre, String Contra) {
        this.Nombre = Nombre;
        this.Contra = Contra;
        Fecha = Calendar.getInstance();
        Historial = new ArrayList();
        Tipo = TipoJuego.INDIVIDUAL;
        ficha = Jugador.Fichas.RED;
        cardPower = new int[8];
    }
    
    //Functions 
    
    public int getPower(int cardNumber){
        for(int i = 40; i < 48;i++){
            if(i == cardNumber){
                return cardPower[i-40];
            }
        }
        return 0;
    }
    
    public void setPower(int cardNumber, int selection){
        cardPower[cardNumber-40] = selection;
    }
    public void addPlay(int points){
        Historial.add("Nombre: " + Nombre + " Fecha: " + Calendar.getInstance().toString() + " Puntos: " + points);
    }
    
    public String History(){
        String txt = "";
        
        if(Historial.size() > 0){
            for(int i = Historial.size() - 1; i >= 0; i--){
                txt+= i+1 + ". " + Historial.get(i) + "\n";
            }
            
        }else{
            txt += "No hay ningun registro de partidas.";
        }
        return txt;
    }
    
    //Setters
    public void setTipo(TipoJuego tipo){
        this.Tipo= tipo;
    }

    public void setFicha(Fichas ficha) {
        this.ficha = ficha;
    }
    
    
    //Getters 
    public int[] getCardPower() {
        return cardPower;
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContra() {
        return Contra;
    }

   
    public Jugador.Fichas getColor() {
        return ficha;
    }

    public TipoJuego getTipo() {
        return Tipo;
    }
    
    
}
