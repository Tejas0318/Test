package ExceptionHandling;
public class ExceptionPgm8 {  
    //defining a method  
    public static int divideNum(int m, int n) throws ArithmeticException, ArrayIndexOutOfBoundsException {  
        int div = m / n;  
        return div;  
    }  
    //main method  
    public static void main(String[] args) {  
      try {
            System.out.println(divideNum(45, 0));  
        }  
        catch (ArithmeticException e){  
            System.out.println("\nNumber cannot be divided by 0");  
        } 
        catch (ArrayIndexOutOfBoundsException e){  
            System.out.println("\nArray index out of bound");  
        } 
          
        System.out.println("Rest of the code..");  
    }  
}  