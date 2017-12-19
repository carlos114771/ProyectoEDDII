/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoeddii;

import java.util.ArrayList;

/**
 *
 * @author Josué Zelaya
 */
public class Registro {

    public ArrayList<Campo> campos = new ArrayList();
    public String contenido;

    public Registro() {
    }

    public Registro(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
//        return "Registro{" + "campos=" + campos + ", contenido=" + contenido + '}';
        return contenido;
    }

}
