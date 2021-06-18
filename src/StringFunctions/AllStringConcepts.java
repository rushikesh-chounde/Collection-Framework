
package StringFunctions;

import collectionframework.Stackds;
import java.util.Collection;
import java.util.HashMap;


public class AllStringConcepts {
    //STRINGS ARE IMMUTABLE WE CANNOT MODIFY CONTENT
    
    public static void main(String[] args) {
//     String str="book";
//    
//
//      char c='b';
//      System.out.println(c+'a');
//      System.out.println(str.substring(0, str.length()/2));
//      System.out.println(str.substring( str.length()/2,str.length()));
//        
//        String str1="I am Rushikesh";
//        
//        String str2="shiva";
//        
//        String str3="rushi";
//        
//        System.out.println(str.charAt(5));
//        
//        System.out.println(str2.compareTo(str3));//compareToIgnorCase()
//        
//        System.out.println(str.concat(" Chounde"));
//        
//        System.out.println(str.contains("Chounde"));
//        
//       System.out.println(str.endsWith("Chounde"));
//       
//       System.out.println(str.equals(str1));//equalsIgnoreCase()
//       
//       System.out.println(str.indexOf("ao"));
//       
//      System.out.println(str.lastIndexOf("a"));
//      
//      Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
//      String s = ”Learn Share Learn”;
//
//        int output = s.indexOf(‘a’,3); returns 8

//       System.out.println(str.isEmpty());
//       
//        
//        
//      System.out.println(str.length());   
//      
//       System.out.println(str.replace("Shiva", "shiva"));
//       
//       String[] s=str.split(" ");
//       for(String sr:s)
//       {
//           System.out.println(sr);
//       }
//        
//       System.out.println(str.substring(0, 5));
//       
//        System.out.println(str.toLowerCase());
//        
//           System.out.println(str.toUpperCase());
//       
//      char[] ch=str.toCharArray();
//      for(char c:ch)
//      {
//          System.out.println(c);
//      }
//      
//      System.out.println(str.trim());
      
      
//----------------------------------------------------------------------
      
      //STRINGBUILDER AND STRINGBUFFER ARE MUTABLE
      
      StringBuilder sb=new StringBuilder("I am shiva");
      StringBuilder sb1=new StringBuilder("I am shiva");
      if(sb.toString().equals(sb1.toString()))
          System.out.println("yes");
  
     
//      
//      
//     System.out.println(sb.append(" Chounde"));
//      
//      System.out.println(sb.append(sb1, 5, 14)); 
//      
//     System.out.println(sb.append(7));
//      
//      System.out.println(sb.capacity());
//      
//      //charAt() is same
//      
//      System.out.println(sb.delete(0, 2));//deleteCharAt()
//      
//      //indexOf() is same
//      
//     System.out.println(sb.insert(5, " don "));//WE CAN INSERT All TYPE OF DATA TYPES 
//     
//     System.out.println(sb.replace(5, 11, ""));
//     
//     System.out.println(sb1.reverse());
//      sb1.reverse();
//      
//      char ch='v';
//      sb1.toString();
//     sb1.setCharAt(3, '7');
//     System.out.println(sb1);
//     
    //lastIndexOf() is same
     
     
     //str.substring(0,8); here 8 is exclusive
     
     //String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was" 
   
     //s.contains("PM");
     
      //----------------------------------------------------------------------
             
      //IMP Questions
      
//      String str = "      Geeks     for    Geeks        ";
//      str = str.replaceAll("\\s", "");//GeeksforGeeks
      
      String str="Java";
//      char[] temp={'a','b','c'};
//      String st=new String(temp);
//      System.out.println(st);
//      HashMap<Character,Integer> hm=new HashMap<>();
//      for(int i=0;i<str.length();i++)
//      {
//          hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i), 0)+1);
//      }
//        System.out.println(hm);
      
      int count[]=new int[256];
      System.out.println(count[str.charAt(2)]);
      
    }
  
}
