package org.department;

import org.college.College;

public class Department extends College {

	public void depName() {
		System.out.println("Computer Science");
	}

public static void main(String[] args) {
	Department dpt = new Department();
	dpt.collegeName();
	dpt.collegeCode();
	dpt.collegeRank();
	dpt.depName();
}
}