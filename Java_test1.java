package java_exam;

public class Java_test1 {

	public static void main(String[] args) {
		// arr �迭�� 10, 20, 30, 40, 50, 60, 70, 80, 90, 100�� �����ϰ� ������ּ���.
//	int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	
		int[] arr2 = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr2[i] = (i + 1) * 10;
		}
		
		for(int i = 0; i <10; i++) {
			System.out.println(arr2[i]);
		}
		
		// �迭�� �ι� ������ּ���.
		int[] arr = {1,2,3,4,5};
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(arr[j]);
			}
		}
		
		 // �迭�� 5���� ���� �Է��ϰ� �Ųٷ� ������ּ���. 
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
