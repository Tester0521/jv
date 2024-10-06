// Core
import java.util.Arrays;

// Local
import lib.*;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("Vasya");
		Student st2 = new Student("Peter");
		Student st3 = new Student("Andrew");

		st1.push(3);
		st1.push(4);
		st1.push(5);

		st2.push(2);
		st2.fill(st1.grades());

		st1.replace(5, 0);

		st3.fill(st1.grades());


		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
	}
}