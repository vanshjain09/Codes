import java.util.ArrayList;

public class mazeWithDiagonal {
    
    public static ArrayList<String> Mazewiththreepaths(int i, int j,String pr){
        if(i==1 && j==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(pr);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        if(i>1 && j>1)
            result.addAll(Mazewiththreepaths(i-1, j-1,pr+'D'));
        if(i>1)
        result.addAll(Mazewiththreepaths(i-1, j,pr+'V'));
        if(j>1)
        result.addAll(Mazewiththreepaths(i, j-1,pr+'H'));
        
        return result ;
    }
    public static void main(String[] args) {
    
        System.out.println(Mazewiththreepaths(3, 3, ""));
    }
    }

