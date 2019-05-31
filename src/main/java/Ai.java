import java.util.Random;

public class Ai {

    public static void getMove(Board gameBoard) {
        int x = -1;
        int y = -1;
        Random generator = new Random();
        while (!gameBoard.checkUserMove(x, y)) {
            x = generator.nextInt(2);
            y = generator.nextInt(2);
        }
        gameBoard.setBoardElement(x, y, 2);
    }

}
