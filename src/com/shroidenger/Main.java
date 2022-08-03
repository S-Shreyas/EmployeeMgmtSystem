package com.shroidenger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean running = true;
		Scanner scanner = new Scanner(System.in);

		headerfooter();

		ArrayList<Employee> arr = new ArrayList<>();

		Employee employee1 = new Employee(1, "SHREYAS", "NOIDA");
		Employee employee2 = new Employee(2, "NAME2", "CITY2");
		Employee employee3 = new Employee(3, "ABHISHEK", "DELHI");
		Employee employee4 = new Employee(4, "NAME4", "CITY4");

		EmployeeAdd.adder(employee1, arr);
		EmployeeAdd.adder(employee2, arr);
		EmployeeAdd.adder(employee3, arr);
		EmployeeAdd.adder(employee4, arr);

		

			while (running) {
				System.out.println("1. ADD Employees");
				System.out.println("2. VIEW Employees");
				System.out.println("3. DELETE Employees");
				System.out.println("4. UPDATE Employees");
				System.out.println("5. VIEW ALL Employees");
				System.out.println("6. EXIT");
				System.out.println("ENTER SELECTION: ");

				int choice = scanner.nextInt();

				switch (choice) {

				case 1: {

					System.out.println();
					System.out.println("«»«»«»«» ADD «»«»«»«»");
					System.out.println();

					System.out.println("ID: ");
					int empid = scanner.nextInt();

					if (EmployeeDAO.checker(empid, arr)) {

						System.out.println("ID EXISTS");
					} else {

						System.out.println("ENTER NAME: ");
						String empname = scanner.next();

						System.out.println("ENTER CITY: ");
						String empcity = scanner.next();

						Employee employee = new Employee(empid, empname, empcity);

						// ADD CONFIRMATION

						arr = EmployeeAdd.adder(employee, arr);
						System.out.println();
						System.out.println("=================================================");
						System.out.println();

					}

					break;
				}
				case 2: {

					System.out.println();
					System.out.println("«»«»«»«» VIEW «»«»«»«»");
					System.out.println();
					System.out.println("ENTER ID: ");
					int viewval = scanner.nextInt();
					if (EmployeeDAO.checker(viewval, arr)) {

						System.out.println(EmployeeView.viewEmployee(viewval, arr));

					} else {
						System.out.println("INVALID ID");
					}
					System.out.println();
					System.out.println("=================================================");
					System.out.println();
					break;
				}
				case 3: {

					System.out.println();
					System.out.println("«»«»«»«» DELETE «»«»«»«»");
					System.out.println();
					System.out.println("ENTER ID: ");
					int delval = scanner.nextInt();
					if (EmployeeDAO.checker(delval, arr)) {

						EmployeeRemove.delete(delval, arr);

					} else {
						System.out.println("INVALID ID");
					}
					System.out.println();
					System.out.println("=================================================");
					System.out.println();
					break;
				}
				case 4: {

					System.out.println();
					System.out.println("«»«»«»«» UPDATE «»«»«»«»");
					System.out.println();
					System.out.println("ENTER ID: ");
					int updateval = scanner.nextInt();
					if (EmployeeDAO.checker(updateval, arr)) {
						arr = EmployeeUpdate.updater(updateval, arr);
					} else {

						System.out.println("INVALID ID");
					}

					break;
				}
				case 5: {

					System.out.println();
					System.out.println("«»«»«»«» VIEWALL «»«»«»«»");
					System.out.println();
					if (arr.isEmpty()) {
						System.out.println("EMPTY");
					} else {

						arr.sort(Comparator.comparing(Employee -> Employee.getId()));
						for (Employee counter : arr) {
							System.out.println(counter.toString());
						}
					}
					System.out.println();
					System.out.println("=================================================");
					System.out.println();
					break;
				}
				case 6: {
					running = false;
					System.out.println();
					System.out.println("«»«»«»«» EXITING «»«»«»«»");
					System.out.println();
					headerfooter();
					System.exit(0);
					break;
				}
				default: {
					System.out.println("WRONG");
					break;
				}
				}

			}
			
	

	}

	private static void headerfooter() {

		for (int i = 0; i < 30; i++) {

			System.out.print("«»");

		}
		System.out.println();

	}

}