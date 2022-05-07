package java_exam;

public class Sol3 {

	public static void introduce(int age, String name) {
		System.out.printf("안녕하세요." + age + "살" + name + "입니다.");
	}

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.name = "홍길동";
//		p1.age = 27;
//
//		Person p2 = new Person();
//		p2.name = "홍길순";
//		p2.age = 25;
//
//		p1.introduce(); // 안녕하세요 27살 홍길동입니다.
//		p2.introduce(); // 안녕하세요 25살 홍길순입니다.

	    Car c1 = new Car();
	    c1.model = "소나타";
	    c1.color = "하얀색";
	    c1.speed = 100;
//
//	    // =====================================================
//	    // 여기에 c2 세팅
//
//	    // =====================================================
//
//	    c1.drive(); // 하얀색 소나타이/가 100km로 달립니다.
//	    c2.drive(); // 검정색 모닝이/가 70km로 달립니다.
//	    
//	    Cat cat1 = new Cat();
//	    cat1.name = "아리";
//	    cat1.age = 4;
//	    cat1.kind = "러시안블루";
//
//	    // =====================================================
//	    // 여기에 cat2 세팅
//
//	    // =====================================================
//
//	    cat1.meow() // 4살 러시안블루 고양이 아리가 야옹하고 웁니다.
//	    cat2.meow() // 6살 샴 고양이 망고가 야옹하고 웁니다.
//
//	    Warrior w1 = new Warrior();
//	    w1.name = "이순신";
//	    w1.attack = 20;
//	    w1.defense = 10;

		// =====================================================
		// 여기에 w2 세팅

		// =====================================================

//	    w1.status(); // 이름 : 이순신, 공격력 : 20, 방어력 : 10 
//	    w2.status(); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15 
//
//	    w1.attack(); // 이순신이 20의 데미지를 입힙민다.
//	    w2.attack(); // 강감찬이 15의 데미지를 입힙민다. 
//
//	    w1.defense(); // 이순신이 10 데미지를 방어합니다.
//	    w2.defense(); // 강감찬이 15 데미지를 방어합니다.

	}

}

//class Person {
//	int age;
//	String name;
//
//	public Person(int data1, String data2) {
//		System.out.println("사람이 한명 생성됩니다.");
//		age = data1;
//		name = data2;
//	}
//}

class Car {
	String model;
	String color;
	int speed;
	
	public void drive() {
		System.out.printf("%s %s가 %dkm로 달립니다." , color, model, speed);
	}
}

//===========================================================
//Person, Car, Cat, Warrior 클래스 만들
