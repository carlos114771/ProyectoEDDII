package pruebaarbolb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class PruebaArbolB {
    int split_llave = 0;
    int orden;
    Nodo buscar_nodo;
    Nodo raiz = null;
    ArrayList<Nodo> arbol;
    
    public PruebaArbolB(int orden) {
        this.orden = orden;
        arbol = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        PruebaArbolB prueba = new PruebaArbolB(4);
        for (int i = 1; i <= 10; i++) {
            prueba.InsertarLlave(i);
        }
        Scanner in = new Scanner(System.in);
        prueba.Print(prueba.raiz, 0);
        int extra;
        do {
            System.out.print("Ingrese un digito: ");
            extra = in.nextInt();
            //Ingresar que tipo de método desea ejecutar [InsertarLlave() ó EliminarLlave()]
            prueba.InsertarLlave(extra);
            prueba.Print(prueba.raiz, 0);
            System.out.println("RAIZ" + prueba.raiz.getLlaves());
        } while (extra != -1);
    }
    
    public boolean InsertarLlave(int llave) {
        //Si el arbol esta vacio, crea un nodo y le agrega la llave
        if (raiz == null) {
            raiz = new Nodo();
            raiz.crearLlave(llave);
        } else {
            //Busca el nodo adecuado
            Nodo nodo = busqueda_Binaria(llave, raiz);
            if (nodo.getLlaves().size() + 1 == orden) {
                //Split
                nodo.crearLlave(llave);
                Split(nodo);
            } else {
                //Si hay espacio introduce la llave
                nodo.crearLlave(llave);
            }
        }
        return false;
    }
    
    //Busca en el arbol y devuelve la posicion del nodo hijo
    public Nodo busqueda_Binaria(int llave, Nodo nodo) {
        if (nodo.esNodo_Hoja()) {
            return nodo;
        } else {
            for (int i = 0; i < nodo.getLlaves().size(); i++) {
                if (llave <= nodo.getLlaves().get(i)) {
                    Nodo posR = nodo.getHijos().get(i);
                    return busqueda_Binaria(llave, posR);
                }
            }
            Nodo posicion = nodo.getHijos().get(nodo.getLlaves().size());
            return busqueda_Binaria(llave, posicion);
        }
    }
    
    public boolean Split(Nodo nodo) {
        if (!nodo.esNodo_Raiz()) {
            //
        }
        if (nodo.getLlaves().size() == orden) {
            nodo = DesarrolloSplit(nodo);
            Split(nodo);
        } else if (nodo.esNodo_Raiz()) {
            return true;
        } else {
            return true;
        }
        return false;
    }
    
    //Desarrollo del Split
    public Nodo DesarrolloSplit(Nodo nodo) {
        Nodo right = new Nodo();
        Nodo left = new Nodo();
        //Agrega la llave para luego hacer la division
        int mitad = (nodo.getLlaves().size() - 1) / 2;

        //Divide los hijos
        if (!nodo.esNodo_Hoja()) {
            System.out.println("Ejecutar");
            LinkedList<Nodo> mitadDerHijos = new LinkedList<>(nodo.getHijos().subList(mitad + 1, nodo.getHijos().size()));
            LinkedList<Nodo> mitadIzqHijos = new LinkedList<>(nodo.getHijos().subList(0, mitad + 1));
            right.setHijos(mitadDerHijos);
            left.setHijos(mitadIzqHijos);
        }
        //Divide las llaves
        LinkedList<Integer> mitadDerLlaves = new LinkedList<>(nodo.getLlaves().subList(mitad + 1, nodo.getLlaves().size()));
        LinkedList<Integer> mitadIzqLLaves = new LinkedList<>(nodo.getLlaves().subList(0, mitad));
        right.setLlaves(mitadDerLlaves);
        left.setLlaves(mitadIzqLLaves);

        //Sube la llave
        split_llave = nodo.getLlaves().get(mitad);
        if (nodo.esNodo_Raiz()) {
            Nodo raiz = new Nodo();
            //Inserta LLave
            raiz.crearLlave(split_llave);
            right.setPadre(raiz);
            left.setPadre(raiz);
            raiz.getHijos().add(left);
            raiz.getHijos().add(right);
            if (!nodo.esNodo_Hoja()) {
                for (int i = 0; i < right.getHijos().size(); i++) {
                    right.getHijos().get(i).setPadre(right);
                }
                for (int i = 0; i < left.getHijos().size(); i++) {
                    left.getHijos().get(i).setPadre(left);
                }
            }
            this.raiz = null;
            this.raiz = raiz;

            return raiz;
        } else {
            right.setPadre(nodo.getPadre());
            left.setPadre(nodo.getPadre());
            //Sube la llave
            nodo.getPadre().crearLlave(split_llave);
            int indice = nodo.getPadre().getLlaves().indexOf(split_llave);
            nodo.getPadre().getHijos().add(indice, left);
            nodo.getPadre().getHijos().add(indice + 1, right);
            nodo.getPadre().getHijos().remove(indice + 2);
            if (!nodo.esNodo_Hoja()) {
                for (int i = 0; i < right.getHijos().size(); i++) {
                    right.getHijos().get(i).setPadre(right);
                }
                for (int i = 0; i < left.getHijos().size(); i++) {
                    left.getHijos().get(i).setPadre(left);
                }
            }
        }
        return nodo.getPadre();
    }
    
    public boolean EliminarLlave(int llave) {
        //Arbol essta vacio
        if (raiz == null) {
            return false;
        } else {
            Nodo nodo = BuscarNodo(llave, raiz);
            System.out.println("LLave Seleccionada");
            System.out.println(nodo.getLlaves());
            if (nodo.esNodo_Hoja()) {
                if (nodo.getLlaves().size() - 1 >= orden / 2) {
                    nodo.getLlaves().remove(new Integer(llave));
                    return true;
                } else {
                    nodo.getLlaves().remove(new Integer(llave));
                    BalancearArbol(nodo);
                }
            } else {
                int indice = nodo.getLlaves().indexOf(new Integer(llave));
                int llaveSube = LlaveMayor(nodo.getHijos().get(indice));
                nodo.getLlaves().remove(new Integer(llave));
                nodo.crearLlave(llaveSube);
                Nodo nodoAux = BuscarNodo(llaveSube, nodo.getHijos().get(indice));
                if (nodoAux.getLlaves().size() - 1 >= orden / 2) {
                    nodoAux.getLlaves().remove(new Integer(llaveSube));
                    return true;
                } else {
                    nodoAux.getLlaves().remove(new Integer(llaveSube));
                    BalancearArbol(nodoAux);
                }
            }
        }
        return false;
    }
    
    public Nodo BuscarNodo(int llave, Nodo nodo) {
        //System.out.println(nodo.esHoja());
        if (nodo.getLlaves().contains(llave)) {
            return nodo;
        } else {
            for (int i = 0; i < nodo.getLlaves().size(); i++) {
                if (llave <= nodo.getLlaves().get(i)) {
                    return BuscarNodo(llave, nodo.getHijos().get(i));
                }
            }
            return BuscarNodo(llave, nodo.getHijos().get(nodo.getLlaves().size()));
        }
    }
    
    public void BalancearArbol(Nodo nodo) {
        int posicion = 0;
        if (!nodo.esNodo_Raiz()) {
            posicion = nodo.getPadre().getHijos().indexOf(nodo);
        }

        if (nodo.esNodo_Raiz()) {
            System.out.println("LLego a la raiz");
            if (nodo.getLlaves().size() == 0) {
                raiz = nodo.getHijos().get(0);
                nodo.getHijos().get(0).setPadre(nodo);
                raiz.setPadre(null);
            }
            System.out.println("RAIZ" + raiz.getLlaves());
            //Si el nodo en la recursion no es valido vuelve hacer el balanceo
        } else if (nodo.getLlaves().size() < (orden - 1) / 2) {
            //Cuando es el primero no puede evaluar ambos solo uno
            if (posicion == 0) {
                System.out.println("ESTA EN EL PRIMERO");
                Nodo nodoComb = JuntarNodos(nodo.getPadre().getHijos().get(posicion), nodo.getPadre().getHijos().get(posicion + 1));
                //Agrega el nodo y borra las otras dos referencias
                nodo.getPadre().getHijos().add(posicion, nodoComb);
                nodo.getPadre().getHijos().remove(nodo.getPadre().getHijos().get(posicion + 1));
                nodo.getPadre().getHijos().remove(nodo.getPadre().getHijos().get(posicion + 1));
                //Revisar si se debe hacer algo mas
                if (nodo.getPadre().getHijos().get(posicion).getLlaves().size() < orden) {
                    BalancearArbol(nodo.getPadre());
                } else {
                    DesarrolloSplit(nodo.getPadre().getHijos().get(posicion));
                }
                //Si es el nodo mas a la derecha solo puede evaluar a la izquierda
            } else if (posicion == nodo.getPadre().getLlaves().size()) {
                System.out.println("ESTA EN EL ULTIMO");
                Nodo nodoComb = JuntarNodos(nodo.getPadre().getHijos().get(posicion - 1), nodo.getPadre().getHijos().get(posicion));
                //Agrega el nodo y borra las otras dos referencias
                nodo.getPadre().getHijos().add(posicion - 1, nodoComb);
                nodo.getPadre().getHijos().remove(nodo.getPadre().getHijos().get(posicion));
                nodo.getPadre().getHijos().remove(nodo.getPadre().getHijos().get(posicion));
                //Revisar si se debe hacer algo mas
                if (nodo.getPadre().getHijos().get(posicion - 1).getLlaves().size() < orden) {
                    BalancearArbol(nodo.getPadre());
                } else {
                    DesarrolloSplit(nodo.getPadre().getHijos().get(posicion - 1));
                }
            } else {
                System.out.println("ENTRA EN LOS DE MEDIO");
                //Elige el vecino mas populoso , si son iguales elige el de la izquierda
                if (nodo.getPadre().getHijos().get(posicion - 1).getLlaves().size() >= nodo.getPadre().getHijos().get(posicion + 1).getLlaves().size()) {
                    System.out.println("AGARRA EL DE LA IZQUIERDA");
                    //Lo combina
                    Nodo nodoComb = JuntarNodos(nodo.getPadre().getHijos().get(posicion - 1), nodo.getPadre().getHijos().get(posicion));
                    //Agrega el nodo y borra las otras dos referencias
                    nodo.getPadre().getHijos().add(posicion - 1, nodoComb);
                    nodo.getPadre().getHijos().remove(nodo.getPadre().getHijos().get(posicion));
                    nodo.getPadre().getHijos().remove(nodo.getPadre().getHijos().get(posicion));
                    //Revisar si se debe hacer algo mas
                    if (nodo.getPadre().getHijos().get(posicion - 1).getLlaves().size() < orden) {
                        BalancearArbol(nodo.getPadre());
                    } else {
                        DesarrolloSplit(nodo.getPadre().getHijos().get(posicion - 1));
                    }
                    //Balanc 
                } else {
                    System.out.println("AGARRA EL DE LA DERECHA");
                    Nodo nodoComb = JuntarNodos(nodo.getPadre().getHijos().get(posicion), nodo.getPadre().getHijos().get(posicion + 1));
                    //Agrega el nodo y borra las otras dos referencias
                    nodo.getPadre().getHijos().add(posicion, nodoComb);
                    nodo.getPadre().getHijos().remove(nodo.getPadre().getHijos().get(posicion + 1));
                    nodo.getPadre().getHijos().remove(nodo.getPadre().getHijos().get(posicion + 1));
                    //Revisar si se debe hacer algo mas
                    if (nodo.getPadre().getHijos().get(posicion).getLlaves().size() < orden) {
                        BalancearArbol(nodo.getPadre());
                    } else {
                        DesarrolloSplit(nodo.getPadre().getHijos().get(posicion));
                    }
                }
            }
        }
    }
    
    public Nodo JuntarNodos(Nodo left, Nodo right) {
        Nodo nodo = new Nodo();
        //Combina las llaves
        LinkedList<Integer> llaves = new LinkedList<>();
        llaves.addAll(left.getLlaves());
        llaves.addAll(right.getLlaves());
        nodo.setLlaves(llaves);
        //Toma el indice de donde esta la llave que se va bajar que es la relacionada
        //Con el nodo izquierdo
        //La saca y la baja
        int indicePadre = left.getPadre().getHijos().indexOf(left);
        int llaveBajar = left.getPadre().getLlaves().get(indicePadre);
        System.out.println("LLAVE QUE BAJA" + llaveBajar);
        nodo.crearLlave(llaveBajar);
        System.out.println("LLaves COMBINANADAS" + nodo.getLlaves());
        left.getPadre().getLlaves().remove(new Integer(llaveBajar));
        //Si es nodo hoja no hay que combinar los hijos
        System.out.println("Es hoja" + nodo.esNodo_Hoja());
        System.out.println("Combina");
        LinkedList<Nodo> hijos = new LinkedList<>();
        hijos.addAll(left.getHijos());
        hijos.addAll(right.getHijos());
        nodo.setHijos(hijos);
        nodo.setPadre(right.getPadre());
        for (int i = 0; i < nodo.getHijos().size(); i++) {
            nodo.getHijos().get(i).setPadre(nodo);
        }
        return nodo;
    }
    
    public Integer LlaveMayor(Nodo nodo) {
        if (nodo.esNodo_Hoja()) {
            return nodo.getLlaves().get(nodo.getLlaves().size() - 1);
        } else {
            return LlaveMayor(nodo.getHijos().get(nodo.getHijos().size() - 1));
        }

    }
    
    public void Print(Nodo nodo, int nivel) {
        if (!nodo.esNodo_Hoja()) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("..");
            }
            System.out.println(nodo.getLlaves().toString());
            nivel++;
            for (int i = 0; i < nodo.getHijos().size(); i++) {
                Print(nodo.getHijos().get(i), nivel);
            }
        } else {
            for (int i = 0; i < nivel; i++) {
                System.out.print("..");
            }
            System.out.println(nodo.getLlaves().toString());
        }
    }
}