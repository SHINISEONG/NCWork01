//package jb03.part05;

public class  Developer1
{
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome = 100;
	int projectCareer; // <- Field�� ���� �� ��� �ʱ�ȭ ������?

	public void participateProject(){
		System.out.println("���α׷� ���߷� �������� �� ��� ����");
		avgIncome++;
		projectCareer++;
	}

	public void participateProject(String project){
		System.out.println(project + "--> project ������ ��������, ��� ����");
		avgIncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avgIncome++;
	}
	
	public void instruct(int lectureCount){
		System.out.println(lectureCount+"�� ���Ǹ� ���� ��������");
		avgIncome += lectureCount;
	}
}// end of class