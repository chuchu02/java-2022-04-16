package java_exam;

public class Array_exam {

	public static void main(String[] args) {
//		//배열
//		//많은 데이터를 수월하게 처리하기 위함.
//		
//		//변수만 사용 시 데이터 갯수가 많아졌을때 관리가 안된다.
//		
//		int numArr[] = {10, 20, 30, 40, 50}; // 정수배열
//		//배열은 경계값을 항상 주의
//		//시작 - > 0
//		//끝 - > 배열의 갯수 - 1
//		System.out.println(numArr[3]); // 배열은 순서가 0부터 시작
//		
//		//타입이 같아야함
////		String[] StringArr = {"aa", "bb", "cc", 10}; //오류
//		
//		//배열의 핵심요소 2가지 -> 자료형(타입), 길이
//		
//		//사용자 입력, 파일 데이터, 데이터베이스 등등 외부 데이터를 불러올 때 사용
//		
//		int[] intArr = new int[100]; // 배열을 만드는 일반적인 방법
//		System.out.println(intArr[2]);
//		
//		//1. 숫자 배열은 0으로 초기화
//		//2. 그 외 배열은 null로 초기화
//		// null -> 데이터가 없다.(비어있다.)
//		
//		String[] strArr = new String[10];
//		System.out.println(strArr[0]);
//		
//		//수정
//		strArr[0] = "hello";
//		String str1 = strArr[0];
//		System.out.println(str1);
//		
//		strArr[1] = "byebye";
//		strArr[2] = "goodbye";
//		
//		//일괄 조회 - >배열은 거의 반드시 반복문과 같이 사용됨.
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
//		System.out.println(strArr[3]);
//		
//		for(int i=0; i <= 9; i++) {
//			System.out.println(strArr[i]);
//		}
//		
//		//배열은 길이 정보를 제공.
//		
//		System.out.println(strArr.length);
//		System.out.println(intArr.length);
//		
//		//배열 전체 조회
//		for(int  i =0; i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
		
		//학생 성적 관리
		//이름
		String[] names = {"철수", "영희", "민철", "수빈", " 길동"};
		//성적
		int[] scores = {100, 90, 80 ,90 ,60};
		
		//학생들의 점수 총합
		int sum = 0;
		int avg = 0;
		for(int i =0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		//1. 학생들의 점수 평균
		avg = sum / scores.length;
		System.out.println(avg);		
		//2. 평균 이상인 학생 출력
		for(int i =0; i < scores.length; i++) {
			if(scores[i] > avg) {
			System.out.println(names[i]);
			}
		}
		//3. 점수가 가장 높은 학생 출력
		int max = scores[0];
		int target = 0;
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				target = i;
			}
		}
		System.out.println(names[target]);
		//4. 점수가 가장 낮은 학생 출력
		int min = scores[0];
		for(int i = 0; i < scores.length; i++) {
			if(min > scores[i]) {
				min = scores[i];
				target = i;
			}
		}
		System.out.println(names[target]);
	}

}
