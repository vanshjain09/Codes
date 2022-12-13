import java.util.*;

import javax.lang.model.element.Element;
public class IsomorphicString {

    public static boolean isIsomorphic(String s , String t){
        int i=0;
        HashMap<Character,Character> map = new HashMap<>();
        while(i<s.length()){
            if(map.containsKey(s.charAt(i))){
                char c = map.get(s.charAt(i));
                if(c!=t.charAt(i)) return false;
            }
            else
            map.put(s.charAt(i), t.charAt(i));

            i++;
        }
        return true;
    }
public static void main(String[] args) {
    System.out.println(isIsomorphic("oop", "add"));
}
    
}