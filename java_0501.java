package java_exam;

import java.util.Scanner;

public class java_0501 {

	public static void gugu(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i ,dan*i);
		}
	}
	
	public static void main(String[] args) {
		//Scanner�� �̿��ؼ� �Ʒ��� ���� ����� �Ͽ� ��Ģ������ �������ּ���.
		//����� ����
		//ù��° ���ڸ� �Է����ּ���: 12
		//�ι�° ���ڸ� �Է����ּ���: 33
		//12 + 33 = 45

		Scanner scan = new Scanner(System.in);
		// �Է� ���� 1
		System.out.printf("ù��° ���ڸ� �Է��� �ּ��� : ");
		int a = Integer.parseInt(scan.nextLine());
		
		System.out.print("�ι�° ���ڸ� �Է��� �ּ��� : ");
		int b = Integer.parseInt(scan.nextLine());
		
		System.out.printf("%d + %d = %d\n", a , b , a+b);
		
		// �Է¹��� 2
		System.out.println("�̸��� �Է����ּ���:");
		String name = scan.nextLine();
		
	    System.out.println("���̸� �Է����ּ���:");
	    int age = Integer.parseInt(scan.nextLine());
	    
	    System.out.printf("�ȳ��ϼ��� %d�� %s�Դϴ�.\n", age, name);

	    // ��� : �ȳ��ϼ��� 29�� ȫ�浿�Դϴ�.
		
		 // Scanner�� �̿��� �Է°��� �޾�
	    // �������� ���ϴ� ���� ������ ���ּ���.

		//�Է¹��� 3
	    //����) ���ϴ� ���� �Է����ּ��� : 4 (�Է��� ����)

	    // 4�� ���.
		System.out.printf("���ϴ� ���� �Է����ּ��� : ");
//		int dan = Integer.parseInt(scan.nextLine());
//		System.out.println("==========������ ���==========");
//		for(int i = 1; i < 10; i++) {
//			System.out.printf("%d * %d = %d\n", dan, i ,dan*i);
//		}
//		System.out.println("==========������ ��==========");
		
		//�ݺ� ������ ���ָ� ���� �ݺ�
		
		//�ݺ����� �����ϴ� ��� -> break ���
		//break => �ݺ��� ���� ����
		System.out.println("==========������ ���==========");
		for(int i = 0; ; i++) {
			System.out.printf("���ϴ� ���� �Է����ּ���(����� 0) : ");
			int dan = Integer.parseInt(scan.nextLine());
			
			if(dan == 0) {
				System.out.println("������ ���α׷��� �����մϴ�.");
				break;
			}
			gugu(dan);
		}
	}

}
