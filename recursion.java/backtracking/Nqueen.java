public class Nqueen {

public static int queen(boolean board[][],int r , int c){
if(r>board.length-1){
    display(board);
    return 1;
}
if(board[r][c]==false)
    queen(board, r, c+1);
if(c>board[0].length-1)
    queen(board, r+1, c);
}
private static void display(boolean[][] board) {
    for(boolean []arr : board){
        for(boolean element : arr){
            if(element==true)
            System.out.print("Q");
            else System.out.print("X");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    
}
}
