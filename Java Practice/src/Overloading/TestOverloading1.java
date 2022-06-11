package Overloading;
class Adder{  
 int add(int a,int b){return a+b;}  
 int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
	Adder a=new Adder();
System.out.println(a.add(11,11));  
System.out.println(a.add(11,11,11));  
}} 

//number of parameters
//data type parameter
//sequence of parameters
//return type diff- method oerloading not possible


