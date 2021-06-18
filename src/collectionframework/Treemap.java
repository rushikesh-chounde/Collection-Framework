
package collectionframework;

import java.util.*;
public class Treemap {
    public static void main(String[] args)
    {
     
      TreeMap<Integer, String> tm = 
             new TreeMap<Integer, String>();
      
      tm.put(2,"shiva");
      tm.put(10,"manav");
      tm.put(3,"onkar");
      tm.put(7,"vedya");
      tm.put(8,"munda");
      
      System.out.println(tm);
       
     TreeMap<Integer, Integer> tm1 = 
             new TreeMap<Integer, Integer>(); 
     
     tm1.put(1,100);
     tm1.put(2,200);
     tm1.put(3,300);
     tm1.put(4,400);
     tm1.put(5,500);
     
     System.out.println(tm1);
    
     //putAll() is same
     
     System.out.println(tm1.containsKey(5));
     
     System.out.println(tm1.containsValue(800));
     
     Set keys=tm1.keySet();
     System.out.println(keys);
     
     //clear() is same
     
     System.out.println(tm1.firstEntry());
     
     System.out.println(tm1.lastEntry());
     
     System.out.println(tm.firstKey());
     
      System.out.println(tm.lastKey());
      
      System.out.println(tm.descendingKeySet());
      
      System.out.println(tm.floorEntry(9));//greatest entry less than or eual to 9
      
      System.out.println(tm.floorKey(5));
      
      System.out.println(tm.headMap(20));//portion of map whose keys are strictly less than 20
      
      System.out.println(tm.headMap(20,true));
      
      System.out.println(tm.higherEntry(5));
     
      System.out.println(tm.lowerEntry(40));
      
      //same is for keys also
      
      //pollLastEntry and pollFirstEntry()is for Remove and get a key-value mapping associated with the greatest key and least key in this map
      
      System.out.println(tm.subMap(2, 8));//8 is exclusive
      
      System.out.println(tm.subMap(2, true, 8, true));//8 is inclusive
      
      System.out.println(tm.tailMap(3));// Get a portion of a map whose keys are greater than or equal to a given key
      
      System.out.println(tm.tailMap(3,false));// Get a portion of a map whose keys are greater than  a given key
      
      System.out.println(tm.ceilingEntry(2));//to get a key-value mapping associated with the least key greater than or equal to the given key
      
       System.out.println(tm.ceilingKey(2));// System.out.println(tm.ceilingEntry(2));
       
       tm.replace(7, "vedant");
       System.out.println(tm);
       
       
     
    }
}
