
public class Example3 {

	public static void main(String[] args) {
		// 짝수인지 홀수인지 판별
		int num = 7;
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		// 두수 num1과 num2가 주어집니다.
		// 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.
		int num1 = 10;
	    int num2 = 15;
	    
	    if(num1 > num2) {
	    	System.out.printf("%d\n", num1 - num2);
	    }else {
	    		System.out.printf("%d\n", num2 - num1);
	    	}
	 // 문제 : 할인 대상인지 아닌지 출력해주세요.
	 // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
	 // 조건 : 출력예시 처럼 출력되어야 합니다.
	 // 조건 : `구현시작` 부분만 수정 할 수 있습니다..
	 // 조건 : 2가지 이상의 방법으로 풀어야 합니다.
	    int age = 65;
	    if(age <= 19 || age >= 60) {
	    	System.out.println("할인 대상입니다.");
	    }
	    else{
	    	System.out.println("할인 대상이 아닙니다.");
	    }
	    /*
	    어떤 차의 높이가 170cm 입니다..

	    이 차는 3개의 터널을 차례대로 지나게 될 것입니다.

	    터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 납니다.

	    차가 모든 터널을 무사히 잘 통과하면 PASS 를 출력하고, 충돌한다면 CRASH 를 출력하세요.
	    */
	    int tunnel1 = 180;
	    int tunnel2 = 182;
	    int tunnel3 = 172;
	}
}


	
