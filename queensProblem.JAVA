import java.util.Scanner;

public class QueensProblem {
    private static int numOfQueens;
    public static int [][] board = new int [8][8];


    public QueensProblem(){
        numOfQueens = 0;


    }
    public int getNumOfQueens(){
        return numOfQueens;
    }


    static boolean search(int[][] board, int row, int col) {
        int i, j;


        //check north
        for (i = row; i >=0; i--){
            if (board[i][col]==1){
                return false;
            }
        }
        //check northeast
        for (i = row, j =col; i >=0 && j< board.length; i--, j++){
                if (board[i][j] == 1) {
                    return false;
                }

        }
        //check east
        for (i = col; i < board.length; i++){
            if (board[row][i]==1){
                return false;
            }
        }
        //check south
        for (i = row; i < board.length; i++){
            if (board[i][col]==1){
                return false;
            }
        }
        //check southeast
        for (i = row, j =col ; i< board.length && j< board.length; i++, j++){
                if (board[i][j]==1){
                    return false;
                }
        }
        //check southwest
        for (i = 0, j=col ; i<row && j>= board.length; i++ , j--) {
                if (board[i][j] == 1) {
                    return false;
                }
        }
        //check west
        for (i = col; i >= 0; i--){
            if (board[row][i]==1){
                return false;
            }
        }
        //check northwest
        for (i = col, j = row; i>=0 && j>=0; i--, j--) {
                if (board[j][i] == 1) {
                    return false;
                }
        }
        return true;

    }
    static boolean problemSolver (int [][]board, int col, int row){


        if (numOfQueens > 8){
            return true;
        }

        for(int i =row ; i< board.length-1; i++ ){
            for (int j =col; j< board.length-1; j++) {

                if (search(board, j, i)) {
                    board[i][j] = 1;
                    numOfQueens++;

                    if (problemSolver(board, col + 1, row)) {
                        return true;
                    }

                    board[i][j] = 0;
                    numOfQueens--;
                }
            }
        }

        return false;
    }

    static void printBoard(int board[][])
    {
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {


        problemSolver(board,5,0);

        printBoard(board);
    }
}
