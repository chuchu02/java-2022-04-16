package java_exam;

public class gugu {

	

	public static void gugu(int dan2, int gop) {//�Ű�����

		for (int i = 1; i <= gop; i++) {
			System.out.printf("%d x %d = %d\n", dan2, i, dan2 * i);
		}
	}
	public static void output(int a) {
		System.out.printf("%d\n" , a);
	}
	
	public static void self(int b) {
		for(int  i = 0; i < b; i++) {
			System.out.println("�ȳ��ϼ���. ���� ȫ�浿 �Դϴ�.");
		}
	}
	
	public static void greeting1(int x) {
		if(x == 2) {
			System.out.println("����~");
		}else if(x == 3) {
			System.out.println("����");
		}else if(x == 1) {
			System.out.println("�ȳ��ϼ���~~");
		}
	}
	public static void greeting2(int x , int y) {
		for(int  i = 0; i < y; i++) {
			if(x == 2) {
				System.out.println("����~");
			}else if(x == 3) {
				System.out.println("����");
			}else if(x == 1) {
				System.out.println("�ȳ��ϼ���~~");
			}
		}
	}
	public static void main(String[] args) {
		// ������
//		gugu(2 , 9);
//		gugu(3 , 15);
//		gugu(4 , 20);
		
		//�Ű� ����1
		output(4);
		output(10);
		output(100);
		
		//�Ű� ����2
//		self(5);
//		
//		self(10);
//		
//		self(15);
		
		greeting1(1);
//		greeting1(2);
//		greeting1(3);
		greeting2(1 , 3);
		greeting2(2 , 5);
		greeting2(3 , 7);
	}


}
