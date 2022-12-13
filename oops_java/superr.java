class car{
    String brand ;
    int wheel = 4;
    public car(String brand){
        this.brand = brand;
        
    }
}
class ElectricCAr extends car{
    int battery;
    int wheel = 5;
    ElectricCAr(String brand,int battery){
        super(brand);
        this.battery = battery;
    }
}
public class superr {
   // ElectricCAr e1 = new car("TESLA");
/*this is giving error b/c battery is compulsary for ElectricCAr 
 objects but constructor of parent class does't know what is 
 parameters of child class
 */
public  static void main(String[] args) {
   
   // System.out.println(super.wheel);
    // both class parent and child have variable wheels and if i want to access parent keyword
    
}
    
}