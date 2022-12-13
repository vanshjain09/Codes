import java.util.ArrayList;

public class diceCombo {
public static ArrayList<String> dice(String pr,int target){
    if(target==0){
        ArrayList <String> list= new ArrayList<>();
        list.add(pr);
        return list;
    }
    ArrayList<String> ans = new ArrayList<>();
    for(int i=1;i<=6 && i<=target;i++){
        ans.addAll(dice(pr+i, target-i));
    }
    return ans;
}
public static void main(String[] args) {
    System.out.println(dice("", 4));
}
}
