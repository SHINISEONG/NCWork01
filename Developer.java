//package jb03.part03;

public class  Developer
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

	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avgIncome++;
	}
}//end of class
