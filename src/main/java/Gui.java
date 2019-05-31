public interface Gui {

    void drawBoard();
    void drawMark(int i);
    void showPlayerTurn(int player);
    void aiMove();
    int askForX();
    int askForY();
    int askAboutVersion();
}
