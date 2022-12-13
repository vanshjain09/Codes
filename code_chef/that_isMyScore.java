import java.util.*;
public class that_isMyScore {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int m=0;m<t;m++){
    int n=0;
    int score=0;
    n=sc.nextInt();
    int score_array[][]={{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0},{10,0},{11,0}};
    int submission[][]=new int[n][2];
    for (int i = 0; i < n; i++) {
        for(int j=0;j<2;j++){
            submission[i][j]=sc.nextInt();
        }}
    for (int i = 0; i < n; i++) {
        if(submission[i][1]>score_array[submission[i][0]-1][1])
            score_array[submission[i][0]-1][1]=submission[i][1];
                }
    for(int x=0;x<=7;x++){
        score+=score_array[x][1];
    }System.out.println(score);
}
}
}
