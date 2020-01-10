/**
 * Given a board with m by n cells, each cell has an initial state live(1) or dead(0).
 * Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the
 * following four rules:
 * any live cell with fewer than two live neighbors dies, as if caused by under-population
 * any live cell with two or three live neighbors lives on to the next generation
 * any live cell with more than three live neighbors fies, as if by over-population
 * any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction
 *
 * The next state is created by applying the above rules simultaneously to every cell in the current state
 *
 * e.g:
 * Input:
 * [
 *  [0,1,0],
 *  [0,0,1],
 *  [1,1,1],
 *  [0,0,0]
 * ]
 * Output:
 * [
 *  [0,0,0],
 *  [0,1,1],
 *  [0,1,1],
 *  [0,1,0]
 * ]
 * Tag: Array
 */
public class GameofLife {
    public void gmaeOfLife(int[][] board){
        int row = board.length;
        int col = board[0].length;

        //create a copy of the original board
        int[][] copyBoard = new int[row][col];

        for (int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                copyBoard[i][j] = board[i][j];

            }
        }
        //Iterate through board cell by cell
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                //count the number of live neighbors of each cell
                int liveNeighbors = 0;

                for(int i =0; i<3;i++){
                    for(int j =0;j<3;j++){

                    }
                }
            }
        }


    }
}
