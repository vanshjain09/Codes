import java.util.ArrayList;
public class permutation {
    public static ArrayList<String> permu(String pr , String Unpr){
        String first="",second="";
        if(Unpr.isEmpty()){
            ArrayList <String> list= new ArrayList<>();
            list.add(pr);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        char ch = Unpr.charAt(0);
        for(int i = 0 ;i<=pr.length();i++){
            first = pr.substring(0,i);
            second = pr.substring(i);
            result.addAll(permu(first+ch+second, Unpr.substring(1)));
        }
        return result;
    }
    public static void main(String[] args) {
       System.out.println(permu("", "abc"));
    }
}
