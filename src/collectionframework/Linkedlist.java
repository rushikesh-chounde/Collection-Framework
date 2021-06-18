
package collectionframework;

import java.util.*;
//import java.util.Iterator;
//import java.util.LinkedList;


public class Linkedlist {
    public static void main(String[] args)
    {
        System.out.println(2%5);
        LinkedList<String> ll=new LinkedList<>();
        ll.add("OS");
        ll.add("DBMS");
        ll.add("CN");
        ll.add("DS");
        ll.add("TOC");
        
        System.out.println(ll);
  //--------------------------------------------      
        for(String str:ll)
        {
            System.out.println(str);
        }
   //---------------------------------------------     
        Iterator<String> it=ll.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
     //---------------------------------------------   
         Iterator<String> it1=ll.descendingIterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
    //------------------------------------------------   
        //Add method is same as ArrayList
        
        ll.addFirst("ADS");
        ll.addLast("COA");
         System.out.println(ll);
     //-----------------------------------------------
        LinkedList<String> ll2=new LinkedList<>();
        ll2.add("ADE");
        ll2.add("ML");
        ll2.add("IOT"); 
        //ll.addAll(ll2);
        System.out.println(ll);
           System.out.println(ll2);
        
        ll.addAll(1,ll2);//add ll2 from first index of ll
        System.out.println(ll);
     //-----------------------------------------------
        String str=ll.getFirst();
         String str1=ll.getLast();
         System.out.println(str+str1);
      //-----------------------------------------------
          System.out.println(ll.get(3));
      //-----------------------------------------------
           System.out.println(ll);
          ll.remove(2);
          ll.remove("TOC");
           System.out.println(ll);
      //----------------------------------------------- 
          System.out.println(ll);
          ll.removeFirst();
          ll.removeLast();
           System.out.println(ll);
      //----------------------------------------------- 
           //ll.clear();
       //----------------------------------------------- 
           //swap is same as arraylist
           //addall is same as arraylist
           //clone() is same as arraylist
       //-----------------------------------------------    
           ll.pop();//Remove and return first element
            System.out.println(ll);
     //-----------------------------------------------    
           System.out.println(ll.peekFirst());
            System.out.println(ll.peekLast());
      //-----------------------------------------------    
            //contains() is same as arraylst
     //---------------------------------------
            ArrayList<String> al=new ArrayList<>(ll);
             System.out.println(al);
              System.out.println(ll);
     //----------------------------------------
          //removeAll() is same as arrayList
          //set() is same as ArrayList
              
    }            
}
