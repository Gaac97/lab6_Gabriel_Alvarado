/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class Carreteras extends Lugar{
    private Double distancia;
    private Carreteras lugarI;
    private Carreteras lugarF;

    public Carreteras(String nombre, Double Direccion, int nivel, String Entradas) {
        super(nombre, Direccion, nivel, Entradas);
    }

  

    

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Carreteras getLugarI() {
        return lugarI;
    }

    public void setLugarI(Carreteras lugarI) {
        this.lugarI = lugarI;
    }

    public Carreteras getLugarF() {
        return lugarF;
    }

    public void setLugarF(Carreteras lugarF) {
        this.lugarF = lugarF;
    }

    @Override
    public String toString() {
        return "Carreteras{" + "distancia=" + distancia + ", lugarI=" + lugarI + ", lugarF=" + lugarF + '}';
    }

   
}
