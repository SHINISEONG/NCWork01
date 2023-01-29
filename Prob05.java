
public class  Prob05
{
	public static void main(String[] args) 
	{
		int[] array = {3, 24, 1, 55, 17, 43, 5};
		int locator=0, tmp =0 ;

		System.out.println("[정렬 전 배열의 내용입니다.]");
		for (int i = 0; i < array.length ; i++ )
		{
			System.out.print(array[i]+" ");
		}// end of print for
		System.out.println("");
		for (int i=locator; i<array.length; i++)
		{
			for (int j = i+1; j<array.length; j++)
			{
				if (array[i] > array[j])
				{
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}// end of inner for
				locator++;
		}// end of outer for
		
		System.out.println("[정렬된 배열의 내용입니다.]");
		for (int i = 0; i < array.length ; i++ )
		{
			System.out.print(array[i]+" ");
		}// end of print for
	} // end of main
}// end of class
