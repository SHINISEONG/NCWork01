//package jb03.part05;

public class  Developer1
{
	String name = "홍길동";
	String job = "개발자";
	int avgIncome = 100;
	int projectCareer; // <- Field를 선언만 한 경우 초기화 유무는?

	public void participateProject(){
		System.out.println("프로그램 개발로 수입증가 및 경력 쌓음");
		avgIncome++;
		projectCareer++;
	}

	public void participateProject(String project){
		System.out.println(project + "--> project 참여로 수입증가, 경력 쌓음");
		avgIncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avgIncome++;
	}
	
	public void instruct(int lectureCount){
		System.out.println(lectureCount+"개 강의를 통한 수입증가");
		avgIncome += lectureCount;
	}
}// end of class
