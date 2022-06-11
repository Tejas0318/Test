package FinalFeature;
class FinalvariableExample{  

   final int MAX_VALUE=99;
   void myMethod(){  
      MAX_VALUE=101;
   }  
   public static void main(String args[]){  
	   FinalvariableExample obj=new  FinalvariableExample();  
      obj.myMethod();  
   }  
}