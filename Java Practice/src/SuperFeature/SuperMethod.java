package SuperFeature;
class Animal6{  
	int i=10;
void eat(){System.out.println("eating...");}  

} 


class Dog6 extends Animal6{  
 void eat() {
	 super.eat();
	 System.out.println(super.i);
	System.out.println("This is eat method");
}
} 


class SuperMethod{  
public static void main(String args[]){  
Dog6 d=new Dog6();  
d.eat();
} 
}

// super - If you want to access parent class method inside child class use super.method
//If you want to access parent class variable inside child class use super.variable name