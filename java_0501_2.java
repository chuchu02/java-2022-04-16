package java_exam;

import java.util.Random;
import java.util.Scanner;

public class java_0501_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // random��ü�� ������ �߻������ش�.
        // ����.
        // random.nextInt(n) -> 0 ~ n ������ ������ �����ϰ� �ϳ� ����
        // ex)
        // int num = random.nextInt(30);
        // System.out.println(num); // 0 ~ 30 ������ ������ �����ϰ� �ϳ� ���
        int num = random.nextInt(30);
        System.out.println(num);
    
      
        int[] lottoNums = new int[7]; // 1�� ��÷ ��ȣ
        int length = lottoNums.length;

        // �Ʒ��� ���� ����� ��µǵ��� �ζ� ��÷ ��ȣ 7��(���ʽ� ��ȣ ����)�� �������ּ���.
        // 1. ���⿡ ��÷ ��ȣ ���� �ڵ� �ۼ����ּ���.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("�ζ� ��ȣ 7���� ������ �ּ��� : %d %d %d %d %d %d %d\n");
        int ltnum = Integer.parseInt(scan.nextLine());
        
        // ** �ߺ��� ��ȣ�� ����� ��.
        // ======================================================================================           



        // ======================================================================================


        // 1 ��� �ڵ�
        // ======================================================================================
        System.out.print("���õ� �ζ� ��ȣ : ");



        // ======================================================================================

        // ��°��
        // ��÷ ��ȣ : 43, 32, 25, 19, 15, 7, ���ʽ� ��ȣ : 36

	}

}
