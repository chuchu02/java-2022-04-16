package java_exam;

public class Sol3 {

	public static void introduce(int age, String name) {
		System.out.printf("�ȳ��ϼ���." + age + "��" + name + "�Դϴ�.");
	}

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.name = "ȫ�浿";
//		p1.age = 27;
//
//		Person p2 = new Person();
//		p2.name = "ȫ���";
//		p2.age = 25;
//
//		p1.introduce(); // �ȳ��ϼ��� 27�� ȫ�浿�Դϴ�.
//		p2.introduce(); // �ȳ��ϼ��� 25�� ȫ����Դϴ�.

	    Car c1 = new Car();
	    c1.model = "�ҳ�Ÿ";
	    c1.color = "�Ͼ��";
	    c1.speed = 100;
//
//	    // =====================================================
//	    // ���⿡ c2 ����
//
//	    // =====================================================
//
//	    c1.drive(); // �Ͼ�� �ҳ�Ÿ��/�� 100km�� �޸��ϴ�.
//	    c2.drive(); // ������ �����/�� 70km�� �޸��ϴ�.
//	    
//	    Cat cat1 = new Cat();
//	    cat1.name = "�Ƹ�";
//	    cat1.age = 4;
//	    cat1.kind = "���þȺ��";
//
//	    // =====================================================
//	    // ���⿡ cat2 ����
//
//	    // =====================================================
//
//	    cat1.meow() // 4�� ���þȺ�� ����� �Ƹ��� �߿��ϰ� ��ϴ�.
//	    cat2.meow() // 6�� �� ����� ���� �߿��ϰ� ��ϴ�.
//
//	    Warrior w1 = new Warrior();
//	    w1.name = "�̼���";
//	    w1.attack = 20;
//	    w1.defense = 10;

		// =====================================================
		// ���⿡ w2 ����

		// =====================================================

//	    w1.status(); // �̸� : �̼���, ���ݷ� : 20, ���� : 10 
//	    w2.status(); // �̸� : ������, ���ݷ� : 15, ���� : 15 
//
//	    w1.attack(); // �̼����� 20�� �������� �����δ�.
//	    w2.attack(); // �������� 15�� �������� �����δ�. 
//
//	    w1.defense(); // �̼����� 10 �������� ����մϴ�.
//	    w2.defense(); // �������� 15 �������� ����մϴ�.

	}

}

//class Person {
//	int age;
//	String name;
//
//	public Person(int data1, String data2) {
//		System.out.println("����� �Ѹ� �����˴ϴ�.");
//		age = data1;
//		name = data2;
//	}
//}

class Car {
	String model;
	String color;
	int speed;
	
	public void drive() {
		System.out.printf("%s %s�� %dkm�� �޸��ϴ�." , color, model, speed);
	}
}

//===========================================================
//Person, Car, Cat, Warrior Ŭ���� ����
