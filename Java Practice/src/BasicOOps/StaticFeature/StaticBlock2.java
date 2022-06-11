package BasicOOps.StaticFeature;
class StaticBlock2{
   static int num;
   static String mystr;
   static{
      num = 97;
      mystr = "Static keyword in Java";
      System.out.println("static block Value of mystr: "+mystr);

   }
 
  public static void main(String args[])
{
    System.out.println("Value of num: "+num);
    System.out.println("Value of mystr: "+mystr);
 }
}

//static block then main
//non static var inside static block- not allowed




//var, method, nested class, block