//package jb03.part04;

public class  MethodSyntaxTestApp
{
	public static void main(String[] args) 
	{
		MethodSyntax methodSyntax = new MethodSyntax();

		System.out.println("\n==========================");
		methodSyntax.browerOn();

		System.out.println("\n==========================");
		boolean result = methodSyntax.documentWork();
		System.out.println("document �۾� ���� : " + result);

		System.out.println("\n==========================");
		int value = methodSyntax.sum(1, 1);
		System.out.println("��� ��� �� : " + value);
		System.out.println("���ϰ� ������ ���� �������� �ʰ� �ٷ� ��� : " + methodSyntax.sum(1,1));

		System.out.println("\n==========================");
		String name = methodSyntax.getName();
		System.out.println("Field ���� name : "+name);
		System.out.println("���ϰ� ������ ���� �������� �ʰ� �ٷ� ��� : " + methodSyntax.getName());
		
		System.out.println("\n==========================");
		String addr = methodSyntax.getAddr();
		System.out.println("Field ���� addr : " + addr);
		System.out.println("���ϰ� ������ ���� �������� �ʰ� �ٷ� ��� : " + methodSyntax.getAddr());

		System.out.println("\n==========================");
		String[] info = methodSyntax.getAllInformation();
		System.out.println("Field ��ü ������ ���");
		for (int i=0; i<info.length; i++)
		//for (int i;i<2;i++)
		{
			System.out.println((i+1)+" ��° ���� : "+info[i]);
		}
	}//end of main
}//end of class