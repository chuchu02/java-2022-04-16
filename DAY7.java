package java_exam;

public class DAY7 {
	
	public static void main(String[] args) {
		int a;
		
//		Person p1 = new Person(); // new Person() => Person �Ѱ� ��������
//		
//		p1.age = 20;
//		p1.name="ȫ�浿";
//		p1.home = "����";
//		System.out.println(p1.age);
//		System.out.println(p1.name);
//		System.out.println(p1.home);
//		
//		Person p2 = new Person();
//		
//		p2.age = 22;
//		p2.name = "����";
//		p2.home ="����";
//		
//		System.out.println(p2.age);
//		System.out.println(p2.name);
//		System.out.println(p2.home);
//		
//		System.out.println(p2.age);
//		System.out.println(p2.name);
//		System.out.println(p2.home);
//		
//		//��ü ����(����)
//		Person p3 = new Person();
//		p3.setData(30, "�̼���", "û��");
//		
//		System.out.println(p3.name);
//		//�ʱ�ȭ �ʼ�!!
////		p3.age = 30;
////		p3.name="�̼���";
////		p3.home="û��";
//		
//		Person p4 = new Person();
//		p4.setData(22, "�Ż��Ӵ�", "�Ѿ�");
//		System.out.println(p4.name);
		
		Person p1 = new Person(20, "ȫ�浿", "����");

		Person p2 = new Person(22, "ȫ���", "û��");
		
		Person p3 = new Person(30, "�Ӳ���", "����");
	}

}

//��� , ���ø�, Ʋ
class Person{
	//static = > ������ ���� ��
	//static�� ���� ������ = > ���纻�� �ٿ��� ��
	int age; // ���纻�� ����� �� static�� ����
	String name;
	String home;
	
	//1. ���� Ÿ��x
	//2. �ݵ�� Ŭ������� �����ؾ���.
	//3. ��ü�� ������ �� �ݵ�� ����Ǵ� �޼��� => ������
	public Person(int data1, String data2, String data3) {
		System.out.println("����� �Ѹ� �����˴ϴ�.");
		age = data1;
		name = data2;
		home= data3;
	}
	
	
}
