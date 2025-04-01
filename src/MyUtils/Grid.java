package MyUtils;

public class Grid {
    private final int width, height;

    Node[][] body;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;

        this.body = new Node[width][height];
    }

    public void setNode(Node node) {
        this.body[node.getX()][node.getY()] = node;
    }

    public Node getNode(int x, int y) {
        return this.body[x][y];
    }

    public int getWidth() { return this.width; }
    public int getHeight() { return this.height; }

    public char[][] getRenderBuffer() {
        char[][] renderBuffer = new char[this.width][this.height];

        for (int x = 0; x < this.width; x++) {
            for (int y = 0; y < this.height; y++) {
                Node currentNode = this.body[x][y];

                renderBuffer[x][y] = currentNode != null ? currentNode.getSymbol() : 0;
            }
        }

        return renderBuffer;
    }
}