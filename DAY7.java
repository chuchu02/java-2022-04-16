package java_exam;

public class DAY7 {
	
	public static void main(String[] args) {
		int a;
		
//		Person p1 = new Person(); // new Person() => Person 한개 복사해줘
//		
//		p1.age = 20;
//		p1.name="홍길동";
//		p1.home = "대전";
//		System.out.println(p1.age);
//		System.out.println(p1.name);
//		System.out.println(p1.home);
//		
//		Person p2 = new Person();
//		
//		p2.age = 22;
//		p2.name = "영희";
//		p2.home ="서울";
//		
//		System.out.println(p2.age);
//		System.out.println(p2.name);
//		System.out.println(p2.home);
//		
//		System.out.println(p2.age);
//		System.out.println(p2.name);
//		System.out.println(p2.home);
//		
//		//객체 생성(선언)
//		Person p3 = new Person();
//		p3.setData(30, "이순신", "청주");
//		
//		System.out.println(p3.name);
//		//초기화 필수!!
////		p3.age = 30;
////		p3.name="이순신";
////		p3.home="청주";
//		
//		Person p4 = new Person();
//		p4.setData(22, "신사임당", "한양");
//		System.out.println(p4.name);
		
		Person p1 = new Person(20, "홍길동", "서울");

		Person p2 = new Person(22, "홍길순", "청주");
		
		Person p3 = new Person(30, "임꺽정", "대전");
	}

}

//양식 , 템플릿, 틀
class Person{
	//static = > 원본에 적는 것
	//static이 붙지 않은것 = > 복사본에 붙였을 떄
	int age; // 복사본을 사용할 때 static을 제거
	String name;
	String home;
	
	//1. 리턴 타입x
	//2. 반드시 클래스명과 동일해야함.
	//3. 객체가 생성될 때 반드시 실행되는 메서드 => 생성자
	public Person(int data1, String data2, String data3) {
		System.out.println("사람이 한명 생성됩니다.");
		age = data1;
		name = data2;
		home= data3;
	}
	
	
}
