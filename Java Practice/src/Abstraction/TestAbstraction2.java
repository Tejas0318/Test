package Abstraction;
//Example of an abstract class that has abstract and non-abstract methods  
  abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
    abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike{  
	 Honda(){
		   System.out.println("Honda is created");

	 }
 void run(){System.out.println("running safely..");}  
 }  
//Creating a Test class which calls abstract and non-abstract methods  
 class TestAbstraction2{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear(); 
  
 }  
}  
 
 
 //abstract class can have both concrete and abstract methods
 //you can have constructor inside abstract class
 //variables: It's not necessay that variable will be public static final'