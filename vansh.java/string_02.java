public class string_02 {
public static void main(String[] args) {

// in this 26 new strings are made
char c = 'a';
String s ="";
for(int i =0;i<26;i++){
    s=s+(char)(c+i)+" ";
}
System.out.println(s);

// using string builder to optimization
StringBuilder str = new StringBuilder();
for(int j =0;j<26;j++){
    str.append((char)('a'+j)+" ");
}System.out.println(str.toString());
}}
 