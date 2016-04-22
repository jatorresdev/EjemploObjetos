/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetos;

import ejemploobjetos.objetos.Contactos;

/**
 *
 * @author APRENDIZ
 */
public class EjemploObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Contactos contacto = new Contactos();
        contacto.setNombre("Angel Torres");
        contacto.setTelefono(123456);
        contacto.setCorreo("jatorres6861@misena.edu.co");
        contacto.setEdad(25);
        
        System.out.println("Su nombre es " + contacto.getNombre());
        System.out.println("Su telefono es " + contacto.getTelefono());
        System.out.println("Su correo es " + contacto.getCorreo());
        System.out.println("Su edad es " + contacto.getEdad());
        
    }
    
}
