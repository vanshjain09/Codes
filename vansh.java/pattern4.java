//inverted half pyramid
public class pattern4 {
public static void main(String[] args) {
    int n=5;
    for (int i = 0; i < n; i++) {
        System.out.println();
        for(int j=0;j<i;j++){
            System.out.print(" ");
            for(int k=0;k<j;k++){
                System.out.print("*");
            }
        }
    }
}
}
