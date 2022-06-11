package ExceptionHandling;
import java.io.*;  
class M1{  
 void method() throws IOException{  
	  throw new IOException("device error");  
 }  
}  
class ExceptionPgm6{  
   public static void main(String args[]){//declare exception  
     M1 m=new M1();  
     try {
		m.method();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
  
    System.out.println("normal flow...");  
  }  
}  