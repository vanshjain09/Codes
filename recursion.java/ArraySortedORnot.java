public class ArraySortedORnot {
static boolean check(int a[],int index){
   if(index==a.length-1){
    return true;
   }
   return a[index]<a[index+1] && check(a, index+1);
}
public static void main(String[] args) {
int a[]={1,1,1,4,55,6};
System.out.println(check(a, 0));

}
}
