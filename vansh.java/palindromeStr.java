public class palindromeStr {
public static void main(String[] args) {
    
String str ="aabbaa";
int start = 0;
int end = str.length()-1;
int flag =1;
while(start<=end){
if(str.charAt(start)==str.charAt(end)){
    start+=1;
    end-=1;
}
else{ flag =0;
break;}
}
if (flag==0) System.out.println("not a palindrome");
else System.out.println("String is a palindrome");
}
}
