package lib;

public enum Grade {
	Two(2), Three(3), Four(4), Five(5);

	private final int v;

	Grade(int v) {
		this.v = v;
	}


	public int get_val() {
		return this.v;
	}
}