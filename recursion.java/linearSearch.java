public class linearSearch {
    static int check(int a[],int index,int target){ // function1 for linear search
       if(a[index]==target) return index;
        return check(a, index+1, target);
        }
        static void check2(int a[],int index,int target){//function 2 for linear search
         if(a[index]==target) System.out.println(index);
         if(index==a.length-1) return;
         check2(a, index+1, target);}
     public static void main(String[] args) {
        int a[]={1,1,6,4,55,6};
        System.out.println(check(a, 0, 6));
        check2(a, 0, 6);
     }
}
