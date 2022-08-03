package com.shroidenger;

import java.util.ArrayList;

public class EmployeeAdd {

	public static ArrayList<Employee> adder(Employee employee, ArrayList<Employee> arr) {
		if (!EmployeeDAO.checker(employee.getId(), arr)) {

			arr.add(employee);
		} else {
			System.out.println("EXISTS");
		}
		return arr;

	}

}