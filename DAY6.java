package java_exam;

public class DAY6 {

	//��� �Լ��� ���� ����� �� �ִ� ����
	static int num = 10;
	static int num2 = 30;
	
	//�Լ��� �Ű������� ��������
	public static void test(int param) {
		int num = 10;
		System.out.println(num2); // �Լ��� �Ϲ������� �ڽ��� ���������� ��밡��
	}
	public static void main(String[] args) {
		
		//�������� , ������ �����ֱ�(������)
		
		//�ý��� -> ���α׷� -> ������ �����ϴ� ��Ģ.
		
		//���� ��� ������ ���ϰ�, ����({})�� ������ ������ �������.(������ �޸𸮴� �����Ǿ� �ֱ⿡ ������ ������ ������ ��������Ѵ�.)
		
		int a= 20;
		{
			
			System.out.println(a); // ���� ������ �ִ� ��ɾ�� �ٱ��� ������ ������ ���� ���� �� �ִ�.
		}
//			System.out.println(a); // int a�� �����ȿ� ������ ���ϹǷ� a���� ���ٰ� ���.
		
		//�ݺ������� int i�� �ݺ����� ������ �������.
//		for(int i =0; i <10; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i =0; i <10; i++) {
//			System.out.println(i);
//		}
		
		System.out.println(num); // num�̶�� ������ test()�� �������� �̱⶧����  main���� ��� �Ұ�.
	}

}
