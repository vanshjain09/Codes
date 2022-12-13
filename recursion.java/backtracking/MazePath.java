import java.util.ArrayList;

public class MazePath {
    
public static int countWays(int i, int j){
    if(i==1 || j==1){
        return 1;
    }
    int count=0;
    count+=countWays(i-1, j);
    count+=countWays(i, j-1);
    return count;
}
public static ArrayList<String> countWaysStr(int i, int j,String pr){
    if(i==1 && j==1){
        ArrayList<String> list = new ArrayList<>();
        list.add(pr);
        return list;
    }
    ArrayList<String> result = new ArrayList<>();
    if(i>1)
        result.addAll(countWaysStr(i-1, j,pr+'d'));
    if(j>1)
        result.addAll(countWaysStr(i, j-1,pr+'r'));


    return result ;
}
public static void main(String[] args) {
    System.out.println(countWays(3, 3));
    System.out.println(countWaysStr(3, 3, ""));
}
}
