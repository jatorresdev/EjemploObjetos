/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetos.objetos;

import java.util.Date;

/**
 *
 * @author https://github.com/jatorresdev
 */
public class Eventos {
    private String evento;
    private String lugar;
    private Date fecha;

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getEvento() {
        return this.evento;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return this.fecha;
    }
}
