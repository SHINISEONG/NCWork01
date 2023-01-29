import java.util.Scanner;

public class Prob03 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~10까지의 정수를 입력하세요\n> ");
		int inputNum = scanner.nextInt();
		if (inputNum < 1 || inputNum > 10)
		{
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}
		
		int factorial=1;
		for (int i = 0; i<inputNum; i++)
		{
			factorial*=(i+1);
		}
		System.out.println(inputNum + " ! = " + factorial);
	}
}
