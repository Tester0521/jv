package com.tester0521.deprecated;

public class ClosedPolyline extends Polyline{
    public ClosedPolyline(Point... arr) {
        super(arr);
    }

    public int getLength(){
        int length = 0;
        length += super.getLength();
        length += new Line(getPoints().getFirst(), getPoints().getLast()).getLength();

        return length;
    }
}
