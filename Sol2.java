package java_exam;

public class Sol2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� : �ڵ����� �ִ�ӷ� 220km�� �޸��ϴ�.
	    // ��� : �ڵ����� �ִ�ӷ� 250km�� �޸��ϴ�.

		//������ + �Լ�(����)�� �̷������ => ��ü == �ν��Ͻ�
		car c1 = new car();
		c1.maxVelo = 200;
		
		car c2 = new car();
		c2.maxVelo = 300;
		
		car c3 = new car();
		c3.maxVelo = 400;
		
		c1.run();
		c1.run();
		c1.run();
		
		c1.run();
		c2.run();
		c3.run();
		
	}

}
//�ִ�ӷ�
class car {
	 int maxVelo;
	 
	 public void run() {
			System.out.printf("�ڵ����� �ִ�ӷ� %dkm�� �޸��ϴ�.\n", maxVelo);
		}
}
