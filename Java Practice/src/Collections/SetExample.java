package Collections;

import java.util.*;  
class SetExample{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
  Set<String> set=new HashSet<String>();  
  set.add("Ravi");  
  set.add("Ajay");  
  set.add("Ravi");  
  set.add(null);  
  set.add(null);  

  //Traversing elements  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  