package java_exam;

public class java_0430 {

	public static int func1() {

		return 10;
	}

	public static int func2(int num) {
		return num;
	}

	public static int func3(int num) {
		return num * num;
	}

	public static int func4(int num1, int num2) {
		return num1 + num2;
	}

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiple(int num1, int num2) {
		return num1 * num2;
	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

	public static int square(int num1) {
		return num1 * num1;
	}

	public static boolean isNegative(int no) {
		if(no < 0) {
			return true;
		}else {
		return false;
	}
}
	 public static boolean isEven(int num) {
		 if(num % 2 == 0) {
			 return true;
		 }
		 return false;
	  }

	  public static void printEven(int n) {
		  for(int i = 1; i <= n; i++) {
			  if(isEven(i)) {
				  System.out.printf("%d ", i);
			  }
		  }
		  	System.out.println();
	  }
	public static void main(String[] args) {
//		int a = func1();
//	    System.out.println(a);
//	    // ��� : 10
//	    int b = func1();
//	    System.out.println(b);
//	    // ��� : 10
//
//	    int c = func2(22);
//	    System.out.println(c);
//	    // ��� : 22
//	    
//	    int d = func2(55);
//	    System.out.println(d);
//	    // ��� : 55
//
//	    int e = func3(10);
//	    System.out.println(e);
//	    // ��� : 100
//	    int f = func3(5);
//	    System.out.println(f);
//	    // ��� : 25
//
//	    int g = func4(10, 30);
//	    System.out.println(g);
//	    // ��� : 40
//
//	    int h = func4(20, 50);
//	    System.out.println(h);
//	    // ��� : 70

//	    int rst1 = plus(10, 20);
//	    System.out.println(rst1);  // ��� : 30
//
//	    int rst2 = minus(10, 20);
//	    System.out.println(rst2); // ��� : -10
//
//	    int rst3 = multiple(5, 4);
//	    System.out.println(rst3); // ��� : 20
//
//	    int rst4 = divide(10, 3);
//	    System.out.println(rst4); // ��� : 3
//
//	    int rst5 = square(5);
//	    System.out.println(rst5); // ��� : 25

		// 0�� ����� ���ڽ��ϴ�.
//		int no = -1;
//
//		if (isNegative(no)) {
//
//			System.out.println("�����Դϴ�.");
//
//		} else {
//
//			System.out.println("����Դϴ�.");
//
//		}
		// no ���� �ٲ㰡�鼭 �׽�Ʈ�غ�����.
		
		 printEven(10); // ���: 2 4 6 8 10
		 printEven(20); // ���: 2 4 6 8 10 12 14 16 18 20
		 printEven(5); // ���: 2 4 

	}

}
