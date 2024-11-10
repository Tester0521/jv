package com.tester0521.deprecated;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
	private List<Point> points = new ArrayList<>();

	public Polyline(Point...arr) {
		for (Point point : arr) {
			this.points.add(point);
		}
	}

	public void addPoint(Point...point) {
		for(int i = 0; i < point.length; i++){
			points.add(point[i]);
		}
	}

	public List<Point> getPoints(){
		return new ArrayList<>(points);
	}

	public int getLength(){
		int length = 0;

		for(int i = 0; i < points.size()-1; i++){
			length += new Line(points.get(i), points.get(i+1)).getLength();
		}
		return length;
	}


	public void removePoint(Point point) {
		for (int i = 0; i < points.size(); i++) {
			if (points.get(i).equals(point)) points.remove(i);
		}
	}

	public String toString() {
		return "Линия: " + points + " - длинна Ломанной: " + getLength();
	}
}