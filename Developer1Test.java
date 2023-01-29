//package jb03.part05;

public class  Developer1Test
{
	public static void main(String[] args) 
	{
		Developer1 developer = new Developer1();

		System.out.println("이름 : " + developer.name);
		System.out.println("직업 : " + developer.job);
		System.out.println("평균수입 : " + developer.avgIncome);
		System.out.println("Project 경력 : " + developer.projectCareer);

		System.out.println("==============================");

		developer.participateProject();
		System.out.println("평균수입 : " + developer.avgIncome);
		System.out.println("Project 경력 : " + developer.projectCareer);

		System.out.println("==============================");
		
		developer.instruct();
		System.out.println("평균수입 : " + developer.avgIncome);
		
		System.out.println("==============================");
		
		String projectName = "한미은행";
		developer.participateProject(projectName);
		System.out.println("평균수입 : " + developer.avgIncome);
		System.out.println("Project 경력 : " + developer.projectCareer);

		System.out.println("==============================");
		
		int lectureCount = 2;
		developer.instruct(lectureCount);
		System.out.println("평균수입 : " + developer.avgIncome);
		
	}//end of main
}
