package week3.day1;

public class Student {
public void getStudentinfo(int id)
{ 
	System.out.println(id);
}
public void getStudentinfo(String name) {
	System.out.println(name);
}
public void getStudentinfo(long contactno) {
	System.out.println(contactno);
}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.getStudentinfo(1001);
		stu.getStudentinfo(9000500008l);
		stu.getStudentinfo("Mahendran");
	}

}
