/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroDelExamen;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Alumno
 */
public class LecturaXml {
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        File f = new File("compras.xml");
        ArrayList<Cliente> lista = new ArrayList<>();
        Cliente cliente;
        String id = "";
        String [] valores=null; //luego se convierte a lo que corresponda
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document d = db.parse(f);
        
        d.getDocumentElement().normalize();
        
        NodeList nodo = d.getElementsByTagName("Cliente");
        System.out.println("Hay " + nodo.getLength());
        for (int i = 0; i < nodo.getLength(); i++) {
            Node node = nodo.item(i);
            if(node.getNodeType()== Node.ELEMENT_NODE){
             Element elemento=(Element)node.getChildNodes();
             id=elemento.getAttribute("id");
             //sin acabar
           //  if()
           //3 hijos articulos, si tiene 3 nodos y cada uno tiene dos nodos 
                
                
            }
            
            
        }
        
        
        
    }
    
}
