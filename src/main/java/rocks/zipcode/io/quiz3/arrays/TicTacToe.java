package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String [][] board;


    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
       List<String[]> getArray = new ArrayList<>(Arrays.asList(board));
        getArray.addAll(Arrays.asList(board));
        return getArray.toArray(new String[0]);
    }

    public String[] getColumn(Integer value) {
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        for(int i = 0; i < board.length; i++){
            if (!board[rowIndex][i].equals(board[rowIndex][i])){
                return false;
            }
        }

            return true;
    }


    public Boolean isColumnHomogeneous(Integer columnIndex) {
        for(int i = 0; i < board.length; i++){
            if (!board[i][columnIndex].equals(board[i][columnIndex])){
                return false;
            }
        }
        return true;
    }

    public String getWinner() { return null;}

    public String[][] getBoard() {
        return null;
    }
}
