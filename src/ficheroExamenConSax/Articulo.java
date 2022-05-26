/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroExamenConSax;

/**
 *
 * @author Morad
 */
public class Articulo {
    
    private int codigo, cantidad;
    
    public Articulo(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
