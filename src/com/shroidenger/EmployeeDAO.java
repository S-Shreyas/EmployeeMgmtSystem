package com.shroidenger;

import java.util.ArrayList;

public class EmployeeDAO {

	public static Boolean checker(int val, ArrayList<Employee> arr) {

		for (Employee counter : arr) {

			if (counter.getId() == val) {
				return true;
			}

		}
		return false;

	}

}