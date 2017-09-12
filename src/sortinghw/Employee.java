package sortinghw;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Employee {
	// implements Comparable<Employee> {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static Employee[] sortName(Employee[] data) {
		int len = data.length; // size of array
		for (int pass = 1; pass < len; pass++) {
			// System.out.println("\nPass = " + pass);
			for (int compares = 0; compares < len - pass; compares++) {
				// System.out.println(compares);
				if (data[compares].name.compareTo(data[compares + 1].name) > 0) { // asc order
					// if ( data[compares].compareTo(data[compares + 1]) < 0) { // desc order
					// swap
					String temp = data[compares].name;
					data[compares].name = data[compares + 1].name;
					data[compares + 1].name = temp;
				}
			}
		}
		return data;
	}

	public static Employee[] sortAge(Employee[] data) {
		int len = data.length; // size of array
		for (int pass = 1; pass < len; pass++) {
			// System.out.println("\nPass = " + pass);
			for (int compares = 0; compares < len - pass; compares++) {
				// System.out.println(compares);
				if (data[compares].age > data[compares + 1].age) { // asc order
					// if (data[compares] < data[compares + 1]) { // desc order
					// swap
					int temp = data[compares].age;
					data[compares].age = data[compares + 1].age;
					data[compares + 1].age = temp;
				}
			}
		}
		return data;
	}

	public String toString() {
		return String.format("(%s, %d)", name, age);
	}

	public static void main(String[] args) {
		Employee[] employees = new Employee[10];
		employees[0] = new Employee("Will", 20);
		employees[1] = new Employee("Kyle", 21);
		employees[2] = new Employee("Alex", 22);
		employees[3] = new Employee("Wyatt", 19);
		employees[4] = new Employee("Tyler", 30);
		employees[5] = new Employee("Nick", 25);
		employees[6] = new Employee("Brock", 15);
		employees[7] = new Employee("Ernie", 37);
		employees[8] = new Employee("Corey", 32);
		employees[9] = new Employee("Taylor", 28);

		long start = System.nanoTime();
		System.out.println("Before sorting: " + Arrays.toString(employees));
		sortAge(employees);
		// Arrays.sort(employees);
		long end = System.nanoTime();
		System.out.println("After sorting: " + Arrays.toString(employees));
		long difference = end - start;
		System.out.println(
				"Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
		System.out.println("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference, TimeUnit.NANOSECONDS));
		long start1 = System.nanoTime();
		System.out.println("Before sorting: " + Arrays.toString(employees));
		sortName(employees);
		// Arrays.sort(employees);
		long end1 = System.nanoTime();
		System.out.println("After sorting: " + Arrays.toString(employees));
		long difference1 = end1 - start1;

		// System.out.println("Execution Time in Nanoseconds " +
		// TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
		// System.out.println("Execution Time in Microseconds " +
		// TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
		System.out.println(
				"Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference1, TimeUnit.NANOSECONDS));
		System.out.println("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference1, TimeUnit.NANOSECONDS));

	}

}
