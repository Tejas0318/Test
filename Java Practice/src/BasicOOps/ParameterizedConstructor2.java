package BasicOOps;
public class ParameterizedConstructor2 {

   int empId;  
   String empName;  

   //parameterized constructor with two parameters
   ParameterizedConstructor2(int empId, String name){  
       this.empId = empId;  
       this.empName = name;  
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  
	   
   public static void main(String args[]){    

	   ParameterizedConstructor2 obj1 = new ParameterizedConstructor2(10245,"Chaitanya");  
	   ParameterizedConstructor2 obj2 = new ParameterizedConstructor2(92232,"Negan");  
	obj1.info();  
	obj2.info();  
   }  
}