package Mainfun;
import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tracert
{
    
    public String s="";
   // public static final String IPADDRESS_PATTERN="(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-4])";
    public String getRoute(String a){
        
    BufferedReader in;
    
        try{
            File file=new File("D:\\tracert.txt\\");


            if(!file.exists()){
                System.out.println("file not found");
                file.createNewFile();
            }

            String[] sew =new String[8];
            Runtime r   =   Runtime.getRuntime();
            
            Process p   =   r.exec("tracert -4 "+a);
            PrintWriter pw = new PrintWriter(file);
            System.out.println(p);
            
           

            in  =   new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;

            if(p==null)
                System.out.println("could not connect");
            //int i=0;
           // Pattern pattern =  Pattern.compile(IPADDRESS_PATTERN);
            
            while((line=in.readLine())!=null){
                  // Matcher matcher = pattern.matcher(line);
                  // sew[i]=matcher.group();
                //System.out.println(sew[i]);
                s+=line;
                     pw.append(s);
            //i++;

               
                //in.close();
            }
             pw.close();
            

        }catch(IOException e){

        System.out.println(e.toString());

        }

 return s;
}
}

