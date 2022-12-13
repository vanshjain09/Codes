// let we have river in col. [2,2] now tell posiible ways to reach at destination
import java.util.ArrayList;
public class mazewithobstacle {
    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }


public static void main(String[] args) {
    boolean maze[][] = {{true,true,true},{true,false,true},{true,true,true}};
    pathRestrictions("",maze,0, 0);
}
}

