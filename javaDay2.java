
public class javaDay2 {

	public static void main(String[] args) {
		//4대 구성요소
		//자료형, 변수, 조건문, 반복문
		
		//특정 상황에서만 수행되는 명령어
		
		//만약에 날씨가 좋으면...
		//1. 맑음 2.비
		
		int weather = 2;
		
//		System.out.println(weather);
		// == 좌항과 우항이 같다.
		if(weather == 1){
		System.out.println("창문을 열어라");
		}
//		if(weather == 2) {
//			System.out.println("창문을 닫아라");
//		}
		else {
			System.out.println("창문을 닫아라");
		}
		
		int sex = 1; // 1.남자 2. 여자
		if(sex == 1) {
			System.out.println("남자입니다.");
		}
		else {
			System.out.println("여자입니다.");
		}
		
		//여러가지 조건 중 택 1
		int crossroad = 3; // 1.직진, 2.좌회전, 3.우회전
		
//		if(crossroad == 2) {
//			System.out.println("직진을 합니다.");			
//		}
//		else {
//		if(crossroad == 1) {
//		System.out.println("좌회전을 합니다.");
//		}
//		else {
//		System.out.println("우회전을 합니다.");
//		}
//			}
		if(crossroad == 2) {
			System.out.println("직진");
		}
		else if(crossroad == 1) {
			System.out.println("좌회전");
		}
		else {
			System.out.println("우회전");
		}
		
		int age = 17;
		
		//나이에 따른 학적 구분
		if(age >= 8 && age <= 13) {
			System.out.println("초등학생입니다.");
		}
		else if(age >= 14 && age <= 16) {
			System.out.println("중학생입니다.");
		}
		else if(age >= 17 && age <= 19 ) {
			System.out.println("고등학생입니다.");
		}
		else{
			System.out.println("대학생입니다.");
		}
		
	}
}
