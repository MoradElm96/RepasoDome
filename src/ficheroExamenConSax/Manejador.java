/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroExamenConSax;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Morad
 */
public class Manejador extends DefaultHandler {

    ArrayList<Cliente> listaClientes = new ArrayList<>();
    ArrayList<Articulo> listaArticulos = new ArrayList<>();
    Cliente cliente;
    Articulo articulo;

    StringBuilder sb = new StringBuilder();

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        sb.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        switch (qName) {
            case "Cliente":
                cliente.setLista(listaArticulos);
                break;
            case "articulo":
                listaArticulos.add(articulo);
                break;
            case "cod_articulo":
                articulo.setCodigo(Integer.parseInt(sb.toString()));
                break;
            case "cantidad":
                articulo.setCantidad(Integer.parseInt(sb.toString()));
                break;

        }

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        switch (qName) {

            case "Cliente":
                cliente = new Cliente();
                listaClientes.add(cliente);
                cliente.setId(attributes.getValue("id"));
                listaArticulos = new ArrayList<Articulo>();
                break;
            case "articulo":
                articulo = new Articulo();
                break;

            case "cod_articulo":
            case "cantidad":
                sb.delete(0, sb.length());
                break;
        }
    }

    public ArrayList<Cliente> obtenerLista() {

        return listaClientes;
    }

}
