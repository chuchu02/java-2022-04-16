package java_exam;

public class DAY6 {

	//모든 함수가 같이 사용할 수 있는 변수
	static int num = 10;
	static int num2 = 30;
	
	//함수의 매개변수도 지역변수
	public static void test(int param) {
		int num = 10;
		System.out.println(num2); // 함수는 일반적으로 자신의 지역변수만 사용가능
	}
	public static void main(String[] args) {
		
		//지역변수 , 변수의 생명주기(스코프)
		
		//시스템 -> 프로그램 -> 변수를 제거하는 규칙.
		
		//변수 사용 지역을 정하고, 지역({})이 끝나면 변수는 사라진다.(변수의 메모리는 한정되어 있기에 지역이 끝나면 변수도 사라져야한다.)
		
		int a= 20;
		{
			
			System.out.println(a); // 안쪽 지역에 있는 명령어는 바깥쪽 지역의 변수에 적용 받을 수 있다.
		}
//			System.out.println(a); // int a의 지역안에 속하지 못하므로 a값이 없다고 뜬다.
		
		//반복문에서 int i는 반복문이 끝나면 사라진다.
//		for(int i =0; i <10; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i =0; i <10; i++) {
//			System.out.println(i);
//		}
		
		System.out.println(num); // num이라는 변수는 test()의 지역변수 이기때문에  main에서 사용 불가.
	}

}
