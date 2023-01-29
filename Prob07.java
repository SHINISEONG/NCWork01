
public class Prob07 
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.println("���ڴ� �ϳ��� �Է��ϼ���!");
			return;
		}
		
		int n = Integer.parseInt(args[0]);
		String[][] star = new String[(n+1)/2][n];

		if ((n % 2 == 0) || (n <= 0))
		{
			System.out.println("���ڴ� 0, ����, ¦�� �Է��� �Ұ��մϴ�. 0���� ū Ȧ���� �Է� ���ּ���!");
			return;
		}
		for (int i=0; i<(n+1)/2 ; i++)
		{
			for (int j=0; j<n; j++)
			{
				star[i][j] = " ";
			}
		}

		for (int i = 0; i<(n+1)/2; i++)
		{
			for (int j=i; j<n-i; j++)
			{
				star[i][j] = "*";
			}
		}

		for (int i = 0; i<(n+1)/2; i++)
		{
			for (int j=0; j<n; j++)
			{
				System.out.print(star[i][j]);
			}
			System.out.println("");
		}

	}
}
