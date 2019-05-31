public class Board {

    private int[][] ticTacToeBoard = new int[3][3];

    public int[][] getBoard() {
        return ticTacToeBoard;
    }

    void setBoardElement(int x, int y, int player) {
        ticTacToeBoard[x][y] = player;
    }


    public Boolean checkUserMove(int x, int y) {
        if(x >= 0 && x < 3 && y >= 0 && y < 3) {
            return ticTacToeBoard[x][y] == 0;
        } else {
            return false;
        }
    }


    boolean checkIfThereIsNextMove(){
        boolean isThereMove = false;
        for (int index = 0; index < ticTacToeBoard.length; index++) {
            for (int index2 = 0; index2 < ticTacToeBoard[index].length; index2++) {
                if(ticTacToeBoard[index][index2] == 0) {
                    isThereMove = true;
                }
            }
        }
        return isThereMove;
    }


    boolean checkWinner() {

        return checkVerticalLine() || checkHorizontalLine() || checkCrosLine();
    }

    boolean checkHorizontalLine() {
        boolean result = false;
        result = result || ( ticTacToeBoard[0][0] == ticTacToeBoard[0][1] && ticTacToeBoard[0][0] == ticTacToeBoard[0][2] && ticTacToeBoard[0][0] != 0);
        result = result || ( ticTacToeBoard[1][0] == ticTacToeBoard[1][1] && ticTacToeBoard[1][0] == ticTacToeBoard[1][2] && ticTacToeBoard[1][0] != 0);
        result = result || ( ticTacToeBoard[2][0] == ticTacToeBoard[2][1] && ticTacToeBoard[2][0] == ticTacToeBoard[0][2] && ticTacToeBoard[2][0] != 0);
        return result;
    }

    boolean checkVerticalLine() {
        boolean result = false;
        result = result || ( ticTacToeBoard[0][0] == ticTacToeBoard[1][0] && ticTacToeBoard[0][0] == ticTacToeBoard[2][0] && ticTacToeBoard[0][0] != 0);
        result = result || ( ticTacToeBoard[0][1] == ticTacToeBoard[1][1] && ticTacToeBoard[0][1] == ticTacToeBoard[2][1] && ticTacToeBoard[0][1] != 0);
        result = result || ( ticTacToeBoard[0][2] == ticTacToeBoard[1][2] && ticTacToeBoard[0][2] == ticTacToeBoard[2][2] && ticTacToeBoard[0][2] != 0);
        return result;
    }

    boolean checkCrosLine() {
        boolean result = false;
        result = result || ( ticTacToeBoard[0][0] == ticTacToeBoard[1][1] && ticTacToeBoard[0][0] == ticTacToeBoard[2][2] && ticTacToeBoard[0][0] != 0);
        result = result || ( ticTacToeBoard[0][2] == ticTacToeBoard[1][1] && ticTacToeBoard[0][2] == ticTacToeBoard[2][0] && ticTacToeBoard[0][2] != 0);
        return result;
    }

}
