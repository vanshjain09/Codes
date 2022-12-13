import java.util.Arrays;
public class rain_water_harvesting {
    public static int min(int a , int b){
        if(a<b) return a;
        return b;
    }
    public static int[] maxleft(int arr[]){
            int maxleft[]=new int[arr.length];
            maxleft[0]=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]<maxleft[i-1]) maxleft[i]=maxleft[i-1];
                else maxleft[i]=arr[i];
            }
            return maxleft;
    }
    public static int[] maxright(int arr[]){
        int maxright[]=new int[arr.length];
        maxright[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<maxright[i+1]) maxright[i]=maxright[i+1];
            else maxright[i]=arr[i];
        }
        return maxright;
    }
    public static int unitofwater(int arr[]){
        int maxleft[]=maxleft(arr);
        int maxright[]=maxright(arr);
        int water[]=new int[arr.length];
        int unitwater=0;
        for(int i=0;i<arr.length;i++){
            water[i]=min(maxleft[i], maxright[i])-arr[i];
            unitwater+=water[i];
        }
        return unitwater;
    }
    public static void main(String[] args) {
        int arr[]={3,0,0,2,0,4};
        System.out.println(unitofwater(arr));
    }
}
