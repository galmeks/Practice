import java.util.Scanner;

public class StudentExaple {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Car seltos = new Car();
		seltos.person=5;
		seltos.max_speed=220;
		seltos.model="Novelise 1.6 GTI 2WD";
		seltos.company="Kia";
		seltos.speed = 0;
		int z = Integer.parseInt(s.nextLine());
		System.out.println("seltos speed: "+seltos.speed);
		seltos.run(z);
		System.out.println("seltos run speed: "+seltos.speed);
		
		
		
		
//		Student s1=new Student();
//		s1.name = "홍길동";
//		s1.gender = "남성";
//		System.out.println("Student 클래스인 객체 인스턴스 s1이 생성되었습니다.");
//		Student s2=new Student();
//		s2.name = "홈길돔";
//		s2.gender = "남섬";
//		System.out.println("Student 클래스 타입의 객체 s2이 생성되었습니다.");
//		System.out.println(s1.name+","+s1.gender+","+s2.name+","+s2.gender);
//		Marine m1 = new Marine();
//		Marine m2 = new Marine();
//		Marine m3 = new Marine();
//		m1.attack = 8;
//		m1.defence = 1;
//		m2.attack = 10;
//		m2.defence = 5;
//		m3.attack = 2;
//		m3.defence = 6;
//		System.out.println(m1.attack+","+m1.defence+","+m2.attack+","+m2.defence+","+m3.attack+","+m3.defence);
	}

}
