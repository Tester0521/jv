package com.tester0521.other;

public final class Storage<T> {
	private final 	T 		   v;
	private static 	Storage<?> nullStorage;

	private Storage(T v) { this.v = v; }

	public static <T> Storage<T> buildWithNull(T v) {
		if (v == null) {
			if (nullStorage == null) nullStorage = new Storage<>(null);

			return (Storage<T>) nullStorage;
		}

		return new Storage<>(v);
	}

	public static <T> Storage<T> buildWithoutNull(T v) {
        if (v == null) throw new IllegalArgumentException("Нулл запрещен(:");

        return new Storage<>(v);
    }

    public T getValue(T altV) { 
		return v != null ? v : altV; 
	}
}