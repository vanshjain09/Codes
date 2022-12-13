/*solid rectangle
public class pattern1 {
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            for(int j=0;j<10;j++){
                System.out.print("*");
            }System.out.print("\n");
                i+=1;
        }
    }
}*/

//hollow rectangle
public class pattern1 {
    public static void main(String[] args) {
        int n=4,m=5;
    for(int i=0;i<n;i++){
        System.out.println();
        for(int j=0;j<m;j++){
            if (i==0||i==n-1||j==m-1||j==0)
            System.out.print("*");
            else
            System.out.print(" ");
        }}
}}


