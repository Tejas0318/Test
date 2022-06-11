package ExceptionHandling;
import java.io.IOException;  
class M3{  
 void method() throws ArithmeticException{ 
 }  
}  
class ExceptionPgm7{  
   public static void main(String args[]){//declare exception  
	 
		     M3 m=new M3();  
		     m.method();  
		        
		   
  
    System.out.println("normal flow...");  
  }  
}  



//compile time- throw
//run time- throws
