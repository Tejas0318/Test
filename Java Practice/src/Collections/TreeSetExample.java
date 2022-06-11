package Collections;

import java.util.*;  
class TreeSetExample{  
 public static void main(String args[]){  
 TreeSet<String> set=new TreeSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Ajay"); 
         set.add("Ravi");  

         System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
           
 }  
}  