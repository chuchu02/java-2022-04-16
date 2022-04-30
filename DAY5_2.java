package java_exam;

import java.util.Scanner;

public class DAY5_2 {

	public static void main(String[] args) {
		
		//입력 => 처리 => 출력
		
		//입력 -> 파일입력, 키보드 입력, 마우스 입력
		//처리 -> 프로그램
		//출력 -> System.out.println() - 표준 입,출력 장치(키보드/모니터)

		// 컨트롤 + 쉬프트 + 0 입력		
//		Scanner scan = new Scanner(System.in);
//		
//		
//		System.out.printf("첫번째 데이터를 입력해주세요 : ");
//		String s =scan.nextLine(); // 입력 데이터를 읽어와서 리턴.(키보드를 통해 들어온 입력 저장소에 저장 된 값을 가져옴)
//		
//		System.out.print("두번째 데이터를 입력해주세요 : ");
//		String s2 = scan.nextLine();
//		
//		System.out.printf("당신이 입력한 값은 : %s %s\n" , s, s2);
		
		Scanner scan = new Scanner(System.in);
		
		//정수값 입력 시 = > Integer.parseInt() 사용
		System.out.printf("첫번째 데이터를 입력해주세요 : ");
		int s = Integer.parseInt(scan.nextLine()); // 입력 데이터를 읽어와서 리턴.(키보드를 통해 들어온 입력 저장소에 저장 된 값을 가져옴)
		
		System.out.print("두번째 데이터를 입력해주세요 : ");
		int s2 = Integer.parseInt(scan.nextLine());
		
		System.out.printf("당신이 입력한 값은 : %d %d\n" , s, s2);
		System.out.println(s + s2);
	}

}
