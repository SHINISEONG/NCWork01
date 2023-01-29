public class  Prob02
{
	public static void main(String[] args) 
	{
		int limit = 50;
		if (limit <2)
		{
			System.out.println("소수는 2부터 존재합니다.");
			return;
		}
		System.out.println(2);
		if (limit==2)
		{
			return;
		}
		

		for (int i = 3; i<limit+1; i++)
		{
			if (i%2 != 0)
			{
				for (int j=3; j<=i ; j++ )
				{
					if (i%j == 0)
					{
						if (i != j)
						{
							break;
						} else {
							System.out.println(i);
						}
					} //end of measure if
				} //end of inner for
			} // end of Even If
		} // end of outer for

	}// end of main
}// end of class
