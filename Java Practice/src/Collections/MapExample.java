package Collections;

import java.util.*;  
public class MapExample{  
 public static void main(String args[]){  
   Map<Integer,String> map1=new HashMap<Integer,String>();//Creating HashMap    
   map1.put(2,"Mango");  //Put elements in Map  
   map1.put(1,"Apple");    
   map1.put(3,"Mango");   
   map1.put(4,null);   

   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map1.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  