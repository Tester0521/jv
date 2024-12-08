package com.tester0521.std;

public sealed interface Res<T, E> permits Ok, Err {
	boolean some();
	boolean none();
	T unwrap();
	E getErr();
}

// public abstract class Res<T, E> {

//     public abstract <R> R unwrap();
// }