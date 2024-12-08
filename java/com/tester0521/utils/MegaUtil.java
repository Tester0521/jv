package com.tester0521.utils;

import java.util.*;
import java.util.function.BinaryOperator;
import com.tester0521.std.*;

public class MegaUtil {

	public static <T> Res<T, String> lambda(List<T> vals, BinaryOperator<T> func) {
		if (vals == null || vals.isEmpty()) return Result.err("nothing inside list :((");

        T res = vals.get(0); 

        for (int i = 1; i < vals.size(); i++) res = func.apply(res, vals.get(i));

        return Result.ok(res);
	}
}