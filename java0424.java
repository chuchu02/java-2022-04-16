package java_exam;

public class java0424 {

	public static void main(String[] args) {
		// 다음 배열을 정렬해주세요.
	      int[] arr = {4,1,6,3,2,8,7,5};

	      // 오름차순 : 작은수 > 큰수
	      //0. 반복문을 이용해서 두개씩 출력
	      for(int i =0; i < 7; i++) {
	    	  System.out.printf("%d %d\n", arr[i] , arr[i+1]);
	      }
	      //1. 가장 큰수를 가장 뒤로 보내기(값 교체 알고리즘 적용)
	      
	     for(int j = 0; j < arr.length; j++) {
	    	 for(int i = 0; i < arr.length-1; i++) {
	    	 if(arr[i] > arr[i+1]) {
	    		 int arr2 = arr[i];
	    		 arr[i] = arr[i+1];
	    		 arr[i+1] = arr2;
	    	 }
	     }
	    }
//	      for(int j =arr.length-1; j >= 2; j--) {
//	    	  for(int i = 0; i < j; i++) {
//	    		  if(arr[i] > arr[i+1]) {
//	    			  int arr2 = arr[i];
//	    			  arr[i] = arr[i+1];
//	    			  arr[i+1] = arr2;
//	    		  }
//	    	  }
//	      }
	     
	      // 내림차순 : 큰수 > 작은수
	     
	     
	      // 정렬된 데이터는 탐색속도가 압도적으로 빠름
	      for(int i = 0; i < arr.length; i++) {
	        System.out.printf("%d ", arr[i]);
	      }

	}

}
