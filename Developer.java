//package jb03.part03;

public class  Developer
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

	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avgIncome++;
	}
}//end of class
