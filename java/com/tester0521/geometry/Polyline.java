package com.tester0521.geometry;

import java.util.*;
import java.util.stream.*;

public class Polyline implements Cloneable {
	private List<Point> points = new ArrayList<>();

	public Polyline(Point ...points) { this.points = Arrays.asList(points); }

	public void addPoints(Point ...points) {
		this.points.addAll(Arrays.asList(points));
	}

	public void fillPoints(List<Point> points) {
		this.points = points;
	}

	public List<Point> getPoints(){
		return new ArrayList<>(points);
	}

	public int len() {
		int len = 0;

		for (int i = 0; i < points.size() - 1; i++)
			len += new Line(points.get(i), points.get(i+1)).len();

		return len;
	}

	public void removePoint(Point point) {
		this.points
			.stream()
			.filter(p -> p != point)
			.collect(Collectors.toList());
	}

	public String toString() {
		return "Линия: " + points + " - длинна Ломанной: " + len();
	}

	@Override public final boolean equals(Object o) {
		return 
			(this == o) ? true :
			(o.getClass() == this.getClass()) ? false :
			(!(o instanceof Polyline polyline) ) ? false :
			o == polyline;
	}

	@Override public int hashCode() {
		return Objects.hashCode(points);
	}

	@Override public Polyline clone() throws CloneNotSupportedException {
		// return ((Polyline)super
		// 			.clone())
		// 			.fillPoints(
		// 				new ArrayList<>(points)
		// 					.stream()
		// 					.map(p -> p.clone())
		// 					.collect(Collectors.toList())
		// 		);
		return (Polyline) super.clone();
	}
}