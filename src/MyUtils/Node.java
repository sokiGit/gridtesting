package MyUtils;

public class Node {
    private final int x, y;
    private boolean walkable;
    private char symbol;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Node(int x, int y, boolean walkable) {
        this.x = x;
        this.y = y;
        this.walkable = walkable;
    }

    public Node(int x, int y, char symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    public Node(int x, int y, boolean walkable, char symbol) {
        this.x = x;
        this.y = y;
        this.walkable = walkable;
        this.symbol = symbol;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public boolean isWalkable() { return walkable; }
    public void setWalkable(boolean walkable) { this.walkable = walkable; }
    public char getSymbol() { return this.symbol; }
}