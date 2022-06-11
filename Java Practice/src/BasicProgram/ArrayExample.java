package BasicProgram;
// Java program to illustrate creating an array
// of integers,  puts some values in the array,
// and prints each value to standard output.
  
class ArrayExample 
{
    public static void main (String[] args) 
    {         
          
      // allocating memory for 5 integers.
     int[] arr = new int[5];   //0-4   {10,20,30,40,50}
      
      //int[] arr=new int[5]
     // int[] arr= {10, 20, 30, 40, 50}
          
      // initialize the first elements of the array
      arr[0] = 10;
          
      // initialize the second elements of the array
      arr[1] = 20;
          
      //so on...
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50;
      
      
   
          
      // accessing the elements of the specified array
 
      for (int i = 0; i < arr.length; i++)
         System.out.println("Element at index " + i + 
                                      " : "+ arr[i]);   
      
      
      
      
            
    }
    
    
   
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
  
}