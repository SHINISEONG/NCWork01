public class Example3
{
	public static void main(String[] args) 
	{
		if (args.length == 2)
		{

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int temp = 0, factorial = 0;
		
			if (a>b)
			{
				temp = a;
				a=b;
				b=temp;
			}
	
			if (a!=b)
			{
				for (int i = a; i <= b; i++)
				{
					factorial += i;
				}
		
				System.out.println(a+"���� "+b+"������ ���� = "+factorial);

			} else {
				System.out.println("�� ���� ���׿�!");
			}
		} else {
			System.out.println("�μ��� �� ������ �Է��� �ּ���.");
		}
	} //end of main
} //end of class
