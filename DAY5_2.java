package java_exam;

import java.util.Scanner;

public class DAY5_2 {

	public static void main(String[] args) {
		
		//�Է� => ó�� => ���
		
		//�Է� -> �����Է�, Ű���� �Է�, ���콺 �Է�
		//ó�� -> ���α׷�
		//��� -> System.out.println() - ǥ�� ��,��� ��ġ(Ű����/�����)

		// ��Ʈ�� + ����Ʈ + 0 �Է�		
//		Scanner scan = new Scanner(System.in);
//		
//		
//		System.out.printf("ù��° �����͸� �Է����ּ��� : ");
//		String s =scan.nextLine(); // �Է� �����͸� �о�ͼ� ����.(Ű���带 ���� ���� �Է� ����ҿ� ���� �� ���� ������)
//		
//		System.out.print("�ι�° �����͸� �Է����ּ��� : ");
//		String s2 = scan.nextLine();
//		
//		System.out.printf("����� �Է��� ���� : %s %s\n" , s, s2);
		
		Scanner scan = new Scanner(System.in);
		
		//������ �Է� �� = > Integer.parseInt() ���
		System.out.printf("ù��° �����͸� �Է����ּ��� : ");
		int s = Integer.parseInt(scan.nextLine()); // �Է� �����͸� �о�ͼ� ����.(Ű���带 ���� ���� �Է� ����ҿ� ���� �� ���� ������)
		
		System.out.print("�ι�° �����͸� �Է����ּ��� : ");
		int s2 = Integer.parseInt(scan.nextLine());
		
		System.out.printf("����� �Է��� ���� : %d %d\n" , s, s2);
		System.out.println(s + s2);
	}

}
