/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class Restaurante extends Lugar {

    private String categoria;
    private int calificacion;

    public Restaurante(String categoria, int calificacion, String nombre, Double Direccion, int nivel, String Entradas) {
        super(nombre, Direccion, nivel, Entradas);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "categoria=" + categoria + ", calificacion=" + calificacion + '}';
    }

}
