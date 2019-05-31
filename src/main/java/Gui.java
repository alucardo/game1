public interface Gui {

    void drawBoard();
    void drawMark(int i);
    void showPlayerTurn(int player);
    void aiMove();
    void wrongMove();
    void endGame();
    int askForX();
    int askForY();
    int askAboutVersion();
}
