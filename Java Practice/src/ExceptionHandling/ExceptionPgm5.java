package ExceptionHandling;
import java.io.*; 



//Handle checked exception using trow keyword
class M{  
 void method() throws IOException {  
  throw new IOException("device error");  
 }  
} 

public class ExceptionPgm5{  
   public static void main(String args[]){  
    
     M m=new M();  
     try {
		m.method();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
       
  
    System.out.println("normal flow...");  
  }  
}  