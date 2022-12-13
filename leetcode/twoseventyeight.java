import java.util.Scanner;

public class twoseventyeight {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter length of char array : ");
int n = sc.nextInt();
String arr[]= new String[n];
System.out.println("Enter elements for char array: ");
for(int i =0;i<n;i++){
    arr[i] = sc.next();
}
int start=0;
int end = n-1;
int middle = (start+end)/2;
while(start<=end){
    if(start==end) System.out.println("first bad element is : "+middle);
    if(arr[middle]=="g") start=middle+1;
    else end = middle-1;
}
}
    
}
