
import java.util.Arrays;
import java.util.Scanner;
public class arrays {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// datatype[] arry_name=new datatype[size]
// new keyword allocates and make objects in heap memory
// memory allocation is at run time
// initialisation is done at compile time
// in java there is may not be contiguos allocation
// b/c of jvm
//by default there is 0 in integer array and null in string aray
/*if each element of array is located in some other 
memory it,s referece is stored in array and if there is 
no value of element it is null */

// alternate of array element iterable(also called for each loop)
int[] num = {1,2,3,4,5};
for(int a:num){
    System.out.print(a+" ");}
// one  method to print array without for loop
System.out.println(Arrays.toString(num));

// number of coloumns is not mandatory in 2d array declaration
// simple method of declararion
//String alpla[][] ={{"a","b","c"},{"apple","ball","cat"}};
// multidimension array is the collection of 1d array
// that size of 1d array is whatrever may not be same of all
//input of 2d array of varying col. use arr[row].length
int arr[][]=new int[3][3];
for(int row=0;row<arr.length;row++){
    for(int col=0;col<arr[0].length;col++){
        arr[row][col] = sc.nextInt();
    }}
// single loop method to print 2d array
for(int i=0;i<3;i++){
    System.out.println(Arrays.toString(arr[i]));
}
// Enhanced for loop to print 2d array
for(int[] a:arr){
    System.out.println(Arrays.toString(a));
}




}
}
