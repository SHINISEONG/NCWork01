//package jb03.part06;
import java.util.Scanner;
public class Developer2 
{
	private String name = "홍길동";

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

	public String getName(){
		Scanner scanner = new Scanner(System.in);
		int pwd = scanner.nextInt();
		System.out.println("겟네임 실행했어");
		if (pwd == 1234)
		{
			return name;	
		} else {
			return "비번틀림";
		}
	}
	
	public String getJob(){
		System.out.println("getJob() method");
		return job;
	}

	public int getAvgIncome(){
		System.out.println("getAvgIncome() method");
		return avgIncome;
	}

	public int getProjectCareer(){
		System.out.println("getProjectCareer() method");
		return projectCareer;
	}

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

} //end of class
