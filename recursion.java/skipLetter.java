public class skipLetter {
  public static String skipa(String empty, String s) {
     if(s.isEmpty()) return empty;
     char ch = s.charAt(0);
     if(ch=='a') return skipa(empty, s.substring(1));
     return skipa(empty+ch, s.substring(1));
  }
  //approach 2 with 1 arguement
  public static String skip(String s) {
    if(s.isEmpty()) return "";
    char ch = s.charAt(0);
    if(ch=='a') return skip(s.substring(1));
    return ch+skip( s.substring(1));
 }
  public static void main(String[] args) {
    System.out.println(skipa("", "vansh"));
    System.out.println(skip("vansh"));
  }
}
