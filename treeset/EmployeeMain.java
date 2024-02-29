package com.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeMain {
	public static void main(String[] args) {

		Employee E = new Employee();
		E.seteid(101);
		E.seteName("Rahul");
		E.seteSalary(25000);

		Employee E2 = new Employee();
		E2.seteid(102);
		E2.seteName("Amol");
		E2.seteSalary(20000);

		Employee E3 = new Employee();
		E3.seteid(103);
		E3.seteName("Sachin");
		E3.seteSalary(30000);

		
		while (true) {
			// TreeSet<Employee> t=null;
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("_______________________________________________________________________________________________");
			System.out.println("Enter your choice");
			System.out.println("1. Id sort \n2. Name Sort \n3. Salary Sort");
			int x = sc.nextInt();

			switch (x) {

			case 1:
				TreeSet<Employee> tId = new TreeSet(new IdSortComparator());
				tId.add(E);
				tId.add(E2);
				tId.add(E3);

				for (Employee emp : tId) {
					System.out.println("Id Sort: "+emp.geteId());
					System.out.println(emp.geteName());
					System.out.println(emp.geteSalary());
					System.out.println();
				}
				break;

			case 2:
				TreeSet<Employee> tName = new TreeSet(new NameSortComparator());
				tName.add(E);
				tName.add(E2);
				tName.add(E3);

				for (Employee emp : tName) {
					System.out.println(emp.geteId());
					System.out.println("Name Sort: "+emp.geteName());
					System.out.println(emp.geteSalary());
					System.out.println();
					
				}

				break;

			case 3:
				TreeSet<Employee> tSalary = new TreeSet(new SalarySortComparator());
				tSalary.add(E);
				tSalary.add(E2);
				tSalary.add(E3);

				for (Employee emp : tSalary) {
					System.out.println(emp.geteId());
					System.out.println(emp.geteName());
					System.out.println("Salary Sort: "+emp.geteSalary());
					System.out.println();
				}

				break;
				
				default:
					System.out.println("Invalid Choice");

			}
		}
	}
}
