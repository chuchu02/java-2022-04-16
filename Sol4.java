package java_exam;

public class Sol4 {

	public static void main(String[] args) {
		
		Student s1 = new Student(100, "Ã¶¼ö" , 177);
		Student s2 = new Student(90, "¿µÈñ" , 165);
		Student s3 = new Student(80, "¹ÎÃ¶" , 175);
		Student s4 = new Student(90, "±æµ¿" , 180);
		Student s5 = new Student(100, "ÁøÈñ" , 159);

		Student[] students = {s1, s2, s3, s4, s5};
		
		
		int sum = 0;
		for(int i =0; i < students.length; i++) {
			Student s = students[i];
			sum += s.score;
		}
		
		int avg = sum / students.length;
		System.out.println(avg);
		
		for(int i=0; i < students.length; i++) {
			Student s = students[i];
			if(s.score >= avg) {
				s.introduce();
			}
		}
	}
}
	class Student {
		String name;
		int score;
		int height;
		
		public Student(int data1, String data2, int data3) {
			score = data1;
			name = data2;
			height = data3;
		}
		
		public void introduce() {
			System.out.printf("Àú´Â %sÀÌ°í, Á¡¼ö´Â %dÀÔ´Ï´Ù. \n", name, score);
		}
	}


