package java_exam;

public class Sol1 {

	public static void run(bar c) {
		System.out.println("자동차가 달립니다.");
	}
	public static void main(String[] args) {
		
		bar c1 = new bar();
		bar c2 = new bar();
		bar c3 = new bar();
		
		run(c1);
		run(c2);
		run(c3);

	}

}
class bar{
	String car;
}
