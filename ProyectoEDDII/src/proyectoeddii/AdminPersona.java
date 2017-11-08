/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoeddii;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario Dell
 */
public class AdminPersona {

    ArrayList<Persona> lista = new ArrayList();

    File archivo = null;

    public AdminPersona(String path) {
        archivo = new File(path);
    }

    public ArrayList<Persona> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Persona> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ListaPersona" + lista;
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Persona t : lista) {
                bw.write(t.getNombre() + ";");
                bw.write(t.edad + ";");
                bw.write(t.getId() + ";");
                bw.write(t.getDireccion() + ";");
            }
            bw.write(";");
            bw.flush();
        } catch (Exception e) {

        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                lista.add(new Persona(sc.next(), sc.nextInt(), sc.nextInt(), sc.next()));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }

    }
}
