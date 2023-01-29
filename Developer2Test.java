//package jb03.part06;


public class  Developer2Test
{
	public static void main(String[] args) 
	{
		Developer2 developer = new Developer2();
		Scanner scanner = new Scanner(System.in);

		//System.out.println("이름 : " + developer.name);
		System.out.println("직업 : " + developer.job);
		System.out.println("평균수입 : " + developer.avgIncome);
		System.out.println("Project 경력 : " + developer.projectCareer);

		System.out.println("==============================");
		
		System.out.print("비밀 번호를 입력하세요.\n> ");
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("평균수입 : " + avgIncome);
		System.out.println("Project 경력 : " + developer.getProjectCareer());
	} //end of main
}// end of class
