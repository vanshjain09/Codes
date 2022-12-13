import java.lang.Math;
public class exersice_1 {
public static void power(int x,int y){
System.out.println(Math.pow(x, y));
}
public static void greatestCommonFactor(int x , int y ){
    int gcf=0;
    for(int i=1;i<x && i<y;i++){
    if (x%i==0 && y%i==0)
    gcf=i;
    }System.out.println(gcf);
}
public static void main(String[] args) {
    power(8, 2);
    greatestCommonFactor(6, 8);
}
}