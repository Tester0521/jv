package com.tester0521.deprecated;

public class Cube {
    private Point point;
    private int length;
    private Polyline cubeFaces;

    public Cube(Point point, int length) {
        if (length <= 0) throw new IllegalArgumentException("Укажите корректную длинну!");
        this.point = point;
        this.length = length;
    }

    public Cube(int x, int y, int length) {
        this.point = new Point(x, y);
        this.length = length;
    }

    public void setLength(int length) {
        if(length <= 0) throw new IllegalArgumentException("Укажите корректную длинну!");
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public Polyline getCubeFaces() {
        Point rightTop = new Point(point.getX() + length, point.getY());
        Point leftBottom = new Point(point.getX(), point.getY() + length);
        Point rightBottom = new Point(point.getX() + length, point.getY() + length);

        return new Polyline(point, rightTop, rightBottom, leftBottom, point);
    }

    public String toString() {
        return "Квадрат в точке " + point + " со стороной " + length;
    }
}
