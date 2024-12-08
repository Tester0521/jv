import java.util.*;


import com.tester0521.utils.*;
import com.tester0521.std.Result;

public class Main {
	public static void main(String[] args) {
		List<String> arr = Arrays.asList("q", "w", "e");
		List<String> arr2 = Arrays.asList("r", "t", "y");
		List<List<String>> ll = new ArrayList<>();
		ll.add(arr);
		ll.add(arr2);

		List<Integer> arrTest = new ArrayList<>();

		var res   = MegaUtil.lambda(Arrays.asList(1, 2, 3, 4),    (a, b) -> a + b).unwrap();
		var ress  = MegaUtil.lambda(Arrays.asList("q", "w", "e"), (a, b) -> a + b).unwrap();
		var resss = MegaUtil.lambda(ll, (a, b) -> {
            List<String> c = new ArrayList<>(a);
            c.addAll(b);
            return c;
		}).unwrap().size();
		var ressss = MegaUtil.lambda(arrTest, (a, b) -> a + b);

		System.out.println(res);
		System.out.println(ress);
		System.out.println(resss);
		System.out.println(ressss);
	}
}