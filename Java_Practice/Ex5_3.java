import java.util.Scanner;
public class Ex5_3
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
//		scanner.reset();
		int[] Score = new int[5];
		int max = 0, min = 0;

		System.out.println("������ �Է��ϼ���");
		System.out.print("> ");

		for (int i=0; i<Score.length; i++)
		{
			Score[i] = scanner.nextInt();
		}
		scanner.close();

		max = Score[0];
		min = Score[0];
		for (int i=0; i<Score.length; i++)
		{
			if (Score[i]>max)
			{
				max = Score[i];
			}
			if (Score[i]<min)
			{
				min = Score[i];
			}
		}

		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
}
