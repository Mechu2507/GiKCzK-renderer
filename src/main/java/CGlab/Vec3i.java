package CGlab;

import static java.lang.Math.*;

public class Vec3i {
    public int x;
    public int y;
    public int z;

    public Vec3i(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int get(int a ){
        if (a == 0){
            return x;
        }else if (a == 1){
            return y;
        }else if (a == 2){
            return z;
        }else{
            return -1;
        }
    }

    /*
    static int lengthSquare(Vec3i p1, Vec3i p2)
    {
        int xDiff = p1.x- p2.x;
        int yDiff = p1.y- p2.y;
        return xDiff*xDiff + yDiff*yDiff;
    }
    static Vec3f getAngle(Vec3i A, Vec3i B,
                          Vec3i C)
    {

        int a2 = lengthSquare(B,C);
        int b2 = lengthSquare(A,C);
        int c2 = lengthSquare(A,B);

        float a = (float)sqrt(a2);
        float b = (float)sqrt(b2);
        float c = (float)sqrt(c2);

        float alpha = (float) acos((b2 + c2 - a2)/(2*b*c));
        float betta = (float) acos((a2 + c2 - b2)/(2*a*c));
        float gamma = (float) acos((a2 + b2 - c2)/(2*a*b));

        alpha = (float) (alpha * 180 / PI);
        betta = (float) (betta * 180 / PI);
        gamma = (float) (gamma * 180 / PI);

        return new Vec3f(alpha,betta,gamma);
    }


     */
    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }
}
