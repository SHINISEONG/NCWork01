import java.util.Scanner;
public class  Prob04
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~1000�� ������ �Է��ϼ���.\n> ");
		int inputData = scanner.nextInt();
		if (inputData < 1 || inputData >1000)
		{
			System.out.println("1���� 1000���� �Է��ϼ���");
			return;
		}
		int cnt = 0, sum = 0;
		scanner.close();

		for (int i = inputData; i < 1001; i+=inputData)
		{
			cnt++;
			sum+=i;
		}
		System.out.println("1~1000������ "+ inputData + "�� ����� ���� : " + cnt);
		System.out.println("1~1000������ "+ inputData + "�� ����� ���� : " + sum);
	}
}
