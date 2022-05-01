package java_exam;

public class DAY6_2 {

	static int remainder = 0;
	
	public static void deposit(int money) {
		remainder += money;
		System.out.printf("%d원을 예금하셨습니다.\n",  money);
		System.out.printf("잔액은 %d원 입니다.\n", remainder);
	}
	
	public static int withdraw(int money) {
		System.out.printf("%d원을 출금하셨습니다.\n", money);
		remainder -= money;
		System.out.printf("잔액은 %d원 입니다.\n", remainder);
		return money;
	}
	public static void main(String[] args) {
		
		deposit(1000); // 예금
		deposit(2000); // 예금
		deposit(3000); // 예금
		int money = withdraw(400); // 출금
		
		System.out.println(money);
		
		money = withdraw(1000);
		
		System.out.println(money);

	}

}
