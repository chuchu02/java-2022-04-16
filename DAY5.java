package java_exam;

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

		// ��, ���� �����
		// 0 = �ݶ�(1200) , 1 = ���̴�(1000) , 2 = Ŀ��(800) , 3 = ����(600)

		String beverage = vendingMachine(800, 1);

		if (beverage == null) {
			System.out.println("ȫ�浿�� ������� ���� �� �����ϴ�.");
		} else {
			System.out.printf("ȫ�浿�� %s�� �������� ���ʴϴ�.\n", beverage);
		}
		
		String beverage2 = vendingMachine(100, 1);
		
		if (beverage2 == null) {
			System.out.println("ȫ����� ������� ���� �� �����ϴ�.");
		} else {
			System.out.printf("ȫ����� %s�� �������� ���ʴϴ�.", beverage);
		}
	}

}
