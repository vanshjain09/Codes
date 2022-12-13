import java.util.Scanner;

class nameException extends Exception{

    nameException(String message){
        super(message);
    }
}

public class customExceptions {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
    String s = sc . next();
    if(s.equals("vansh")){
        throw new nameException("This name is already taken");
    }
    }catch(nameException e){
        System.out.println(e.getMessage());
    }
}}
