/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author harle
 */
public class GestorUsuarios implements Serializable{
    private ArrayList<Usuario> Usuarios;
    
    public GestorUsuarios(){
        Usuarios = new ArrayList();
        Usuarios.add(new Usuario("Invitado1","123"));
        Usuarios.add(new Usuario("Invitado2","123"));
        Usuarios.add(new Usuario("Invitado3","123"));
        Usuarios.add(new Usuario("Invitado4","123"));
    }
    
    public Usuario searchUser(String Nombre){
        for(Usuario usuario : Usuarios){
            if(usuario.getNombre().equals(Nombre))
                return usuario;
        }
        return null;
    }
    
    public boolean addUser(String Nombre, String Contra){
        if(searchUser(Nombre) == null){
            Usuarios.add(new Usuario(Nombre,Contra));
            return true;
        }
        return false;
    }
    
    public Usuario logIn(String Nombre, String Contra){
        for(Usuario usuario : Usuarios){
            if(usuario.getNombre().equals(Nombre) && usuario.getContra().equals(Contra))
                return usuario;
        }
        return null;
    }
    
    public int size(){
        return Usuarios.size();
    }
    
    public ArrayList<Usuario> getUsers(){
        return Usuarios;
    }
}