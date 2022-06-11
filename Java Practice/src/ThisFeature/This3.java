package ThisFeature;
class A{  
A(){System.out.println("hello a");} 

A(int x){  
	this();
System.out.println(x);  

}  
}  
class This3{  
public static void main(String args[]){  
A a=new A(10);  
}} 

// this or super- should be the first statement while calling constructors