import java.util.ArrayList;
import java.util.List;
public class iterativeSubSeq {
public static List<List<Integer>> subset(int a[]){
    List<List<Integer>> outer = new ArrayList<>();
    outer.add( new ArrayList<>());
    for(int nums : a){
        int n = outer.size();
        for (int i = 0; i < n; i++) {
            List<Integer> internal = new ArrayList<>(outer.get(i));
            internal.add(nums);
            outer.add(internal);
        }
    }return outer;
}
public static void main(String[] args) {
int a[]={1,2,3};
System.out.println(subset(a));

}
}
