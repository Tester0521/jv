package com.tester0521.std;

public final class Err<T, E> implements Res<T, E> {
    private final E e;
    private final int status;

    public   Err(E e, int status)   { this.e = e; this.status = status; }
    public   Err(E e)               { this(e, 404); }
    public E getError()             { return e;     }

    @Override public boolean some() { return false; }
    @Override public boolean none() { return true;  }

    @Override public E getErr()     { return e;     }
    @Override public T unwrap()     {
        throw new IllegalStateException("Попробуйте getErr()");
    }
    // @Override public E unwrap() { return e; }


    @Override public String toString() {
        return "Err(error: " + e +", status: " + status + ")";
    }
}


