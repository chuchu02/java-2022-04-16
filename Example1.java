
public class Example1 {

	public static void main(String[] args) {
		//반복문--> while, for
		
		//명령을 n번 반복해라.
		
		//반복문 -> 반복횟수를 세서 내가 원하는 횟수에서 멈춘다.
		//for(시작; 반복횟수; 증가량)
		for(int i = 0;  i < 10; i++) {
			System.out.println("hello");
		}
		
		// <= 작거나 같다(이하)
		// < 작다(미만)
		// > 크다(초과)
		// >= 크거나 같다(이상)
		// == 같다
		// != 같지 않다.
//		for(int n = 100; n < 151; n++) {
//			System.out.println(n);
//		}
		
		//v2
//		for(int n = 100; n <= 1000; n = n+1) {
//			System.out.println(n);
//		}
		
		//짝수 판별법 ==> 나눈 나머지
		//산술 연산자
		//더하기
		System.out.println(10 + 20);
		//빼기
		System.out.println(100 - 20);
		//곱하기
		System.out.println(10 * 20);
		//나누기 몫
		System.out.println(10 / 20);
		//나누기 나머지
		System.out.println(100 % 30);
		
		//복합 대입 연산자, 증감연산자
		int num = 5;
		num = num + 1;
		num += 1;
		
		//증감 연산자
//		num++ // 1씩 증가
//		num-- // 1씩 감소
		//2로 나눠서 떨어지면 == 짝수
//		for(int i = 100; i<= 1000; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//			else {
//				System.out.println("홀수입니다.");
//			}
//		}
	}

}
