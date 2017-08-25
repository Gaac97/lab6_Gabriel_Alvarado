/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class Canchas extends Lugar{
    private String Categoria;
    private String estado;

    public Canchas(String nombre, Double Direccion, int nivel, String Entradas) {
        super(nombre, Direccion, nivel, Entradas);
    }

    public Canchas(String Categoria, String estado, String nombre, Double Direccion, int nivel, String Entradas) {
        super(nombre, Direccion, nivel, Entradas);
        this.Categoria = Categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Canchas{" + "Categoria=" + Categoria + ", estado=" + estado + '}';
    }

    
    
}
