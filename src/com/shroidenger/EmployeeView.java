package com.shroidenger;

import java.util.ArrayList;

public class EmployeeView {

	public static Employee viewEmployee(int val, ArrayList<Employee> arr) {

		for (Employee counter : arr) {

			if (counter.getId() == val) {
				return counter;
			}

		}
		return null;
	}

}