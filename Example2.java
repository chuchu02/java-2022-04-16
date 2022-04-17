
public class Example2 {

	public static void main(String[] args) {
		//구구단
		//포맷 출력 -> 줄바꿈 x
		//줄바꿈 문자 -> \n
		// %d ->정수
		// %s ->문자열
		// %f ->실수
		System.out.printf("2 + 5 = 7\n");
		System.out.printf("aaa\n");
		System.out.printf("%d + %d = %d\n\n", 2, 5 ,2+5);
		
		//7단
		int i = 7;
		for(int n = 1; n <=9; n++) {
			
			System.out.printf("%d * %d = %d\n", i , n ,i*n);
		}
		for(int x = 1; x <= 9; x++) {
			for(int y = 1; y <= 9; y++) {
				System.out.printf("%d * %d = %d\n", x, y, x*y);
			}
		}

}
}
