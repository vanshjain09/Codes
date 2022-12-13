public class singletonClass {
    // class which have only one instance 
    public static void main(String[] args) {
        
        singleton obj = singleton.objectBnado();
    }
}
class singleton{
     static singleton obj = new singleton();// step 1 creating that single object
    private singleton(){
        // step 2 doing the constructor private
    } 
    // step 3 returning the object
     public static singleton objectBnado(){
        return obj;
    }

}
