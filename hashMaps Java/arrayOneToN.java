import java.util.Arrays;
import java.util.HashMap;
//suppose a ideal array contain 1 to n integers but find missing and duplicates in given array
public class arrayOneToN {
    //from hashmap approach using space O(N)
    public static void missingDuplicate(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            map.put(arr[i], 1);
        }
        for(int i=1;i<arr.length;i++){
            if(map.containsKey(i)==false) System.out.println("Missing element:"+i);
            else if(map.containsKey(i) && map.get(i)>1) System.out.println("Duplicate element :"+i);
        }
    }
    //Space O(1) using swap sort
    public static void missingDuplicate2(int arr[]){
        swapsort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=i+1){
                System.out.println("Missing :"+(i+1));
                System.out.println("Duplicate:"+arr[i]);
            }
        }
    }
    //put available elements at their right place and put left with missing ones
    public static void swapsort(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i]==arr[arr[i]-1]) i++;
            else
            swap(arr,i,arr[i]-1);
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,4,5,4,6,8};
        System.out.println("Approach 1 :");
        missingDuplicate(arr);
        System.out.println("Approach 2 :");
        missingDuplicate2(arr);
    }
    
    
}
