package BasicOOps.StaticFeature;
class Static9{
  static int i = 100;
  static String s = "Beginnersbook";
  //Static method
 public  static void display()
  {
     System.out.println("i:"+i);
     System.out.println("i:"+s);
  }

  //non-static method
  void funcn()
  {
      //Static method called in non-static method
      display();
  }
}


  //static method
class Static5{
  public static void main(String args[])
  {
	  Static9 obj = new Static9();
	  //You need to have object to call this non-static method
	  obj.funcn();
	  
      //Static method called in another static method
      Static9.display();
   }
}


// It is allowed to call static method inside non static method
//It is also allowed to call non static method inside static method but using object of class

//inside the same class- you can directly call static method
//ouside class- you have to use class name to call static method