package java_exam;

public class Array_exam {

	public static void main(String[] args) {
//		//�迭
//		//���� �����͸� �����ϰ� ó���ϱ� ����.
//		
//		//������ ��� �� ������ ������ ���������� ������ �ȵȴ�.
//		
//		int numArr[] = {10, 20, 30, 40, 50}; // �����迭
//		//�迭�� ��谪�� �׻� ����
//		//���� - > 0
//		//�� - > �迭�� ���� - 1
//		System.out.println(numArr[3]); // �迭�� ������ 0���� ����
//		
//		//Ÿ���� ���ƾ���
////		String[] StringArr = {"aa", "bb", "cc", 10}; //����
//		
//		//�迭�� �ٽɿ�� 2���� -> �ڷ���(Ÿ��), ����
//		
//		//����� �Է�, ���� ������, �����ͺ��̽� ��� �ܺ� �����͸� �ҷ��� �� ���
//		
//		int[] intArr = new int[100]; // �迭�� ����� �Ϲ����� ���
//		System.out.println(intArr[2]);
//		
//		//1. ���� �迭�� 0���� �ʱ�ȭ
//		//2. �� �� �迭�� null�� �ʱ�ȭ
//		// null -> �����Ͱ� ����.(����ִ�.)
//		
//		String[] strArr = new String[10];
//		System.out.println(strArr[0]);
//		
//		//����
//		strArr[0] = "hello";
//		String str1 = strArr[0];
//		System.out.println(str1);
//		
//		strArr[1] = "byebye";
//		strArr[2] = "goodbye";
//		
//		//�ϰ� ��ȸ - >�迭�� ���� �ݵ�� �ݺ����� ���� ����.
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
//		System.out.println(strArr[3]);
//		
//		for(int i=0; i <= 9; i++) {
//			System.out.println(strArr[i]);
//		}
//		
//		//�迭�� ���� ������ ����.
//		
//		System.out.println(strArr.length);
//		System.out.println(intArr.length);
//		
//		//�迭 ��ü ��ȸ
//		for(int  i =0; i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
		
		//�л� ���� ����
		//�̸�
		String[] names = {"ö��", "����", "��ö", "����", " �浿"};
		//����
		int[] scores = {100, 90, 80 ,90 ,60};
		
		//�л����� ���� ����
		int sum = 0;
		int avg = 0;
		for(int i =0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		//1. �л����� ���� ���
		avg = sum / scores.length;
		System.out.println(avg);		
		//2. ��� �̻��� �л� ���
		for(int i =0; i < scores.length; i++) {
			if(scores[i] > avg) {
			System.out.println(names[i]);
			}
		}
		//3. ������ ���� ���� �л� ���
		int max = scores[0];
		int target = 0;
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				target = i;
			}
		}
		System.out.println(names[target]);
		//4. ������ ���� ���� �л� ���
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
