package Interface;
interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}  
  
class interfaceExample2 implements Printable, Showable{  

public void print(){System.out.println("Hello");}  
public static void main(String args[]){  

	interfaceExample2 obj = new interfaceExample2();  
obj.print();  
 }
 
}  