package java_exam;

public class gugu {

	

	public static void gugu(int dan2, int gop) {//매개변수

		for (int i = 1; i <= gop; i++) {
			System.out.printf("%d x %d = %d\n", dan2, i, dan2 * i);
		}
	}
	public static void output(int a) {
		System.out.printf("%d\n" , a);
	}
	
	public static void self(int b) {
		for(int  i = 0; i < b; i++) {
			System.out.println("안녕하세요. 저는 홍길동 입니다.");
		}
	}
	
	public static void greeting1(int lang) {
		if(lang == 2) {
			System.out.println("하이~");
		}else if(lang == 3) {
			System.out.println("봉쥬");
		}else if(lang == 1) {
			System.out.println("안녕하세요~~");
		}
	}
//	public static void greeting2(int lang , int num) {
//		for(int  i = 0; i < num; i++) {
//			if(lang == 2) {
//				System.out.println("하이~");
//			}else if(lang == 3) {
//				System.out.println("봉쥬");
//			}else if(lang == 1) {
//				System.out.println("안녕하세요~~");
//			}
//		}
//	}
	//방법 2
	public static void greeting2(int lang , int num) {
		for(int  i = 0; i < num; i++) {
			greeting1(lang);
		}
	}
	
	public static void main(String[] args) {
		// 구구단
//		gugu(2 , 9);
//		gugu(3 , 15);
//		gugu(4 , 20);
		
		//매개 문제1
		output(4);
		output(10);
		output(100);
		
		//매개 문제2
//		self(5);
//		
//		self(10);
//		
//		self(15);
		
		//매개 문제3
		greeting1(1);
//		greeting1(2);
//		greeting1(3);
		greeting2(1 , 3);
		greeting2(2 , 5);
		greeting2(3 , 7);
	}


}
