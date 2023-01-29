import java.util.Arrays;
public class Ex5_4
{
	public static void main(String[] args) 
	{
		int randTen = 0, randOne = 0, tmp = 0, shf = 100;
		int[] lotto = new int[6];

		for (int i=0; i<lotto.length; i++ )
		{
			while (true)
			{
				randTen = (int)(Math.random()*100);
				if (randTen >= 0 && randTen <=40)
				{
					break;
				}
			}
			if (randTen == 40)
			{
				while (true)
				{
					randOne = (int)(Math.random()*10);
					if (randOne >= 0 && randOne<=5)
					{
						break;
					}
				}
			} else {
				randOne = (int)(Math.random()*10);
			}

			lotto[i] = randTen+randOne;
		}

		System.out.println ("추첨 하신 번호 6개 입니다");
		System.out.println (Arrays.toString(lotto));

		for (int i=0; i<shf; i++)
		{
			for(int j=0; j<lotto.length; j++)
			{
				while (true)
				{
					randOne = (int)(Math.random()*10);
					if (randOne >= 0 && randOne < lotto.length)
					{
						break;
					}
				}
			tmp = lotto[j];
			lotto[j] = lotto[randOne];
			lotto[randOne] = tmp;
			}
		}

		System.out.println ("섞은 번호 6개 입니다");
		System.out.println (Arrays.toString(lotto));

	}
}
