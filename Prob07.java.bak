
public class Prob07 
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.println("인자는 하나만 입력하세요!");
			return;
		}
		
		int n = Integer.parseInt(args[0]);
		String[][] star = new String[(n+1)/2][n];

		if ((n % 2 == 0) || (n <= 0))
		{
			System.out.println("인자는 0, 음수, 짝수 입력이 불가합니다. 0보다 큰 홀수로 입력 해주세요!");
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
