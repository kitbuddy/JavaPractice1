package javaPrac;

public class Distance2D3D {

    public static void main(String[] args) {
        Distance2D3D distance2D3D = new Distance2D3D();

        System.out.println("2D distance = " + distance2D3D.dist2D(new Point2D(2,3)));
        System.out.println("3D distance = " + distance2D3D.dist3D(new Point3D(2,3, 4)));
    }

    public double dist2D(Point2D point2D) {

        double dist2D_distance = 0;

        Point2D point2D_current = new Point2D(1, 1);

        int xDistance = (point2D.x - point2D_current.x) * (point2D.x - point2D_current.x);
        int yDistance = (point2D.y - point2D_current.y) * (point2D.y - point2D_current.y);

        dist2D_distance = Math.sqrt( (xDistance + yDistance));

        return dist2D_distance;
    }

    public double dist3D(Point3D point3D) {

        double dist3D_distance = 0;

        Point3D point3D_current = new Point3D(1, 1, 1);

        int xDistance = (point3D.x - point3D_current.x) * (point3D.x - point3D_current.x);
        int yDistance = (point3D.y - point3D_current.y) * (point3D.y - point3D_current.y);
        int zDistance = (point3D.z - point3D_current.z) * (point3D.z - point3D_current.z);

        dist3D_distance = Math.sqrt( (xDistance + yDistance + zDistance));

        return dist3D_distance;
    }



}

class Point2D {
    int x;
    int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Point3D extends Point2D {

    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

