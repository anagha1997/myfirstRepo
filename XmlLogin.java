/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CloudApp;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 *
 * @author gubbi
 */
public class XmlLogin {
    
   String l_user;
   String l_pass;
   
   public XmlLogin(String user,String pass)
   {
       l_user=user;
       l_pass=pass;
   }
   
   public int checkPass()
   {
       String path="/home/gubbi/netBeans_Proj/CLoudApp/src/java/CloudApp/loginInfo.xml/";
       int value1=0;
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
                    for(int j=0;j<(nameList.getLength());j++)
                    {
                        Node n=nameList.item(j);
                        if(n.getNodeType()==Node.ELEMENT_NODE)
                        {
                            Element name=(Element)n;
                            //System.out.println("user name "+id +":"+name.getTagName()+"and his pass: "+name.getTextContent());
                            if(name.getTagName().equals("name"))
                            {
                                System.out.println(name.getTextContent());
                                if(name.getTextContent().equalsIgnoreCase(l_user))
                                {
                                    System.out.println("inside username "+name.getTextContent());
                                    System.out.println("it has to make true");
                                    continue;
                                }
                                else
                                {
                                    break;
                                }
                                
                            }
                            else
                            {
                                System.out.println(name.getTagName()+"password"+name.getTextContent());
                                if(name.getTextContent().equalsIgnoreCase(l_pass))
                                {
                                   // System.out.println(name.getTextContent());
                                    value1= 1;
                                   // String boolVal=value1.toString();
                                   // System.out.println(boolVal);
                                   // System.out.println("it has to make true");
                                    //break;
                                }
                                
                            }
                        }
                         //String boolVal=value1.toString();
                          System.out.println("the value shows "+ value1);
                        System.out.println("again comes out to for loop");
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
      return value1;
    }
   }

