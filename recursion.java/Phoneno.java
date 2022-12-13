import java.util.ArrayList;
public class Phoneno {
static ArrayList<String> lettercombinations(String pr, String unpr){
    if(unpr.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
        list.add(pr);
        return list;
    }
    char ch = unpr.charAt(0);
    ArrayList<String> result = new ArrayList<>();
    for(int i = (Character.getNumericValue(ch)-1)*3;i<Character.getNumericValue(ch)*3;i++){
        char ch2 = (char)((char)94+i);
        result.addAll(lettercombinations(pr+ch2, unpr.substring(1)));
    }
    return result;
}
public static void main(String[] args) {
    System.out.println(lettercombinations("", "32"));
}
}
