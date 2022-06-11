package FinalFeature;
class BlankFinalVariableExample{  
   //Blank final variable
   final int MAX_VALUE;
	 
   BlankFinalVariableExample(){
      //It must be initialized in constructor
      MAX_VALUE=100;
   }
   void myMethod(){  
      System.out.println(MAX_VALUE);
   }  
   public static void main(String args[]){  
	   BlankFinalVariableExample obj=new  BlankFinalVariableExample();  
      obj.myMethod();  
   }  
}


//variable, method, class

//variable- can't change value
//class- can't inherit class
//method- can't override that method