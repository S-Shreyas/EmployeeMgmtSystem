package com.shroidenger;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeUpdate {

	public static ArrayList<Employee> updater(int val, ArrayList<Employee> arr) {

		Scanner scanner = new Scanner(System.in);

		for (Employee counter : arr) {

			if (counter.getId() == val) {

				System.out.println("ENTER NAME: ");
				String upname = scanner.next();

				System.out.println("ENTER CITY: ");
				String upcity = scanner.next();

				counter.setName(upname);
				counter.setCity(upcity);
			}

		}
		

		System.out.println("UPDATED");

		return arr;

	}

}