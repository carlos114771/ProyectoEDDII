package pruebaarbolb;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
        
public class Nodo {
    Nodo padre;
    LinkedList<Nodo> hijos;
    LinkedList<Integer> llaves;

    public Nodo() {
        padre = null;
        hijos = new LinkedList<>();
        llaves = new LinkedList<>();
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public LinkedList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(LinkedList<Nodo> hijos) {
        this.hijos = hijos;
    }

    public LinkedList<Integer> getLlaves() {
        return llaves;
    }

    public void setLlaves(LinkedList<Integer> llaves) {
        this.llaves = llaves;
    }
    
    public boolean esNodo_Raiz() {
        if (padre == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void crearLlave(int llave) {
        llaves.add(llave);
        Collections.sort(llaves);
    }
    
    public boolean esNodo_Hoja() {
        if (hijos.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}