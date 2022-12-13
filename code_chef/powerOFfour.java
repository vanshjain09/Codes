//https://leetcode.com/problems/power-of-four/
import java.util.*;
public class powerOFfour {
static boolean powerOffour(int n , int start){
    if(n==Math.pow(4,start)) return true;
    if(n<Math.pow(4,start)) return false;
    return powerOffour(n, start+1);
}


public static void main(String[] args) {
System.out.println(powerOffour(16, 1));

    
}}