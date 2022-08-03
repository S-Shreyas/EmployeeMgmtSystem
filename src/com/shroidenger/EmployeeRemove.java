package com.shroidenger;

import java.util.ArrayList;

public class EmployeeRemove {

	public static ArrayList<Employee> delete(int val, ArrayList<Employee> arr) {

		// if (EmployeeView.viewEmployee(val) != null){
		// System.out.println(EmployeeView.viewEmployee(val));
		// }else{
		// System.out.println("INVALID");
		// }
		// ADD IF TO ENSURE

		for (Employee counter : arr) {
			if (counter.getId() == val) {
				arr.remove(counter);
			}
		}

		return arr;

	}

}