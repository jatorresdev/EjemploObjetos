/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetos;

import java.util.Scanner;
import ejemploobjetos.objetos.Contactos;
import ejemploobjetos.objetos.Eventos;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

        int cantidad = 1;

        do {
            /**
             * Imprimo en pantalla información al usuario
             */
            System.out.println("\n\t\t\t\tBienvenido a Ejemplo Objetos\n");
            System.out.println("Seleccione una de las siguientes opciones: \n");
            System.out.println("1. Registrar Contactos");
            System.out.println("2. Registrar Eventos");
            System.out.println("0. Salir\n");
            System.out.print("Opción: ......... ");

            opcionMenu = cadena.nextInt();
            cadena.nextLine();

            switch (opcionMenu) {

                case 0:
                    System.out.println("Adios");

                    break;

                case 1:
                    ArrayList<Contactos> listaContactos = new ArrayList<>();
                    System.out.println("Cuantos contactos desea registrar?");
                    cantidad = cadena.nextInt();
                    cadena.nextLine();

                    for (int i = 0; i < cantidad; i++) {
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

                        listaContactos.add(contacto);
                        System.out.println("El contacto ha sido creado exitosamente\n");
                    }

                    System.out.println("A continuación se listan sus contactos");
                    for (int i = 0; i < listaContactos.size(); i++) {
                        Contactos contactoSave = listaContactos.get(i);

                        System.out.println("Nombre: " + contactoSave.getNombre());
                        System.out.println("Telefono: " + contactoSave.getTelefono());
                        System.out.println("Correo: " + contactoSave.getCorreo());
                        System.out.println("Edad: " + contactoSave.getEdad());
                    }

                    break;

                case 2:
                    ArrayList<Eventos> listaEventos = new ArrayList<>();
                    System.out.println("Cuantos eventos desea registrar?");
                    cantidad = cadena.nextInt();
                    cadena.nextLine();

                    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd hh:mm a");

                    for (int i = 0; i < cantidad; i++) {
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

                        try {
                            Date fechaEvento = formatoFecha.parse(fecha);
                            evento.setFecha(fechaEvento);

                        } catch (Exception e) {
                            System.out.println("Ingrese una fecha valida");
                        }

                        listaEventos.add(evento);
                        System.out.println("El evento ha sido creado exitosamente\n");
                    }

                    System.out.println("A continuación se listan sus eventos");
                    for (int i = 0; i < listaEventos.size(); i++) {
                        Eventos eventoSave = listaEventos.get(i);
                        
                        System.out.println("Evento: " + eventoSave.getEvento());
                        System.out.println("Lugar: " + eventoSave.getLugar());
                        System.out.println("Fecha: " + eventoSave.getFecha());
                    }

                    break;

                default:
                    System.out.println("Ingrese una opción valida!");

                    break;
            }
        } while (opcionMenu != 0);

    }

}
