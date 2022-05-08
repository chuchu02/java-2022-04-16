package java_exam;

public class VendingMachine {
	
	int remainder = 0;
	
	
	Beverage[] beverages = new Beverage[10]; // 음료수 10개 저장 가능.
	
	//대입 -> 연산. => 연산은 함수에서 해야한다.
	
	public void init() {
		//선언
		Beverage b1 = new Beverage("콜라" , 1200);
		Beverage b2 = new Beverage("사이다" , 1000);
		Beverage b3 = new Beverage("커피" , 800);
		Beverage b4 = new Beverage("생수" , 600);
		
		beverages[0] = b1;
		beverages[1] = b2;
		beverages[2] = b3;
		beverages[3] = b4;
	}
	
	public void addBeverage(Beverage beverage) {
		
		//1. beverages 배열의 길이가 4, 마지막 인덱스가 3
		beverages[4] = beverage;
	}
	public  String operate(int inputMoney, int bno) {
		// 음료 목록

	
		Beverage target = beverages[bno];
				
				System.out.printf("투입 금액은 %d입니다.\n", inputMoney);
				remainder = remainder + inputMoney;
				
				if(remainder < target.price) {
					System.out.println("잔액이 부족합니다.");
					return null;
				}
				
				System.out.printf("%s를 뽑으셨습니다.\n", target.name);
				
				
				remainder = remainder - target.price;
				System.out.printf("잔액은 %d입니다.\n", remainder);
				
				return target.name;
	}

}

class Beverage{
	String name;
	int price;
	public Beverage(String data1, int data2) {
		name = data1;
		price = data2;
	}
}
