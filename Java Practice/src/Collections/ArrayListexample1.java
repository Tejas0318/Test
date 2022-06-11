package Collections;

import java.util.*;  
public class ArrayListexample1{  
public static void main(String args[]){  
 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
     list.add("banana");//Adding object in arraylist    
     list.add("Apple");    
     list.add(null);    
     list.add("Grapes"); 
     list.add("Mango");//Adding object in arraylist    

     //Printing the arraylist object   
     System.out.println(list);  
}  
}  


/*duplicate, Null, Order*/





/*Hashset - no duplicate, only 1 null, no order
Treeset- no duplicate, no null value(throw exception), sorted order


Map: key-value
Hashmap: key should be unique(value can be duplicate), only 1 null key is allowed(more than 1 values can be null), no order
Treemap: Key should unique(duplicate values are allowed), no null key is allowed(null value is allowed) throws error, sorted in asc order of key

*/




