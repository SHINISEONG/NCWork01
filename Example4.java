public class  Example4
{
public static void main(String[] args) 
	{
		for (int i=1; i<=9; i++)
		{
			System.out.println(i + "단을 출력합니다.");
			System.out.println("==================================");
			
			for (int j=1; j<=9; j++)
			{
				System.out.println(i+" x "+ j + " = " + (i*j));
			}
			System.out.println("==================================\n");
		}
	} //end of main
} //end of class
