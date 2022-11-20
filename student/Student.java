package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Mahendran");
	}
public void studentDept() {
	System.out.println("BCA");
}
public void studentId() {
	System.out.println("60005");
}

public static void main(String[] args) {
	Student stu = new Student();
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	stu.depName();
	stu.studentName();
	stu.studentDept();
	stu.studentId();
}
}