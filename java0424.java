package java_exam;

public class java0424 {

	public static void main(String[] args) {
		// ���� �迭�� �������ּ���.
	      int[] arr = {4,1,6,3,2,8,7,5};

	      // �������� : ������ > ū��
	      //0. �ݺ����� �̿��ؼ� �ΰ��� ���
	      for(int i =0; i < 7; i++) {
	    	  System.out.printf("%d %d\n", arr[i] , arr[i+1]);
	      }
	      //1. ���� ū���� ���� �ڷ� ������(�� ��ü �˰��� ����)
	      
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
	     
	      // �������� : ū�� > ������
	     
	     
	      // ���ĵ� �����ʹ� Ž���ӵ��� �е������� ����
	      for(int i = 0; i < arr.length; i++) {
	        System.out.printf("%d ", arr[i]);
	      }

	}

}
