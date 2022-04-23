package java_exam;

public class Java_test1 {

	public static void main(String[] args) {
		// arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
//	int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	
		int[] arr2 = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr2[i] = (i + 1) * 10;
		}
		
		for(int i = 0; i <10; i++) {
			System.out.println(arr2[i]);
		}
		
		// 배열을 두번 출력해주세요.
		int[] arr = {1,2,3,4,5};
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(arr[j]);
			}
		}
		
		 // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요. 
		System.out.println(arr[4]); 
		System.out.println(arr[3]); 
		System.out.println(arr[2]); 
		System.out.println(arr[1]); 
		System.out.println(arr[0]);
		
		for(int  i = 4; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
