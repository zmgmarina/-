package seminarOOP_2.Sample2;

public class Wall extends Obstacle{

    private final int height;



    public Wall(int height) {
        this.height = height;

    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
