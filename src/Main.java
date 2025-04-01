import MyUtils.Grid;
import MyUtils.Node;
import MyUtils.Renderer;

public class Main {
    private static final Renderer renderer = new Renderer();
    private static final int width = 32;
    private static final int height =  32;

    public static void main(String[] args) {
        Grid mainGrid = new Grid(width, height);
        Grid backgroundGrid = new Grid(width, height);

        // Obstacles
        mainGrid.setNode(new Node(12, 12, '#'));
        mainGrid.setNode(new Node(13, 12, '#'));
        mainGrid.setNode(new Node(14, 12, '#'));
        mainGrid.setNode(new Node(12, 13, '#'));

        // Set background to dots
        for (int bgX = 0; bgX < width; bgX++) {
            for (int bgY = 0; bgY < height; bgY++) {
                backgroundGrid.setNode(new Node(bgX, bgY, '.'));
            }
        }

        // Rendering
        renderer.renderBuffer(
                renderer.combineBuffers(width, height,
                        new char[][][]{
                                backgroundGrid.getRenderBuffer(),
                                mainGrid.getRenderBuffer()
                        }
                )
        );
    }
}