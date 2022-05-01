package java_exam;

import java.util.Scanner;

public class DAY5 {

	// 제곱 함수
	public static int test(int num) {
//콘솔창 출력	System.out.println(25);
// ruturn 값 전달
		return num * num;
	}

	public static String vendingMachine(int inputMoney, int bno) {

		String[] beverageNames = { "콜라", "사이다", "커피", "생수" };
		int[] beveragePrices = { 1200, 1000, 800, 600 };
		
		System.out.printf("투입 금액은 %d원 입니다.\n", inputMoney);
		if (inputMoney < beveragePrices[bno]) {
			System.out.println("잔액이 부족합니다");
			return null;
		}
		
		System.out.printf("%s를 뽑으셨습니다.\n" , beverageNames[bno]);
		int remainder = inputMoney - beveragePrices[bno];
		System.out.printf("잔액은 %d 입니다.\n", remainder);

		return beverageNames[bno];
	}

	public static void main(String[] args) {
		// 1.함수
		// 2.정의
		// 3.호출
		// 4.리턴(함수와 함수의 데이터 교환)

		// return 값 호출
//		int rt = test(10);
//		System.out.println(rt /2);
//		
//		int rt2 = test(5);
//		System.out.println(rt2 * 2);
		
		Scanner scan = new Scanner(System.in);
		// 돈, 뽑을 음료수
		// 0 = 콜라(1200) , 1 = 사이다(1000) , 2 = 커피(800) , 3 = 생수(600)
		
		System.out.println("==================음료수목록==================");
		System.out.println("0 : 콜라(1200원)");
		System.out.println("1 : 사이다(1000원)");
		System.out.println("2 : 커피(800원)");
		System.out.println("3 : 생수(600원)");
		System.out.println("====================================");
		System.out.print("얼마의 금액을 투입하시겠습니까 : ");
		int inputMoney = Integer.parseInt(scan.nextLine());
		
		System.out.print("어떤 음료수를 선택하시겠습니까 : ");
		int bno = Integer.parseInt(scan.nextLine());
		
		String beverage = vendingMachine(inputMoney , bno);

		if (beverage == null) {
			System.out.println("홍길동이 음료수를 뽑을 수 없습니다.");
		} else {
			System.out.printf("홍길동이 %s를 벌컥벌컥 마십니다.\n", beverage);
		}
		
	}

}
