package ThisFeature;
class This1{  
int rollno;  
String name;  
float fee;  
This1(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  

class TestThis1{  
public static void main(String args[]){  
	This1 s1=new This1(111,"ankit",5000f);  
	This1 s2=new This1(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  


//variables
//methods
//nested class