public enum Direction{left, right, up, down}
public enum Color{White, Black}
public class Game{
    private Player[] players;
    private static Game instance;
    private Board board;
    private final int ROWS = 10;
    private final int COLUMNS = 10;
    private Game(){}
    public static Game getInstance(){}
    public Board getBoard(){}
}

public class Board{
    private int blackCount = 0;
    private int whiteCount = 0;
    private Piece[][] board;
    public Board(int rows, int columns){}
    public void initialize(){}
    public boolean placeColor(int row, int column, Color color){}
    public int flipSection(int row, int column, Color color, Direction d){}
    public int getScoreForColor(Color c){}
    public void updateScore(Color newColor, int newPieces){}
}

public class Piece{

}

public class Player{
    
}
