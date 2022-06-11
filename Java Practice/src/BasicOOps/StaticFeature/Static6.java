package BasicOOps.StaticFeature;
class Static6{
   private static String str = "BeginnersBook";

   //Static class
   static class MyNestedClass{
	//non-static method
	public void disp() {

	   /* If you make the str variable of outer class
	    * non-static then you will get compilation error
	    * because: a nested static class cannot access non-
	    * static variable of the outer class.
	    */
	   System.out.println(str); 
	}
	
	public static void disp1() {


		}

   }
   public static void main(String args[])
   {
       /* To create instance of nested class we didn't need the outer
	* class instance but for a regular nested class you would need 
	* to create an instance of outer class first
        */
	   Static6.MyNestedClass obj = new Static6.MyNestedClass();
	obj.disp();
	
	
	Static6.MyNestedClass.disp1();
	
   }
}


// you can call non static method inside static nested class
//static var, static nested class-alllowed
//non static var, sttaic nested class- not allowed

