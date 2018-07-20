/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CloudApp;

/**
 *
 * @author gubbi
 */

import java.io.File;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XmlSignin {
    String l_user;
   String l_pass;
   String l_id;
    public XmlSignin(String user,String pass,String id)
    {
        l_user=user;
        l_pass=pass;
        l_id=id;
    }
    public void WriteXml(){
           // int i=1;
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
         try{
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            Element rootElement =doc.createElement("users");
            //doc.appendChild(rootElement);
            doc.appendChild(rootElement);
            rootElement.appendChild(getUser(doc,l_user,l_pass,l_id));
            //add elements to Document
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(new File("/home/gubbi/netBeans_Proj/CLoudApp/src/java/CloudApp/loginInfo.xml"));
            //write data
            transformer.transform(source, console);
            transformer.transform(source, file);
            System.out.println("DONE");

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XmlSignin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XmlSignin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XmlSignin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static Node getUser(Document doc,String name,String pass,String id)
    {
        Element user=doc.createElement("user");
        user.setAttribute(id,id);
        user.appendChild(getUserElements(doc,user,"name",name));
        
       
        user.appendChild(getUserElements(doc,user,"pass",pass));
        
        return user;
    }
    
    private static Node getUserElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
}
