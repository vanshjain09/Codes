import java.util.Scanner;

class DivisionWithOneException extends Exception{
    DivisionWithOneException(String message){
        super(message);
    }
}

public class custom_exception_02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter Two no. to divide :");
     int a = sc.nextInt();
     int b = sc.nextInt();
     try{
        System.out.println(a/b);
        if (b==1) throw new DivisionWithOneException("Division with 1 is not allowed");
     }
     catch(DivisionWithOneException e){
        System.out.println(e.getMessage());
     }
    }
   
    
}
