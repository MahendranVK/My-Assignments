package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Miniumum deposit year in Axis Bank is 10 ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axb = new AxisBank();
		axb.savings();
		axb.fixed();
		axb.deposit();
	}

}
