package com.tester0521.other; 

public class PointGenerator {
    public static Point yieldPoint(int x, int y)        { return new Point2D(x, y); }
    public static Point yieldPoint(int x, int y, int z) { return new Point3D(x, y, z); }
}