package java_exam;

public class Sol2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 출력 : 자동차가 최대속력 220km로 달립니다.
	    // 출력 : 자동차가 최대속력 250km로 달립니다.

		//데이터 + 함수(동작)로 이루어진것 => 객체 == 인스턴스
		car c1 = new car();
		c1.maxVelo = 200;
		
		car c2 = new car();
		c2.maxVelo = 300;
		
		car c3 = new car();
		c3.maxVelo = 400;
		
		c1.run();
		c1.run();
		c1.run();
		
		c1.run();
		c2.run();
		c3.run();
		
	}

}
//최대속력
class car {
	 int maxVelo;
	 
	 public void run() {
			System.out.printf("자동차가 최대속력 %dkm로 달립니다.\n", maxVelo);
		}
}
