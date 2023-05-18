package com.google;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Johny", 30));
		empList.add(new Employee(2, "Rocky", 35));
		empList.add(new Employee(3, "Tim", 32));
		empList.add(new Employee(4, "Alex", 28));
		empList.add(new Employee(5, "Eric", 25));
		
		Employee maxAged = empList.stream()
								.max((e1, e2) -> e1.getAge() > e2.getAge() ? 1 : -1)
								.get();
		System.out.println("Max aged employee: "+maxAged);
		
		Employee minAged = empList.stream()
								.min((e1, e2) -> e1.getAge() > e2.getAge() ? 1 : -1)
								.get();
		System.out.println("Min aged employee: "+minAged);
		
		long sum = empList.stream()
						.mapToInt(e -> e.getAge())
						.summaryStatistics()
						.getSum();
		System.out.println("Sum of ages: "+sum);
		
		double avg = empList.stream()
						.mapToInt(e -> e.getAge())
						.summaryStatistics()
						.getAverage();
		System.out.println("Average of ages: "+avg);
		
//		after summaryStatistics you can call getMax(), getMin(), and getCount() also
		
	}

}
