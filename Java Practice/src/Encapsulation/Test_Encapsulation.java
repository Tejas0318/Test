package Encapsulation;
class Test_Encapsulation{  
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student_Encapsulation s=new Student_Encapsulation(); 
System.out.println(s.name1);  


//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName());  
}  
}  