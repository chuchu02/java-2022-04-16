package java_exam;

public class bool {

	public static int func1() {
		return 10;
	}
	public static double func2() {
		return 10.2;
	}
	//return ->  함수의 종료
	public static String func3() {
		return "hello";
	}
	public static boolean func4() {
		return true;
	}
	public static int func5() {
		for(int i =1; i < 10; i++) {
			if(i == 5) {
				return 5;
			}
			System.out.println(i);
		}
		return 0;
	}
	public static void main(String[] args) {
		int i = func1();
		double d = func2();
		String c = func3();
		boolean b = func4();
		func5();
		// 논리값, 진리값 => boolean
//		System.out.println(1> 10);
//		System.out.println(1 < 10);
//		System.out.println(false);
	}

}
