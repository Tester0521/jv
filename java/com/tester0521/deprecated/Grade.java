

package com.tester0521.deprecated;

public enum Grade {
	two(2), three(3), four(4), five(5);

	private final int v;

	Grade(int v) {
		this.v = v;
	}


	public int get_val() {
		return this.v;
	}
}