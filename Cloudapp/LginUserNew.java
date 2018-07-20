/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CloudApp;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @author gubbi
 */
public class LginUserNew {
    

    public void DocParser(String path) {
       
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.parse(path);
            NodeList userList=doc.getElementsByTagName("user");
            for(int i=0;i<userList.getLength();i++)
            {
                Node u=userList.item(i);
                if (u.getNodeType()==Node.ELEMENT_NODE){
                    Element user=(Element)u;
                    String id=user.getAttribute("id");
                    NodeList nameList= user.getChildNodes();
                    for(int j=0;j<nameList.getLength();j++)
                    {
                        Node n=nameList.item(j);
                        if(n.getNodeType()==Node.ELEMENT_NODE)
                        {
                            Element name=(Element)n;
                            System.out.println("user name "+id +":"+name.getTagName()+"and his pass: "+name.getTextContent());
                        }
                    }
                }
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(LginUserNew.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(LginUserNew.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LginUserNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args)
    {
           LginUserNew login=new LginUserNew();
           login.DocParser("/home/gubbi/netBeans_Proj/CLoudApp/src/java/CloudApp/loginInfo.xml/");
           
    }
}
