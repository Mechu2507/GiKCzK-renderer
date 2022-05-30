package CGlab;

public class Vec2i {
    public int x;

    public Vec2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int y;
    @Override
    public String toString() {
        return x + " " + y;
    }

}
