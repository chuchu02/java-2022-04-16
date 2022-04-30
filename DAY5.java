package java_exam;

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

		// 돈, 뽑을 음료수
		// 0 = 콜라(1200) , 1 = 사이다(1000) , 2 = 커피(800) , 3 = 생수(600)

		String beverage = vendingMachine(800, 1);

		if (beverage == null) {
			System.out.println("홍길동이 음료수를 뽑을 수 없습니다.");
		} else {
			System.out.printf("홍길동이 %s를 벌컥벌컥 마십니다.\n", beverage);
		}
		
		String beverage2 = vendingMachine(100, 1);
		
		if (beverage2 == null) {
			System.out.println("홍길순이 음료수를 뽑을 수 없습니다.");
		} else {
			System.out.printf("홍길순이 %s를 벌컥벌컥 마십니다.", beverage);
		}
	}

}
