package Inheritance;
class Animal{  //parent, supeclass
void eat(){System.out.println("eating...");
}  
} 

class Dog extends Animal{    //child, subsclass
void bark(){System.out.println("barking...");
}  
}  

class SingleInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat(); 

//no sense of creating parent classs object
Animal a=new Animal();
a.eat();

//not allowed
//a.bark();
}
}  
