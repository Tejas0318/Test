package Interface;
//Interface declaration: by first user  
interface Drawable1{  
void draw() ;  
} 

//Implementation: by second user  
class Rectangle1 implements Drawable1{  
public void draw(){System.out.println("drawing rectangle");}  

}  
class Circle2 implements Drawable1{  
public void draw(){System.out.println("drawing circle");}  
} 

//Using interface: by third user  
class Interfaceexample{  
public static void main(String args[]){  
Drawable1 d=new Circle2();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}}  




// we can''t have constructor in interface
//variables- public , static, final
//only abstract methods
//we can't create object of interface
//class can implement more than one interface
//interface always extends a interface- 1 interface at a time