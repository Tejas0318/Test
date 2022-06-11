package Overriding;
//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
 class Vehicle{  
  //defining a method  
    void run(){System.out.println("Vehicle is running");}  
}  
//Creating a child class  
class OverridingExample1 extends Vehicle{  
  //defining the same method as in the parent class  
  void run(){System.out.println("Bike is running safely");}  
  
  public static void main(String args[]){  
	  OverridingExample1 obj = new OverridingExample1();//creating object  
  obj.run();//calling method  
  

  }  
}  