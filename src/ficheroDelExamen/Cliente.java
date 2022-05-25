/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroDelExamen;

/**
 *
 * @author Alumno
 */
public class Cliente {
    
    private String id;
    private int codigoArticulo,cantidad;

    public Cliente(String id, int codigoArticulo, int cantidad) {
        this.id = id;
        this.codigoArticulo = codigoArticulo;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", codigoArticulo=" + codigoArticulo + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
}
