package com.tester0521.geometry;

import java.util.Objects;

public class Line implements Cloneable {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStart() { return p1; }

    public Point getEnd() { return p2; }

    public Line setStart(int x, int y) { p1 = new Point(x, y); return this; }

    public Line setEnd(int x, int y) { p2 = new Point(x, y); return this; }

    public String toString() { return p1 + " " + p2; }

    public int len() {
        // int dx = p1.getX() - p2.getX();
        // int dy = p1.getY() - p2.getY();

        // return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
        return (int) Math.round(Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) - Math.pow(p1.getY() - p2.getY(), 2)));
    }

    @Override public boolean equals(Object o) {
        return 
            (this == o) ? true :
            (o == null || getClass() != o.getClass()) ? false : 
            (!(o instanceof Line line)) ? false :
            this.len() == line.len();
    }

    @Override public int hashCode() { return Objects.hash(p1, p2); }

    @Override public Line clone() throws CloneNotSupportedException {
        return ((Line) super.clone())
                        .setStart(this.getStart().getX(), this.getStart().getY())
                        .setEnd(this.getEnd().getX(), this.getEnd().getY());
    }
}
