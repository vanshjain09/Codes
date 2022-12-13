public class skipString {
static String pass(String s,String pass){
    if(s.isEmpty()) return "";
    char ch = s.charAt(0);
    if(s.startsWith(pass))
    return pass(s.substring(pass.length()),pass);

    return ch+pass(s.substring(1),pass);
}
public static void main(String[] args) {
    System.out.println(pass("vansappleh", "apple"));
}
}
