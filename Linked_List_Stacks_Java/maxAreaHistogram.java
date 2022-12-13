import java.util.Arrays;
import java.util.Stack;

class Pair {
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class maxAreaHistogram {
    public static int[] nsl(int arr[]){
        int nsl[] = new int[arr.length];
        Stack<Pair> stk = new Stack<>();
        for(int i=0;i<arr.length;i++){
        if(stk.isEmpty()) nsl[i]=-1;
        else if(stk.size()>0 && arr[i]>stk.peek().key) nsl[i]=stk.peek().value;
        else if(stk.size()>0 && arr[i]<stk.peek().key){
            while(stk.size()>0 && arr[i]<stk.peek().key){
                stk.pop();
            }
            if(stk.isEmpty()) nsl[i]=-1;
            else nsl[i]=stk.peek().value;
        }
        stk.push(new Pair(arr[i], i));
        }
        return nsl;
    }
    public static int[] nsr(int arr[]){
        int nsr[] = new int[arr.length];
        Stack<Pair> stk = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(stk.isEmpty()) nsr[i]=arr.length;
            else if(stk.size()>0 && arr[i]>stk.peek().key) nsr[i]=stk.peek().value;
            else if(stk.size()>0 && arr[i]<stk.peek().key){
                while(stk.size()>0 && arr[i]<stk.peek().key){
                    stk.pop();
                }
                if(stk.isEmpty()) nsr[i]=arr.length;
                else nsr[i]=stk.peek().value;
            }
            stk.push(new Pair(arr[i], i));
        }
        return nsr;
    }
    public static int maxArea(int arr[]){
        int max=0;
       int width[]=new int[arr.length];
       int nsl[]=nsl(arr);
       int nsr[]=nsr(arr);
       for(int i=0;i<arr.length;i++){
        width[i]=nsr[i]-nsl[i]-1;
        width[i]=width[i]*arr[i];
        if(width[i]>max) max=width[i];
       }
       return max;
}
    public static void main(String[] args) {
        int arr[] = {6,2,5,4,5,1,6};
        System.out.println(maxArea(arr));
    }
}
