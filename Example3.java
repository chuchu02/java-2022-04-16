
public class Example3 {

	public static void main(String[] args) {
		// ¦������ Ȧ������ �Ǻ�
				int num = 7;
				if(num % 2 == 0) {
					System.out.println("¦��");
				}else {
					System.out.println("Ȧ��");
				}
				// �μ� num1�� num2�� �־����ϴ�.
				// �� ���� �� ū������ �� ���� ���� �� ����� ������ּ���.
//				int num1 = 10;
//			    int num2 = 15;
//			    
//			    if(num1 > num2) {
//			    	System.out.printf("%d\n", num1 - num2);
//			    }else {
//			    		System.out.printf("%d\n", num2 - num1);
//			    	}
			 // ���� : ���� ������� �ƴ��� ������ּ���.
			 // ���� : ���̰� 19�� �����̰ų� 60�� �̻��̸� ���� ����Դϴ�.
			 // ���� : ��¿��� ó�� ��µǾ�� �մϴ�.
			 // ���� : `��������` �κи� ���� �� �� �ֽ��ϴ�..
			 // ���� : 2���� �̻��� ������� Ǯ��� �մϴ�.
			    int age = 20; // �� ���� �ٲ㰡�鼭 �����غ�����.

			    System.out.println("����� ���̴� " + age + "�� �Դϴ�.");

			    // ��������
//			    if(age <= 19 || age >=60) {
//			    	System.out.println("���δ���Դϴ�.");
//			    }
//			    if(age > 19 && age < 60) {
//			    	System.out.println("���δ���� �ƴմϴ�.");
//			    }
//			    if(age <= 19 || age >=60) {
//	    	System.out.println("���δ���Դϴ�.");
//		    }else {
//		    	System.out.println("���δ���� �ƴմϴ�.");
//		    }
			    // if���� �̿��ؼ� Ǯ��
			    // ��� => ���δ���Դϴ�. �Ǵ� ���� ����� �ƴմϴ�.
			    /*
			    � ���� ���̰� 170cm �Դϴ�..
			    �� ���� 3���� �ͳ��� ���ʴ�� ������ �� ���Դϴ�.
			    �ͳ��� ���̰� ���� ���̺��� ���ų� ���ٸ� ���� �ͳΰ� �浹�Ͽ� ��� ���ϴ�.
			    ���� ��� �ͳ��� ������ �� ����ϸ� PASS �� ����ϰ�, �浹�Ѵٸ� CRASH �� ����ϼ���.
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
			 // 1. 1 ~ 100���� ���
//			    for(int i =1; i <=100; i++) {
//			    	System.out.println(i);
//			    }
			    // 2. -25 ~ 50���� ���
//			    for(int i = -25; i <=50; i++) {
//			    	System.out.println(i);
//			    }
			    // 3. 1 ~ 100 ���� ¦���� ��� 
//			    for(int i = 1; i<=100; i++) {
//			    	if(i%2==0) {
//			    		System.out.println(i);
//			    	}
//			    }
			    // ¦�� �Ǻ� ��� : 2�� ������ �������� 0�̸� ¦��.
			    
			    // 4. 100 ~ 200 ������ Ȧ���� ���
			    // Ȧ�� �Ǻ� ��� : ¦���� �ƴϸ� Ȧ��
//			    for(int i = 100; i <= 200; i++) {
//			    	if(i%2!=0) {
//			    		System.out.println(i);
//			    	}
//			    }
			    // 5. 1 ~ 500 ������ �� �� 4�� ����� ���
			    // n�� ��� �Ǻ� ��� : � ���ڸ� n���� ���� �������� 0�̸� n�� ���
//			    for(int i = 1; i <=500; i++) {
//			    	if(i%4 == 0) {
//			    		System.out.println(i);
//			    	}
//			    }
			    // 6. 1 ~ 1000 ������ �� �� 1000�� ����� ��� -> 1000 % a == 0
			    // ��� -> 1000�� a�� �������� �� ������ �������鸦 a 1000�� ������ �Ѵ�.
			    // ����� 1 ~ �ڱ��ڽŸ� ��� ���� �Ѵ�.
			    // ������ �������ٴ� ���� �������� �� �������� 0�̶�� ���� �ǹ��Ѵ�.
//				for(int i = 1; i <= 1000; i++) {
//					if(1000%i==0) {
//						System.out.println(i);
//					}
//				}

			    // 7. 1 ~ 1000 ������ �� �� 3�� ��� �̸鼭 5�� ����� ���� ���
//			    for(int i = 1; i <=1000; i++) {
//			    	if(i%3 == 0) {
//			    		if(i%5 ==0) {
//			    			System.out.println(i);
//			    		}
//			    	}
//			    }
			    // 8. 1 2 3 4 5 10�� ���
//			    for(int i= 1; i <=5; i++) {
//			    	for(int j=1; j<=10; j++) {
//			    		System.out.printf("%d", i);
//			    	}
//			    	System.out.println();
//			    }
			    // 9. ������ 2~9�� ���
//			    for(int i = 2; i <= 9; i++) {
//			    	for(int j = 1; j <= 9; j++) {
//			    		System.out.printf("%d * %d = %d\n", i,j,i*j);
//			    	}
//			    }
			    // 10. �������� ���
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
			 // ���
//			    for(int i=1; i <=3; i++) {
//			    	for(int j = 0; j < i; j++) {
//			    		System.out.printf("*");
//			    	}
//			    	System.out.println("");
//			    }
			    /*
			    ���� : [3]
				
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

			    ���� : [5]
			    
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

			    ���� : [7]

			    *
			    **
			    ***
			    ****
			    *****
			    ******
			    *******
			    
			    */
			 // ���
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

			    ���� : [3]

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

			    ���� : [5]

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

			    ���� : [7]

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
