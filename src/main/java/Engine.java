import java.util.Scanner;


public class Engine {

    private int player = 1;
    private Gui gameGui;
    int x = -1;
    int y = -1;
    private Board gameBoard;
    private int aiOn = 1;

    void initGame() {
        gameBoard = new Board();
        gameGui = new TextGui(gameBoard); // By changing it you will change the render
    }

    void startGame() {
        initGame();
        aiOn = gameGui.askAboutVersion();
        while (continueGame()) {
            gameGui.drawBoard();
            if(aiOn == 1 || player == 1) {
                gameGui.showPlayerTurn(player);
                getUserMove();
                // check user move and if it return wrong move (false) ask one more time
                while (!checkUserMove()) {
                    gameGui.wrongMove();
                    getUserMove();
                }
                gameBoard.setBoardElement(x, y, player);
            } else {
                gameGui.aiMove();
                Ai.getMove(gameBoard);
            }
            changeUser();
        }
        gameGui.endGame();
    }

    void getUserMove() {
        x = gameGui.askForX();
        y = gameGui.askForY();
    }

    Boolean checkUserMove(){
        return gameBoard.checkUserMove(x, y);
    }

    Boolean continueGame() {
        // gameBoard.checkWinner() => return true if there is a winner
        // ! changes true to false and false to true
        return gameBoard.checkIfThereIsNextMove() && !gameBoard.checkWinner();
    }

    void changeUser() {
        player = player == 1 ? 2 : 1;
    }


}
