package java_exam;

public class Customer {
	int age;
	String name;
	String address;
	
	public Customer(int data1, String data2, String data3) {//class와 같은 이름을 쓰고 매개변수를 공유
		age = data1;
		name = data2;
		address = data3;
	}
	
	public void printName() {
		System.out.println(name);
	}
	public void printAndAge() {
		System.out.println(age);
	}
}
