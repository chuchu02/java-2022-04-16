package java_exam;

import java.util.Scanner;

public class test2_1 {
	
	
	
	public static void main(String[] args) {
		String data = null;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; ; i++) {
			System.out.print("����� �������ּ��� (1. �� ����, 2. �� ��ȸ) :");
			int menu = Integer.parseInt(scan.nextLine());
			
			if(menu == 1) {
				System.out.print("������ ���� �Է����ּ��� : ");
				data = scan.nextLine();
				
			} else if(menu == 2) {
				System.out.printf("����� ������ ��: %s\n", data);
				
			} else {
				System.out.println("�߸��� �����Դϴ�.");
				
			}
		}		
		
		// ����� �������ּ��� (1. �� ����, 2. �� ��ȸ) : 1
		// ������ ���� �Է����ּ��� : hello
		// ����� �������ּ��� (1. �� ����, 2. �� ��ȸ) : 2
		// ����� ������ ��: hello

	}

}