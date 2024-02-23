/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Usuario;

import java.io.Serializable;

/**
 *
 * @author jomel
 */
public enum TipoJuego implements Serializable{
    INDIVIDUAL(0), GRUPAL(1);
    
    int index;
    
    TipoJuego(int index){
        this.index = index;
    }
    
    public int getIndex(){
        return index;
    }
}
