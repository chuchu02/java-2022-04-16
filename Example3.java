
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
//				int num1 = 10;
//			    int num2 = 15;
//			    
//			    if(num1 > num2) {
//			    	System.out.printf("%d\n", num1 - num2);
//			    }else {
//			    		System.out.printf("%d\n", num2 - num1);
//			    	}
			 // 문제 : 할인 대상인지 아닌지 출력해주세요.
			 // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
			 // 조건 : 출력예시 처럼 출력되어야 합니다.
			 // 조건 : `구현시작` 부분만 수정 할 수 있습니다..
			 // 조건 : 2가지 이상의 방법으로 풀어야 합니다.
			    int age = 20; // 이 값을 바꿔가면서 실행해보세요.

			    System.out.println("당신의 나이는 " + age + "살 입니다.");

			    // 구현시작
//			    if(age <= 19 || age >=60) {
//			    	System.out.println("할인대상입니다.");
//			    }
//			    if(age > 19 && age < 60) {
//			    	System.out.println("할인대상이 아닙니다.");
//			    }
//			    if(age <= 19 || age >=60) {
//	    	System.out.println("할인대상입니다.");
//		    }else {
//		    	System.out.println("할인대상이 아닙니다.");
//		    }
			    // if문만 이용해서 풀기
			    // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
			    /*
			    어떤 차의 높이가 170cm 입니다..
			    이 차는 3개의 터널을 차례대로 지나게 될 것입니다.
			    터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 납니다.
			    차가 모든 터널을 무사히 잘 통과하면 PASS 를 출력하고, 충돌한다면 CRASH 를 출력하세요.
			    */
//			    int tunnel1 = 180;
//			    int tunnel2 = 182;
//			    int tunnel3 = 172;
//			    int car = 180;
//			    
//			    if(tunnel1 <= car) {
//			    	System.out.println("CRASH");
//			    }else {
//			    	System.out.println("PASS");
//			    }
//			    if(tunnel2 <= car) {
//			    	System.out.println("CRASH");
//			    }else {
//			    	System.out.println("PASS");
//			    }
//			    if(tunnel3 <= car) {
//			    	System.out.println("CRASH");
//			    }else {
//			    	System.out.println("PASS");
//			    }
			 // 1. 1 ~ 100까지 출력
//			    for(int i =1; i <=100; i++) {
//			    	System.out.println(i);
//			    }
			    // 2. -25 ~ 50까지 출력
//			    for(int i = -25; i <=50; i++) {
//			    	System.out.println(i);
//			    }
			    // 3. 1 ~ 100 까지 짝수만 출력 
//			    for(int i = 1; i<=100; i++) {
//			    	if(i%2==0) {
//			    		System.out.println(i);
//			    	}
//			    }
			    // 짝수 판별 방법 : 2로 나누어 나머지가 0이면 짝수.
			    
			    // 4. 100 ~ 200 사이의 홀수만 출력
			    // 홀수 판별 방법 : 짝수가 아니면 홀수
//			    for(int i = 100; i <= 200; i++) {
//			    	if(i%2!=0) {
//			    		System.out.println(i);
//			    	}
//			    }
			    // 5. 1 ~ 500 사이의 수 중 4의 배수만 출력
			    // n의 배수 판별 방법 : 어떤 숫자를 n으로 나눈 나머지가 0이면 n의 배수
//			    for(int i = 1; i <=500; i++) {
//			    	if(i%4 == 0) {
//			    		System.out.println(i);
//			    	}
//			    }
			    // 6. 1 ~ 1000 사이의 수 중 1000의 약수만 출력 -> 1000 % a == 0
			    // 약수 -> 1000을 a로 나누었을 때 나누어 떨어지면를 a 1000의 약수라고 한다.
			    // 약수는 1 ~ 자기자신만 대상 수로 한다.
			    // 나누어 떨어진다는 것은 나누었을 때 나머지가 0이라는 것을 의미한다.
//				for(int i = 1; i <= 1000; i++) {
//					if(1000%i==0) {
//						System.out.println(i);
//					}
//				}

			    // 7. 1 ~ 1000 사이의 수 중 3의 배수 이면서 5의 배수인 수만 출력
//			    for(int i = 1; i <=1000; i++) {
//			    	if(i%3 == 0) {
//			    		if(i%5 ==0) {
//			    			System.out.println(i);
//			    		}
//			    	}
//			    }
			    // 8. 1 2 3 4 5 10번 출력
//			    for(int i= 1; i <=5; i++) {
//			    	for(int j=1; j<=10; j++) {
//			    		System.out.printf("%d", i);
//			    	}
//			    	System.out.println();
//			    }
			    // 9. 구구단 2~9단 출력
//			    for(int i = 2; i <= 9; i++) {
//			    	for(int j = 1; j <= 9; j++) {
//			    		System.out.printf("%d * %d = %d\n", i,j,i*j);
//			    	}
//			    }
			    // 10. 구구구단 출력
			    /* 
			    1 * 1 * 1 = 1
			    1 * 1 * 2 = 2
			    ...
			    2 * 1 * 1 = 2
			    ...
			    9 * 9 * 9 = 729

			    */
//			    for(int i = 1; i <=9; i++) {
//			    	for(int j = 1; j<=9; j++) {
//			    		for(int n = 1; n<=9; n++) {
//			    			System.out.printf("%d * %d * %d = %d\n", i,j,n, i*j*n);
//			    		}
//			    	}
//			    }
			 // 출력
//			    for(int i=1; i <=3; i++) {
//			    	for(int j = 0; j < i; j++) {
//			    		System.out.printf("*");
//			    	}
//			    	System.out.println("");
//			    }
			    /*
			    높이 : [3]
				
			    *
			    **
			    ***


			    */
			    
//			    for(int i = 1; i <=5; i++) {
//			    	for(int j = 0; j < i; j++) {
//			    		System.out.printf("*");
//			    	}
//			    	System.out.println();
//			    }
			    /*

			    높이 : [5]
			    
			    *
			    **
			    ***
			    ****
			    *****

			    */
//			    for(int i = 1; i <=7; i++) {
//			    	for(int j = 0; j < i; j++) {
//			    		System.out.printf("*");
//			    	}
//			    	System.out.println();
//			    }
			    /*

			    높이 : [7]

			    *
			    **
			    ***
			    ****
			    *****
			    ******
			    *******
			    
			    */
			 // 출력
			    for(int i = 1; i <=3; i++) {
			    	for(int j = 3; j > 0; j--) {
			    		if(i<j) {
			    			System.out.printf(" ");
			    		}else {
			    			System.out.printf("*");
			    		}
			    	}
			    	System.out.println("");
			    }
			    /*

			    높이 : [3]

			      *
			     **
			    ***
			    
			    */
//			    for(int i=1; i <= 5; i++) {
//			    	for(int j = 5; j > 0; j--) {
//			    		if(i<j) {
//			    			System.out.printf(" ");
//			    		}else {
//			    			System.out.printf("*");
//			    		}
//			    	}
//			    	System.out.println();
//			    }
			    /*

			    높이 : [5]

			        *
			       **
			      ***
			     ****
			    *****

			    */
			    for(int i=1; i <= 7; i++) {
			    	for(int j = 7; j > 0; j--) {
			    		if(i<j) {
			    			System.out.printf(" ");
			    		}else {
			    			System.out.printf("*");
			    		}
			    	}
			    	System.out.println();
			    }
			    /*

			    높이 : [7]

			          *
			         **
			        ***
			       ****
			      *****
			     ******
			    *******

			    */
	}

}
