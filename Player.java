public class Player {
    private char[][] board;
    
    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    private Rival rival;
    
    public Rival getRival() {
        return rival;
    }

    public void setRival(Rival rival) {
        this.rival = rival;
    }

    public Player() {
        board = new char[10][10];
        rival = new Rival();
        clearBoard();
        printBoard();
    }

    public void clearBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                    board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-0123456789");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                    System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void predict(int x, int y) {
        if (rival.getGrid()[x][y] == 1) {
            board[x][y] = 'X';
        }else{
            board[x][y] = 'A';
        }
    }


}
