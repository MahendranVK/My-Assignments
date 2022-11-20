package org.college;

public class College {
public void collegeName() {
	System.out.println("Rathinam College of Arts & Science");
}
public void collegeCode() {
	System.out.println("10001");
}
public void collegeRank() {
	System.out.println("Rank-I");
	
}
public static void main(String[] args) {
	College clg = new College();
	clg.collegeName();
	clg.collegeCode();
	clg.collegeRank();
}
}
