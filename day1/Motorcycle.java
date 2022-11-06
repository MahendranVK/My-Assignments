package week1.day1;

public class Motorcycle {
	int noOfwheels = 4;
	long chasisNumber = 25121996;
	short noOfKicker = 3;
	boolean isPetrol = true;
	String bikeName = "Impulse";
	double milegeKm = 45.5;

	public static void main(String[] args) 
	{
		Motorcycle B = new Motorcycle();
		System.out.println(B.noOfwheels);
		System.out.println(B.chasisNumber);
		System.out.println(B.noOfKicker);
		System.out.println(B.isPetrol);
		System.out.println(B.bikeName);
		System.out.println(B.milegeKm);
	}

}
