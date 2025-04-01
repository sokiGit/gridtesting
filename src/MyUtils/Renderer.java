package MyUtils;

public class Renderer {
    public void renderBuffer(char[][] buffer) {
        System.out.println();

        for (int y = 0; y < buffer.length; y++) {
            for (int x = 0; x < buffer[y].length; x++) {
                System.out.print(buffer[x][y] + " ");
            }
            System.out.println();
        }
    }

    public char[][] combineBuffers(int width, int height, char[][][] bufferList) {
        char[][] newBuffer = new char[width][height];

        for (char[][] currentBuffer : bufferList) {
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    char currentChar = currentBuffer[x][y];

                    if (currentChar != 0) {
                        newBuffer[x][y] = currentChar;
                    }
                }
            }
        }

        return newBuffer;
    }
}