interface Engine{
    static final int price = 100000;
abstract void start();
void accelerate();
void stop();
}
interface Brake{
void start();
void brake();
void stop();
}//if we have functions with same name in differnt interfaces we use different class to implements it
class Enginne implements Engine{
@Override
    public void start() {
        System.out.println("Engine Started");
        
    }
@Override
    public void accelerate() {
        System.out.println("Engine Accelerate");
        
    }
@Override
    public void stop() {
        System.out.println("Engine Stops");
        
    }}
class Break implements Brake{
@Override
    public void start() {
        System.out.println("BREAK started");
        }
@Override
    public void brake() {
        System.out.println("BREAK done");
        
    }
@Override
    public void stop() {
        System.out.println("BREAK stop");
        
    }

}


public class seperate_class_interface {
public static void main(String[] args) {
    Break b1 = new Break();
    b1.start();
    Enginne e1 = new Enginne();
    e1.start(); // different function of start for engine and break
}
}
