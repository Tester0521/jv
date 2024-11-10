package com.tester0521.deprecated;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public void setStart(int x, int y) {
        p1 = new Point(x, y);
    }

    public void setEnd(int x, int y) {
        p2 = new Point(x, y);
    }

    public Point getStart() {
        return p1;
    }

    public Point getEnd() {
        return p2;
    }

    public int getLength() {
        int dx = p1.getX() - p2.getX();
        int dy = p1.getY() - p2.getY();
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }


    public String toString() {
        return p1 + " " + p2;
    }
}
