package java_exam;

public class Example4 {
	//Hong 이라는 클래스에는 자료형을 대입할 수 없다.
	//Hong 이라는 새로운 자료형을 만들겠다.
	public static void introduce(Hong hong) {
		System.out.printf("안녕하세요. %d살 %s입니다.\n", hong.age, hong.name);
	}
	public static void main(String[] args) {
		
		// 사람
		// 나이, 이름
		
		
		
		
		//자기소개
		//값을 새로 저장하는 방법. -> class 변수 = new class();
		Hong h  = new Hong();
		introduce(h);
//		introduce(Lee);
	}

}
//Hong 이라는 새로운 바구니 생성.
class Hong{
	static int age = 22;
	static String name = "홍길동";
}
class Lee{
	static int age = 33;
	static String name = "이순신";
}
