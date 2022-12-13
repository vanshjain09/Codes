import java.util.ArrayList;

public class passingArrayList {
public static void main(String[] args) {
    ArrayList <Integer> list= new ArrayList<>();
    System.out.println(findoneinBinary("010101", list, 0));
    System.out.println(findoneinBinary2("101010", 0));
}
//returning Arraylist list with arguements
static ArrayList findoneinBinary(String s, ArrayList<Integer> list,int i){
    if(i==s.length()) return list;
    if(s.charAt(i)=='1') list.add(i);
    return findoneinBinary(s, list, i+1);
}
// returning Arraylist without arguements
static ArrayList<Integer> list2 = new ArrayList<>();
static ArrayList findoneinBinary2(String s,int i){
    if(i==s.length()) return list2;
    if(s.charAt(i)=='1') list2.add(i);
    return findoneinBinary2(s, i+1);
}
    
}