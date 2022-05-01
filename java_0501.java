package java_exam;

import java.util.Scanner;

public class java_0501 {

	public static void gugu(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i ,dan*i);
		}
	}
	
	public static void main(String[] args) {
		//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
		//입출력 예시
		//첫번째 숫자를 입력해주세요: 12
		//두번째 숫자를 입력해주세요: 33
		//12 + 33 = 45

		Scanner scan = new Scanner(System.in);
		// 입력 문제 1
		System.out.printf("첫번째 숫자를 입력해 주세요 : ");
		int a = Integer.parseInt(scan.nextLine());
		
		System.out.print("두번째 숫자를 입력해 주세요 : ");
		int b = Integer.parseInt(scan.nextLine());
		
		System.out.printf("%d + %d = %d\n", a , b , a+b);
		
		// 입력문제 2
		System.out.println("이름을 입력해주세요:");
		String name = scan.nextLine();
		
	    System.out.println("나이를 입력해주세요:");
	    int age = Integer.parseInt(scan.nextLine());
	    
	    System.out.printf("안녕하세요 %d세 %s입니다.\n", age, name);

	    // 출력 : 안녕하세요 29세 홍길동입니다.
		
		 // Scanner를 이용해 입력값을 받아
	    // 구구단을 원하는 단이 나오게 해주세요.

		//입력문제 3
	    //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

	    // 4단 출력.
		System.out.printf("원하는 단을 입력해주세요 : ");
//		int dan = Integer.parseInt(scan.nextLine());
//		System.out.println("==========구구단 출력==========");
//		for(int i = 1; i < 10; i++) {
//			System.out.printf("%d * %d = %d\n", dan, i ,dan*i);
//		}
//		System.out.println("==========구구단 끝==========");
		
		//반복 조건을 없애면 무한 반복
		
		//반복문을 종료하는 방법 -> break 사용
		//break => 반복문 강제 종료
		System.out.println("==========구구단 출력==========");
		for(int i = 0; ; i++) {
			System.out.printf("원하는 단을 입력해주세요(종료는 0) : ");
			int dan = Integer.parseInt(scan.nextLine());
			
			if(dan == 0) {
				System.out.println("구구단 프로그램을 종료합니다.");
				break;
			}
			gugu(dan);
		}
	}

}
