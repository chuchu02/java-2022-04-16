package java_exam;

public class Day4 {
	// 정의(고용)
//	public static void test() {
//		System.out.println("알바 : ");
//		System.out.println("오하요");
//		System.out.println("곤니치와");
//		System.out.println("곤방와");
//	}
//	
//	public static void test2() {
//		System.out.println("hello");
//		System.out.println("nice to meet you");
//		System.out.println("byebye");
//	}
	// main 함수 > 절차를 저장하고 연산을 수행하는 주체
	// 함수 사용시 => 일이 분담이 되어서 책임 소재가 명확.
	// 절차의 재사용 가능
	public static void main(String[] args) {

		// 값의 재활용
//		int num = 2;
//		System.out.println(num);
//		System.out.println(num);
//		System.out.println(num);

//		test(); // 호출(일해라)
//		System.out.println("사장 : 코드1");
//		test2();
//		System.out.println("사장 : 코드2");
//		test();
//		System.out.println("사장 : 코드3");
		hi();
		name();
		ja1();
		make();
		hi2();
		bye();

	}
	// 메서드를 올바르게 호출해서 아래처럼 출력되게 해주세요.

	// 안녕하세요!!
	// 저는 차태진입니다.
	// 자바를 통해
	// 프로그램을 만들어보아요.
	// 컨트롤 + 쉬프트 + f 자동 줄 맞춤
	public static void hi() {
		System.out.println("안녕하세요!!");
	}

	public static void name() {
		System.out.println("저는 김태훈입니다.");
	}

	public static void ja1() {
		System.out.println("자바를 통해");
	}

	public static void make() {
		System.out.println("프로그램을 만들어 보아여");
	}

	public static void hi2() {
		System.out.println("저는 홍길동 입니다.");
	}

	public static void bye() {
		System.out.println("다음에 봐요!!");
	}
}
