
package collectionframework;

import java.util.*;
//import java.util.Collections;

public class Arraylist {
    public static void main(String[] args)
    {
          ArrayList al1=new ArrayList();
        al1.add("shiva");
        al1.add(10);
        al1.add(10);
        al1.add("manav");
        al1.add("vedant");
        al1.add("onkar");
        al1.add("adu");
        System.out.println(al1);
//        ArrayList<Character> al5=new ArrayList<>();
//        al5.add('a');
//        
//        
//         ArrayList<String> al2=new ArrayList<>();
//        al2.add("swapnil");
//        al2.add("yash");
//        al2.add("tejas");
//        al2.add("om");
//        al2.add("adarsh");
//          
//      al1.add(3,"aniket");//not affected on the list
//        System.out.println(al1);
//        
//        System.out.println(al1.get(1));
//        
//        al2.set(0, "kaustubh");//replace this element
//        System.out.println(al2);
//        
//        al1.remove("adu");
//        al1.remove(1);
//        System.out.println(al1);
//        
//        if(al1.contains("yash"))
//        {
//            System.out.println("----");
//        }
//        
//         System.out.println(al1);
//         Collections.sort(al1);
//        
////         Collections.copy(al1, al2);//al2 elements are copied in al1
////          System.out.println(al1);
//         
//         System.out.println(al1.subList(0,3));//print sublist from index 0-2
//         
//         Collections.swap(al1,0,2);
//         System.out.println(al1);
//         
//          System.out.println(al1);
//           System.out.println(al2);
//           al1.addAll(al2);//It is also used to join two arraylist
//            System.out.println(al1);
//            
//            ArrayList<String> al3=(ArrayList<String>)al1.clone();
//             System.out.println(al3);
//             
////         al1.removeAll(al1);
////          System.out.println(al1);
//             
//              System.out.println(al1.isEmpty());
//              
//              al1.trimToSize();
//               System.out.println(al1.size());
//               System.out.println(al1);
//               
               for(int i=0;i<al1.size();i++)
               {
                   System.out.println(al1.get(i));
               }
    
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        System.out.println(al.get(2));
        al.add(2, 60);
        System.out.println(al);
        al.set(3, 70);
        System.out.println(al);
        al.remove(4);
        al.remove(Integer.valueOf(30));
        System.out.println(al);
        Iterator<Integer> it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}
