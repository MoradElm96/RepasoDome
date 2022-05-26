/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroExamenConSax;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Morad
 */
public class Principal {
    
   
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
       
        File f = new File("compras.xml");
        SAXParserFactory spf =  SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();
        
        Manejador m = new Manejador();
        
        sp.parse(f, m);
        
        ArrayList<Cliente> lista = m.obtenerLista();
        
        for (Cliente cliente : lista) {
            
            System.out.println(cliente);
        }
        
    }
}
