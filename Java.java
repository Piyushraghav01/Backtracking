// Rat In A Maze Code
/*
 
public class Solution {
	

	public static boolean ratInAMaze(int maze[][]){
		int n = maze.length;
		int path[][] = new int[n][n];
		return solveMaze(maze, 0, 0, path);
	}

	public static boolean solveMaze(int maze[][], int i, int j, int path[][]){
		int n = maze.length;
		// Check if i,j cell is valid or not
		if(i  < 0 || i >= n || j < 0 || j >= n  || maze[i][j] == 0 
			|| 	path[i][j] == 1){
			return false;
		}
		// Include the cell in current path
		path[i][j] = 1;
		// Destination cell
		if(i == n - 1 && j == n - 1){	
			path[i][j] = 0;		
			return true;
		}
		
		// Explore further in all directions
		boolean pathPossible = false;	
		// top
		if(solveMaze(maze, i - 1, j, path)){
			pathPossible = true;
		}
		// right 
		else if(solveMaze(maze, i, j + 1, path)){
			pathPossible = true;
		}
		// Down
		else if(solveMaze(maze, i + 1 , j, path)){
			pathPossible = true;
		}
		// Left
		else if(solveMaze(maze, i, j - 1, path)){
			pathPossible = true;
		}		
		return pathPossible;
	}

}
 */

 // All Possible paths code
 /*
  public class Solution{   
    
    
    static void printsolution(int[][] solution, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(solution[i][j] + " ");
            }
        }
    }
    static void solveMaze(int maze[][], int solution[][], int x, int y, int n)
    {
        if (x == n - 1 && y == n - 1)
        {
            solution[x][y] = 1;
            printsolution(solution, n);
            System.out.println();
            return;
        }
        if (x > n - 1 || x < 0 || y > n - 1 || y < 0)
        {
            return;
        }
        if (x > n - 1 || x < 0 || y > n - 1 || y < 0 || maze[x][y] == 0 || solution[x][y] == 1)
        {
            return;
        }
        solution[x][y] = 1;
        solveMaze(maze, solution, x - 1, y, n);
        solveMaze(maze, solution, x + 1, y, n);
        solveMaze(maze, solution, x, y - 1, n);
        solveMaze(maze, solution, x, y + 1, n);
        solution[x][y] = 0;
    }
    
    static void ratInAMaze(int maze[][], int n)
    {
        int[][] solution = new int[20][20];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                solution[i][j] = 0;
            }
        }
        solveMaze(maze, solution, 0, 0, n);
    }

}
  */

  