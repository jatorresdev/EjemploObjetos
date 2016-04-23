/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetos;

import java.util.Scanner;
import ejemploobjetos.objetos.Contactos;
import ejemploobjetos.objetos.Eventos;

/**
 *
 * @author https://github.com/jatorresdev
 */
public class EjemploObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcionMenu;
        Scanner cadena = new Scanner(System.in);

        // Contacto
        String nombre;
        String correo;
        int telefono;
        int edad;

        // Evento
        String eventoNombre;
        String lugar;
        String fecha;

        do {
            /**
             * Imprimo en pantalla información al usuario
             */
            System.out.println("\n\t\t\t\tBienvenido a Ejemplo Objetos\n");
            System.out.println("Seleccione una de las siguientes opciones: \n");
            System.out.println("1. Registrar un Contacto");
            System.out.println("2. Registrar un Evento");
            System.out.println("0. Salir\n");
            System.out.print("Opción: ......... ");

            opcionMenu = cadena.nextInt();
            cadena.nextLine();

            switch (opcionMenu) {

                case 0:
                    System.out.println("Adios");

                    break;

                case 1:
                    Contactos contacto = new Contactos();

                    System.out.println("Para registrar un contacto ingrese los siguientes datos ");
                    System.out.print("Nombre: ");
                    nombre = cadena.nextLine();
                    contacto.setNombre(nombre);

                    System.out.print("Telefono: ");
                    telefono = cadena.nextInt();
                    cadena.nextLine();
                    contacto.setTelefono(telefono);

                    System.out.print("Correo: ");
                    correo = cadena.nextLine();
                    contacto.setCorreo(correo);

                    System.out.print("Edad: ");
                    edad = cadena.nextInt();
                    cadena.nextLine();
                    contacto.setEdad(edad);

                    System.out.println("\nEl contacto ha sido creado exitosamente");
                    System.out.println("Nombre: " + contacto.getNombre());
                    System.out.println("Telefono: " + contacto.getTelefono());
                    System.out.println("Correo: " + contacto.getCorreo());
                    System.out.println("Edad: " + contacto.getEdad());

                    break;

                case 2:
                    Eventos evento = new Eventos();

                    System.out.println("Para registrar un evento ingrese los siguientes datos ");
                    System.out.print("Evento: ");
                    eventoNombre = cadena.nextLine();
                    evento.setEvento(eventoNombre);

                    System.out.print("Lugar: ");
                    lugar = cadena.nextLine();
                    evento.setLugar(lugar);

                    System.out.print("Fecha: ");
                    fecha = cadena.nextLine();
                    evento.setFecha(fecha);

                    System.out.println("\nEl evento ha sido creado exitosamente");
                    System.out.println("Evento: " + evento.getEvento());
                    System.out.println("Lugar: " + evento.getLugar());
                    System.out.println("Fecha: " + evento.getFecha());

                    break;

                default:
                    System.out.println("Ingrese una opción valida!");

                    break;
            }
        } while(opcionMenu != 0);
        
    }
    
}
