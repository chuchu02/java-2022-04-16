package java_exam;

public class Sol5 {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(35 , "김짱구", "대전");	    

	    Customer c2 = new Customer(29, "손흥민", "런던");

	    Customer c3 = new Customer(26, "홍길동", "서울");	    

	    Customer c4 = new Customer(44, "김서방", "대전");
	   
	    Customer[] customers= {c1, c2, c3, c4};
	    
	    //1. 전체 회원 나이와 이름 출력
	    for(int i = 0; i < customers.length; i++) {
	    	Customer c = customers[i];
	    	c.printName();
	    	c.printAndAge();
	    	System.out.println("===============");
	    }
	    //2. 나이가 30세 미만인 사람의 이름 출력    
	    for(int i = 0; i < customers.length; i++) {
	    	Customer c = customers[i];
	    	if(c.age < 30) {
	    		System.out.println(c.name);
	    		System.out.println("===============");
	    	}
	    }
	    //3. 대전 사는 사람들의 이름과 나이 출력
	    for(int i =0; i < customers.length; i++) {
	    	Customer c = customers[i];
	    	if(c.address == "대전") {
	    		System.out.println(c.age);
	    		System.out.println(c.name);
	    		System.out.println("===============");
	    	}
	    }
	    //4. 김씨 성을 가진 사람 이름 출력 (힌트 : startsWith)
	    // 자바 API
	    // API => 여러분이 만든게 아니라 누군가 만들어서 함수나 클래스,모듈 형태로 제공
	    for(int i = 0; i < customers.length; i++) {
	    	Customer c = customers[i];
	    	if(c.name.startsWith("김")) {
	    		System.out.println(c.name);
	    	}
	    }

	}

}
