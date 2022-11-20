package week3.Abstraction;

public class Automation extends MultipleLanguage implements Testtool{
	public void java() {
		System.out.println("Java");
	}
	public void ruby() {
		System.out.println("ruby");
	}
	public static void main(String[] args) {
  Automation auto = new Automation();
  auto.java();
  auto.selenium();
  auto.ruby();
  auto.python();
	}
	public void selenium() {
		System.out.println("Selenium");

		
	}

}
