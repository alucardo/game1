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
        System.out.println("Start gry");
        aiOn = gameGui.askAboutVersion();
        while (continueGame()) {
            gameGui.drawBoard();
            if(aiOn == 1 || player == 1) {
                gameGui.showPlayerTurn(player);
                getUserMove();
                // check user move and if it return wrong move (false) ask one more time
                while (!checkUserMove()) {
                    System.out.println("Podane pole jest nie prawidłowe");
                    getUserMove();
                }
                gameBoard.setBoardElement(x, y, player);
            } else {
                gameGui.aiMove();
                Ai.getMove(gameBoard);
            }
            changeUser();
        }
        System.out.println("Koniec gry");
    }

    void getUserMove() {
        x = gameGui.askForX();
        y = gameGui.askForY();
    }

    Boolean checkUserMove(){
        return gameBoard.checkUserMove(x, y);
    }

    Boolean continueGame() {
        return gameBoard.checkIfThereIsNextMove();
    }

    void changeUser() {
        player = player == 1 ? 2 : 1;
    }


}
