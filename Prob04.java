import java.util.Scanner;
public class  Prob04
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~1000의 정수를 입력하세요.\n> ");
		int inputData = scanner.nextInt();
		if (inputData < 1 || inputData >1000)
		{
			System.out.println("1부터 1000까지 입력하세요");
			return;
		}
		int cnt = 0, sum = 0;
		scanner.close();

		for (int i = inputData; i < 1001; i+=inputData)
		{
			cnt++;
			sum+=i;
		}
		System.out.println("1~1000사이의 "+ inputData + "의 배수의 개수 : " + cnt);
		System.out.println("1~1000사이의 "+ inputData + "의 배수의 총합 : " + sum);
	}
}
