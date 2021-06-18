
package FileHandling;

import java.io.*;

public class Filehandling {
   public static void main(String[] args) throws IOException
   {
       File f=new File("a.txt");//IT IS NOT CREATED NEW FILE IN SYSTEM BUT IT CREATES JAVA FILE OBJECT
       System.out.println(f.exists());//FALSE
       
       f.createNewFile();//AFTER THIS FILE IS CREATED IN SYSTEM
        System.out.println(f.exists());//TRUE
       
       
       
       
   }
    
    
}
 