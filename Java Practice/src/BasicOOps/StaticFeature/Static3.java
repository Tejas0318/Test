package BasicOOps.StaticFeature;
class Static3{
  static int var1=12;   //static variable
   String var2="shivani";  //instance variable
  
  //This is a Static Method
   static void disp(){
      System.out.println("Var1 is: "+var1);



  }
   
   void disp1() {   //non-static method
	      System.out.println("Var1 is: "+var1);
	      System.out.println("Var2 is: "+var2);

	   
   }
  public static void main(String args[]) 
  {
	  disp();
	
	  
  }
}



//  var static, method static- allowed
//var non static, method static- not allowed
//var static, var non static and method non static- allowed


//static var- value will be shared and it wont depends on object
//non static- values  will be stored at diff memory location and managed at object level

//It is allowed to call static method inside non static method
//It is not allowed to call non static method inside static method directly but using object of class you call non static method inside static classs

//inside the same class- you can directly call static method
//ouside class- you have to use class name to call static method

//you can call non static method inside static nested class
//static var, static nested class-allowed
//non static var, static nested class- not allowed
