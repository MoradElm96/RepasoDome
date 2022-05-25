package repasodome;

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
import repasodome.Alumno;

public class RepasoDome {
  public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
      File f=new File("notas.xml");
      ArrayList<Alumno> lista=new ArrayList<Alumno>();
      Alumno al;
      String id="";
      String[] valores=null;
      DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
      DocumentBuilder db=dbf.newDocumentBuilder();
      Document d=db.parse(f);
      d.getDocumentElement().normalize();
      
      NodeList nodo=d.getElementsByTagName("alumno");//LISTA DE NODOS CON ETIQUETA alumno
      System.out.println("Hay "+nodo.getLength()+" alumnos en el fichero");
      for(int i=0;i<nodo.getLength();i++){
         Node node=nodo.item(i);
         if(node.getNodeType()==Node.ELEMENT_NODE){
           Element elemento=(Element)node.getChildNodes();
           id=elemento.getAttribute("id");
           if(elemento.hasChildNodes()){
               NodeList hijos=node.getChildNodes();
               valores=new String[hijos.getLength()];
               for(int j=0;j<hijos.getLength();j++){
                 Node nd=hijos.item(j);
                 NodeList ndl=nd.getChildNodes();
                 for(int k=0;k<ndl.getLength();k++){
                   Node datos=ndl.item(k);
                   valores[j]=datos.getTextContent();
                 }
              } 
               /*for(int l=1;l<valores.length;l=l+2)
               System.out.println(valores[l]);*/
           }
           
         }
         al=new Alumno(id,valores[1],Integer.parseInt(valores[3]),Integer.parseInt(valores[5]),
         Integer.parseInt(valores[7]),Integer.parseInt(valores[9]));
         lista.add(al);
      }
    
      for(int i=0;i<lista.size();i++)
        System.out.println(lista.get(i).toString());
    }
    
}
