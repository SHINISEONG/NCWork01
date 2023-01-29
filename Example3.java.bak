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
		
				System.out.println(a+"부터 "+b+"까지의 총합 = "+factorial);

			} else {
				System.out.println("두 수가 같네요!");
			}
		} else {
			System.out.println("인수는 두 가지로 입력해 주세요.");
		}
	} //end of main
} //end of class
