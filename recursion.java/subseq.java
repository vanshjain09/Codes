import java.util.ArrayList;

public class subseq {
    static ArrayList<String> powerSet(String pr, String unpr){
        if(unpr.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pr);
            return list;
        }
        char ch = unpr.charAt(0);
        ArrayList<String> left = powerSet(ch+pr, unpr.substring(1));
        ArrayList<String> right = powerSet(pr, unpr.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        System.out.println(powerSet("", "abc"));
    }
}
