//package jb03.part06;


public class  Developer2Test
{
	public static void main(String[] args) 
	{
		Developer2 developer = new Developer2();
		Scanner scanner = new Scanner(System.in);

		//System.out.println("�̸� : " + developer.name);
		System.out.println("���� : " + developer.job);
		System.out.println("��ռ��� : " + developer.avgIncome);
		System.out.println("Project ��� : " + developer.projectCareer);

		System.out.println("==============================");
		
		System.out.print("��� ��ȣ�� �Է��ϼ���.\n> ");
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + job);
		System.out.println("��ռ��� : " + avgIncome);
		System.out.println("Project ��� : " + developer.getProjectCareer());
	} //end of main
}// end of class
