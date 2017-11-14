/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoeddii;

/**
 *
 * @author Josué Zelaya
 */
public class Registro {
    public Campo campo;
    public String contenido;

    public Registro() {
    }

    public Registro(Campo campo, String contenido) {
        this.campo = campo;
        this.contenido = contenido;
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Registro{" + "campo=" + campo + ", contenido=" + contenido + '}';
    }
    
    
}
