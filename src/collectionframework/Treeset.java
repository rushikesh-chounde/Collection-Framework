
package collectionframework;

import java.util.*;
//import java.util.TreeSet;

public class Treeset {
   public static void main(String[] args)
   {
       TreeSet<String> ts=new TreeSet<>();
       ts.add("pink");
        ts.add("yellow");
        ts.add("green");
        ts.add("black");
        ts.add("white");
    
        System.out.println(ts);//duplicates are not allowed and insertion order is not preserved
        
        for(String str:ts)
        {
            System.out.println(str);
        }
       
        TreeSet<String> ts1=new TreeSet<>();
       ts1.add("purple");
        ts1.add("red");
        ts1.add("blue");
        ts1.add("black");
        
        ts.addAll(ts1);
         System.out.println(ts);
        
        Iterator<String> it=ts.descendingIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
       
        System.out.println(ts.first());
        System.out.println(ts.last());
       
        //clone() is same as others
        //size() is same as others
        //contains() is same as others
//      System.out.println("---------------------------");
//        TreeSet<String> ts2=new TreeSet<>();
//        ts2=(TreeSet)ts.headSet("grey");
//        
//        Iterator<String> it1=ts2.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
        
        
        
       TreeSet<Integer> ts3=new TreeSet<>();
       ts3.add(10);
        ts3.add(40);
        ts3.add(30);
        ts3.add(20);
        ts3.add(60);
        System.out.println(ts3);
        System.out.println(ts3.ceiling(50));//Returns the least element in this set greater than or equal to the given element
        
      System.out.println(ts3.floor(50));//Returns the greatest element in this set less than or equal to the given element
      
      System.out.println(ts3.pollFirst());
       System.out.println(ts3.pollLast());
      
       //remove() is same as others
       
       
   }
}
