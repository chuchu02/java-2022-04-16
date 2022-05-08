package java_exam;

public class Sol5 {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(35 , "��¯��", "����");	    

	    Customer c2 = new Customer(29, "�����", "����");

	    Customer c3 = new Customer(26, "ȫ�浿", "����");	    

	    Customer c4 = new Customer(44, "�輭��", "����");
	   
	    Customer[] customers= {c1, c2, c3, c4};
	    
	    //1. ��ü ȸ�� ���̿� �̸� ���
	    for(int i = 0; i < customers.length; i++) {
	    	Customer c = customers[i];
	    	c.printName();
	    	c.printAndAge();
	    	System.out.println("===============");
	    }
	    //2. ���̰� 30�� �̸��� ����� �̸� ���    
	    for(int i = 0; i < customers.length; i++) {
	    	Customer c = customers[i];
	    	if(c.age < 30) {
	    		System.out.println(c.name);
	    		System.out.println("===============");
	    	}
	    }
	    //3. ���� ��� ������� �̸��� ���� ���
	    for(int i =0; i < customers.length; i++) {
	    	Customer c = customers[i];
	    	if(c.address == "����") {
	    		System.out.println(c.age);
	    		System.out.println(c.name);
	    		System.out.println("===============");
	    	}
	    }
	    //4. �达 ���� ���� ��� �̸� ��� (��Ʈ : startsWith)
	    // �ڹ� API
	    // API => �������� ����� �ƴ϶� ������ ���� �Լ��� Ŭ����,��� ���·� ����
	    for(int i = 0; i < customers.length; i++) {
	    	Customer c = customers[i];
	    	if(c.name.startsWith("��")) {
	    		System.out.println(c.name);
	    	}
	    }

	}

}
