package com.tester0521.std;

// public sealed class Result<T, E> permits Ok, Err {
public class Result<T, E> {
    public static <T, E> Res<T, E> ok (T v) { return new Ok <>(v); }
    public static <T, E> Res<T, E> err(E e) { return new Err<>(e); }
}
