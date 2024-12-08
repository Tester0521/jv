package com.tester0521.std;

public final class Ok<T, E> implements Res<T, E> {
    private final T v;

    public   Ok(T v) { this.v = v; }
    public T value() { return v;   }

    @Override public boolean some() { return true;  }
    @Override public boolean none() { return false; }

    @Override public T unwrap()     { return v;     }
    @Override public E getErr()     {
        throw new IllegalStateException("Попробуйте unwrap()");
    }

    @Override public String toString() {
        return "Ok(" + v + ")";
    }
}
