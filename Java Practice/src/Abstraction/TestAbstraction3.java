package Abstraction;
interface A2{ 
	public static final String s="shivani";
void a();   
void b();  
void c();  
void d();  
}  



abstract class B2 implements A2{  
public void c(){System.out.println("I am c");}  
}  
  
class M2 extends B2{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
class TestAbstraction3{  
public static void main(String args[]){  
A2 a=new M2();  
a.a();  
a.b();  
a.c();  
a.d();  
}}  