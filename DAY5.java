package java_exam;

import java.util.Scanner;

public class DAY5 {

	// ���� �Լ�
	public static int test(int num) {
//�ܼ�â ���	System.out.println(25);
// ruturn �� ����
		return num * num;
	}

	public static String vendingMachine(int inputMoney, int bno) {

		String[] beverageNames = { "�ݶ�", "���̴�", "Ŀ��", "����" };
		int[] beveragePrices = { 1200, 1000, 800, 600 };
		
		System.out.printf("���� �ݾ��� %d�� �Դϴ�.\n", inputMoney);
		if (inputMoney < beveragePrices[bno]) {
			System.out.println("�ܾ��� �����մϴ�");
			return null;
		}
		
		System.out.printf("%s�� �����̽��ϴ�.\n" , beverageNames[bno]);
		int remainder = inputMoney - beveragePrices[bno];
		System.out.printf("�ܾ��� %d �Դϴ�.\n", remainder);

		return beverageNames[bno];
	}

	public static void main(String[] args) {
		// 1.�Լ�
		// 2.����
		// 3.ȣ��
		// 4.����(�Լ��� �Լ��� ������ ��ȯ)

		// return �� ȣ��
//		int rt = test(10);
//		System.out.println(rt /2);
//		
//		int rt2 = test(5);
//		System.out.println(rt2 * 2);
		
		Scanner scan = new Scanner(System.in);
		// ��, ���� �����
		// 0 = �ݶ�(1200) , 1 = ���̴�(1000) , 2 = Ŀ��(800) , 3 = ����(600)
		
		System.out.println("==================��������==================");
		System.out.println("0 : �ݶ�(1200��)");
		System.out.println("1 : ���̴�(1000��)");
		System.out.println("2 : Ŀ��(800��)");
		System.out.println("3 : ����(600��)");
		System.out.println("====================================");
		System.out.print("���� �ݾ��� �����Ͻðڽ��ϱ� : ");
		int inputMoney = Integer.parseInt(scan.nextLine());
		
		System.out.print("� ������� �����Ͻðڽ��ϱ� : ");
		int bno = Integer.parseInt(scan.nextLine());
		
		String beverage = vendingMachine(inputMoney , bno);

		if (beverage == null) {
			System.out.println("ȫ�浿�� ������� ���� �� �����ϴ�.");
		} else {
			System.out.printf("ȫ�浿�� %s�� �������� ���ʴϴ�.\n", beverage);
		}
		
	}

}
