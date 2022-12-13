public class backtrackMaze {
    static void maze(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
//allow to move in 4 directions
        if (!maze[r][c]) {
            return;
        }
        maze[r][c]=false;

        if (r < maze.length - 1) {
            maze(p + "dwn-", maze, r+1, c);
        }
        if (c < maze[0].length - 1) {
            maze(p + "Rgt-", maze, r, c+1);
        }
        if(r>0){
            maze(p+"up-",maze,r-1,c);
        }
        if(c>0){
            maze(p+"lft-",maze,r,c-1);
        }

        maze[r][c]=true;
    }
    public static void main(String[] args) {
        boolean maze[][] = {{true,true,true},{true,true,true},{true,true,true}};
        maze("",maze,0, 0);
    }
    }
    
    


