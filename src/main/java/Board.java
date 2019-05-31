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

}
