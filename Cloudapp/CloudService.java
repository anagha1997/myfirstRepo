/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainfun;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
/**
 *
 * @author gubbi
 */
public class CloudService {

    /**
     * @param args the command line arguments
     */
    public String getCloud(String domain) throws FileNotFoundException, IOException {
       
           // TODO code application logic here
           
           CloudService obj=new CloudService();
           File file=new File("D:\\tracert.txt\\");
//        System.out.println("please enter the the domain name of which u want to find cloud service");
//        Scanner sc=new Scanner(System.in);
//        String domain=sc.next();
//System.out.println("domain given is "+domain);
// String command="traceroute  "+domain +" | tail --lines=1 | awk '{ print $2 }'";

String command="tracert "+domain;
/*try {*/
        
    
   
/*catch (IOException ex) {
    Logger.getLogger(CloudService.class.getName()).log(Level.SEVERE, null, ex);
}*/

 Scanner scanner=new Scanner("D:\\tracert.txt\\");
List<String> list=new ArrayList<>();
while(scanner.hasNextLine()){
list.add(scanner.nextLine());
System.out.println(list.toString());
}
String google="1e100";
if((stringMatch(google))!=null)
{
    return google;
}
String azure="msn";
if((stringMatch(azure))!=null)
{
    return azure;
}
String amazon="amazon";
if((stringMatch(amazon))!=null)
{
    return amazon;
}



/* if(list.contains(google))
{
System.out.println("works on google servers");
}
else{
System.out.println("word doesnt match any");
}*/
// System.out.println(output);
//obj.executeCommand(command);

      return null; 
       }
    
public String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		Process p;
		try {
                        Runtime run=Runtime.getRuntime();
			p = run.exec(command);
			p.waitFor();
			BufferedReader reader = 
                            new BufferedReader(new InputStreamReader(p.getInputStream()));
                       // System.out.println(reader.readLine());
                        String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line +"\n");
                                //System.out.println(line);
                               // System.out.println(line);
                        
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output.toString();

	}

public String stringMatch(String cloud)
{
    try{
    Scanner fileScanner = new Scanner(new File("D:\\tracert.txt\\"));
        List lineNumbers = new ArrayList();
int lineID = 0;
Pattern pattern =  Pattern.compile(cloud);
Matcher matcher = null;
while(fileScanner.hasNextLine()){
    String line = fileScanner.nextLine();
    lineID++;
    matcher = pattern.matcher(line);
    if(matcher.find()){
        lineNumbers.add(lineID);
    }
    
}

if(!lineNumbers.isEmpty())
{
    return cloud;
}
}
   catch (FileNotFoundException ex) {
                Logger.getLogger(CloudService.class.getName()).log(Level.SEVERE, null, ex);
            }
    return null;
}

}


