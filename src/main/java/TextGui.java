import java.util.Scanner;


public class TextGui implements Gui {

    private Board gameBoard;
    private Scanner scan = new Scanner(System.in);

    public TextGui(Board gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void drawBoard() {

        for (int index = 0; index < gameBoard.getBoard().length; index++) {
            for (int index2 = 0; index2 < gameBoard.getBoard()[index].length; index2++) {
                drawMark(gameBoard.getBoard()[index][index2]);
            }
            System.out.println(" ");
        }
    }

    public void drawMark(int i) {
        switch (i) {
            case 1:
                System.out.print(" X ");
                break;
            case 2:
                System.out.print(" 0 ");
                break;
            default:
                System.out.print(" _ ");
                break;
        }
    }

    public void showPlayerTurn(int player) {
        System.out.println("Tura gracza: " + player);
    }

    public int askForX() {
        System.out.println("Podaj wartość X:");
        return Integer.parseInt(scan.nextLine());
    }

    public int askForY() {
        System.out.println("Podaj wartość Y:");
        return Integer.parseInt(scan.nextLine());
    }

    public int askAboutVersion() {
        System.out.println("W jaką wersje gry chcesz zagrać: ");
        System.out.println("1) Gracz vs Gracz");
        System.out.println("2) Gracz vs Komputer");
        return Integer.parseInt(scan.nextLine());
    }

    public void aiMove() {
        System.out.println("Ruch komputera");
    }
    public void wrongMove() {
        System.out.println("Podane pole jest nie prawidłowe");
    }

    public void endGame() {
        System.out.println("Koniec gry. Dziękuje :)");
    }



}
