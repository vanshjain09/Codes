/*A class can implements Multiple Interface
  interface have static final keyword
  have abstract functions
*/
interface Engine{
    static final int price = 100000;
abstract void start();
void stop();
void accelerate();
}
interface Brake{
void brake();

}
class Tesla implements Engine,Brake{  //A class 

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
        
    }

    @Override
    public void start() {
        System.out.println("I Start like a normal car");
        
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
        
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");
        
    }

}
public class interfacce {
public static void main(String[] args) {
    
Tesla model1 = new Tesla();


}
}
