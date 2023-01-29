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
		System.out.println("document 작업 유무 : " + result);

		System.out.println("\n==========================");
		int value = methodSyntax.sum(1, 1);
		System.out.println("계산 결과 값 : " + value);
		System.out.println("리턴값 변수에 따로 저장하지 않고 바로 출력 : " + methodSyntax.sum(1,1));

		System.out.println("\n==========================");
		String name = methodSyntax.getName();
		System.out.println("Field 정보 name : "+name);
		System.out.println("리턴값 변수에 따로 저장하지 않고 바로 출력 : " + methodSyntax.getName());
		
		System.out.println("\n==========================");
		String addr = methodSyntax.getAddr();
		System.out.println("Field 정보 addr : " + addr);
		System.out.println("리턴값 변수에 따로 저장하지 않고 바로 출력 : " + methodSyntax.getAddr());

		System.out.println("\n==========================");
		String[] info = methodSyntax.getAllInformation();
		System.out.println("Field 전체 정보를 출력");
		for (int i=0; i<info.length; i++)
		//for (int i;i<2;i++)
		{
			System.out.println((i+1)+" 번째 정보 : "+info[i]);
		}
	}//end of main
}//end of class
