import java.util.*;

public class hashmap_1 {
public static void main(String[] args) {
      HashMap<String,Integer> map = new HashMap<>();
      //insertion in hash maps
      map.put("CNG", 70);
      map.put("DIESEL", 80);
      map.put("PETROL", 90);
      System.out.println(map);
      //iterating in hashmaps
      Set<String> keys = map.keySet();
      for(String key:keys){
        System.out.println(key+" "+map.get(key));
      }
      //removing pair in hashmaps
      map.remove("CNG");

      //making element to itereate
      for(Map.Entry<String,Integer> element : map.entrySet()){
        System.out.println(element.getKey()+" "+element.getValue());
         
      }
}
    
}