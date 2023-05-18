import java.util.Scanner;

public class Game {

    public boolean endGameVerification(Player player, Rival rival) {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10 ; y++) {
                if ((player.getBoard()[x][y] == '-')||(rival.getGrid()[x][y] == 1)) {return false;}
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game game = new Game();
        Player player = new Player();
        Rival rival = new Rival();
        rival.setShip(4, 4);
        rival.setShip(2, 2, 3, "horizontal");	
        rival.setShip(3, 6, 6, "vertical");
        player.setRival(rival);
        int cont = 0;
        while (!game.endGameVerification(player, rival)) {
            System.out.println("Enter the coordinates of the shot:");
            int x = input.nextInt();
            int y = input.nextInt();
            player.predict(x, y);
            player.printBoard();
            cont++;
        }
        System.out.println("You won in " + cont + " shots");
    }
}
