
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class Lugar {
    private String nombre;
    private Double Direccion;
    private int nivel;
    private ArrayList <Carreteras> List = new ArrayList();
    private String Entradas;

    public Lugar(String nombre, Double Direccion, int nivel, String Entradas) {
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.nivel = nivel;
        this.Entradas = Entradas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDireccion() {
        return Direccion;
    }

    public void setDireccion(Double Direccion) {
        this.Direccion = Direccion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Carreteras> getList() {
        return List;
    }

    public void setList(ArrayList<Carreteras> List) {
        this.List = List;
    }

    public String getEntradas() {
        return Entradas;
    }

    public void setEntradas(String Entradas) {
        this.Entradas = Entradas;
    }

    @Override
    public String toString() {
        return "Lugar{" + "nombre=" + nombre + ", Direccion=" + Direccion + ", nivel=" + nivel + ", List=" + List + ", Entradas=" + Entradas + '}';
    }
    
    
    
}
