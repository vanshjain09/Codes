class Morning{
    static void greet(){
        System.out.println("Good morning !");
    }
}
class EarlyMorning extends Morning{
    
     static void greet(){
        System.out.println("Early Good morning !");
    }
}


public class static_overriding {
    // Overriding not done on static methods b/c 
    //it static methods are always firstly called
    public static void main(String[] args) {
        Morning obj = new EarlyMorning();
        obj.greet();                
        Morning obj2 = new Morning();
        obj2.greet();//both are giving same results b/c no overriding done
        
    }
}
