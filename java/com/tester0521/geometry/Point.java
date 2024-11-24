package com.tester0521.geometry;

import java.util.Objects;

public class Point implements Cloneable {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() { return x; }

	public int getY() { return y; }

	public void setX(int x) { this.x = x; }

	public void setY(int y) { this.y = y; }

	public String toString() { return "{" + x + ";" + y + "}"; }

	@Override public boolean equals(Object o) {
		return 
			(this == o) ? true : 
			(o == null || getClass() != o.getClass()) ? false :
			(!(o instanceof Point point)) ? false :
			x == point.x && y == point.y;
	}

	@Override public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override public Point clone() throws CloneNotSupportedException {
		return (Point) super.clone();
	}
}
