//package jb02.part02;
public class ForTest
{
	public static void main(String[] args) 
	{
		int j = 5;
		System.out.println(j + "���� ����մϴ�.");
		for (int i=1; i<10; i++)
		{
			System.out.println(j+" * "+i+ " = " + j*i);
		}
		int k=1;
		for(;;){
			if (k>10)
			{

				break;
			}
			System.out.println("����� for ���ѷ���");
			k++;
		}

	}
}