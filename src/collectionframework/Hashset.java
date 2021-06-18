
package collectionframework;

import java.util.*;
//import java.util.Iterator;
//import java.util.TreeSet;


public class Hashset {
    public static void main(String[] args)
    {
        HashSet<String> hs=new HashSet<>();
        hs.add("vyankatesh");
        hs.add("rohit");
        hs.add("hemant");
        hs.add("prathamesh");
        hs.add("abhishek");
        hs.add("rohit");
         HashSet<String> hs1=new HashSet<>();
        hs1.add("girish");
        hs1.add("shri");
        hs1.add("akash");
        hs1.add("shashank");
        hs1.add("abhishek");
        
        System.out.println(hs);//duplicates are not allowed and insertion order is not preserved
       
        Iterator<String> it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        System.out.println(hs.size());
        
        System.out.println(hs.isEmpty());
        
        //clone() is same as ArrayList
        
//        String[] arr=new String[hs.size()];
//        hs.toArray(arr);
//        for(String str:arr)
//        {
//            System.out.println(str);
//        }
        
        TreeSet ts=new TreeSet();
        ts.add(10);
        ts.add(20);
        //ts.add("hi");
        System.out.println(ts);
        //same for arraylist like treeset
        
        //contains() is same as arraylist
        
        hs.retainAll(hs1);
         System.out.println(hs);//after this operation hs will contain only common elements
         
         //clear() and removeAll() are same
        
        
    }
}
