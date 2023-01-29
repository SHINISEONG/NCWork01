import java.util.Arrays;
public class Ex5_1
{
	public static void main(String[] args) 
	{
		int[] iArr1 = new int[10];

		for (int i=0; i < iArr1.length; i++)
		{
			iArr1[i]=(int)(Math.random()*10)+1;
		}

		System.out.println(Arrays.toString(iArr1));
	}
}
