public class innerclasses {
     class A{
        String name;
         A(String name){
            this.name= name;
        }
        }

    public static void main(String[] args) {
         /*A is in non static class so methods of A is also non static so it does 
          not run static main
          */

      /*A a = new A("vansh"); 
        System.out.println(a.name);*/

        // if we make A class static it works b/c static in static works :)
    }
}
