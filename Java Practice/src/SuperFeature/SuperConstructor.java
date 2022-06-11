package SuperFeature;
class Animal5{
String s="shivani";	
Animal5(){System.out.println("animal is created");}  
}  
class Dog5 extends Animal5{
String s="sandhya";	

Dog5(){ 
super();
System.out.println("dog is created");  
}  
}  
class SuperConstructor{  
public static void main(String args[]){  
Dog5 d=new Dog5();  
}} 


//first- parent class constructor will be called
//second- child class constructor
