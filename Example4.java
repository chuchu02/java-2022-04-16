package java_exam;

public class Example4 {
	//Hong �̶�� Ŭ�������� �ڷ����� ������ �� ����.
	//Hong �̶�� ���ο� �ڷ����� ����ڴ�.
	public static void introduce(Hong hong) {
		System.out.printf("�ȳ��ϼ���. %d�� %s�Դϴ�.\n", hong.age, hong.name);
	}
	public static void main(String[] args) {
		
		// ���
		// ����, �̸�
		
		
		
		
		//�ڱ�Ұ�
		//���� ���� �����ϴ� ���. -> class ���� = new class();
		Hong h  = new Hong();
		introduce(h);
//		introduce(Lee);
	}

}
//Hong �̶�� ���ο� �ٱ��� ����.
class Hong{
	static int age = 22;
	static String name = "ȫ�浿";
}
class Lee{
	static int age = 33;
	static String name = "�̼���";
}
