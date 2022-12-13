import java.text.spi.DecimalFormatSymbolsProvider;

//there is diff. in error and exceptions
//exception are of two types
// CHECKED--> Compile time exception ex: file not present
// Unchecked --> Run time exception ex: division by 0
// class Exception is the base class for checked and unchecked exception

public class exceptions {
    public static void main(String[] args) {
        // this give exception System.out.println(5/0); 
        //to handle exception in a preety way we use try catch plot
        try {
            System.out.println(5/0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }// Exception is base class whom e object is reffered
        // method get message is called by e object

        // finally keyword -> block will always execute 
        finally {
            System.out.println("i run with exception or not with any exception");}

/*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// */ 

            try{
            divide(5,0);}
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
// throws == karta h
// throw == kar
    
    static void divide(int a,int b) throws ArithmeticException{ // handling by using functions
        if(b==0) throw new ArithmeticException("Dividing with 0 is not allowed");
        else System.out.println(a/b);
    }
}
