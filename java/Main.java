// Core
import java.util.Arrays;

// Local
import lib.*;

public class Main {

	public static void main(String[] args) {
		// ################### 1-3 ##########################
		// Student st1 = new Student("Vasya");
		// Student st2 = new Student("Peter");
		// Student st3 = new Student("Andrew");

		// st1.push(3);
		// st1.push(4);
		// st1.push(5);

		// st2.push(2);
		// st2.fill_grades(st1.get_grades());

		// st1.replace(5, 0);

		// st3.fill_grades(st1.get_grades());


		// System.out.println(st1.toString());
		// System.out.println(st2.toString());
		// System.out.println(st3.toString());
		// ################### 1-3 ##########################
		// ################### 1-4 ##########################
		// int[] grades = {3, 4, 5};

		// Student st1 = new Student("Vasya", grades);
		// Student st2 = new Student("Maksim");

		// System.out.println(st1.toString());
		// System.out.println(st2.toString());
		// ################### 1-4 ##########################
		// ################### 1-5 ##########################
		// int[] g1 = {3, 4, 5, 4};
		// int[] g2 = {5, 5, 5, 5};

		// Student st1 = new Student("Vasya", g1);
		// Student st2 = new Student("Peter", g2);

		// System.out.println(st1.name +" --> средний балл --> " + st1.get_average() + " --> " + st1.isFullSupport());
		// System.out.println(st2.name +" --> средний балл --> " + st2.get_average() + " --> " + st2.isFullSupport());
		// ################### 1-5 ##########################
		// ################### 1-6 ##########################

		Student st1 = new Student("Vasya");
		Student st2 = new Student("Peter");

		st1.push(Grade.two);
		st1.push(Grade.three);
		st1.push(Grade.four);

		st2.push(Grade.five);
		st2.push(Grade.five);

		System.out.println(st1.toString());
		System.out.println(st2.toString());

		// Grade test = new Grade(2);
		// ################### 1-6 ##########################
	}
}