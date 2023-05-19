public class Rival {
    private int[][] grid;

    public Rival() {
        this.grid = new int[10][10];
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void setGrid() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                    this.grid[i][j] = 0;
            }
        }
    }

    public void printGrid() {
        System.out.println("-0123456789");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public void setShip(int size, int x, int y, String orientation) {
        if (orientation.equals("horizontal")) {
            for (int i = 0; i < size; i++) {
                grid[x][y+i] = 1;
            }
        }else if (orientation.equals("vertical")){
            for (int i = 0; i < size; i++) {
                grid[x+i][y] = 1;
            }
        }else{
            System.out.println("Invalid orientation");
        }
    }

    public void setShip(int x, int y) {
        grid[x][y] = 1;
    }
} // end class Rival
