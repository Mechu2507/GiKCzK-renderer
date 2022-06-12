package CGlab;

public class Vec4f {
    public float x;

    public Vec4f(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public float y;
    public float z;
    public float w;

    @Override
    public String toString() {
        return x + " " + y + " " + z + " " + w;
    }

    public float x() {
        return x;
    }

    public float w() {
        return w;
    }

    public float y() {
        return y;
    }

    public float z() {
        return z;
    }


}
