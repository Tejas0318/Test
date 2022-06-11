package Inheritance;
class A1{  
void msg(){System.out.println("Hello");}  
}  
class B1{  
void msg(){System.out.println("Welcome");}  
}  

class MultipleInheritance extends A1,B1{  
   public static void main(String args[]){  
	 MultipleInheritance obj=new MultipleInheritance();  
   obj.msg();    //Now which msg() method would be invoked?  
}  
} 


//you can extend(inherit) two class at a time