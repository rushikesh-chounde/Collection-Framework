
package collectionframework;

import java.util.*;
//import java.util.Map;
//import java.util.Set;


public class Hashmap {
    public static void main(String[] args)
    {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        String s="amol";
        hm.put(1, "shiva");
        hm.put(3, "sumit");
        hm.put(2, "deepak");
        hm.put(4, "amol");
        hm.put(5, s);
      hm.put(5, "tejas");
        System.out.println(hm);
        for(Map.Entry x: hm.entrySet())
        {
            System.out.println(x.getValue()+" "+ x.getKey());
        }
        for(Map.Entry y: hm.entrySet())
        {
            System.out.println(y.getKey()+" "+y.getValue());
        }
        
        HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();//stored in ascending order of keys
        hm1.put(1, 10);
        hm1.put(4, 40);
        hm1.put(3, 80);
        hm1.put(2, 30);
        
        System.out.println(hm1);
        
        for(Map.Entry x:hm1.entrySet())
        {
           System.out.println(x.getKey()+""+x.getValue());
        }
      
        System.out.println(hm.size());
        
        HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
        hm2.put(9, 100);
        hm2.put(6, 600);
        hm2.put(8, 890);
        hm2.put(4, 300);
        
        hm1.putAll(hm2);
          System.out.println(hm1);
          
      //clear() is same as others
          
      System.out.println(hm1.isEmpty());
      
      HashMap<Integer,Integer> new_hm=new HashMap<>();
      new_hm=(HashMap)hm.clone();
      
      System.out.println(new_hm);
    
      if(hm2.containsKey(6))
      {
          System.out.println(hm1.get(6));
      }
      
       //System.out.println(hm1.get(7));
        
      System.out.println(hm2.containsValue(890));
      
      String str =(String)hm.get(3);
      System.out.println(str);
      Set keyset = hm.keySet();
      
      System.out.println(keyset);
      
      System.out.println(hm.values());
      
       System.out.println(hm.get(10));
      
     
      
    }
}
