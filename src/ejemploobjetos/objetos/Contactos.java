/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetos.objetos;

/**
 *
 * @author APRENDIZ
 */
public class Contactos {
    private String nombre;
    private int telefono;
    private String correo;
    private int edad;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
}
