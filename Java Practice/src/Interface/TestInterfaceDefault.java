package Interface;
interface Drawable3{  
void draw();  //abstract method
 default void msg(){System.out.println("default method");}  //default method
}  
class Rectangle3 implements Drawable3{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class TestInterfaceDefault{  
public static void main(String args[]){  
Drawable3 d=new Rectangle3();  
d.draw();  
d.msg();  
}}  