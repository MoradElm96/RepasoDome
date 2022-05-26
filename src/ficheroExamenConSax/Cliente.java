/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroExamenConSax;

import java.util.ArrayList;

/**
 *
 * @author Morad
 */
public class Cliente {
    
    private String id;
    private ArrayList<Articulo> lista= new ArrayList<Articulo>();

    public Cliente() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
     public ArrayList<Articulo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Articulo> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", lista=" + lista + '}';
    }
    
    
    
}
