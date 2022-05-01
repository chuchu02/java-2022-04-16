package java_exam;

import java.util.Scanner;

public class test2_1 {
	
	
	
	public static void main(String[] args) {
		String data = null;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; ; i++) {
			System.out.print("기능을 선택해주세요 (1. 값 저장, 2. 값 조회) :");
			int menu = Integer.parseInt(scan.nextLine());
			
			if(menu == 1) {
				System.out.print("저장할 값을 입력해주세요 : ");
				data = scan.nextLine();
				
			} else if(menu == 2) {
				System.out.printf("당신이 저장한 값: %s\n", data);
				
			} else {
				System.out.println("잘못된 명령입니다.");
				
			}
		}		
		
		// 기능을 선택해주세요 (1. 값 저장, 2. 값 조회) : 1
		// 저장할 값을 입력해주세요 : hello
		// 기능을 선택해주세요 (1. 값 저장, 2. 값 조회) : 2
		// 당신이 저장한 값: hello

	}

}
