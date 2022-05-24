
public class HrmMain {

	public static void main(String[] args) {
		Member p1 = new Member("홈길동","79646654");
//		p1.name="홈길동";
		p1.gender="남";
		p1.jobTitle="곰무원";
//		p1.mobile="79646654";
		System.out.println(p1.name+","+p1.gender+","+p1.jobTitle+","+p1.mobile);
		Member p2 = new Member("곰길동","56426654");
//		p2.name="곰길동";
		p2.gender="여";
		p2.jobTitle="강사";
//		p2.mobile="56426654";
		System.out.println(p2.name+","+p2.gender+","+p2.jobTitle+","+p2.mobile);
	}

}
